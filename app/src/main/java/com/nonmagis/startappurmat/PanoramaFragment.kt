package com.nonmagis.startappurmat

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.Animation
import android.view.animation.RotateAnimation
import android.widget.ImageView
import com.nonmagis.startappurmat.databinding.FragmentPanoramaBinding

@Suppress("UNREACHABLE_CODE")
class PanoramaFragment : Fragment() {

    private val binding: FragmentPanoramaBinding by lazy {
        FragmentPanoramaBinding.inflate(layoutInflater)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        // Определите точку опоры (центр изображения)
        val pivotX = binding.container.width / 2f
        val pivotY = binding.container.height / 2f

        // Создайте объект анимации RotateAnimation
        val rotateAnimation = RotateAnimation(
            0f, 360f, // От 0 градусов до 360 градусов (полный оборот)
            pivotX, pivotY
        )

        // Установите свойства анимации
        rotateAnimation.duration = 3000 // Продолжительность анимации в миллисекундах
        rotateAnimation.repeatCount = Animation.INFINITE // Бесконечное повторение анимации

        // Запустите анимацию
        binding.container.startAnimation(rotateAnimation)
    }
}
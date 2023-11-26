package com.hamza.mvc_architecture.models

import com.hamza.mvc_architecture.models.domains.Wisdom

class FakeApiService {
    private val wisdomList = listOf<Wisdom>(
        Wisdom(
            date = "2021/7/22,", content = "أن تضيء شمعة صغيرة خير لك من أن تنفق عمرك تلعن الظلام"
        ),
        Wisdom(date = "2021/7/18,", content = "كلما ازدادت ثقافة المرء ازداد بؤسه"),
        Wisdom(
            date = "2021/7/12,", content = "سأل الممكن المستحيل أين تقيم ؟ فأجابه في أحلام العاجز"
        ),
        Wisdom(date = "2021/7/7,", content = "إن بيتا يخلو من كتاب هو بيت بلا روح"),
        Wisdom(date = "2021/7/1", content = "نحن لا نحصل على السلام بالحرب، وإنما بالتفاهم"),
        Wisdom(date = "2021/6/28,", content = "بعض الناس عظماء لأن المحيطين بهم صغار"),
        Wisdom(
            date = "2021/6/20,", content = "عندما يمشي الكسل في الطريق، فلا بد أن يلحق به الفقر"
        ),
        Wisdom(
            date = "2021/6/15,",
            content = "قليل من العلم مع العمل به أنفع من كثير من العلم مع قلة العمل به"
        )
    )

    fun getRandomWisdom() = wisdomList[(Math.random() * wisdomList.size).toInt()]

}
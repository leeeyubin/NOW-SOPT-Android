package com.sopt.now.compose.feature.auth.signup

data class SignUpState(
    val id: String = "",
    val pw: String = "",
    val nickname: String = "",
    val mbti: String = "",
    val message: String? = null
)

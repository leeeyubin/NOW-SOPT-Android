package com.sopt.feature.main.search

import androidx.annotation.StringRes

sealed class SearchSideEffect {
    data class Toast(@StringRes val message: Int) : SearchSideEffect()
}
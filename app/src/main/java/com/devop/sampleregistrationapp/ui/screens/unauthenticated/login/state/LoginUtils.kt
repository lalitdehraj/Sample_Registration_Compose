package com.devop.sampleregistrationapp.ui.screens.unauthenticated.login.state

import com.devop.sampleregistrationapp.R
import com.devop.sampleregistrationapp.ui.common.state.ErrorState

val emailOrMobileEmptyErrorState = ErrorState(
    hasError = true,
    errorMessageStringResource = R.string.login_error_msg_empty_email_mobile
)

val passwordEmptyErrorState = ErrorState(
    hasError = true,
    errorMessageStringResource = R.string.login_error_msg_empty_password
)
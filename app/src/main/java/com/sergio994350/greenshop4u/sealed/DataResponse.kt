package com.sergio994350.greenshop4u.sealed

sealed class DataResponse<T>(
    var data: T? = null,
    var error: com.sergio994350.greenshop4u.sealed.Error? = null,
) {
    class Success<T>(data: T) : DataResponse<T>(data = data)
    class Error<T>(error: com.sergio994350.greenshop4u.sealed.Error) : DataResponse<T>(error = error)
}
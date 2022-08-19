package com.example.tarjetascarrousel.cardCarrousel.base

abstract class BaseUseCase<T>  {
    abstract suspend fun execute(): List<T>
}
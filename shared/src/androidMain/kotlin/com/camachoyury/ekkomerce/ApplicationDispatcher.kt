package com.camachoyury.ekkomerce

import kotlinx.coroutines.CoroutineDispatcher

import kotlinx.coroutines.*

internal actual val ApplicationDispatcher: CoroutineDispatcher = Dispatchers.Default
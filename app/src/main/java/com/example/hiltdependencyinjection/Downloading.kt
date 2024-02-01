package com.example.hiltdependencyinjection

import android.util.Log
import java.lang.Exception

class Downloading {
}

class HttpClient{

}

class Executor{

}
class Request constructor(private val client: HttpClient,private val executor: Executor){

    fun getRequest(){
        Log.d("main","File Downloading")
    }

}
class Downloader constructor(private val request: Request){

    fun getDownload(){
        request.getRequest()
    }

}

object DownloaderFactory{
    fun create():Downloader{
        val client = HttpClient()
        val executor = Executor()
        val request = Request(client,executor)
        return Downloader(request)
    }
}
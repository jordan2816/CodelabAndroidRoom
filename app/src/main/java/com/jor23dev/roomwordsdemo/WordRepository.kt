package com.jor23dev.roomwordsdemo

import androidx.lifecycle.LiveData

class WordRepository(private val wordDao: WordDao) {

    val allWords: LiveData<List<Word>> = wordDao.getAlphabetizedWords()

    suspend fun getAll(): List<Word> {
        return wordDao.getAlphabetizedWords2()
    }

    suspend fun insert(word: Word) {
        wordDao.insert(word)
    }
}
package pt.ulusofona.deisi.a2020.cm.g25.domain.interfaces

import pt.ulusofona.deisi.a2020.cm.g25.data.local.room.entities.TestResult

interface TestListLogicCallbackInterface {
    fun testsListReturn(response: List<TestResult>)
}
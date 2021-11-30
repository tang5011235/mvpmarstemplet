package com.github.tang5011235.mvpmarstemplet.services

import com.intellij.openapi.project.Project
import com.github.tang5011235.mvpmarstemplet.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}

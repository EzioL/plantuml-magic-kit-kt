package com.github.eziol.plantumlmagickit.services

import com.github.eziol.plantumlmagickit.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}

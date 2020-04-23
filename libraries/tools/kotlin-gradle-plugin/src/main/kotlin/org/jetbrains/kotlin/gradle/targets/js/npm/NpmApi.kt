/*
 * Copyright 2010-2020 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.gradle.targets.js.npm

import org.gradle.api.Project
import org.jetbrains.kotlin.gradle.targets.js.npm.resolved.KotlinCompilationNpmResolution
import java.io.File

/**
 * NodeJS package manager API
 */
interface NpmApi {
    fun setup(project: Project)

    fun resolveProject(resolvedNpmProject: KotlinCompilationNpmResolution)

    fun preparedFiles(project: Project): Collection<File>

    fun prepareRootProject(
        rootProject: Project,
        subProjects: Collection<KotlinCompilationNpmResolution>
    )

    fun resolveRootProject(
        rootProject: Project,
        npmProjects: Collection<KotlinCompilationNpmResolution>,
        skipExecution: Boolean,
        cliArgs: List<String>
    )

    fun resolveDependency(
        npmResolution: KotlinCompilationNpmResolution,
        dependency: NpmDependency,
        transitive: Boolean
    ): Set<File>

    companion object {
        fun resolveOperationDescription(packageManagerTitle: String): String =
            "Resolving NPM dependencies using $packageManagerTitle"
    }
}
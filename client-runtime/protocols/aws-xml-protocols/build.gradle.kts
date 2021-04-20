/*
 * Copyright Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * SPDX-License-Identifier: Apache-2.0.
 */

description = "Support for the XML suite of AWS protocols"
extra["displayName"] = "Software :: AWS :: Kotlin SDK :: XML"
extra["moduleName"] = "aws.sdk.kotlin.runtime.protocol.xml"

val smithyKotlinVersion: String by project

kotlin {
    sourceSets {
        commonMain {
            dependencies {
                api("software.aws.smithy.kotlin:http:$smithyKotlinVersion")
                api(project(":client-runtime:aws-client-rt"))
                implementation(project(":client-runtime:protocols:http"))
                implementation("software.aws.smithy.kotlin:serde:$smithyKotlinVersion")
                implementation("software.aws.smithy.kotlin:serde-xml:$smithyKotlinVersion")
                implementation("software.aws.smithy.kotlin:utils:$smithyKotlinVersion")
            }
        }

        commonTest {
            dependencies {
                implementation(project(":client-runtime:testing"))
            }
        }
    }
}


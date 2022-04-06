// provided.js - generated by gradle-jmh-report, 2022-03-22 22:59:48.608

var providedBenchmarks = ['results'];

var providedBenchmarkStore = {
'results': 
[
    {
        "jmhVersion" : "1.34",
        "benchmark" : "com.github.skjolber.jwt.JwtClaimBenchmark.auth0_claim",
        "mode" : "thrpt",
        "threads" : 1,
        "forks" : 1,
        "jvm" : "/home/svenja/.jdks/openjdk-17.0.2/bin/java",
        "jvmArgs" : [
            "-XX:+UseG1GC"
        ],
        "jdkVersion" : "17.0.2",
        "vmName" : "OpenJDK 64-Bit Server VM",
        "vmVersion" : "17.0.2+8-86",
        "warmupIterations" : 10,
        "warmupTime" : "2 s",
        "warmupBatchSize" : 1,
        "measurementIterations" : 6,
        "measurementTime" : "10 s",
        "measurementBatchSize" : 1,
        "primaryMetric" : {
            "score" : 26606.96892659031,
            "scoreError" : 27.703549902409957,
            "scoreConfidence" : [
                26579.2653766879,
                26634.67247649272
            ],
            "scorePercentiles" : {
                "0.0" : 26588.77903767772,
                "50.0" : 26609.35286564836,
                "90.0" : 26617.223705166114,
                "95.0" : 26617.223705166114,
                "99.0" : 26617.223705166114,
                "99.9" : 26617.223705166114,
                "99.99" : 26617.223705166114,
                "99.999" : 26617.223705166114,
                "99.9999" : 26617.223705166114,
                "100.0" : 26617.223705166114
            },
            "scoreUnit" : "ops/s",
            "rawData" : [
                [
                    26607.487705329342,
                    26612.336446518475,
                    26617.223705166114,
                    26588.77903767772,
                    26604.76863888283,
                    26611.21802596738
                ]
            ]
        },
        "secondaryMetrics" : {
        }
    },
    {
        "jmhVersion" : "1.34",
        "benchmark" : "com.github.skjolber.jwt.JwtClaimBenchmark.fusionauth_claim",
        "mode" : "thrpt",
        "threads" : 1,
        "forks" : 1,
        "jvm" : "/home/svenja/.jdks/openjdk-17.0.2/bin/java",
        "jvmArgs" : [
            "-XX:+UseG1GC"
        ],
        "jdkVersion" : "17.0.2",
        "vmName" : "OpenJDK 64-Bit Server VM",
        "vmVersion" : "17.0.2+8-86",
        "warmupIterations" : 10,
        "warmupTime" : "2 s",
        "warmupBatchSize" : 1,
        "measurementIterations" : 6,
        "measurementTime" : "10 s",
        "measurementBatchSize" : 1,
        "primaryMetric" : {
            "score" : 26639.162870052693,
            "scoreError" : 23.845887057024648,
            "scoreConfidence" : [
                26615.316982995668,
                26663.008757109717
            ],
            "scorePercentiles" : {
                "0.0" : 26632.905304239517,
                "50.0" : 26636.42249062535,
                "90.0" : 26655.82916410467,
                "95.0" : 26655.82916410467,
                "99.0" : 26655.82916410467,
                "99.9" : 26655.82916410467,
                "99.99" : 26655.82916410467,
                "99.999" : 26655.82916410467,
                "99.9999" : 26655.82916410467,
                "100.0" : 26655.82916410467
            },
            "scoreUnit" : "ops/s",
            "rawData" : [
                [
                    26634.373740819214,
                    26638.24805818085,
                    26639.024029902048,
                    26632.905304239517,
                    26655.82916410467,
                    26634.596923069857
                ]
            ]
        },
        "secondaryMetrics" : {
        }
    },
    {
        "jmhVersion" : "1.34",
        "benchmark" : "com.github.skjolber.jwt.JwtClaimBenchmark.jjwt_claim",
        "mode" : "thrpt",
        "threads" : 1,
        "forks" : 1,
        "jvm" : "/home/svenja/.jdks/openjdk-17.0.2/bin/java",
        "jvmArgs" : [
            "-XX:+UseG1GC"
        ],
        "jdkVersion" : "17.0.2",
        "vmName" : "OpenJDK 64-Bit Server VM",
        "vmVersion" : "17.0.2+8-86",
        "warmupIterations" : 10,
        "warmupTime" : "2 s",
        "warmupBatchSize" : 1,
        "measurementIterations" : 6,
        "measurementTime" : "10 s",
        "measurementBatchSize" : 1,
        "primaryMetric" : {
            "score" : 25142.308381148356,
            "scoreError" : 21.205988691055033,
            "scoreConfidence" : [
                25121.102392457302,
                25163.51436983941
            ],
            "scorePercentiles" : {
                "0.0" : 25129.53335368738,
                "50.0" : 25142.50603358692,
                "90.0" : 25153.263258172807,
                "95.0" : 25153.263258172807,
                "99.0" : 25153.263258172807,
                "99.9" : 25153.263258172807,
                "99.99" : 25153.263258172807,
                "99.999" : 25153.263258172807,
                "99.9999" : 25153.263258172807,
                "100.0" : 25153.263258172807
            },
            "scoreUnit" : "ops/s",
            "rawData" : [
                [
                    25142.122711720414,
                    25142.610551609705,
                    25129.53335368738,
                    25153.263258172807,
                    25142.40151556414,
                    25143.918896135685
                ]
            ]
        },
        "secondaryMetrics" : {
        }
    },
    {
        "jmhVersion" : "1.34",
        "benchmark" : "com.github.skjolber.jwt.JwtClaimBenchmark.nimbus_claim",
        "mode" : "thrpt",
        "threads" : 1,
        "forks" : 1,
        "jvm" : "/home/svenja/.jdks/openjdk-17.0.2/bin/java",
        "jvmArgs" : [
            "-XX:+UseG1GC"
        ],
        "jdkVersion" : "17.0.2",
        "vmName" : "OpenJDK 64-Bit Server VM",
        "vmVersion" : "17.0.2+8-86",
        "warmupIterations" : 10,
        "warmupTime" : "2 s",
        "warmupBatchSize" : 1,
        "measurementIterations" : 6,
        "measurementTime" : "10 s",
        "measurementBatchSize" : 1,
        "primaryMetric" : {
            "score" : 14975.271081490471,
            "scoreError" : 43.06222326382054,
            "scoreConfidence" : [
                14932.208858226652,
                15018.333304754291
            ],
            "scorePercentiles" : {
                "0.0" : 14944.901991853623,
                "50.0" : 14981.959386636401,
                "90.0" : 14984.684493264554,
                "95.0" : 14984.684493264554,
                "99.0" : 14984.684493264554,
                "99.9" : 14984.684493264554,
                "99.99" : 14984.684493264554,
                "99.999" : 14984.684493264554,
                "99.9999" : 14984.684493264554,
                "100.0" : 14984.684493264554
            },
            "scoreUnit" : "ops/s",
            "rawData" : [
                [
                    14984.684493264554,
                    14984.002414715244,
                    14982.724562887903,
                    14944.901991853623,
                    14974.1188158366,
                    14981.194210384901
                ]
            ]
        },
        "secondaryMetrics" : {
        }
    },
    {
        "jmhVersion" : "1.34",
        "benchmark" : "com.github.skjolber.jwt.JwtClaimBenchmark.okta_claim",
        "mode" : "thrpt",
        "threads" : 1,
        "forks" : 1,
        "jvm" : "/home/svenja/.jdks/openjdk-17.0.2/bin/java",
        "jvmArgs" : [
            "-XX:+UseG1GC"
        ],
        "jdkVersion" : "17.0.2",
        "vmName" : "OpenJDK 64-Bit Server VM",
        "vmVersion" : "17.0.2+8-86",
        "warmupIterations" : 10,
        "warmupTime" : "2 s",
        "warmupBatchSize" : 1,
        "measurementIterations" : 6,
        "measurementTime" : "10 s",
        "measurementBatchSize" : 1,
        "primaryMetric" : {
            "score" : 1034.5495637749043,
            "scoreError" : 9.455136010067948,
            "scoreConfidence" : [
                1025.0944277648364,
                1044.0046997849722
            ],
            "scorePercentiles" : {
                "0.0" : 1028.1624351600851,
                "50.0" : 1035.8065596850267,
                "90.0" : 1037.0936239587688,
                "95.0" : 1037.0936239587688,
                "99.0" : 1037.0936239587688,
                "99.9" : 1037.0936239587688,
                "99.99" : 1037.0936239587688,
                "99.999" : 1037.0936239587688,
                "99.9999" : 1037.0936239587688,
                "100.0" : 1037.0936239587688
            },
            "scoreUnit" : "ops/s",
            "rawData" : [
                [
                    1037.0936239587688,
                    1028.1624351600851,
                    1036.8768335793457,
                    1035.7584965355886,
                    1033.5513705811732,
                    1035.8546228344649
                ]
            ]
        },
        "secondaryMetrics" : {
        }
    },
    {
        "jmhVersion" : "1.34",
        "benchmark" : "com.github.skjolber.jwt.JwtParseBenchmark.auth0_parse",
        "mode" : "thrpt",
        "threads" : 1,
        "forks" : 1,
        "jvm" : "/home/svenja/.jdks/openjdk-17.0.2/bin/java",
        "jvmArgs" : [
            "-XX:+UseG1GC"
        ],
        "jdkVersion" : "17.0.2",
        "vmName" : "OpenJDK 64-Bit Server VM",
        "vmVersion" : "17.0.2+8-86",
        "warmupIterations" : 10,
        "warmupTime" : "2 s",
        "warmupBatchSize" : 1,
        "measurementIterations" : 6,
        "measurementTime" : "10 s",
        "measurementBatchSize" : 1,
        "primaryMetric" : {
            "score" : 898799.7115052962,
            "scoreError" : 44646.69672561707,
            "scoreConfidence" : [
                854153.0147796791,
                943446.4082309132
            ],
            "scorePercentiles" : {
                "0.0" : 866512.6214828106,
                "50.0" : 905618.1085274441,
                "90.0" : 906979.7399025864,
                "95.0" : 906979.7399025864,
                "99.0" : 906979.7399025864,
                "99.9" : 906979.7399025864,
                "99.99" : 906979.7399025864,
                "99.999" : 906979.7399025864,
                "99.9999" : 906979.7399025864,
                "100.0" : 906979.7399025864
            },
            "scoreUnit" : "ops/s",
            "rawData" : [
                [
                    901766.9225371305,
                    866512.6214828106,
                    905693.1993000839,
                    905543.0177548042,
                    906302.7680543615,
                    906979.7399025864
                ]
            ]
        },
        "secondaryMetrics" : {
        }
    },
    {
        "jmhVersion" : "1.34",
        "benchmark" : "com.github.skjolber.jwt.JwtParseBenchmark.fusionauth_parse",
        "mode" : "thrpt",
        "threads" : 1,
        "forks" : 1,
        "jvm" : "/home/svenja/.jdks/openjdk-17.0.2/bin/java",
        "jvmArgs" : [
            "-XX:+UseG1GC"
        ],
        "jdkVersion" : "17.0.2",
        "vmName" : "OpenJDK 64-Bit Server VM",
        "vmVersion" : "17.0.2+8-86",
        "warmupIterations" : 10,
        "warmupTime" : "2 s",
        "warmupBatchSize" : 1,
        "measurementIterations" : 6,
        "measurementTime" : "10 s",
        "measurementBatchSize" : 1,
        "primaryMetric" : {
            "score" : 1556755.9788915224,
            "scoreError" : 10466.942444592716,
            "scoreConfidence" : [
                1546289.0364469297,
                1567222.921336115
            ],
            "scorePercentiles" : {
                "0.0" : 1550848.6303877488,
                "50.0" : 1557404.2384555568,
                "90.0" : 1561267.2618103467,
                "95.0" : 1561267.2618103467,
                "99.0" : 1561267.2618103467,
                "99.9" : 1561267.2618103467,
                "99.99" : 1561267.2618103467,
                "99.999" : 1561267.2618103467,
                "99.9999" : 1561267.2618103467,
                "100.0" : 1561267.2618103467
            },
            "scoreUnit" : "ops/s",
            "rawData" : [
                [
                    1554201.3852114123,
                    1550848.6303877488,
                    1557367.8312423646,
                    1561267.2618103467,
                    1559410.1190285133,
                    1557440.6456687488
                ]
            ]
        },
        "secondaryMetrics" : {
        }
    },
    {
        "jmhVersion" : "1.34",
        "benchmark" : "com.github.skjolber.jwt.JwtParseBenchmark.nimbus_parse",
        "mode" : "thrpt",
        "threads" : 1,
        "forks" : 1,
        "jvm" : "/home/svenja/.jdks/openjdk-17.0.2/bin/java",
        "jvmArgs" : [
            "-XX:+UseG1GC"
        ],
        "jdkVersion" : "17.0.2",
        "vmName" : "OpenJDK 64-Bit Server VM",
        "vmVersion" : "17.0.2+8-86",
        "warmupIterations" : 10,
        "warmupTime" : "2 s",
        "warmupBatchSize" : 1,
        "measurementIterations" : 6,
        "measurementTime" : "10 s",
        "measurementBatchSize" : 1,
        "primaryMetric" : {
            "score" : 1163933.0610995898,
            "scoreError" : 16027.254110100592,
            "scoreConfidence" : [
                1147905.8069894891,
                1179960.3152096905
            ],
            "scorePercentiles" : {
                "0.0" : 1155386.237246203,
                "50.0" : 1166959.923031147,
                "90.0" : 1168447.3162907544,
                "95.0" : 1168447.3162907544,
                "99.0" : 1168447.3162907544,
                "99.9" : 1168447.3162907544,
                "99.99" : 1168447.3162907544,
                "99.999" : 1168447.3162907544,
                "99.9999" : 1168447.3162907544,
                "100.0" : 1168447.3162907544
            },
            "scoreUnit" : "ops/s",
            "rawData" : [
                [
                    1157974.6674986915,
                    1155386.237246203,
                    1167497.689334271,
                    1167870.299499596,
                    1168447.3162907544,
                    1166422.1567280232
                ]
            ]
        },
        "secondaryMetrics" : {
        }
    },
    {
        "jmhVersion" : "1.34",
        "benchmark" : "com.github.skjolber.jwt.JwtVerifyBenchmark.auth0_verify",
        "mode" : "thrpt",
        "threads" : 1,
        "forks" : 1,
        "jvm" : "/home/svenja/.jdks/openjdk-17.0.2/bin/java",
        "jvmArgs" : [
            "-XX:+UseG1GC"
        ],
        "jdkVersion" : "17.0.2",
        "vmName" : "OpenJDK 64-Bit Server VM",
        "vmVersion" : "17.0.2+8-86",
        "warmupIterations" : 10,
        "warmupTime" : "2 s",
        "warmupBatchSize" : 1,
        "measurementIterations" : 6,
        "measurementTime" : "10 s",
        "measurementBatchSize" : 1,
        "primaryMetric" : {
            "score" : 26062.428202565865,
            "scoreError" : 25.244557470173035,
            "scoreConfidence" : [
                26037.18364509569,
                26087.67276003604
            ],
            "scorePercentiles" : {
                "0.0" : 26045.977119026487,
                "50.0" : 26063.947944064385,
                "90.0" : 26072.332091602904,
                "95.0" : 26072.332091602904,
                "99.0" : 26072.332091602904,
                "99.9" : 26072.332091602904,
                "99.99" : 26072.332091602904,
                "99.999" : 26072.332091602904,
                "99.9999" : 26072.332091602904,
                "100.0" : 26072.332091602904
            },
            "scoreUnit" : "ops/s",
            "rawData" : [
                [
                    26045.977119026487,
                    26060.598237059723,
                    26067.7658795773,
                    26063.812337588046,
                    26064.08355054072,
                    26072.332091602904
                ]
            ]
        },
        "secondaryMetrics" : {
        }
    },
    {
        "jmhVersion" : "1.34",
        "benchmark" : "com.github.skjolber.jwt.JwtVerifyBenchmark.fusionauth_verify",
        "mode" : "thrpt",
        "threads" : 1,
        "forks" : 1,
        "jvm" : "/home/svenja/.jdks/openjdk-17.0.2/bin/java",
        "jvmArgs" : [
            "-XX:+UseG1GC"
        ],
        "jdkVersion" : "17.0.2",
        "vmName" : "OpenJDK 64-Bit Server VM",
        "vmVersion" : "17.0.2+8-86",
        "warmupIterations" : 10,
        "warmupTime" : "2 s",
        "warmupBatchSize" : 1,
        "measurementIterations" : 6,
        "measurementTime" : "10 s",
        "measurementBatchSize" : 1,
        "primaryMetric" : {
            "score" : 26768.685131820836,
            "scoreError" : 34.97939352155116,
            "scoreConfidence" : [
                26733.705738299286,
                26803.664525342385
            ],
            "scorePercentiles" : {
                "0.0" : 26751.51163208036,
                "50.0" : 26768.769034488232,
                "90.0" : 26782.799633024137,
                "95.0" : 26782.799633024137,
                "99.0" : 26782.799633024137,
                "99.9" : 26782.799633024137,
                "99.99" : 26782.799633024137,
                "99.999" : 26782.799633024137,
                "99.9999" : 26782.799633024137,
                "100.0" : 26782.799633024137
            },
            "scoreUnit" : "ops/s",
            "rawData" : [
                [
                    26761.360612424713,
                    26776.17745655175,
                    26782.799633024137,
                    26779.347309084693,
                    26760.914147759362,
                    26751.51163208036
                ]
            ]
        },
        "secondaryMetrics" : {
        }
    },
    {
        "jmhVersion" : "1.34",
        "benchmark" : "com.github.skjolber.jwt.JwtVerifyBenchmark.jjwt_verify",
        "mode" : "thrpt",
        "threads" : 1,
        "forks" : 1,
        "jvm" : "/home/svenja/.jdks/openjdk-17.0.2/bin/java",
        "jvmArgs" : [
            "-XX:+UseG1GC"
        ],
        "jdkVersion" : "17.0.2",
        "vmName" : "OpenJDK 64-Bit Server VM",
        "vmVersion" : "17.0.2+8-86",
        "warmupIterations" : 10,
        "warmupTime" : "2 s",
        "warmupBatchSize" : 1,
        "measurementIterations" : 6,
        "measurementTime" : "10 s",
        "measurementBatchSize" : 1,
        "primaryMetric" : {
            "score" : 25095.03602133581,
            "scoreError" : 29.24009425077811,
            "scoreConfidence" : [
                25065.795927085033,
                25124.27611558659
            ],
            "scorePercentiles" : {
                "0.0" : 25082.184480684624,
                "50.0" : 25094.20943484952,
                "90.0" : 25109.392552241818,
                "95.0" : 25109.392552241818,
                "99.0" : 25109.392552241818,
                "99.9" : 25109.392552241818,
                "99.99" : 25109.392552241818,
                "99.999" : 25109.392552241818,
                "99.9999" : 25109.392552241818,
                "100.0" : 25109.392552241818
            },
            "scoreUnit" : "ops/s",
            "rawData" : [
                [
                    25097.121453627115,
                    25082.184480684624,
                    25091.297416071924,
                    25086.334191130132,
                    25103.88603425926,
                    25109.392552241818
                ]
            ]
        },
        "secondaryMetrics" : {
        }
    },
    {
        "jmhVersion" : "1.34",
        "benchmark" : "com.github.skjolber.jwt.JwtVerifyBenchmark.nimbus_verify",
        "mode" : "thrpt",
        "threads" : 1,
        "forks" : 1,
        "jvm" : "/home/svenja/.jdks/openjdk-17.0.2/bin/java",
        "jvmArgs" : [
            "-XX:+UseG1GC"
        ],
        "jdkVersion" : "17.0.2",
        "vmName" : "OpenJDK 64-Bit Server VM",
        "vmVersion" : "17.0.2+8-86",
        "warmupIterations" : 10,
        "warmupTime" : "2 s",
        "warmupBatchSize" : 1,
        "measurementIterations" : 6,
        "measurementTime" : "10 s",
        "measurementBatchSize" : 1,
        "primaryMetric" : {
            "score" : 15003.352967286968,
            "scoreError" : 46.85960370496129,
            "scoreConfidence" : [
                14956.493363582007,
                15050.21257099193
            ],
            "scorePercentiles" : {
                "0.0" : 14984.602750181699,
                "50.0" : 15004.686458532822,
                "90.0" : 15024.02716967621,
                "95.0" : 15024.02716967621,
                "99.0" : 15024.02716967621,
                "99.9" : 15024.02716967621,
                "99.99" : 15024.02716967621,
                "99.999" : 15024.02716967621,
                "99.9999" : 15024.02716967621,
                "100.0" : 15024.02716967621
            },
            "scoreUnit" : "ops/s",
            "rawData" : [
                [
                    14985.953130633052,
                    15016.161836165198,
                    14984.602750181699,
                    14996.117697973079,
                    15013.255219092567,
                    15024.02716967621
                ]
            ]
        },
        "secondaryMetrics" : {
        }
    },
    {
        "jmhVersion" : "1.34",
        "benchmark" : "com.github.skjolber.jwt.JwtVerifyBenchmark.okta_verify",
        "mode" : "thrpt",
        "threads" : 1,
        "forks" : 1,
        "jvm" : "/home/svenja/.jdks/openjdk-17.0.2/bin/java",
        "jvmArgs" : [
            "-XX:+UseG1GC"
        ],
        "jdkVersion" : "17.0.2",
        "vmName" : "OpenJDK 64-Bit Server VM",
        "vmVersion" : "17.0.2+8-86",
        "warmupIterations" : 10,
        "warmupTime" : "2 s",
        "warmupBatchSize" : 1,
        "measurementIterations" : 6,
        "measurementTime" : "10 s",
        "measurementBatchSize" : 1,
        "primaryMetric" : {
            "score" : 1033.9971970473894,
            "scoreError" : 1.7689213950685259,
            "scoreConfidence" : [
                1032.228275652321,
                1035.7661184424578
            ],
            "scorePercentiles" : {
                "0.0" : 1033.2967982423195,
                "50.0" : 1033.8292549374025,
                "90.0" : 1034.8893076187235,
                "95.0" : 1034.8893076187235,
                "99.0" : 1034.8893076187235,
                "99.9" : 1034.8893076187235,
                "99.99" : 1034.8893076187235,
                "99.999" : 1034.8893076187235,
                "99.9999" : 1034.8893076187235,
                "100.0" : 1034.8893076187235
            },
            "scoreUnit" : "ops/s",
            "rawData" : [
                [
                    1033.5471065731458,
                    1033.2967982423195,
                    1033.6158593278642,
                    1034.8893076187235,
                    1034.0426505469409,
                    1034.5914599753426
                ]
            ]
        },
        "secondaryMetrics" : {
        }
    }
]


};

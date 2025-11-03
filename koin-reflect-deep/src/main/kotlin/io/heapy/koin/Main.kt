package io.heapy.koin

import io.heapy.sample.common2.*
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.bind
import org.koin.dsl.koinApplication
import org.koin.dsl.module

fun main() {
    val s = koinApplication {
        modules(module {
            singleOf(::DefaultService) bind Service::class
            singleOf(::DefaultService1) bind Service1::class
            singleOf(::DefaultService2) bind Service2::class
            singleOf(::DefaultService3) bind Service3::class
            singleOf(::DefaultService4) bind Service4::class
            singleOf(::DefaultService5) bind Service5::class
            singleOf(::DefaultService6) bind Service6::class
            singleOf(::DefaultService7) bind Service7::class
            singleOf(::DefaultService8) bind Service8::class
            singleOf(::DefaultService9) bind Service9::class
            singleOf(::DefaultService10) bind Service10::class
            singleOf(::DefaultService11) bind Service11::class
            singleOf(::DefaultService12) bind Service12::class
            singleOf(::DefaultService13) bind Service13::class
            singleOf(::DefaultService14) bind Service14::class
            singleOf(::DefaultService15) bind Service15::class
            singleOf(::DefaultService16) bind Service16::class
            singleOf(::DefaultService17) bind Service17::class
            singleOf(::DefaultService18) bind Service18::class
            singleOf(::DefaultService19) bind Service19::class
            singleOf(::DefaultService20) bind Service20::class
            singleOf(::DefaultService21) bind Service21::class
            singleOf(::DefaultService22) bind Service22::class
            singleOf(::DefaultService23) bind Service23::class
            singleOf(::DefaultService24) bind Service24::class
            singleOf(::DefaultService25) bind Service25::class
            singleOf(::DefaultService26) bind Service26::class
            singleOf(::DefaultService27) bind Service27::class
            singleOf(::DefaultService28) bind Service28::class
            singleOf(::DefaultService29) bind Service29::class
            singleOf(::DefaultService30) bind Service30::class
            singleOf(::DefaultService31) bind Service31::class
            singleOf(::DefaultService32) bind Service32::class
            singleOf(::DefaultService33) bind Service33::class
            singleOf(::DefaultService34) bind Service34::class
            singleOf(::DefaultService35) bind Service35::class
            singleOf(::DefaultService36) bind Service36::class
            singleOf(::DefaultService37) bind Service37::class
            singleOf(::DefaultService38) bind Service38::class
            singleOf(::DefaultService39) bind Service39::class
            singleOf(::DefaultService40) bind Service40::class
            singleOf(::DefaultService41) bind Service41::class
            singleOf(::DefaultService42) bind Service42::class
            singleOf(::DefaultService43) bind Service43::class
            singleOf(::DefaultService44) bind Service44::class
            singleOf(::DefaultService45) bind Service45::class
            singleOf(::DefaultService46) bind Service46::class
            singleOf(::DefaultService47) bind Service47::class
            singleOf(::DefaultService48) bind Service48::class
            singleOf(::DefaultService49) bind Service49::class
            singleOf(::DefaultService50) bind Service50::class
            singleOf(::DefaultService51) bind Service51::class
            singleOf(::DefaultService52) bind Service52::class
            singleOf(::DefaultService53) bind Service53::class
            singleOf(::DefaultService54) bind Service54::class
            singleOf(::DefaultService55) bind Service55::class
            singleOf(::DefaultService56) bind Service56::class
            singleOf(::DefaultService57) bind Service57::class
            singleOf(::DefaultService58) bind Service58::class
            singleOf(::DefaultService59) bind Service59::class
            singleOf(::DefaultService60) bind Service60::class
            singleOf(::DefaultService61) bind Service61::class
            singleOf(::DefaultService62) bind Service62::class
            singleOf(::DefaultService63) bind Service63::class
            singleOf(::DefaultService64) bind Service64::class
            singleOf(::DefaultService65) bind Service65::class
            singleOf(::DefaultService66) bind Service66::class
            singleOf(::DefaultService67) bind Service67::class
            singleOf(::DefaultService68) bind Service68::class
            singleOf(::DefaultService69) bind Service69::class
            singleOf(::DefaultService70) bind Service70::class
            singleOf(::DefaultService71) bind Service71::class
            singleOf(::DefaultService72) bind Service72::class
            singleOf(::DefaultService73) bind Service73::class
            singleOf(::DefaultService74) bind Service74::class
            singleOf(::DefaultService75) bind Service75::class
            singleOf(::DefaultService76) bind Service76::class
            singleOf(::DefaultService77) bind Service77::class
            singleOf(::DefaultService78) bind Service78::class
            singleOf(::DefaultService79) bind Service79::class
            singleOf(::DefaultService80) bind Service80::class
            singleOf(::DefaultService81) bind Service81::class
            singleOf(::DefaultService82) bind Service82::class
            singleOf(::DefaultService83) bind Service83::class
            singleOf(::DefaultService84) bind Service84::class
            singleOf(::DefaultService85) bind Service85::class
            singleOf(::DefaultService86) bind Service86::class
            singleOf(::DefaultService87) bind Service87::class
            singleOf(::DefaultService88) bind Service88::class
            singleOf(::DefaultService89) bind Service89::class
            singleOf(::DefaultService90) bind Service90::class
            singleOf(::DefaultService91) bind Service91::class
            singleOf(::DefaultService92) bind Service92::class
            singleOf(::DefaultService93) bind Service93::class
            singleOf(::DefaultService94) bind Service94::class
            singleOf(::DefaultService95) bind Service95::class
            singleOf(::DefaultService96) bind Service96::class
            singleOf(::DefaultService97) bind Service97::class
            singleOf(::DefaultService98) bind Service98::class
            singleOf(::DefaultService99) bind Service99::class
            singleOf(::DefaultService100) bind Service100::class
            singleOf(::DefaultService101) bind Service101::class
        })
    }.koin.get<Service>()

    println(s.name())
}

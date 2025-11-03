package io.heapy.koin

import org.koin.dsl.koinApplication
import org.koin.dsl.module

fun main() {
    val s = koinApplication {
        modules(module {
            single<Service> { DefaultService(get()) }
            single<Service1> { DefaultService1(get()) }
            single<Service2> { DefaultService2(get()) }
            single<Service3> { DefaultService3(get()) }
            single<Service4> { DefaultService4(get()) }
            single<Service5> { DefaultService5(get()) }
            single<Service6> { DefaultService6(get()) }
            single<Service7> { DefaultService7(get()) }
            single<Service8> { DefaultService8(get()) }
            single<Service9> { DefaultService9(get()) }
            single<Service10> { DefaultService10(get()) }
            single<Service11> { DefaultService11(get()) }
            single<Service12> { DefaultService12(get()) }
            single<Service13> { DefaultService13(get()) }
            single<Service14> { DefaultService14(get()) }
            single<Service15> { DefaultService15(get()) }
            single<Service16> { DefaultService16(get()) }
            single<Service17> { DefaultService17(get()) }
            single<Service18> { DefaultService18(get()) }
            single<Service19> { DefaultService19(get()) }
            single<Service20> { DefaultService20(get()) }
            single<Service21> { DefaultService21(get()) }
            single<Service22> { DefaultService22(get()) }
            single<Service23> { DefaultService23(get()) }
            single<Service24> { DefaultService24(get()) }
            single<Service25> { DefaultService25(get()) }
            single<Service26> { DefaultService26(get()) }
            single<Service27> { DefaultService27(get()) }
            single<Service28> { DefaultService28(get()) }
            single<Service29> { DefaultService29(get()) }
            single<Service30> { DefaultService30(get()) }
            single<Service31> { DefaultService31(get()) }
            single<Service32> { DefaultService32(get()) }
            single<Service33> { DefaultService33(get()) }
            single<Service34> { DefaultService34(get()) }
            single<Service35> { DefaultService35(get()) }
            single<Service36> { DefaultService36(get()) }
            single<Service37> { DefaultService37(get()) }
            single<Service38> { DefaultService38(get()) }
            single<Service39> { DefaultService39(get()) }
            single<Service40> { DefaultService40(get()) }
            single<Service41> { DefaultService41(get()) }
            single<Service42> { DefaultService42(get()) }
            single<Service43> { DefaultService43(get()) }
            single<Service44> { DefaultService44(get()) }
            single<Service45> { DefaultService45(get()) }
            single<Service46> { DefaultService46(get()) }
            single<Service47> { DefaultService47(get()) }
            single<Service48> { DefaultService48(get()) }
            single<Service49> { DefaultService49(get()) }
            single<Service50> { DefaultService50(get()) }
            single<Service51> { DefaultService51(get()) }
            single<Service52> { DefaultService52(get()) }
            single<Service53> { DefaultService53(get()) }
            single<Service54> { DefaultService54(get()) }
            single<Service55> { DefaultService55(get()) }
            single<Service56> { DefaultService56(get()) }
            single<Service57> { DefaultService57(get()) }
            single<Service58> { DefaultService58(get()) }
            single<Service59> { DefaultService59(get()) }
            single<Service60> { DefaultService60(get()) }
            single<Service61> { DefaultService61(get()) }
            single<Service62> { DefaultService62(get()) }
            single<Service63> { DefaultService63(get()) }
            single<Service64> { DefaultService64(get()) }
            single<Service65> { DefaultService65(get()) }
            single<Service66> { DefaultService66(get()) }
            single<Service67> { DefaultService67(get()) }
            single<Service68> { DefaultService68(get()) }
            single<Service69> { DefaultService69(get()) }
            single<Service70> { DefaultService70(get()) }
            single<Service71> { DefaultService71(get()) }
            single<Service72> { DefaultService72(get()) }
            single<Service73> { DefaultService73(get()) }
            single<Service74> { DefaultService74(get()) }
            single<Service75> { DefaultService75(get()) }
            single<Service76> { DefaultService76(get()) }
            single<Service77> { DefaultService77(get()) }
            single<Service78> { DefaultService78(get()) }
            single<Service79> { DefaultService79(get()) }
            single<Service80> { DefaultService80(get()) }
            single<Service81> { DefaultService81(get()) }
            single<Service82> { DefaultService82(get()) }
            single<Service83> { DefaultService83(get()) }
            single<Service84> { DefaultService84(get()) }
            single<Service85> { DefaultService85(get()) }
            single<Service86> { DefaultService86(get()) }
            single<Service87> { DefaultService87(get()) }
            single<Service88> { DefaultService88(get()) }
            single<Service89> { DefaultService89(get()) }
            single<Service90> { DefaultService90(get()) }
            single<Service91> { DefaultService91(get()) }
            single<Service92> { DefaultService92(get()) }
            single<Service93> { DefaultService93(get()) }
            single<Service94> { DefaultService94(get()) }
            single<Service95> { DefaultService95(get()) }
            single<Service96> { DefaultService96(get()) }
            single<Service97> { DefaultService97(get()) }
            single<Service98> { DefaultService98(get()) }
            single<Service99> { DefaultService99(get()) }
            single<Service100> { DefaultService100(get()) }
            single<Service101> { DefaultService101() }
        })
    }.koin.get<Service>()

    println(s.name())
}

package io.heapy.kodein

import io.heapy.sample.common2.*
import org.kodein.di.DI
import org.kodein.di.bind
import org.kodein.di.direct
import org.kodein.di.instance
import org.kodein.di.singleton

fun main() {
    val s = DI {
        bind<Service>() with singleton { DefaultService(instance()) }
        bind<Service1>() with singleton { DefaultService1(instance()) }
        bind<Service2>() with singleton { DefaultService2(instance()) }
        bind<Service3>() with singleton { DefaultService3(instance()) }
        bind<Service4>() with singleton { DefaultService4(instance()) }
        bind<Service5>() with singleton { DefaultService5(instance()) }
        bind<Service6>() with singleton { DefaultService6(instance()) }
        bind<Service7>() with singleton { DefaultService7(instance()) }
        bind<Service8>() with singleton { DefaultService8(instance()) }
        bind<Service9>() with singleton { DefaultService9(instance()) }
        bind<Service10>() with singleton { DefaultService10(instance()) }
        bind<Service11>() with singleton { DefaultService11(instance()) }
        bind<Service12>() with singleton { DefaultService12(instance()) }
        bind<Service13>() with singleton { DefaultService13(instance()) }
        bind<Service14>() with singleton { DefaultService14(instance()) }
        bind<Service15>() with singleton { DefaultService15(instance()) }
        bind<Service16>() with singleton { DefaultService16(instance()) }
        bind<Service17>() with singleton { DefaultService17(instance()) }
        bind<Service18>() with singleton { DefaultService18(instance()) }
        bind<Service19>() with singleton { DefaultService19(instance()) }
        bind<Service20>() with singleton { DefaultService20(instance()) }
        bind<Service21>() with singleton { DefaultService21(instance()) }
        bind<Service22>() with singleton { DefaultService22(instance()) }
        bind<Service23>() with singleton { DefaultService23(instance()) }
        bind<Service24>() with singleton { DefaultService24(instance()) }
        bind<Service25>() with singleton { DefaultService25(instance()) }
        bind<Service26>() with singleton { DefaultService26(instance()) }
        bind<Service27>() with singleton { DefaultService27(instance()) }
        bind<Service28>() with singleton { DefaultService28(instance()) }
        bind<Service29>() with singleton { DefaultService29(instance()) }
        bind<Service30>() with singleton { DefaultService30(instance()) }
        bind<Service31>() with singleton { DefaultService31(instance()) }
        bind<Service32>() with singleton { DefaultService32(instance()) }
        bind<Service33>() with singleton { DefaultService33(instance()) }
        bind<Service34>() with singleton { DefaultService34(instance()) }
        bind<Service35>() with singleton { DefaultService35(instance()) }
        bind<Service36>() with singleton { DefaultService36(instance()) }
        bind<Service37>() with singleton { DefaultService37(instance()) }
        bind<Service38>() with singleton { DefaultService38(instance()) }
        bind<Service39>() with singleton { DefaultService39(instance()) }
        bind<Service40>() with singleton { DefaultService40(instance()) }
        bind<Service41>() with singleton { DefaultService41(instance()) }
        bind<Service42>() with singleton { DefaultService42(instance()) }
        bind<Service43>() with singleton { DefaultService43(instance()) }
        bind<Service44>() with singleton { DefaultService44(instance()) }
        bind<Service45>() with singleton { DefaultService45(instance()) }
        bind<Service46>() with singleton { DefaultService46(instance()) }
        bind<Service47>() with singleton { DefaultService47(instance()) }
        bind<Service48>() with singleton { DefaultService48(instance()) }
        bind<Service49>() with singleton { DefaultService49(instance()) }
        bind<Service50>() with singleton { DefaultService50(instance()) }
        bind<Service51>() with singleton { DefaultService51(instance()) }
        bind<Service52>() with singleton { DefaultService52(instance()) }
        bind<Service53>() with singleton { DefaultService53(instance()) }
        bind<Service54>() with singleton { DefaultService54(instance()) }
        bind<Service55>() with singleton { DefaultService55(instance()) }
        bind<Service56>() with singleton { DefaultService56(instance()) }
        bind<Service57>() with singleton { DefaultService57(instance()) }
        bind<Service58>() with singleton { DefaultService58(instance()) }
        bind<Service59>() with singleton { DefaultService59(instance()) }
        bind<Service60>() with singleton { DefaultService60(instance()) }
        bind<Service61>() with singleton { DefaultService61(instance()) }
        bind<Service62>() with singleton { DefaultService62(instance()) }
        bind<Service63>() with singleton { DefaultService63(instance()) }
        bind<Service64>() with singleton { DefaultService64(instance()) }
        bind<Service65>() with singleton { DefaultService65(instance()) }
        bind<Service66>() with singleton { DefaultService66(instance()) }
        bind<Service67>() with singleton { DefaultService67(instance()) }
        bind<Service68>() with singleton { DefaultService68(instance()) }
        bind<Service69>() with singleton { DefaultService69(instance()) }
        bind<Service70>() with singleton { DefaultService70(instance()) }
        bind<Service71>() with singleton { DefaultService71(instance()) }
        bind<Service72>() with singleton { DefaultService72(instance()) }
        bind<Service73>() with singleton { DefaultService73(instance()) }
        bind<Service74>() with singleton { DefaultService74(instance()) }
        bind<Service75>() with singleton { DefaultService75(instance()) }
        bind<Service76>() with singleton { DefaultService76(instance()) }
        bind<Service77>() with singleton { DefaultService77(instance()) }
        bind<Service78>() with singleton { DefaultService78(instance()) }
        bind<Service79>() with singleton { DefaultService79(instance()) }
        bind<Service80>() with singleton { DefaultService80(instance()) }
        bind<Service81>() with singleton { DefaultService81(instance()) }
        bind<Service82>() with singleton { DefaultService82(instance()) }
        bind<Service83>() with singleton { DefaultService83(instance()) }
        bind<Service84>() with singleton { DefaultService84(instance()) }
        bind<Service85>() with singleton { DefaultService85(instance()) }
        bind<Service86>() with singleton { DefaultService86(instance()) }
        bind<Service87>() with singleton { DefaultService87(instance()) }
        bind<Service88>() with singleton { DefaultService88(instance()) }
        bind<Service89>() with singleton { DefaultService89(instance()) }
        bind<Service90>() with singleton { DefaultService90(instance()) }
        bind<Service91>() with singleton { DefaultService91(instance()) }
        bind<Service92>() with singleton { DefaultService92(instance()) }
        bind<Service93>() with singleton { DefaultService93(instance()) }
        bind<Service94>() with singleton { DefaultService94(instance()) }
        bind<Service95>() with singleton { DefaultService95(instance()) }
        bind<Service96>() with singleton { DefaultService96(instance()) }
        bind<Service97>() with singleton { DefaultService97(instance()) }
        bind<Service98>() with singleton { DefaultService98(instance()) }
        bind<Service99>() with singleton { DefaultService99(instance()) }
        bind<Service100>() with singleton { DefaultService100(instance()) }
        bind<Service101>() with singleton { DefaultService101() }
    }.direct.instance<Service>()

    println(s.name())
}

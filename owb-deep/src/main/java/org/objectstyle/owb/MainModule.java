package org.objectstyle.owb;

import io.heapy.sample.common2.*;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Produces;


@ApplicationScoped
public class MainModule {

    @Produces
    @ApplicationScoped
    Service provideService(Service1 service) {
        return new DefaultService(service);
    }

    @Produces
    @ApplicationScoped
    Service1 provideService1(Service2 service) {
        return new DefaultService1(service);
    }

    @Produces
    @ApplicationScoped
    Service2 provideService2(Service3 service) {
        return new DefaultService2(service);
    }

    @Produces
    @ApplicationScoped
    Service3 provideService3(Service4 service) {
        return new DefaultService3(service);
    }

    @Produces
    @ApplicationScoped
    Service4 provideService4(Service5 service) {
        return new DefaultService4(service);
    }

    @Produces
    @ApplicationScoped
    Service5 provideService5(Service6 service) {
        return new DefaultService5(service);
    }

    @Produces
    @ApplicationScoped
    Service6 provideService6(Service7 service) {
        return new DefaultService6(service);
    }

    @Produces
    @ApplicationScoped
    Service7 provideService7(Service8 service) {
        return new DefaultService7(service);
    }

    @Produces
    @ApplicationScoped
    Service8 provideService8(Service9 service) {
        return new DefaultService8(service);
    }

    @Produces
    @ApplicationScoped
    Service9 provideService9(Service10 service) {
        return new DefaultService9(service);
    }

    @Produces
    @ApplicationScoped
    Service10 provideService10(Service11 service) {
        return new DefaultService10(service);
    }

    @Produces
    @ApplicationScoped
    Service11 provideService11(Service12 service) {
        return new DefaultService11(service);
    }

    @Produces
    @ApplicationScoped
    Service12 provideService12(Service13 service) {
        return new DefaultService12(service);
    }

    @Produces
    @ApplicationScoped
    Service13 provideService13(Service14 service) {
        return new DefaultService13(service);
    }

    @Produces
    @ApplicationScoped
    Service14 provideService14(Service15 service) {
        return new DefaultService14(service);
    }

    @Produces
    @ApplicationScoped
    Service15 provideService15(Service16 service) {
        return new DefaultService15(service);
    }

    @Produces
    @ApplicationScoped
    Service16 provideService16(Service17 service) {
        return new DefaultService16(service);
    }

    @Produces
    @ApplicationScoped
    Service17 provideService17(Service18 service) {
        return new DefaultService17(service);
    }

    @Produces
    @ApplicationScoped
    Service18 provideService18(Service19 service) {
        return new DefaultService18(service);
    }

    @Produces
    @ApplicationScoped
    Service19 provideService19(Service20 service) {
        return new DefaultService19(service);
    }

    @Produces
    @ApplicationScoped
    Service20 provideService20(Service21 service) {
        return new DefaultService20(service);
    }

    @Produces
    @ApplicationScoped
    Service21 provideService21(Service22 service) {
        return new DefaultService21(service);
    }

    @Produces
    @ApplicationScoped
    Service22 provideService22(Service23 service) {
        return new DefaultService22(service);
    }

    @Produces
    @ApplicationScoped
    Service23 provideService23(Service24 service) {
        return new DefaultService23(service);
    }

    @Produces
    @ApplicationScoped
    Service24 provideService24(Service25 service) {
        return new DefaultService24(service);
    }

    @Produces
    @ApplicationScoped
    Service25 provideService25(Service26 service) {
        return new DefaultService25(service);
    }

    @Produces
    @ApplicationScoped
    Service26 provideService26(Service27 service) {
        return new DefaultService26(service);
    }

    @Produces
    @ApplicationScoped
    Service27 provideService27(Service28 service) {
        return new DefaultService27(service);
    }

    @Produces
    @ApplicationScoped
    Service28 provideService28(Service29 service) {
        return new DefaultService28(service);
    }

    @Produces
    @ApplicationScoped
    Service29 provideService29(Service30 service) {
        return new DefaultService29(service);
    }

    @Produces
    @ApplicationScoped
    Service30 provideService30(Service31 service) {
        return new DefaultService30(service);
    }

    @Produces
    @ApplicationScoped
    Service31 provideService31(Service32 service) {
        return new DefaultService31(service);
    }

    @Produces
    @ApplicationScoped
    Service32 provideService32(Service33 service) {
        return new DefaultService32(service);
    }

    @Produces
    @ApplicationScoped
    Service33 provideService33(Service34 service) {
        return new DefaultService33(service);
    }

    @Produces
    @ApplicationScoped
    Service34 provideService34(Service35 service) {
        return new DefaultService34(service);
    }

    @Produces
    @ApplicationScoped
    Service35 provideService35(Service36 service) {
        return new DefaultService35(service);
    }

    @Produces
    @ApplicationScoped
    Service36 provideService36(Service37 service) {
        return new DefaultService36(service);
    }

    @Produces
    @ApplicationScoped
    Service37 provideService37(Service38 service) {
        return new DefaultService37(service);
    }

    @Produces
    @ApplicationScoped
    Service38 provideService38(Service39 service) {
        return new DefaultService38(service);
    }

    @Produces
    @ApplicationScoped
    Service39 provideService39(Service40 service) {
        return new DefaultService39(service);
    }

    @Produces
    @ApplicationScoped
    Service40 provideService40(Service41 service) {
        return new DefaultService40(service);
    }

    @Produces
    @ApplicationScoped
    Service41 provideService41(Service42 service) {
        return new DefaultService41(service);
    }

    @Produces
    @ApplicationScoped
    Service42 provideService42(Service43 service) {
        return new DefaultService42(service);
    }

    @Produces
    @ApplicationScoped
    Service43 provideService43(Service44 service) {
        return new DefaultService43(service);
    }

    @Produces
    @ApplicationScoped
    Service44 provideService44(Service45 service) {
        return new DefaultService44(service);
    }

    @Produces
    @ApplicationScoped
    Service45 provideService45(Service46 service) {
        return new DefaultService45(service);
    }

    @Produces
    @ApplicationScoped
    Service46 provideService46(Service47 service) {
        return new DefaultService46(service);
    }

    @Produces
    @ApplicationScoped
    Service47 provideService47(Service48 service) {
        return new DefaultService47(service);
    }

    @Produces
    @ApplicationScoped
    Service48 provideService48(Service49 service) {
        return new DefaultService48(service);
    }

    @Produces
    @ApplicationScoped
    Service49 provideService49(Service50 service) {
        return new DefaultService49(service);
    }

    @Produces
    @ApplicationScoped
    Service50 provideService50(Service51 service) {
        return new DefaultService50(service);
    }

    @Produces
    @ApplicationScoped
    Service51 provideService51(Service52 service) {
        return new DefaultService51(service);
    }

    @Produces
    @ApplicationScoped
    Service52 provideService52(Service53 service) {
        return new DefaultService52(service);
    }

    @Produces
    @ApplicationScoped
    Service53 provideService53(Service54 service) {
        return new DefaultService53(service);
    }

    @Produces
    @ApplicationScoped
    Service54 provideService54(Service55 service) {
        return new DefaultService54(service);
    }

    @Produces
    @ApplicationScoped
    Service55 provideService55(Service56 service) {
        return new DefaultService55(service);
    }

    @Produces
    @ApplicationScoped
    Service56 provideService56(Service57 service) {
        return new DefaultService56(service);
    }

    @Produces
    @ApplicationScoped
    Service57 provideService57(Service58 service) {
        return new DefaultService57(service);
    }

    @Produces
    @ApplicationScoped
    Service58 provideService58(Service59 service) {
        return new DefaultService58(service);
    }

    @Produces
    @ApplicationScoped
    Service59 provideService59(Service60 service) {
        return new DefaultService59(service);
    }

    @Produces
    @ApplicationScoped
    Service60 provideService60(Service61 service) {
        return new DefaultService60(service);
    }

    @Produces
    @ApplicationScoped
    Service61 provideService61(Service62 service) {
        return new DefaultService61(service);
    }

    @Produces
    @ApplicationScoped
    Service62 provideService62(Service63 service) {
        return new DefaultService62(service);
    }

    @Produces
    @ApplicationScoped
    Service63 provideService63(Service64 service) {
        return new DefaultService63(service);
    }

    @Produces
    @ApplicationScoped
    Service64 provideService64(Service65 service) {
        return new DefaultService64(service);
    }

    @Produces
    @ApplicationScoped
    Service65 provideService65(Service66 service) {
        return new DefaultService65(service);
    }

    @Produces
    @ApplicationScoped
    Service66 provideService66(Service67 service) {
        return new DefaultService66(service);
    }

    @Produces
    @ApplicationScoped
    Service67 provideService67(Service68 service) {
        return new DefaultService67(service);
    }

    @Produces
    @ApplicationScoped
    Service68 provideService68(Service69 service) {
        return new DefaultService68(service);
    }

    @Produces
    @ApplicationScoped
    Service69 provideService69(Service70 service) {
        return new DefaultService69(service);
    }

    @Produces
    @ApplicationScoped
    Service70 provideService70(Service71 service) {
        return new DefaultService70(service);
    }

    @Produces
    @ApplicationScoped
    Service71 provideService71(Service72 service) {
        return new DefaultService71(service);
    }

    @Produces
    @ApplicationScoped
    Service72 provideService72(Service73 service) {
        return new DefaultService72(service);
    }

    @Produces
    @ApplicationScoped
    Service73 provideService73(Service74 service) {
        return new DefaultService73(service);
    }

    @Produces
    @ApplicationScoped
    Service74 provideService74(Service75 service) {
        return new DefaultService74(service);
    }

    @Produces
    @ApplicationScoped
    Service75 provideService75(Service76 service) {
        return new DefaultService75(service);
    }

    @Produces
    @ApplicationScoped
    Service76 provideService76(Service77 service) {
        return new DefaultService76(service);
    }

    @Produces
    @ApplicationScoped
    Service77 provideService77(Service78 service) {
        return new DefaultService77(service);
    }

    @Produces
    @ApplicationScoped
    Service78 provideService78(Service79 service) {
        return new DefaultService78(service);
    }

    @Produces
    @ApplicationScoped
    Service79 provideService79(Service80 service) {
        return new DefaultService79(service);
    }

    @Produces
    @ApplicationScoped
    Service80 provideService80(Service81 service) {
        return new DefaultService80(service);
    }

    @Produces
    @ApplicationScoped
    Service81 provideService81(Service82 service) {
        return new DefaultService81(service);
    }

    @Produces
    @ApplicationScoped
    Service82 provideService82(Service83 service) {
        return new DefaultService82(service);
    }

    @Produces
    @ApplicationScoped
    Service83 provideService83(Service84 service) {
        return new DefaultService83(service);
    }

    @Produces
    @ApplicationScoped
    Service84 provideService84(Service85 service) {
        return new DefaultService84(service);
    }

    @Produces
    @ApplicationScoped
    Service85 provideService85(Service86 service) {
        return new DefaultService85(service);
    }

    @Produces
    @ApplicationScoped
    Service86 provideService86(Service87 service) {
        return new DefaultService86(service);
    }

    @Produces
    @ApplicationScoped
    Service87 provideService87(Service88 service) {
        return new DefaultService87(service);
    }

    @Produces
    @ApplicationScoped
    Service88 provideService88(Service89 service) {
        return new DefaultService88(service);
    }

    @Produces
    @ApplicationScoped
    Service89 provideService89(Service90 service) {
        return new DefaultService89(service);
    }

    @Produces
    @ApplicationScoped
    Service90 provideService90(Service91 service) {
        return new DefaultService90(service);
    }

    @Produces
    @ApplicationScoped
    Service91 provideService91(Service92 service) {
        return new DefaultService91(service);
    }

    @Produces
    @ApplicationScoped
    Service92 provideService92(Service93 service) {
        return new DefaultService92(service);
    }

    @Produces
    @ApplicationScoped
    Service93 provideService93(Service94 service) {
        return new DefaultService93(service);
    }

    @Produces
    @ApplicationScoped
    Service94 provideService94(Service95 service) {
        return new DefaultService94(service);
    }

    @Produces
    @ApplicationScoped
    Service95 provideService95(Service96 service) {
        return new DefaultService95(service);
    }

    @Produces
    @ApplicationScoped
    Service96 provideService96(Service97 service) {
        return new DefaultService96(service);
    }

    @Produces
    @ApplicationScoped
    Service97 provideService97(Service98 service) {
        return new DefaultService97(service);
    }

    @Produces
    @ApplicationScoped
    Service98 provideService98(Service99 service) {
        return new DefaultService98(service);
    }

    @Produces
    @ApplicationScoped
    Service99 provideService99(Service100 service) {
        return new DefaultService99(service);
    }

    @Produces
    @ApplicationScoped
    Service100 provideService100(Service101 service) {
        return new DefaultService100(service);
    }

    @Produces
    @ApplicationScoped
    Service101 provideService101() {
        return new DefaultService101();
    }
}

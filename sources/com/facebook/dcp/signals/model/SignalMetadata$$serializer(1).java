package com.facebook.dcp.signals.model;

import X.AnonymousClass6ZC;
import X.AnonymousClass87g;
import X.AnonymousClass8sP;
import X.C04220Ms;
import X.C141528bl;
import X.C147118nQ;
import X.C28173Ezj;
import X.C39060Kls;
import X.C39063Klv;
import X.C39068Km0;
import X.C39069Km1;
import X.C86114wI;
import X.C86144wL;
import X.J5B;
import ch.boye.httpclientandroidlib.cookie.ClientCookie;
import ch.boye.httpclientandroidlib.util.LangUtils;
import com.facebook.common.dextricks.Constants;
import com.facebook.dcp.model.DcpData;
import com.facebook.dcp.model.DcpData$$serializer;
import com.facebook.dcp.model.LogLevel;
import com.facebook.dcp.model.LogLevel$$serializer;
import com.facebook.dcp.model.Type;
import com.instagram.debug.devoptions.FXPFAccessLibraryDebugFragment;
import com.instagram.react.modules.base.IgReactQEModule;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

public final class SignalMetadata$$serializer implements C28173Ezj {
    public static final SignalMetadata$$serializer INSTANCE;
    public static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    public SignalMetadata deserialize(Decoder decoder) {
        int i;
        Decoder decoder2 = decoder;
        C04220Ms.A0B(decoder2, 0);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = descriptor;
        C147118nQ AAF = decoder2.AAF(pluginGeneratedSerialDescriptor);
        String str = null;
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        Object obj5 = null;
        String str2 = null;
        String str3 = null;
        long j = 0;
        long j2 = 0;
        long j3 = 0;
        int i2 = 0;
        boolean z = false;
        int i3 = 0;
        boolean z2 = false;
        boolean z3 = false;
        int i4 = 0;
        String str4 = null;
        boolean z4 = false;
        while (true) {
            int AGx = AAF.AGx(pluginGeneratedSerialDescriptor);
            switch (AGx) {
                case -1:
                    AAF.AKG(pluginGeneratedSerialDescriptor);
                    return new SignalMetadata((DcpData) obj4, (LogLevel) obj2, (Type) obj, str, str2, str4, str3, (String) obj3, (String) obj5, i2, i3, i4, j2, j, j3, z3, z2, z4, z);
                case 0:
                    str = AAF.AHH(pluginGeneratedSerialDescriptor, 0);
                    i2 |= 1;
                    continue;
                case 1:
                    str2 = AAF.AHH(pluginGeneratedSerialDescriptor, 1);
                    i2 |= 2;
                    continue;
                case 2:
                    obj = AAF.AHC(obj, new C39060Kls("com.facebook.dcp.model.Type", Type.values()), pluginGeneratedSerialDescriptor, 2);
                    i2 |= 4;
                    continue;
                case 3:
                    obj4 = AAF.AHB(obj4, DcpData$$serializer.INSTANCE, pluginGeneratedSerialDescriptor, 3);
                    i2 |= 8;
                    continue;
                case 4:
                    str4 = AAF.AHH(pluginGeneratedSerialDescriptor, 4);
                    i2 |= 16;
                    continue;
                case 5:
                    str3 = AAF.AHH(pluginGeneratedSerialDescriptor, 5);
                    i2 |= 32;
                    continue;
                case 6:
                    z3 = AAF.AGq(pluginGeneratedSerialDescriptor, 6);
                    i2 |= 64;
                    continue;
                case 7:
                    z2 = AAF.AGq(pluginGeneratedSerialDescriptor, 7);
                    i2 |= 128;
                    continue;
                case 8:
                    z4 = AAF.AGq(pluginGeneratedSerialDescriptor, 8);
                    i2 |= 256;
                    continue;
                case 9:
                    i3 = AAF.AH6(pluginGeneratedSerialDescriptor, 9);
                    i2 |= 512;
                    continue;
                case 10:
                    i4 = AAF.AH6(pluginGeneratedSerialDescriptor, 10);
                    i2 |= 1024;
                    continue;
                case 11:
                    obj3 = AAF.AHB(obj3, AnonymousClass87g.A00, pluginGeneratedSerialDescriptor, 11);
                    i2 |= 2048;
                    continue;
                case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                    obj5 = AAF.AHB(obj5, AnonymousClass87g.A00, pluginGeneratedSerialDescriptor, 12);
                    i2 |= 4096;
                    continue;
                case 13:
                    obj2 = AAF.AHC(obj2, LogLevel$$serializer.INSTANCE, pluginGeneratedSerialDescriptor, 13);
                    i2 |= 8192;
                    continue;
                case 14:
                    z = AAF.AGq(pluginGeneratedSerialDescriptor, 14);
                    i2 |= Constants.LOAD_RESULT_DEX2OAT_CLASSPATH_SET;
                    continue;
                case 15:
                    j2 = AAF.AH9(pluginGeneratedSerialDescriptor, 15);
                    i = 32768;
                    break;
                case 16:
                    j = AAF.AH9(pluginGeneratedSerialDescriptor, 16);
                    i = Constants.LOAD_RESULT_PGO_ATTEMPTED;
                    break;
                case LangUtils.HASH_SEED /*17*/:
                    j3 = AAF.AH9(pluginGeneratedSerialDescriptor, 17);
                    i = Constants.LOAD_RESULT_DEX2OAT_TRY_PERIODIC_PGO_COMP;
                    break;
                default:
                    throw new C141528bl(AGx);
            }
            i2 |= i;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0034, code lost:
        if (r9 != false) goto L_0x0042;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0040, code lost:
        if (X.C04220Ms.A0I(r12.A06, X.C86114wI.A0J()) != false) goto L_0x0049;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0042, code lost:
        r5.AJy(r12.A06, com.facebook.dcp.model.DcpData$$serializer.INSTANCE, r2, 3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x004c, code lost:
        if (r9 != false) goto L_0x0056;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0054, code lost:
        if (X.C04220Ms.A0I(r12.A0C, "") != false) goto L_0x005b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0056, code lost:
        r5.AK3(r12.A0C, r2, 4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x005c, code lost:
        if (r9 != false) goto L_0x0066;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0064, code lost:
        if (X.C04220Ms.A0I(r12.A0A, "") != false) goto L_0x006b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0066, code lost:
        r5.AK3(r12.A0A, r2, 5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x006c, code lost:
        if (r9 != false) goto L_0x0072;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0070, code lost:
        if (r12.A0F == r3) goto L_0x0077;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0072, code lost:
        r5.AJo(r2, 6, r12.A0F);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0078, code lost:
        if (r9 != false) goto L_0x007e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x007c, code lost:
        if (r12.A0G == r3) goto L_0x0083;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x007e, code lost:
        r5.AJo(r2, 7, r12.A0G);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0085, code lost:
        if (r9 != false) goto L_0x008b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0089, code lost:
        if (r12.A0H == false) goto L_0x0090;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x008b, code lost:
        r5.AJo(r2, 8, r12.A0H);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0092, code lost:
        if (r9 != false) goto L_0x0098;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0096, code lost:
        if (r12.A02 == 0) goto L_0x009d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0098, code lost:
        r5.AJv(r2, 9, r12.A02);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x009f, code lost:
        if (r9 != false) goto L_0x00a7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00a5, code lost:
        if (r12.A01 == 30) goto L_0x00ac;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00a7, code lost:
        r5.AJv(r2, 10, r12.A01);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00ae, code lost:
        if (r9 != false) goto L_0x00b4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00b2, code lost:
        if (r12.A00 == null) goto L_0x00bb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00b4, code lost:
        r5.AJy(r12.A00, X.AnonymousClass87g.A00, r2, 11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00bd, code lost:
        if (r9 != false) goto L_0x00c3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00c1, code lost:
        if (r12.A09 == null) goto L_0x00ca;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00c3, code lost:
        r5.AJy(r12.A09, X.AnonymousClass87g.A00, r2, 12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0021, code lost:
        if (r9 != false) goto L_0x0023;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x00cc, code lost:
        if (r9 != false) goto L_0x00db;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x00d9, code lost:
        if (X.C04220Ms.A0I(r12.A07, new com.facebook.dcp.model.LogLevel(0)) != false) goto L_0x00e2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x00db, code lost:
        r5.AJz(r12.A07, com.facebook.dcp.model.LogLevel$$serializer.INSTANCE, r2, 13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x00e4, code lost:
        if (r9 != false) goto L_0x00ea;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x00e8, code lost:
        if (r12.A0E == r3) goto L_0x00ef;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x00ea, code lost:
        r5.AJo(r2, 14, r12.A0E);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0023, code lost:
        r5.AK3(r12.A0D, r2, r3 ? 1 : 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x00f1, code lost:
        if (r9 != false) goto L_0x00fb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x00f9, code lost:
        if (r12.A05 == 600) goto L_0x0100;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x00fb, code lost:
        r5.AJx(r2, 15, r12.A05);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0102, code lost:
        if (r9 != false) goto L_0x010c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x010a, code lost:
        if (r12.A03 == 3600) goto L_0x0111;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x010c, code lost:
        r5.AJx(r2, 16, r12.A03);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0028, code lost:
        if (r9 == false) goto L_0x0132;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0113, code lost:
        if (r9 != false) goto L_0x011d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x011b, code lost:
        if (r12.A04 == 0) goto L_0x0122;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x011d, code lost:
        r5.AJx(r2, 17, r12.A04);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0122, code lost:
        r5.AKG(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x0125, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x012e, code lost:
        if (X.C04220Ms.A0I(r12.A0D, "0.0.0") == false) goto L_0x0023;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x0136, code lost:
        if (r12.A08 == com.facebook.dcp.model.Type.STRING) goto L_0x0033;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x002a, code lost:
        r5.AJz(r12.A08, X.C86114wI.A0y(), r2, 2);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void serialize(kotlinx.serialization.encoding.Encoder r11, com.facebook.dcp.signals.model.SignalMetadata r12) {
        /*
            r10 = this;
            r4 = 0
            boolean r3 = X.AnonymousClass0wJ.A1Z(r11, r12)
            kotlinx.serialization.internal.PluginGeneratedSerialDescriptor r2 = descriptor
            X.8mU r5 = r11.AAG(r2)
            r6 = 2
            boolean r9 = X.C86114wI.A1Y(r2, r5)
            if (r9 != 0) goto L_0x001c
            java.lang.String r1 = r12.A0B
            java.lang.String r0 = "1"
            boolean r0 = X.C04220Ms.A0I(r1, r0)
            if (r0 != 0) goto L_0x0126
        L_0x001c:
            java.lang.String r0 = r12.A0B
            r5.AK3(r0, r2, r4)
            if (r9 == 0) goto L_0x0126
        L_0x0023:
            java.lang.String r0 = r12.A0D
            r5.AK3(r0, r2, r3)
            if (r9 == 0) goto L_0x0132
        L_0x002a:
            X.Kls r1 = X.C86114wI.A0y()
            com.facebook.dcp.model.Type r0 = r12.A08
            r5.AJz(r0, r1, r2, r6)
        L_0x0033:
            r6 = 3
            if (r9 != 0) goto L_0x0042
            com.facebook.dcp.model.DcpData r1 = r12.A06
            com.facebook.dcp.model.DcpData r0 = X.C86114wI.A0J()
            boolean r0 = X.C04220Ms.A0I(r1, r0)
            if (r0 != 0) goto L_0x0049
        L_0x0042:
            com.facebook.dcp.model.DcpData$$serializer r1 = com.facebook.dcp.model.DcpData$$serializer.INSTANCE
            com.facebook.dcp.model.DcpData r0 = r12.A06
            r5.AJy(r0, r1, r2, r6)
        L_0x0049:
            r1 = 4
            java.lang.String r6 = ""
            if (r9 != 0) goto L_0x0056
            java.lang.String r0 = r12.A0C
            boolean r0 = X.C04220Ms.A0I(r0, r6)
            if (r0 != 0) goto L_0x005b
        L_0x0056:
            java.lang.String r0 = r12.A0C
            r5.AK3(r0, r2, r1)
        L_0x005b:
            r1 = 5
            if (r9 != 0) goto L_0x0066
            java.lang.String r0 = r12.A0A
            boolean r0 = X.C04220Ms.A0I(r0, r6)
            if (r0 != 0) goto L_0x006b
        L_0x0066:
            java.lang.String r0 = r12.A0A
            r5.AK3(r0, r2, r1)
        L_0x006b:
            r1 = 6
            if (r9 != 0) goto L_0x0072
            boolean r0 = r12.A0F
            if (r0 == r3) goto L_0x0077
        L_0x0072:
            boolean r0 = r12.A0F
            r5.AJo(r2, r1, r0)
        L_0x0077:
            r1 = 7
            if (r9 != 0) goto L_0x007e
            boolean r0 = r12.A0G
            if (r0 == r3) goto L_0x0083
        L_0x007e:
            boolean r0 = r12.A0G
            r5.AJo(r2, r1, r0)
        L_0x0083:
            r1 = 8
            if (r9 != 0) goto L_0x008b
            boolean r0 = r12.A0H
            if (r0 == 0) goto L_0x0090
        L_0x008b:
            boolean r0 = r12.A0H
            r5.AJo(r2, r1, r0)
        L_0x0090:
            r1 = 9
            if (r9 != 0) goto L_0x0098
            int r0 = r12.A02
            if (r0 == 0) goto L_0x009d
        L_0x0098:
            int r0 = r12.A02
            r5.AJv(r2, r1, r0)
        L_0x009d:
            r6 = 10
            if (r9 != 0) goto L_0x00a7
            int r1 = r12.A01
            r0 = 30
            if (r1 == r0) goto L_0x00ac
        L_0x00a7:
            int r0 = r12.A01
            r5.AJv(r2, r6, r0)
        L_0x00ac:
            r6 = 11
            if (r9 != 0) goto L_0x00b4
            java.lang.String r0 = r12.A00
            if (r0 == 0) goto L_0x00bb
        L_0x00b4:
            X.87g r1 = X.AnonymousClass87g.A00
            java.lang.String r0 = r12.A00
            r5.AJy(r0, r1, r2, r6)
        L_0x00bb:
            r6 = 12
            if (r9 != 0) goto L_0x00c3
            java.lang.String r0 = r12.A09
            if (r0 == 0) goto L_0x00ca
        L_0x00c3:
            X.87g r1 = X.AnonymousClass87g.A00
            java.lang.String r0 = r12.A09
            r5.AJy(r0, r1, r2, r6)
        L_0x00ca:
            r6 = 13
            if (r9 != 0) goto L_0x00db
            com.facebook.dcp.model.LogLevel r1 = r12.A07
            com.facebook.dcp.model.LogLevel r0 = new com.facebook.dcp.model.LogLevel
            r0.<init>(r4)
            boolean r0 = X.C04220Ms.A0I(r1, r0)
            if (r0 != 0) goto L_0x00e2
        L_0x00db:
            com.facebook.dcp.model.LogLevel$$serializer r1 = com.facebook.dcp.model.LogLevel$$serializer.INSTANCE
            com.facebook.dcp.model.LogLevel r0 = r12.A07
            r5.AJz(r0, r1, r2, r6)
        L_0x00e2:
            r1 = 14
            if (r9 != 0) goto L_0x00ea
            boolean r0 = r12.A0E
            if (r0 == r3) goto L_0x00ef
        L_0x00ea:
            boolean r0 = r12.A0E
            r5.AJo(r2, r1, r0)
        L_0x00ef:
            r8 = 15
            if (r9 != 0) goto L_0x00fb
            long r6 = r12.A05
            r3 = 600(0x258, double:2.964E-321)
            int r0 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r0 == 0) goto L_0x0100
        L_0x00fb:
            long r0 = r12.A05
            r5.AJx(r2, r8, r0)
        L_0x0100:
            r8 = 16
            if (r9 != 0) goto L_0x010c
            long r6 = r12.A03
            r3 = 3600(0xe10, double:1.7786E-320)
            int r0 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r0 == 0) goto L_0x0111
        L_0x010c:
            long r0 = r12.A03
            r5.AJx(r2, r8, r0)
        L_0x0111:
            r8 = 17
            if (r9 != 0) goto L_0x011d
            long r6 = r12.A04
            r3 = 0
            int r0 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r0 == 0) goto L_0x0122
        L_0x011d:
            long r0 = r12.A04
            r5.AJx(r2, r8, r0)
        L_0x0122:
            r5.AKG(r2)
            return
        L_0x0126:
            java.lang.String r1 = r12.A0D
            java.lang.String r0 = "0.0.0"
            boolean r0 = X.C04220Ms.A0I(r1, r0)
            if (r0 != 0) goto L_0x0132
            goto L_0x0023
        L_0x0132:
            com.facebook.dcp.model.Type r1 = r12.A08
            com.facebook.dcp.model.Type r0 = com.facebook.dcp.model.Type.STRING
            if (r1 == r0) goto L_0x0033
            goto L_0x002a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.dcp.signals.model.SignalMetadata$$serializer.serialize(kotlinx.serialization.encoding.Encoder, com.facebook.dcp.signals.model.SignalMetadata):void");
    }

    static {
        SignalMetadata$$serializer signalMetadata$$serializer = new SignalMetadata$$serializer();
        INSTANCE = signalMetadata$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.facebook.dcp.signals.model.SignalMetadata", signalMetadata$$serializer, 18);
        pluginGeneratedSerialDescriptor.A00("id", true);
        pluginGeneratedSerialDescriptor.A00(ClientCookie.VERSION_ATTR, true);
        pluginGeneratedSerialDescriptor.A00("type", true);
        pluginGeneratedSerialDescriptor.A00("defaultValue", true);
        pluginGeneratedSerialDescriptor.A00(FXPFAccessLibraryDebugFragment.NAME, true);
        pluginGeneratedSerialDescriptor.A00("extractorName", true);
        pluginGeneratedSerialDescriptor.A00("isEnabled", true);
        pluginGeneratedSerialDescriptor.A00("isPersisted", true);
        pluginGeneratedSerialDescriptor.A00("isRealTime", true);
        pluginGeneratedSerialDescriptor.A00("collectionDelay", true);
        pluginGeneratedSerialDescriptor.A00("cacheTtlInDays", true);
        pluginGeneratedSerialDescriptor.A00("purpose", true);
        pluginGeneratedSerialDescriptor.A00("access", true);
        pluginGeneratedSerialDescriptor.A00("logLevel", true);
        C86144wL.A1S("collectOnAppStart", pluginGeneratedSerialDescriptor);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    public AnonymousClass8sP[] childSerializers() {
        AnonymousClass87g r1 = AnonymousClass87g.A00;
        C39060Kls A0y = C86114wI.A0y();
        AnonymousClass8sP A00 = J5B.A00(DcpData$$serializer.INSTANCE);
        C39063Klv klv = C39063Klv.A00;
        C39068Km0 km0 = C39068Km0.A00;
        AnonymousClass8sP A002 = J5B.A00(r1);
        AnonymousClass8sP A003 = J5B.A00(r1);
        LogLevel$$serializer logLevel$$serializer = LogLevel$$serializer.INSTANCE;
        C39069Km1 km1 = C39069Km1.A00;
        return new AnonymousClass8sP[]{r1, r1, A0y, A00, r1, r1, klv, klv, klv, km0, km0, A002, A003, logLevel$$serializer, klv, km1, km1, km1};
    }

    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public AnonymousClass8sP[] typeParametersSerializers() {
        return AnonymousClass6ZC.A00;
    }
}

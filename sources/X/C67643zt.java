package X;

import android.content.Context;
import android.os.Build;
import com.instagram.service.session.UserSession;

/* renamed from: X.3zt  reason: invalid class name and case insensitive filesystem */
public final class C67643zt implements AnonymousClass0TG {
    public static final int A03 = Build.VERSION.SDK_INT;
    public final C07810cE A00;
    public final UserSession A01;
    public final Context A02;

    private final boolean A02(long j) {
        C07810cE r3 = this.A00;
        if (r3 == null || 28 - A03 != 0 || j == Long.MIN_VALUE) {
            return false;
        }
        return r3.ATr(j);
    }

    private final double A00(long j) {
        C07810cE r3 = this.A00;
        if (r3 == null || 28 - A03 != 0 || j == Long.MIN_VALUE) {
            return 0.0d;
        }
        return r3.Adp(j);
    }

    private final int A01(int i, long j) {
        C07810cE r3 = this.A00;
        if (r3 == null || 28 - A03 != 0 || j == Long.MIN_VALUE) {
            return i;
        }
        return (int) r3.At2(j);
    }

    public final int AYu() {
        if (28 - A03 != 0) {
            return 0;
        }
        return 45228;
    }

    public C67643zt(Context context, UserSession userSession) {
        AnonymousClass3Ie A04;
        AnonymousClass0wJ.A1O(context, userSession);
        this.A02 = context;
        this.A01 = userSession;
        C67603zp r0 = null;
        if (AYu() != 0) {
            C61823Vx r1 = C61823Vx.A01;
            if (!(r1 == null || (A04 = r1.A04(userSession)) == null)) {
                r0 = A04.A01.A00;
            }
            this.A00 = r0;
            if (r0 != null) {
                r0.A5n(this);
                return;
            }
            return;
        }
        this.A00 = null;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0749 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A03() {
        /*
            r7 = this;
            int r0 = r7.AYu()
            if (r0 == 0) goto L_0x0795
            X.0Kf r4 = new X.0Kf
            r4.<init>()
            X.0cE r0 = r7.A00
            if (r0 == 0) goto L_0x03be
            r0 = 36318428140081557(0x81076b00171195, double:3.031258426134896E-306)
            r3 = 0
            boolean r0 = r7.A02(r0)
            r4.A1J = r0
            r0 = 36318428139688335(0x81076b0011118f, double:3.0312584258862206E-306)
            boolean r0 = r7.A02(r0)
            r4.A19 = r0
            r0 = 36318428139819409(0x81076b00131191, double:3.031258425969112E-306)
            boolean r0 = r7.A02(r0)
            r4.A1A = r0
            r0 = 36318428139557261(0x81076b000f118d, double:3.031258425803329E-306)
            boolean r0 = r7.A02(r0)
            r4.A18 = r0
            r0 = 36318428138967433(0x81076b00061189, double:3.031258425430319E-306)
            boolean r0 = r7.A02(r0)
            r4.A15 = r0
            r0 = 36599903115611453(0x82076b00050d3d, double:3.2092643340687545E-306)
            int r0 = r7.A01(r3, r0)
            r4.A0E = r0
            r0 = 36318428139164042(0x81076b0009118a, double:3.0312584255546556E-306)
            boolean r0 = r7.A02(r0)
            r4.A16 = r0
            r0 = 36599903115808062(0x82076b00080d3e, double:3.209264334193091E-306)
            int r0 = r7.A01(r3, r0)
            r4.A0F = r0
            r0 = 36318428139426188(0x81076b000d118c, double:3.031258425720438E-306)
            boolean r0 = r7.A02(r0)
            r4.A17 = r0
            r0 = 36599903116070207(0x82076b000c0d3f, double:3.2092643343588723E-306)
            int r0 = r7.A01(r3, r0)
            r4.A0G = r0
            r0 = 36318428144079287(0x81076b005411b7, double:3.031258428663076E-306)
            boolean r0 = r7.A02(r0)
            r4.A2m = r0
            r0 = 36599903120723276(0x82076b00530d4c, double:3.209264337301492E-306)
            int r0 = r7.A01(r3, r0)
            r4.A0s = r0
            r0 = 36318428141719970(0x81076b003011a2, double:3.031258427171035E-306)
            boolean r0 = r7.A02(r0)
            r4.A2J = r0
            r0 = 36599903118363969(0x82076b002f0d41, double:3.2092643358094567E-306)
            int r0 = r7.A01(r3, r0)
            r4.A0c = r0
            r0 = 36318428141982116(0x81076b003411a4, double:3.031258427336817E-306)
            boolean r0 = r7.A02(r0)
            r4.A2Q = r0
            r0 = 36599903118626114(0x82076b00330d42, double:3.209264335975238E-306)
            int r0 = r7.A01(r3, r0)
            r4.A0g = r0
            r0 = 36318428141064605(0x81076b0026119d, double:3.031258426756579E-306)
            boolean r0 = r7.A02(r0)
            r4.A1S = r0
            r0 = 36599903117708608(0x82076b00250d40, double:3.209264335395004E-306)
            int r0 = r7.A01(r3, r0)
            r4.A0P = r0
            r0 = 36318428138770824(0x81076b00031188, double:3.031258425305983E-306)
            boolean r0 = r7.A02(r0)
            r4.A14 = r0
            r0 = 36599903115414844(0x82076b00020d3c, double:3.209264333944418E-306)
            int r0 = r7.A01(r3, r0)
            r4.A0D = r0
            r0 = 36318428143554994(0x81076b004c11b2, double:3.031258428331511E-306)
            boolean r0 = r7.A02(r0)
            r4.A2h = r0
            r0 = 36318428143489457(0x81076b004b11b1, double:3.0312584282900654E-306)
            boolean r0 = r7.A02(r0)
            r4.A2g = r0
            r0 = 36318428140016020(0x81076b00161194, double:3.03125842609345E-306)
            boolean r0 = r7.A02(r0)
            r4.A1H = r0
            r0 = 36318428139950483(0x81076b00151193, double:3.031258426052004E-306)
            boolean r0 = r7.A02(r0)
            r4.A1G = r0
            r0 = 36318428143292848(0x81076b004811b0, double:3.031258428165729E-306)
            boolean r0 = r7.A02(r0)
            r4.A2e = r0
            r0 = 36318428142178726(0x81076b003711a6, double:3.031258427461154E-306)
            boolean r0 = r7.A02(r0)
            r4.A2U = r0
            r0 = 36318428142965164(0x81076b004311ac, double:3.0312584279585004E-306)
            boolean r0 = r7.A02(r0)
            r4.A2a = r0
            r0 = 36599903119609160(0x82076b00420d48, double:3.2092643365969205E-306)
            int r0 = r7.A01(r3, r0)
            r4.A0p = r0
            r0 = 36318428143227311(0x81076b004711af, double:3.031258428124283E-306)
            boolean r0 = r7.A02(r0)
            r4.A2d = r0
            r0 = 36599903119871305(0x82076b00460d49, double:3.209264336762702E-306)
            int r0 = r7.A01(r3, r0)
            r4.A0q = r0
            r0 = 36318428142309799(0x81076b003911a7, double:3.031258427544045E-306)
            boolean r0 = r7.A02(r0)
            r4.A2V = r0
            r0 = 36599903118953795(0x82076b00380d43, double:3.209264336182465E-306)
            int r0 = r7.A01(r3, r0)
            r4.A0k = r0
            r0 = 36318428142703018(0x81076b003f11aa, double:3.031258427792718E-306)
            boolean r0 = r7.A02(r0)
            r4.A2Y = r0
            r0 = 36599903119347014(0x82076b003e0d46, double:3.209264336431138E-306)
            int r0 = r7.A01(r3, r0)
            r4.A0n = r0
            r0 = 36318428142571945(0x81076b003d11a9, double:3.031258427709827E-306)
            boolean r0 = r7.A02(r0)
            r4.A2X = r0
            r0 = 36599903119215941(0x82076b003c0d45, double:3.209264336348247E-306)
            int r0 = r7.A01(r3, r0)
            r4.A0m = r0
            r0 = 36318428142834091(0x81076b004111ab, double:3.0312584278756093E-306)
            boolean r0 = r7.A02(r0)
            r4.A2Z = r0
            r0 = 36599903119478087(0x82076b00400d47, double:3.2092643365140294E-306)
            int r0 = r7.A01(r3, r0)
            r4.A0o = r0
            r0 = 36318428142440872(0x81076b003b11a8, double:3.031258427626936E-306)
            boolean r0 = r7.A02(r0)
            r4.A2W = r0
            r0 = 36599903119084868(0x82076b003a0d44, double:3.209264336265356E-306)
            int r0 = r7.A01(r3, r0)
            r4.A0l = r0
            r0 = 36318428143096238(0x81076b004511ae, double:3.031258428041392E-306)
            boolean r0 = r7.A02(r0)
            r4.A2c = r0
            r0 = 36318428143030701(0x81076b004411ad, double:3.031258427999946E-306)
            boolean r0 = r7.A02(r0)
            r4.A2b = r0
            r0 = 36318428142113189(0x81076b003611a5, double:3.031258427419708E-306)
            boolean r0 = r7.A02(r0)
            r4.A2T = r0
            r0 = 36318428141588897(0x81076b002e11a1, double:3.0312584270881436E-306)
            boolean r0 = r7.A02(r0)
            r4.A1s = r0
            r0 = 37162853069160573(0x84076b0007007d, double:3.565276151510733E-306)
            double r0 = r7.A00(r0)
            r4.A01 = r0
            r0 = 37162853069357182(0x84076b000a007e, double:3.565276151635069E-306)
            double r0 = r7.A00(r0)
            r4.A02 = r0
            r0 = 37162853069619327(0x84076b000e007f, double:3.565276151800851E-306)
            double r0 = r7.A00(r0)
            r4.A03 = r0
            r0 = 37162853074272389(0x84076b00550085, double:3.565276154743466E-306)
            double r0 = r7.A00(r0)
            r4.A09 = r0
            r0 = 37162853071913091(0x84076b00310083, double:3.5652761532514364E-306)
            double r0 = r7.A00(r0)
            r4.A07 = r0
            r0 = 37162853072175236(0x84076b00350084, double:3.565276153417218E-306)
            double r0 = r7.A00(r0)
            r4.A08 = r0
            r0 = 37162853071257728(0x84076b00270080, double:3.565276152836982E-306)
            double r0 = r7.A00(r0)
            r4.A04 = r0
            r0 = 37162853068963964(0x84076b0004007c, double:3.5652761513863967E-306)
            double r0 = r7.A00(r0)
            r4.A00 = r0
            r0 = 36318428140212630(0x81076b00191196, double:3.031258426217787E-306)
            boolean r0 = r7.A02(r0)
            r4.A1K = r0
            r0 = 36318428139753872(0x81076b00121190, double:3.0312584259276664E-306)
            boolean r0 = r7.A02(r0)
            r4.A1n = r0
            r0 = 36318428140802458(0x81076b0022119a, double:3.0312584265907964E-306)
            boolean r0 = r7.A02(r0)
            r4.A1r = r0
            r0 = 36318428143620531(0x81076b004d11b3, double:3.031258428372957E-306)
            boolean r0 = r7.A02(r0)
            r4.A2i = r0
            r0 = 36318428141457823(0x81076b002c119f, double:3.031258427005252E-306)
            boolean r0 = r7.A02(r0)
            r4.A1v = r0
            r0 = 36318428141523360(0x81076b002d11a0, double:3.031258427046698E-306)
            boolean r0 = r7.A02(r0)
            r4.A1i = r0
            r0 = 36318428138574214(0x81076b00001186, double:3.031258425181646E-306)
            boolean r0 = r7.A02(r0)
            r4.A1a = r0
            r0 = 36318428139622798(0x81076b0010118e, double:3.031258425844775E-306)
            boolean r0 = r7.A02(r0)
            r4.A1h = r0
            r0 = 36318428140867995(0x81076b0023119b, double:3.031258426632242E-306)
            boolean r0 = r7.A02(r0)
            r4.A1t = r0
            r0 = 36318428138639751(0x81076b00011187, double:3.031258425223092E-306)
            boolean r0 = r7.A02(r0)
            r4.A1U = r0
            r0 = 36318428140933532(0x81076b0024119c, double:3.031258426673688E-306)
            boolean r0 = r7.A02(r0)
            r4.A1o = r0
            r0 = 36318428143948214(0x81076b005211b6, double:3.031258428580185E-306)
            boolean r0 = r7.A02(r0)
            r4.A1x = r0
            r0 = 36318428143882677(0x81076b005111b5, double:3.0312584285387393E-306)
            boolean r0 = r7.A02(r0)
            r4.A1k = r0
            r0 = 36318428141851043(0x81076b003211a3, double:3.031258427253926E-306)
            boolean r0 = r7.A02(r0)
            r4.A1w = r0
            r0 = 36318428139295115(0x81076b000b118b, double:3.0312584256375466E-306)
            boolean r0 = r7.A02(r0)
            r4.A1V = r0
            r0 = 36318428140671384(0x81076b00201198, double:3.031258426507905E-306)
            boolean r0 = r7.A02(r0)
            r4.A1q = r0
            r0 = 36318428141326750(0x81076b002a119e, double:3.031258426922361E-306)
            boolean r0 = r7.A02(r0)
            r4.A1y = r0
            r0 = 37162853071388801(0x84076b00290081, double:3.5652761529198733E-306)
            double r0 = r7.A00(r0)
            r4.A05 = r0
            r0 = 36318428140343703(0x81076b001b1197, double:3.031258426300678E-306)
            boolean r0 = r7.A02(r0)
            r4.A1p = r0
            r1 = 36599903120395594(0x82076b004e0d4a, double:3.2092643370942645E-306)
            r0 = 9
            int r0 = r7.A01(r0, r1)
            r4.A0Q = r0
            r1 = 36599903120461131(0x82076b004f0d4b, double:3.2092643371357104E-306)
            r0 = 1
            int r0 = r7.A01(r0, r1)
            r4.A0R = r0
            r0 = 36318428140736921(0x81076b00211199, double:3.0312584265493506E-306)
            boolean r0 = r7.A02(r0)
            r4.A1g = r0
            r4.A1d = r3
            r4.A1c = r3
            r4.A1Z = r3
            r0 = 36318428143817140(0x81076b005011b4, double:3.0312584284972935E-306)
            boolean r0 = r7.A02(r0)
            r4.A2j = r0
            r0 = 37162853071519874(0x84076b002b0082, double:3.5652761530027644E-306)
            double r0 = r7.A00(r0)
            r4.A06 = r0
            r4.A2P = r3
            r4.A2N = r3
            r4.A2O = r3
            r4.A0f = r3
            r4.A2M = r3
            r4.A0e = r3
            r4.A2L = r3
            r4.A0d = r3
            r4.A1C = r3
            r4.A0r = r3
            r4.A2f = r3
            r1 = 36318428139884946(0x81076b00141192, double:3.031258426010558E-306)
            boolean r0 = r7.A02(r1)
            r4.A1E = r0
            r4.A11 = r3
            r4.A10 = r3
            r4.A2R = r3
            r4.A0h = r3
            r4.A2S = r3
            r4.A0i = r3
            r4.A1F = r3
            r4.A2l = r3
            boolean r0 = r7.A02(r1)
            r4.A1E = r0
            r4.A11 = r3
            r4.A10 = r3
            r4.A2R = r3
            r4.A0h = r3
            r4.A2S = r3
            r4.A0i = r3
            r4.A1F = r3
            r4.A2l = r3
            com.instagram.service.session.UserSession r3 = r7.A01
            X.0TJ r2 = X.AnonymousClass0TJ.A05
            r0 = 36320820435360003(0x81099800001903, double:3.032771323301985E-306)
            boolean r0 = X.C63803iN.A0E(r2, r3, r0)
            r4.A1O = r0
            r0 = 36320820435425540(0x81099800011904, double:3.032771323343431E-306)
            boolean r0 = X.C63803iN.A0E(r2, r3, r0)
            r4.A1P = r0
        L_0x03be:
            android.content.Context r3 = r7.A02
            X.0Kf r0 = X.C03670Kf.A2n
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L_0x0758
            java.lang.String r6 = "risky_startup_config"
            java.lang.String r5 = "RiskyStartupConfig"
            r2 = 0
            java.io.File r0 = r3.getFileStreamPath(r6)     // Catch:{ IOException -> 0x074a }
            java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x074a }
            r1.<init>(r0, r2)     // Catch:{ IOException -> 0x074a }
            java.io.BufferedOutputStream r0 = new java.io.BufferedOutputStream     // Catch:{ IOException -> 0x074a }
            r0.<init>(r1)     // Catch:{ IOException -> 0x074a }
            java.io.DataOutputStream r2 = new java.io.DataOutputStream     // Catch:{ IOException -> 0x074a }
            r2.<init>(r0)     // Catch:{ IOException -> 0x074a }
            boolean r0 = r4.A1J     // Catch:{ all -> 0x0745 }
            r2.writeBoolean(r0)     // Catch:{ all -> 0x0745 }
            boolean r0 = r4.A19     // Catch:{ all -> 0x0745 }
            r2.writeBoolean(r0)     // Catch:{ all -> 0x0745 }
            boolean r0 = r4.A1A     // Catch:{ all -> 0x0745 }
            r2.writeBoolean(r0)     // Catch:{ all -> 0x0745 }
            boolean r0 = r4.A18     // Catch:{ all -> 0x0745 }
            r2.writeBoolean(r0)     // Catch:{ all -> 0x0745 }
            boolean r0 = r4.A15     // Catch:{ all -> 0x0745 }
            r2.writeBoolean(r0)     // Catch:{ all -> 0x0745 }
            int r0 = r4.A0E     // Catch:{ all -> 0x0745 }
            r2.writeInt(r0)     // Catch:{ all -> 0x0745 }
            boolean r0 = r4.A16     // Catch:{ all -> 0x0745 }
            r2.writeBoolean(r0)     // Catch:{ all -> 0x0745 }
            int r0 = r4.A0F     // Catch:{ all -> 0x0745 }
            r2.writeInt(r0)     // Catch:{ all -> 0x0745 }
            boolean r0 = r4.A17     // Catch:{ all -> 0x0745 }
            r2.writeBoolean(r0)     // Catch:{ all -> 0x0745 }
            int r0 = r4.A0G     // Catch:{ all -> 0x0745 }
            r2.writeInt(r0)     // Catch:{ all -> 0x0745 }
            boolean r0 = r4.A2m     // Catch:{ all -> 0x0745 }
            r2.writeBoolean(r0)     // Catch:{ all -> 0x0745 }
            int r0 = r4.A0s     // Catch:{ all -> 0x0745 }
            r2.writeInt(r0)     // Catch:{ all -> 0x0745 }
            boolean r0 = r4.A2J     // Catch:{ all -> 0x0745 }
            r2.writeBoolean(r0)     // Catch:{ all -> 0x0745 }
            int r0 = r4.A0c     // Catch:{ all -> 0x0745 }
            r2.writeInt(r0)     // Catch:{ all -> 0x0745 }
            boolean r0 = r4.A2Q     // Catch:{ all -> 0x0745 }
            r2.writeBoolean(r0)     // Catch:{ all -> 0x0745 }
            int r0 = r4.A0g     // Catch:{ all -> 0x0745 }
            r2.writeInt(r0)     // Catch:{ all -> 0x0745 }
            boolean r0 = r4.A1S     // Catch:{ all -> 0x0745 }
            r2.writeBoolean(r0)     // Catch:{ all -> 0x0745 }
            int r0 = r4.A0P     // Catch:{ all -> 0x0745 }
            r2.writeInt(r0)     // Catch:{ all -> 0x0745 }
            boolean r0 = r4.A14     // Catch:{ all -> 0x0745 }
            r2.writeBoolean(r0)     // Catch:{ all -> 0x0745 }
            int r0 = r4.A0D     // Catch:{ all -> 0x0745 }
            r2.writeInt(r0)     // Catch:{ all -> 0x0745 }
            boolean r0 = r4.A2h     // Catch:{ all -> 0x0745 }
            r2.writeBoolean(r0)     // Catch:{ all -> 0x0745 }
            boolean r0 = r4.A2g     // Catch:{ all -> 0x0745 }
            r2.writeBoolean(r0)     // Catch:{ all -> 0x0745 }
            boolean r0 = r4.A1H     // Catch:{ all -> 0x0745 }
            r2.writeBoolean(r0)     // Catch:{ all -> 0x0745 }
            boolean r0 = r4.A1G     // Catch:{ all -> 0x0745 }
            r2.writeBoolean(r0)     // Catch:{ all -> 0x0745 }
            boolean r0 = r4.A2e     // Catch:{ all -> 0x0745 }
            r2.writeBoolean(r0)     // Catch:{ all -> 0x0745 }
            boolean r0 = r4.A2U     // Catch:{ all -> 0x0745 }
            r2.writeBoolean(r0)     // Catch:{ all -> 0x0745 }
            boolean r0 = r4.A2a     // Catch:{ all -> 0x0745 }
            r2.writeBoolean(r0)     // Catch:{ all -> 0x0745 }
            int r0 = r4.A0p     // Catch:{ all -> 0x0745 }
            r2.writeInt(r0)     // Catch:{ all -> 0x0745 }
            boolean r0 = r4.A2d     // Catch:{ all -> 0x0745 }
            r2.writeBoolean(r0)     // Catch:{ all -> 0x0745 }
            int r0 = r4.A0q     // Catch:{ all -> 0x0745 }
            r2.writeInt(r0)     // Catch:{ all -> 0x0745 }
            boolean r0 = r4.A2V     // Catch:{ all -> 0x0745 }
            r2.writeBoolean(r0)     // Catch:{ all -> 0x0745 }
            int r0 = r4.A0k     // Catch:{ all -> 0x0745 }
            r2.writeInt(r0)     // Catch:{ all -> 0x0745 }
            boolean r0 = r4.A2Y     // Catch:{ all -> 0x0745 }
            r2.writeBoolean(r0)     // Catch:{ all -> 0x0745 }
            int r0 = r4.A0n     // Catch:{ all -> 0x0745 }
            r2.writeInt(r0)     // Catch:{ all -> 0x0745 }
            boolean r0 = r4.A2X     // Catch:{ all -> 0x0745 }
            r2.writeBoolean(r0)     // Catch:{ all -> 0x0745 }
            int r0 = r4.A0m     // Catch:{ all -> 0x0745 }
            r2.writeInt(r0)     // Catch:{ all -> 0x0745 }
            boolean r0 = r4.A2Z     // Catch:{ all -> 0x0745 }
            r2.writeBoolean(r0)     // Catch:{ all -> 0x0745 }
            int r0 = r4.A0o     // Catch:{ all -> 0x0745 }
            r2.writeInt(r0)     // Catch:{ all -> 0x0745 }
            boolean r0 = r4.A2W     // Catch:{ all -> 0x0745 }
            r2.writeBoolean(r0)     // Catch:{ all -> 0x0745 }
            int r0 = r4.A0l     // Catch:{ all -> 0x0745 }
            r2.writeInt(r0)     // Catch:{ all -> 0x0745 }
            boolean r0 = r4.A2c     // Catch:{ all -> 0x0745 }
            r2.writeBoolean(r0)     // Catch:{ all -> 0x0745 }
            boolean r0 = r4.A2b     // Catch:{ all -> 0x0745 }
            r2.writeBoolean(r0)     // Catch:{ all -> 0x0745 }
            boolean r0 = r4.A2T     // Catch:{ all -> 0x0745 }
            r2.writeBoolean(r0)     // Catch:{ all -> 0x0745 }
            boolean r0 = r4.A1s     // Catch:{ all -> 0x0745 }
            r2.writeBoolean(r0)     // Catch:{ all -> 0x0745 }
            double r0 = r4.A01     // Catch:{ all -> 0x0745 }
            r2.writeDouble(r0)     // Catch:{ all -> 0x0745 }
            double r0 = r4.A02     // Catch:{ all -> 0x0745 }
            r2.writeDouble(r0)     // Catch:{ all -> 0x0745 }
            double r0 = r4.A03     // Catch:{ all -> 0x0745 }
            r2.writeDouble(r0)     // Catch:{ all -> 0x0745 }
            double r0 = r4.A09     // Catch:{ all -> 0x0745 }
            r2.writeDouble(r0)     // Catch:{ all -> 0x0745 }
            double r0 = r4.A07     // Catch:{ all -> 0x0745 }
            r2.writeDouble(r0)     // Catch:{ all -> 0x0745 }
            double r0 = r4.A08     // Catch:{ all -> 0x0745 }
            r2.writeDouble(r0)     // Catch:{ all -> 0x0745 }
            double r0 = r4.A04     // Catch:{ all -> 0x0745 }
            r2.writeDouble(r0)     // Catch:{ all -> 0x0745 }
            double r0 = r4.A00     // Catch:{ all -> 0x0745 }
            r2.writeDouble(r0)     // Catch:{ all -> 0x0745 }
            boolean r0 = r4.A1K     // Catch:{ all -> 0x0745 }
            r2.writeBoolean(r0)     // Catch:{ all -> 0x0745 }
            boolean r0 = r4.A1n     // Catch:{ all -> 0x0745 }
            r2.writeBoolean(r0)     // Catch:{ all -> 0x0745 }
            boolean r0 = r4.A1r     // Catch:{ all -> 0x0745 }
            r2.writeBoolean(r0)     // Catch:{ all -> 0x0745 }
            boolean r0 = r4.A2i     // Catch:{ all -> 0x0745 }
            r2.writeBoolean(r0)     // Catch:{ all -> 0x0745 }
            boolean r0 = r4.A1W     // Catch:{ all -> 0x0745 }
            r2.writeBoolean(r0)     // Catch:{ all -> 0x0745 }
            boolean r0 = r4.A1l     // Catch:{ all -> 0x0745 }
            r2.writeBoolean(r0)     // Catch:{ all -> 0x0745 }
            boolean r0 = r4.A1v     // Catch:{ all -> 0x0745 }
            r2.writeBoolean(r0)     // Catch:{ all -> 0x0745 }
            boolean r0 = r4.A1i     // Catch:{ all -> 0x0745 }
            r2.writeBoolean(r0)     // Catch:{ all -> 0x0745 }
            boolean r0 = r4.A1j     // Catch:{ all -> 0x0745 }
            r2.writeBoolean(r0)     // Catch:{ all -> 0x0745 }
            boolean r0 = r4.A1a     // Catch:{ all -> 0x0745 }
            r2.writeBoolean(r0)     // Catch:{ all -> 0x0745 }
            boolean r0 = r4.A1h     // Catch:{ all -> 0x0745 }
            r2.writeBoolean(r0)     // Catch:{ all -> 0x0745 }
            boolean r0 = r4.A1t     // Catch:{ all -> 0x0745 }
            r2.writeBoolean(r0)     // Catch:{ all -> 0x0745 }
            boolean r0 = r4.A1U     // Catch:{ all -> 0x0745 }
            r2.writeBoolean(r0)     // Catch:{ all -> 0x0745 }
            boolean r0 = r4.A1o     // Catch:{ all -> 0x0745 }
            r2.writeBoolean(r0)     // Catch:{ all -> 0x0745 }
            boolean r0 = r4.A1x     // Catch:{ all -> 0x0745 }
            r2.writeBoolean(r0)     // Catch:{ all -> 0x0745 }
            boolean r0 = r4.A1k     // Catch:{ all -> 0x0745 }
            r2.writeBoolean(r0)     // Catch:{ all -> 0x0745 }
            boolean r0 = r4.A1w     // Catch:{ all -> 0x0745 }
            r2.writeBoolean(r0)     // Catch:{ all -> 0x0745 }
            boolean r0 = r4.A1V     // Catch:{ all -> 0x0745 }
            r2.writeBoolean(r0)     // Catch:{ all -> 0x0745 }
            boolean r0 = r4.A1q     // Catch:{ all -> 0x0745 }
            r2.writeBoolean(r0)     // Catch:{ all -> 0x0745 }
            boolean r0 = r4.A1y     // Catch:{ all -> 0x0745 }
            r2.writeBoolean(r0)     // Catch:{ all -> 0x0745 }
            double r0 = r4.A05     // Catch:{ all -> 0x0745 }
            r2.writeDouble(r0)     // Catch:{ all -> 0x0745 }
            boolean r0 = r4.A1p     // Catch:{ all -> 0x0745 }
            r2.writeBoolean(r0)     // Catch:{ all -> 0x0745 }
            int r0 = r4.A0Q     // Catch:{ all -> 0x0745 }
            r2.writeInt(r0)     // Catch:{ all -> 0x0745 }
            int r0 = r4.A0R     // Catch:{ all -> 0x0745 }
            r2.writeInt(r0)     // Catch:{ all -> 0x0745 }
            boolean r0 = r4.A1g     // Catch:{ all -> 0x0745 }
            r2.writeBoolean(r0)     // Catch:{ all -> 0x0745 }
            boolean r0 = r4.A1Y     // Catch:{ all -> 0x0745 }
            r2.writeBoolean(r0)     // Catch:{ all -> 0x0745 }
            boolean r0 = r4.A1X     // Catch:{ all -> 0x0745 }
            r2.writeBoolean(r0)     // Catch:{ all -> 0x0745 }
            boolean r0 = r4.A1b     // Catch:{ all -> 0x0745 }
            r2.writeBoolean(r0)     // Catch:{ all -> 0x0745 }
            boolean r0 = r4.A1e     // Catch:{ all -> 0x0745 }
            r2.writeBoolean(r0)     // Catch:{ all -> 0x0745 }
            boolean r0 = r4.A1m     // Catch:{ all -> 0x0745 }
            r2.writeBoolean(r0)     // Catch:{ all -> 0x0745 }
            boolean r0 = r4.A1d     // Catch:{ all -> 0x0745 }
            r2.writeBoolean(r0)     // Catch:{ all -> 0x0745 }
            boolean r0 = r4.A1c     // Catch:{ all -> 0x0745 }
            r2.writeBoolean(r0)     // Catch:{ all -> 0x0745 }
            boolean r0 = r4.A1T     // Catch:{ all -> 0x0745 }
            r2.writeBoolean(r0)     // Catch:{ all -> 0x0745 }
            boolean r0 = r4.A1u     // Catch:{ all -> 0x0745 }
            r2.writeBoolean(r0)     // Catch:{ all -> 0x0745 }
            boolean r0 = r4.A1f     // Catch:{ all -> 0x0745 }
            r2.writeBoolean(r0)     // Catch:{ all -> 0x0745 }
            boolean r0 = r4.A1Z     // Catch:{ all -> 0x0745 }
            r2.writeBoolean(r0)     // Catch:{ all -> 0x0745 }
            boolean r0 = r4.A2j     // Catch:{ all -> 0x0745 }
            r2.writeBoolean(r0)     // Catch:{ all -> 0x0745 }
            double r0 = r4.A06     // Catch:{ all -> 0x0745 }
            r2.writeDouble(r0)     // Catch:{ all -> 0x0745 }
            boolean r0 = r4.A26     // Catch:{ all -> 0x0745 }
            r2.writeBoolean(r0)     // Catch:{ all -> 0x0745 }
            int r0 = r4.A0X     // Catch:{ all -> 0x0745 }
            r2.writeInt(r0)     // Catch:{ all -> 0x0745 }
            boolean r0 = r4.A24     // Catch:{ all -> 0x0745 }
            r2.writeBoolean(r0)     // Catch:{ all -> 0x0745 }
            int r0 = r4.A0W     // Catch:{ all -> 0x0745 }
            r2.writeInt(r0)     // Catch:{ all -> 0x0745 }
            boolean r0 = r4.A25     // Catch:{ all -> 0x0745 }
            r2.writeBoolean(r0)     // Catch:{ all -> 0x0745 }
            long r0 = r4.A0t     // Catch:{ all -> 0x0745 }
            r2.writeLong(r0)     // Catch:{ all -> 0x0745 }
            boolean r0 = r4.A23     // Catch:{ all -> 0x0745 }
            r2.writeBoolean(r0)     // Catch:{ all -> 0x0745 }
            float r0 = r4.A0A     // Catch:{ all -> 0x0745 }
            r2.writeFloat(r0)     // Catch:{ all -> 0x0745 }
            boolean r0 = r4.A2A     // Catch:{ all -> 0x0745 }
            r2.writeBoolean(r0)     // Catch:{ all -> 0x0745 }
            float r0 = r4.A0C     // Catch:{ all -> 0x0745 }
            r2.writeFloat(r0)     // Catch:{ all -> 0x0745 }
            boolean r0 = r4.A29     // Catch:{ all -> 0x0745 }
            r2.writeBoolean(r0)     // Catch:{ all -> 0x0745 }
            float r0 = r4.A0B     // Catch:{ all -> 0x0745 }
            r2.writeFloat(r0)     // Catch:{ all -> 0x0745 }
            boolean r0 = r4.A28     // Catch:{ all -> 0x0745 }
            r2.writeBoolean(r0)     // Catch:{ all -> 0x0745 }
            boolean r0 = r4.A27     // Catch:{ all -> 0x0745 }
            r2.writeBoolean(r0)     // Catch:{ all -> 0x0745 }
            boolean r0 = r4.A2P     // Catch:{ all -> 0x0745 }
            r2.writeBoolean(r0)     // Catch:{ all -> 0x0745 }
            boolean r0 = r4.A2N     // Catch:{ all -> 0x0745 }
            r2.writeBoolean(r0)     // Catch:{ all -> 0x0745 }
            boolean r0 = r4.A2O     // Catch:{ all -> 0x0745 }
            r2.writeBoolean(r0)     // Catch:{ all -> 0x0745 }
            int r0 = r4.A0f     // Catch:{ all -> 0x0745 }
            r2.writeInt(r0)     // Catch:{ all -> 0x0745 }
            boolean r0 = r4.A2M     // Catch:{ all -> 0x0745 }
            r2.writeBoolean(r0)     // Catch:{ all -> 0x0745 }
            int r0 = r4.A0e     // Catch:{ all -> 0x0745 }
            r2.writeInt(r0)     // Catch:{ all -> 0x0745 }
            boolean r0 = r4.A2L     // Catch:{ all -> 0x0745 }
            r2.writeBoolean(r0)     // Catch:{ all -> 0x0745 }
            int r0 = r4.A0d     // Catch:{ all -> 0x0745 }
            r2.writeInt(r0)     // Catch:{ all -> 0x0745 }
            boolean r0 = r4.A12     // Catch:{ all -> 0x0745 }
            r2.writeBoolean(r0)     // Catch:{ all -> 0x0745 }
            boolean r0 = r4.A2K     // Catch:{ all -> 0x0745 }
            r2.writeBoolean(r0)     // Catch:{ all -> 0x0745 }
            boolean r0 = r4.A1B     // Catch:{ all -> 0x0745 }
            r2.writeBoolean(r0)     // Catch:{ all -> 0x0745 }
            int r0 = r4.A0j     // Catch:{ all -> 0x0745 }
            r2.writeInt(r0)     // Catch:{ all -> 0x0745 }
            boolean r0 = r4.A1C     // Catch:{ all -> 0x0745 }
            r2.writeBoolean(r0)     // Catch:{ all -> 0x0745 }
            int r0 = r4.A0r     // Catch:{ all -> 0x0745 }
            r2.writeInt(r0)     // Catch:{ all -> 0x0745 }
            boolean r0 = r4.A2f     // Catch:{ all -> 0x0745 }
            r2.writeBoolean(r0)     // Catch:{ all -> 0x0745 }
            boolean r0 = r4.A0z     // Catch:{ all -> 0x0745 }
            r2.writeBoolean(r0)     // Catch:{ all -> 0x0745 }
            boolean r0 = r4.A13     // Catch:{ all -> 0x0745 }
            r2.writeBoolean(r0)     // Catch:{ all -> 0x0745 }
            boolean r0 = r4.A1I     // Catch:{ all -> 0x0745 }
            r2.writeBoolean(r0)     // Catch:{ all -> 0x0745 }
            boolean r0 = r4.A0w     // Catch:{ all -> 0x0745 }
            r2.writeBoolean(r0)     // Catch:{ all -> 0x0745 }
            boolean r0 = r4.A0u     // Catch:{ all -> 0x0745 }
            r2.writeBoolean(r0)     // Catch:{ all -> 0x0745 }
            boolean r0 = r4.A1E     // Catch:{ all -> 0x0745 }
            r2.writeBoolean(r0)     // Catch:{ all -> 0x0745 }
            boolean r0 = r4.A11     // Catch:{ all -> 0x0745 }
            r2.writeBoolean(r0)     // Catch:{ all -> 0x0745 }
            boolean r0 = r4.A10     // Catch:{ all -> 0x0745 }
            r2.writeBoolean(r0)     // Catch:{ all -> 0x0745 }
            boolean r0 = r4.A2R     // Catch:{ all -> 0x0745 }
            r2.writeBoolean(r0)     // Catch:{ all -> 0x0745 }
            int r0 = r4.A0h     // Catch:{ all -> 0x0745 }
            r2.writeInt(r0)     // Catch:{ all -> 0x0745 }
            boolean r0 = r4.A2S     // Catch:{ all -> 0x0745 }
            r2.writeBoolean(r0)     // Catch:{ all -> 0x0745 }
            int r0 = r4.A0i     // Catch:{ all -> 0x0745 }
            r2.writeInt(r0)     // Catch:{ all -> 0x0745 }
            boolean r0 = r4.A1F     // Catch:{ all -> 0x0745 }
            r2.writeBoolean(r0)     // Catch:{ all -> 0x0745 }
            boolean r0 = r4.A2l     // Catch:{ all -> 0x0745 }
            r2.writeBoolean(r0)     // Catch:{ all -> 0x0745 }
            boolean r0 = r4.A0x     // Catch:{ all -> 0x0745 }
            r2.writeBoolean(r0)     // Catch:{ all -> 0x0745 }
            boolean r0 = r4.A0y     // Catch:{ all -> 0x0745 }
            r2.writeBoolean(r0)     // Catch:{ all -> 0x0745 }
            boolean r0 = r4.A1R     // Catch:{ all -> 0x0745 }
            r2.writeBoolean(r0)     // Catch:{ all -> 0x0745 }
            boolean r0 = r4.A1Q     // Catch:{ all -> 0x0745 }
            r2.writeBoolean(r0)     // Catch:{ all -> 0x0745 }
            int r0 = r4.A0O     // Catch:{ all -> 0x0745 }
            r2.writeInt(r0)     // Catch:{ all -> 0x0745 }
            int r0 = r4.A0H     // Catch:{ all -> 0x0745 }
            r2.writeInt(r0)     // Catch:{ all -> 0x0745 }
            int r0 = r4.A0N     // Catch:{ all -> 0x0745 }
            r2.writeInt(r0)     // Catch:{ all -> 0x0745 }
            int r0 = r4.A0J     // Catch:{ all -> 0x0745 }
            r2.writeInt(r0)     // Catch:{ all -> 0x0745 }
            int r0 = r4.A0K     // Catch:{ all -> 0x0745 }
            r2.writeInt(r0)     // Catch:{ all -> 0x0745 }
            int r0 = r4.A0M     // Catch:{ all -> 0x0745 }
            r2.writeInt(r0)     // Catch:{ all -> 0x0745 }
            int r0 = r4.A0L     // Catch:{ all -> 0x0745 }
            r2.writeInt(r0)     // Catch:{ all -> 0x0745 }
            boolean r0 = r4.A1L     // Catch:{ all -> 0x0745 }
            r2.writeBoolean(r0)     // Catch:{ all -> 0x0745 }
            boolean r0 = r4.A1M     // Catch:{ all -> 0x0745 }
            r2.writeBoolean(r0)     // Catch:{ all -> 0x0745 }
            int r0 = r4.A0I     // Catch:{ all -> 0x0745 }
            r2.writeInt(r0)     // Catch:{ all -> 0x0745 }
            boolean r0 = r4.A21     // Catch:{ all -> 0x0745 }
            r2.writeBoolean(r0)     // Catch:{ all -> 0x0745 }
            int r0 = r4.A0S     // Catch:{ all -> 0x0745 }
            r2.writeInt(r0)     // Catch:{ all -> 0x0745 }
            int r0 = r4.A0U     // Catch:{ all -> 0x0745 }
            r2.writeInt(r0)     // Catch:{ all -> 0x0745 }
            int r0 = r4.A0V     // Catch:{ all -> 0x0745 }
            r2.writeInt(r0)     // Catch:{ all -> 0x0745 }
            boolean r0 = r4.A22     // Catch:{ all -> 0x0745 }
            r2.writeBoolean(r0)     // Catch:{ all -> 0x0745 }
            int r0 = r4.A0T     // Catch:{ all -> 0x0745 }
            r2.writeInt(r0)     // Catch:{ all -> 0x0745 }
            boolean r0 = r4.A0v     // Catch:{ all -> 0x0745 }
            r2.writeBoolean(r0)     // Catch:{ all -> 0x0745 }
            boolean r0 = r4.A1D     // Catch:{ all -> 0x0745 }
            r2.writeBoolean(r0)     // Catch:{ all -> 0x0745 }
            boolean r0 = r4.A2D     // Catch:{ all -> 0x0745 }
            r2.writeBoolean(r0)     // Catch:{ all -> 0x0745 }
            boolean r0 = r4.A2B     // Catch:{ all -> 0x0745 }
            r2.writeBoolean(r0)     // Catch:{ all -> 0x0745 }
            boolean r0 = r4.A2F     // Catch:{ all -> 0x0745 }
            r2.writeBoolean(r0)     // Catch:{ all -> 0x0745 }
            boolean r0 = r4.A2H     // Catch:{ all -> 0x0745 }
            r2.writeBoolean(r0)     // Catch:{ all -> 0x0745 }
            int r0 = r4.A0b     // Catch:{ all -> 0x0745 }
            r2.writeInt(r0)     // Catch:{ all -> 0x0745 }
            int r0 = r4.A0Z     // Catch:{ all -> 0x0745 }
            r2.writeInt(r0)     // Catch:{ all -> 0x0745 }
            boolean r0 = r4.A1N     // Catch:{ all -> 0x0745 }
            r2.writeBoolean(r0)     // Catch:{ all -> 0x0745 }
            boolean r0 = r4.A2E     // Catch:{ all -> 0x0745 }
            r2.writeBoolean(r0)     // Catch:{ all -> 0x0745 }
            boolean r0 = r4.A2C     // Catch:{ all -> 0x0745 }
            r2.writeBoolean(r0)     // Catch:{ all -> 0x0745 }
            boolean r0 = r4.A2G     // Catch:{ all -> 0x0745 }
            r2.writeBoolean(r0)     // Catch:{ all -> 0x0745 }
            boolean r0 = r4.A2I     // Catch:{ all -> 0x0745 }
            r2.writeBoolean(r0)     // Catch:{ all -> 0x0745 }
            int r0 = r4.A0a     // Catch:{ all -> 0x0745 }
            r2.writeInt(r0)     // Catch:{ all -> 0x0745 }
            int r0 = r4.A0Y     // Catch:{ all -> 0x0745 }
            r2.writeInt(r0)     // Catch:{ all -> 0x0745 }
            boolean r0 = r4.A1z     // Catch:{ all -> 0x0745 }
            r2.writeBoolean(r0)     // Catch:{ all -> 0x0745 }
            boolean r0 = r4.A20     // Catch:{ all -> 0x0745 }
            r2.writeBoolean(r0)     // Catch:{ all -> 0x0745 }
            boolean r0 = r4.A2k     // Catch:{ all -> 0x0745 }
            r2.writeBoolean(r0)     // Catch:{ all -> 0x0745 }
            boolean r0 = r4.A1O     // Catch:{ all -> 0x0745 }
            r2.writeBoolean(r0)     // Catch:{ all -> 0x0745 }
            boolean r0 = r4.A1P     // Catch:{ all -> 0x0745 }
            r2.writeBoolean(r0)     // Catch:{ all -> 0x0745 }
            r2.close()     // Catch:{ IOException -> 0x074a }
            goto L_0x0758
        L_0x0745:
            r0 = move-exception
            r2.close()     // Catch:{ all -> 0x0749 }
        L_0x0749:
            throw r0     // Catch:{ IOException -> 0x074a }
        L_0x074a:
            r2 = move-exception
            java.lang.Object[] r1 = new java.lang.Object[]{r6}
            java.lang.String r0 = "Cannot write to file %s"
            java.lang.String r0 = java.lang.String.format(r0, r1)
            android.util.Log.e(r5, r0, r2)
        L_0x0758:
            r0 = 1832390025(0x6d380d89, float:3.5601003E27)
            java.io.File r6 = X.C14630pr.A00(r3, r0)
            r6.mkdirs()
            boolean r0 = r6.exists()
            if (r0 == 0) goto L_0x0795
            java.io.File[] r5 = r6.listFiles()
            int r4 = r5.length
            r3 = 0
        L_0x076e:
            java.lang.String r2 = "RiskyStartupConfig"
            if (r3 >= r4) goto L_0x078a
            r1 = r5[r3]
            boolean r0 = r1.delete()
            if (r0 != 0) goto L_0x0787
            java.lang.Object[] r1 = new java.lang.Object[]{r1}
            java.lang.String r0 = "Could not delete config read state: %s"
            java.lang.String r0 = java.lang.String.format(r0, r1)
            android.util.Log.w(r2, r0)
        L_0x0787:
            int r3 = r3 + 1
            goto L_0x076e
        L_0x078a:
            boolean r0 = r6.delete()
            if (r0 != 0) goto L_0x0795
            java.lang.String r0 = "Could not delete all risky start up config state"
            android.util.Log.w(r2, r0)
        L_0x0795:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C67643zt.A03():void");
    }

    public final void BrR(C07810cE r1, int i) {
        A03();
    }
}

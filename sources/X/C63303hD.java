package X;

import android.os.Handler;
import android.os.SystemClock;
import com.facebook.exoplayer.monitor.VpsEventCallback;
import com.facebook.video.heroplayer.ipc.VideoPlayRequest;
import com.facebook.video.heroplayer.setting.HeroPlayerSetting;
import java.util.HashMap;

/* renamed from: X.3hD  reason: invalid class name and case insensitive filesystem */
public final class C63303hD {
    public int A00;
    public int A01;
    public int A02;
    public long A03 = SystemClock.elapsedRealtime();
    public AnonymousClass22Z A04;
    public C39753KzN A05;
    public String A06;
    public long A07 = -1;
    public final Handler A08;
    public final AnonymousClass22Z A09;
    public final JPH A0A;
    public final HeroPlayerSetting A0B;
    public final Runnable A0C;
    public final VpsEventCallback A0D;
    public final C81254nS A0E;
    public final VideoPlayRequest A0F;

    public C63303hD(Handler handler, VpsEventCallback vpsEventCallback, C81254nS r10, VideoPlayRequest videoPlayRequest, JPH jph, HeroPlayerSetting heroPlayerSetting) {
        C04220Ms.A0B(handler, 1);
        this.A08 = handler;
        this.A0B = heroPlayerSetting;
        this.A0F = videoPlayRequest;
        this.A0A = jph;
        this.A0D = vpsEventCallback;
        this.A0E = r10;
        this.A01 = videoPlayRequest.A05;
        AnonymousClass22Z A002 = A00(this);
        this.A09 = A002;
        this.A04 = A002;
        this.A0C = AnonymousClass4TJ.A00;
        this.A06 = "";
        A05();
        long j = (long) A01(this.A04, this).A0O;
        if (j > 0) {
            this.A08.postDelayed(this.A0C, j);
        }
        AnonymousClass22Z r2 = this.A04;
        AnonymousClass00U.A0L("Initial:", this.A06);
        A02(A002, r2, this);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000e, code lost:
        if (r0 == 2) goto L_0x0010;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.AnonymousClass22Z A00(X.C63303hD r6) {
        /*
            com.facebook.video.heroplayer.setting.HeroPlayerSetting r5 = r6.A0B
            int r0 = r5.A0g
            r1 = 2
            if (r0 == r1) goto L_0x0010
            r3 = 1
            if (r0 == r3) goto L_0x0017
            int r0 = r6.A01
            if (r0 == r3) goto L_0x0017
            if (r0 != r1) goto L_0x0032
        L_0x0010:
            java.lang.String r0 = "ToggleNormal"
        L_0x0012:
            r6.A06 = r0
            X.22Z r4 = X.AnonymousClass22Z.REGULAR_LATENCY
            return r4
        L_0x0017:
            com.facebook.video.heroplayer.ipc.VideoPlayRequest r1 = r6.A0F
            boolean r0 = r1.A0J
            if (r0 != 0) goto L_0x0032
            com.facebook.video.heroplayer.ipc.VideoSource r0 = r1.A0b
            boolean r0 = r0.A0Q
            if (r0 == 0) goto L_0x0074
            java.util.Map r0 = r5.A1C
            X.22Z r4 = X.AnonymousClass22Z.ULTRA_LOW_LATENCY
            boolean r0 = r0.containsKey(r4)
            if (r0 != r3) goto L_0x0074
            java.lang.String r0 = "ToggleLow+LLClassifier"
        L_0x002f:
            r6.A06 = r0
            return r4
        L_0x0032:
            com.facebook.video.heroplayer.ipc.VideoPlayRequest r2 = r6.A0F
            com.facebook.video.heroplayer.ipc.VideoSource r1 = r2.A0b
            boolean r0 = r1.A0Q
            if (r0 == 0) goto L_0x004b
            java.util.Map r0 = r5.A1C
            X.22Z r4 = X.AnonymousClass22Z.ULTRA_LOW_LATENCY
            boolean r0 = r0.containsKey(r4)
            if (r0 != r3) goto L_0x004b
            boolean r0 = r2.A0J
            if (r0 != 0) goto L_0x004b
            java.lang.String r0 = "ULLClassifier"
            goto L_0x002f
        L_0x004b:
            boolean r0 = r1.A0M
            if (r0 == 0) goto L_0x0060
            java.util.Map r0 = r5.A1C
            X.22Z r4 = X.AnonymousClass22Z.LOW_LATENCY
            boolean r0 = r0.containsKey(r4)
            if (r0 != r3) goto L_0x0060
            boolean r0 = r2.A0J
            if (r0 != 0) goto L_0x0060
            java.lang.String r0 = "LLClassifier"
            goto L_0x002f
        L_0x0060:
            boolean r0 = r2.A0J
            if (r0 == 0) goto L_0x0071
            java.util.Map r0 = r5.A1C
            X.22Z r4 = X.AnonymousClass22Z.LOW_LATENCY_HUDDLE
            boolean r0 = r0.containsKey(r4)
            if (r0 != r3) goto L_0x0071
            java.lang.String r0 = "Huddle"
            goto L_0x002f
        L_0x0071:
            java.lang.String r0 = "Classifier"
            goto L_0x0012
        L_0x0074:
            X.22Z r4 = X.AnonymousClass22Z.LOW_LATENCY
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C63303hD.A00(X.3hD):X.22Z");
    }

    public static final C72384Ny A01(AnonymousClass22Z r1, C63303hD r2) {
        C72384Ny r0 = (C72384Ny) r2.A0B.A1C.get(r1);
        if (r0 == null) {
            return new C72384Ny();
        }
        return r0;
    }

    public static final void A02(AnonymousClass22Z r3, AnonymousClass22Z r4, C63303hD r5) {
        VpsEventCallback vpsEventCallback = r5.A0D;
        System.currentTimeMillis();
        A01(r4, r5);
        vpsEventCallback.callback(new C34445ITu());
        HashMap A0y = AnonymousClass0wJ.A0y();
        A0y.put("latency_level", r4.toString());
        A0y.put("target_latency_level", r3.toString());
        A0y.put("settings", A01(r4, r5).A0X);
        A0y.put("reason", r5.A06);
    }

    private final boolean A04(C72384Ny r9) {
        C39753KzN kzN;
        long j;
        String str;
        C84004sO ASp;
        C39753KzN kzN2;
        long j2;
        C84004sO ASp2;
        if (!r9.A0b || this.A0A.A03.A01()) {
            String str2 = r9.A0V;
            C04220Ms.A05(str2);
            if (str2.length() == 0 || AnonymousClass8bP.A0j(str2, "UNKNOWN", true)) {
                int i = r9.A0D;
                if (i > 0 && this.A00 <= i) {
                    str = "abr_bitrate";
                } else if (r9.A0c) {
                    str = AnonymousClass00U.A0L("not QUIC: ", (String) null);
                } else {
                    int i2 = r9.A0C;
                    if (!(i2 <= 0 || (kzN2 = this.A05) == null || kzN2.ASp() == null)) {
                        int i3 = r9.A0B;
                        C39753KzN kzN3 = this.A05;
                        if (kzN3 == null || (ASp2 = kzN3.ASp()) == null) {
                            j2 = 0;
                        } else {
                            j2 = ASp2.getEstimatedThroughput(i3, (String) null);
                        }
                        if (j2 <= ((long) i2)) {
                            str = "low_bandwidth";
                        }
                    }
                    int i4 = r9.A0G;
                    if (!(i4 <= 0 || (kzN = this.A05) == null || kzN.ASp() == null)) {
                        int i5 = r9.A0F;
                        C39753KzN kzN4 = this.A05;
                        if (kzN4 == null || (ASp = kzN4.ASp()) == null) {
                            j = Long.MAX_VALUE;
                        } else {
                            j = ASp.getEstimatedRequestTTFBMs(i5, (String) null);
                        }
                        if (j >= ((long) i4)) {
                            str = "high_ttfb";
                        }
                    }
                    return false;
                }
            } else {
                str = AnonymousClass000.A00(846);
            }
        } else {
            str = "cell";
        }
        this.A06 = str;
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00d2, code lost:
        if (r3 == r5) goto L_0x0052;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A05() {
        /*
            r10 = this;
            X.22Z r0 = r10.A04
            X.4Ny r7 = A01(r0, r10)
            long r1 = r10.A07
            r8 = 0
            int r0 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r0 <= 0) goto L_0x0027
            long r4 = android.os.SystemClock.elapsedRealtime()
            long r4 = r4 - r1
            int r0 = r7.A0P
            long r2 = (long) r0
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 >= 0) goto L_0x0027
            long r2 = r2 - r4
            int r0 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r0 <= 0) goto L_0x0026
            android.os.Handler r1 = r10.A08
            java.lang.Runnable r0 = r10.A0C
            r1.postDelayed(r0, r2)
        L_0x0026:
            return
        L_0x0027:
            long r4 = android.os.SystemClock.elapsedRealtime()
            long r0 = r10.A03
            long r4 = r4 - r0
            int r3 = r10.A02
            if (r3 <= 0) goto L_0x00d6
            int r0 = r7.A0O
            long r1 = (long) r0
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x00d6
            long r0 = (long) r3
            long r4 = r4 / r0
            int r0 = r7.A0E
            long r1 = (long) r0
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x00d6
            java.lang.String r0 = "stalls"
            r10.A06 = r0
            r1 = 1
        L_0x0047:
            boolean r0 = r10.A04(r7)
            X.22Z r6 = X.AnonymousClass22Z.UNDEFINED
            r5 = r6
            if (r1 != 0) goto L_0x00ba
            if (r0 != 0) goto L_0x00ba
        L_0x0052:
            X.22Z r0 = r10.A04
            X.22Z r8 = r10.A09
            int r0 = r0.compareTo(r8)
            if (r0 <= 0) goto L_0x0088
            int r1 = r7.A0J
            if (r1 <= 0) goto L_0x0090
            int r0 = r10.A00
            if (r0 <= r1) goto L_0x0090
            java.lang.String r0 = "abr_bitrate"
        L_0x0066:
            r10.A06 = r0
            X.22Z r0 = r10.A04
            X.22Z r2 = r7.A0U
            if (r0 == r2) goto L_0x0088
            X.C04220Ms.A05(r2)
            X.4Ny r0 = A01(r2, r10)
            boolean r0 = r10.A04(r0)
            if (r0 != 0) goto L_0x0088
            r6 = r2
            if (r2 == r5) goto L_0x0088
            java.lang.String r1 = "Upgrade:"
            java.lang.String r0 = r10.A06
            X.AnonymousClass00U.A0L(r1, r0)
            A02(r8, r2, r10)
        L_0x0088:
            if (r6 == r5) goto L_0x0026
            r10.A04 = r6
            A03(r10)
            return
        L_0x0090:
            int r9 = r7.A0I
            if (r9 <= 0) goto L_0x0088
            X.KzN r0 = r10.A05
            if (r0 == 0) goto L_0x0088
            X.4sO r0 = r0.ASp()
            if (r0 == 0) goto L_0x0088
            int r2 = r7.A0H
            X.KzN r0 = r10.A05
            if (r0 == 0) goto L_0x00b7
            X.4sO r1 = r0.ASp()
            if (r1 == 0) goto L_0x00b7
            r0 = 0
            long r3 = r1.getEstimatedThroughput(r2, r0)
        L_0x00af:
            long r1 = (long) r9
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0088
            java.lang.String r0 = "high_bandwidth"
            goto L_0x0066
        L_0x00b7:
            r3 = 0
            goto L_0x00af
        L_0x00ba:
            X.22Z r0 = r10.A04
            X.22Z r3 = r7.A0T
            if (r0 == r3) goto L_0x0052
            r6 = r3
            X.C04220Ms.A05(r3)
            if (r3 == r5) goto L_0x0052
            X.22Z r2 = r10.A09
            java.lang.String r1 = "Fallback:"
            java.lang.String r0 = r10.A06
            X.AnonymousClass00U.A0L(r1, r0)
            A02(r2, r3, r10)
            if (r3 != r5) goto L_0x0088
            goto L_0x0052
        L_0x00d6:
            r1 = 0
            goto L_0x0047
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C63303hD.A05():void");
    }

    public static final void A03(C63303hD r7) {
        r7.A03 = SystemClock.elapsedRealtime();
        r7.A07 = SystemClock.elapsedRealtime();
        r7.A02 = 0;
        Handler handler = r7.A08;
        Runnable runnable = r7.A0C;
        handler.removeCallbacks(runnable);
        long j = (long) A01(r7.A04, r7).A0O;
        if (j > 0) {
            handler.postDelayed(runnable, j);
        }
    }
}

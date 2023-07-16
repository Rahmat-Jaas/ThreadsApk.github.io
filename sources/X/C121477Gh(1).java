package X;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseArray;
import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.vision.zzb;
import com.google.android.gms.internal.vision.zzk;
import com.google.android.gms.internal.vision.zzl;
import com.google.android.gms.internal.vision.zzs;
import com.google.android.gms.vision.barcode.Barcode;
import com.instagram.service.session.UserSession;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.HashMap;

/* renamed from: X.7Gh  reason: invalid class name and case insensitive filesystem */
public final class C121477Gh {
    public long A00;
    public AnonymousClass7DK A01;
    public String A02;
    public HashMap A03;
    public final Context A04;
    public final UserSession A05;

    public C121477Gh(Context context, UserSession userSession) {
        C04220Ms.A0B(userSession, 2);
        this.A04 = context;
        this.A05 = userSession;
    }

    public static final AnonymousClass79P A00(C108986jH r9, C121477Gh r10) {
        int i;
        Barcode[] barcodeArr;
        int i2 = 0;
        try {
            PackageManager packageManager = r10.A04.getPackageManager();
            if (packageManager != null) {
                i = packageManager.getPackageInfo("com.google.android.gms", 0).versionCode;
                if (i >= 9452000) {
                    Context context = r10.A04;
                    zzk zzk = new zzk();
                    zzk.A00 = 256;
                    C112996qX r3 = new C112996qX(context, zzk);
                    if (r3.A00() != null) {
                        zzs zzs = new zzs();
                        C107506gr r1 = r9.A02;
                        zzs.A00 = r1.A00;
                        zzs.A01 = r1.A01;
                        zzs.A03 = 0;
                        zzs.A02 = 0;
                        zzs.A04 = 0;
                        Bitmap bitmap = r9.A00;
                        if (bitmap != null) {
                            if (r3.A00() != null) {
                                try {
                                    ObjectWrapper objectWrapper = new ObjectWrapper(bitmap);
                                    Object A002 = r3.A00();
                                    C13320nQ.A01(A002);
                                    zzb zzb = (zzb) ((zzl) A002);
                                    int A032 = C14030oh.A03(-1436719897);
                                    Parcel A003 = zzb.A00(objectWrapper, zzb);
                                    C86114wI.A12(A003, zzs, 0);
                                    Parcel A012 = zzb.A01(A003, 2);
                                    barcodeArr = (Barcode[]) A012.createTypedArray(Barcode.CREATOR);
                                    A012.recycle();
                                    C14030oh.A0A(-2065881195, A032);
                                } catch (RemoteException e) {
                                    Log.e("BarcodeNativeHandle", "Error calling native barcode detector", e);
                                    barcodeArr = new Barcode[0];
                                }
                            } else {
                                barcodeArr = new Barcode[0];
                            }
                            if (barcodeArr == null) {
                                throw C18190wL.A0a("Internal barcode detector error; check logcat output.");
                            }
                        } else {
                            ByteBuffer byteBuffer = r9.A01;
                            C13320nQ.A01(byteBuffer);
                            if (!AnonymousClass0wJ.A1W(r3.A00())) {
                                barcodeArr = new Barcode[0];
                            } else {
                                ObjectWrapper objectWrapper2 = new ObjectWrapper(byteBuffer);
                                Object A004 = r3.A00();
                                C13320nQ.A01(A004);
                                zzb zzb2 = (zzb) ((zzl) A004);
                                int A033 = C14030oh.A03(176351068);
                                Parcel A005 = zzb.A00(objectWrapper2, zzb2);
                                A005.writeInt(1);
                                zzs.writeToParcel(A005, 0);
                                Parcel A013 = zzb2.A01(A005, 1);
                                barcodeArr = (Barcode[]) A013.createTypedArray(Barcode.CREATOR);
                                A013.recycle();
                                C14030oh.A0A(-1206288851, A033);
                            }
                        }
                        SparseArray sparseArray = new SparseArray(r3);
                        for (Barcode barcode : barcodeArr) {
                            sparseArray.append(barcode.A0C.hashCode(), barcode);
                        }
                        int size = sparseArray.size();
                        while (i2 < size) {
                            Object obj = sparseArray.get(sparseArray.keyAt(i2));
                            if (obj != null) {
                                String str = ((Barcode) obj).A0C;
                                C04220Ms.A05(str);
                                AnonymousClass79P A022 = A02(r10, str);
                                if (A022 != null) {
                                    return A022;
                                }
                                i2++;
                            } else {
                                throw C18180wK.A0a("Required value was null.");
                            }
                        }
                    }
                }
                return null;
            }
            throw C18180wK.A0a("Required value was null.");
        } catch (Exception unused) {
            i = 0;
        }
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.AnonymousClass79P A01(X.C114786tt r7, X.C121477Gh r8) {
        /*
            X.7DK r0 = r8.A01
            if (r0 != 0) goto L_0x0009
            X.7DK r0 = new X.7DK
            r0.<init>()
        L_0x0009:
            r8.A01 = r0
            java.util.HashMap r2 = r8.A03
            if (r2 != 0) goto L_0x0013
            java.util.HashMap r2 = X.AnonymousClass0wJ.A0y()
        L_0x0013:
            r8.A03 = r2
            r0 = 1
            X.67o r1 = X.C970067o.TRY_HARDER
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r2.put(r1, r0)
            X.5sU r1 = new X.5sU
            r1.<init>(r7)
            r6 = 0
            X.7DK r4 = r8.A01     // Catch:{ LXF | LXG | LXH -> 0x00a8, all -> 0x0148 }
            if (r4 == 0) goto L_0x00a8
            java.util.HashMap r3 = r8.A03     // Catch:{ LXF | LXG | LXH -> 0x00a8, all -> 0x0148 }
            if (r3 == 0) goto L_0x0090
            X.67o r0 = X.C970067o.PURE_BARCODE     // Catch:{ LXF | LXG | LXH -> 0x00a8, all -> 0x0148 }
            boolean r0 = r3.containsKey(r0)     // Catch:{ LXF | LXG | LXH -> 0x00a8, all -> 0x0148 }
            if (r0 == 0) goto L_0x0090
            X.7yJ r0 = r1.A00()     // Catch:{ LXF | LXG | LXH -> 0x00a8, all -> 0x0148 }
            X.7yJ r1 = X.AnonymousClass7DK.A00(r0)     // Catch:{ LXF | LXG | LXH -> 0x00a8, all -> 0x0148 }
            X.Ly7 r0 = r4.A00     // Catch:{ LXF | LXG | LXH -> 0x00a8, all -> 0x0148 }
            X.6mS r1 = r0.A01(r1, r3)     // Catch:{ LXF | LXG | LXH -> 0x00a8, all -> 0x0148 }
            X.LzK[] r0 = X.AnonymousClass7DK.A01     // Catch:{ LXF | LXG | LXH -> 0x00a8, all -> 0x0148 }
        L_0x0045:
            java.lang.Object r2 = r1.A00     // Catch:{ LXF | LXG | LXH -> 0x00a8, all -> 0x0148 }
            boolean r2 = r2 instanceof X.AnonymousClass6JM     // Catch:{ LXF | LXG | LXH -> 0x00a8, all -> 0x0148 }
            if (r2 == 0) goto L_0x0059
            int r3 = r0.length     // Catch:{ LXF | LXG | LXH -> 0x00a8, all -> 0x0148 }
            r2 = 3
            if (r3 < r2) goto L_0x0059
            r5 = 0
            r4 = r0[r5]     // Catch:{ LXF | LXG | LXH -> 0x00a8, all -> 0x0148 }
            r3 = 2
            r2 = r0[r3]     // Catch:{ LXF | LXG | LXH -> 0x00a8, all -> 0x0148 }
            r0[r5] = r2     // Catch:{ LXF | LXG | LXH -> 0x00a8, all -> 0x0148 }
            r0[r3] = r4     // Catch:{ LXF | LXG | LXH -> 0x00a8, all -> 0x0148 }
        L_0x0059:
            java.lang.String r4 = r1.A04     // Catch:{ LXF | LXG | LXH -> 0x00a8, all -> 0x0148 }
            byte[] r2 = r1.A06     // Catch:{ LXF | LXG | LXH -> 0x00a8, all -> 0x0148 }
            X.6sF r3 = new X.6sF     // Catch:{ LXF | LXG | LXH -> 0x00a8, all -> 0x0148 }
            r3.<init>(r4, r2, r0)     // Catch:{ LXF | LXG | LXH -> 0x00a8, all -> 0x0148 }
            java.util.List r2 = r1.A05     // Catch:{ LXF | LXG | LXH -> 0x00a8, all -> 0x0148 }
            if (r2 == 0) goto L_0x006b
            X.67p r0 = X.C970167p.BYTE_SEGMENTS     // Catch:{ LXF | LXG | LXH -> 0x00a8, all -> 0x0148 }
            r3.A00(r0, r2)     // Catch:{ LXF | LXG | LXH -> 0x00a8, all -> 0x0148 }
        L_0x006b:
            java.lang.String r2 = r1.A03     // Catch:{ LXF | LXG | LXH -> 0x00a8, all -> 0x0148 }
            if (r2 == 0) goto L_0x0074
            X.67p r0 = X.C970167p.ERROR_CORRECTION_LEVEL     // Catch:{ LXF | LXG | LXH -> 0x00a8, all -> 0x0148 }
            r3.A00(r0, r2)     // Catch:{ LXF | LXG | LXH -> 0x00a8, all -> 0x0148 }
        L_0x0074:
            int r2 = r1.A01     // Catch:{ LXF | LXG | LXH -> 0x00a8, all -> 0x0148 }
            if (r2 < 0) goto L_0x013e
            int r0 = r1.A02     // Catch:{ LXF | LXG | LXH -> 0x00a8, all -> 0x0148 }
            if (r0 < 0) goto L_0x013e
            X.67p r1 = X.C970167p.STRUCTURED_APPEND_SEQUENCE     // Catch:{ LXF | LXG | LXH -> 0x00a8, all -> 0x0148 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ LXF | LXG | LXH -> 0x00a8, all -> 0x0148 }
            r3.A00(r1, r0)     // Catch:{ LXF | LXG | LXH -> 0x00a8, all -> 0x0148 }
            X.67p r1 = X.C970167p.STRUCTURED_APPEND_PARITY     // Catch:{ LXF | LXG | LXH -> 0x00a8, all -> 0x0148 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)     // Catch:{ LXF | LXG | LXH -> 0x00a8, all -> 0x0148 }
            r3.A00(r1, r0)     // Catch:{ LXF | LXG | LXH -> 0x00a8, all -> 0x0148 }
            goto L_0x013e
        L_0x0090:
            X.7yJ r1 = r1.A00()     // Catch:{ LXF | LXG | LXH -> 0x00a8, all -> 0x0148 }
            X.M2X r0 = new X.M2X     // Catch:{ LXF | LXG | LXH -> 0x00a8, all -> 0x0148 }
            r0.<init>(r1)     // Catch:{ LXF | LXG | LXH -> 0x00a8, all -> 0x0148 }
            X.6gv r2 = r0.A03(r3)     // Catch:{ LXF | LXG | LXH -> 0x00a8, all -> 0x0148 }
            X.Ly7 r1 = r4.A00     // Catch:{ LXF | LXG | LXH -> 0x00a8, all -> 0x0148 }
            X.7yJ r0 = r2.A00     // Catch:{ LXF | LXG | LXH -> 0x00a8, all -> 0x0148 }
            X.6mS r1 = r1.A01(r0, r3)     // Catch:{ LXF | LXG | LXH -> 0x00a8, all -> 0x0148 }
            X.LzK[] r0 = r2.A01     // Catch:{ LXF | LXG | LXH -> 0x00a8, all -> 0x0148 }
            goto L_0x0045
        L_0x00a8:
            boolean r0 = r7 instanceof X.AnonymousClass5sV
            if (r0 == 0) goto L_0x00b6
            X.5sV r7 = (X.AnonymousClass5sV) r7
            X.6tt r0 = r7.A00
        L_0x00b0:
            X.5sU r1 = new X.5sU
            r1.<init>(r0)
            goto L_0x00bc
        L_0x00b6:
            X.5sV r0 = new X.5sV
            r0.<init>(r7)
            goto L_0x00b0
        L_0x00bc:
            X.7DK r4 = r8.A01     // Catch:{ LXF | LXG | LXH -> 0x0147, all -> 0x0148 }
            if (r4 == 0) goto L_0x0147
            java.util.HashMap r3 = r8.A03     // Catch:{ LXF | LXG | LXH -> 0x0147, all -> 0x0148 }
            if (r3 == 0) goto L_0x0126
            X.67o r0 = X.C970067o.PURE_BARCODE     // Catch:{ LXF | LXG | LXH -> 0x0147, all -> 0x0148 }
            boolean r0 = r3.containsKey(r0)     // Catch:{ LXF | LXG | LXH -> 0x0147, all -> 0x0148 }
            if (r0 == 0) goto L_0x0126
            X.7yJ r0 = r1.A00()     // Catch:{ LXF | LXG | LXH -> 0x0147, all -> 0x0148 }
            X.7yJ r1 = X.AnonymousClass7DK.A00(r0)     // Catch:{ LXF | LXG | LXH -> 0x0147, all -> 0x0148 }
            X.Ly7 r0 = r4.A00     // Catch:{ LXF | LXG | LXH -> 0x0147, all -> 0x0148 }
            X.6mS r1 = r0.A01(r1, r3)     // Catch:{ LXF | LXG | LXH -> 0x0147, all -> 0x0148 }
            X.LzK[] r0 = X.AnonymousClass7DK.A01     // Catch:{ LXF | LXG | LXH -> 0x0147, all -> 0x0148 }
        L_0x00dc:
            java.lang.Object r2 = r1.A00     // Catch:{ LXF | LXG | LXH -> 0x0147, all -> 0x0148 }
            boolean r2 = r2 instanceof X.AnonymousClass6JM     // Catch:{ LXF | LXG | LXH -> 0x0147, all -> 0x0148 }
            if (r2 == 0) goto L_0x00f0
            int r3 = r0.length     // Catch:{ LXF | LXG | LXH -> 0x0147, all -> 0x0148 }
            r2 = 3
            if (r3 < r2) goto L_0x00f0
            r5 = 0
            r4 = r0[r5]     // Catch:{ LXF | LXG | LXH -> 0x0147, all -> 0x0148 }
            r3 = 2
            r2 = r0[r3]     // Catch:{ LXF | LXG | LXH -> 0x0147, all -> 0x0148 }
            r0[r5] = r2     // Catch:{ LXF | LXG | LXH -> 0x0147, all -> 0x0148 }
            r0[r3] = r4     // Catch:{ LXF | LXG | LXH -> 0x0147, all -> 0x0148 }
        L_0x00f0:
            java.lang.String r4 = r1.A04     // Catch:{ LXF | LXG | LXH -> 0x0147, all -> 0x0148 }
            byte[] r2 = r1.A06     // Catch:{ LXF | LXG | LXH -> 0x0147, all -> 0x0148 }
            X.6sF r3 = new X.6sF     // Catch:{ LXF | LXG | LXH -> 0x0147, all -> 0x0148 }
            r3.<init>(r4, r2, r0)     // Catch:{ LXF | LXG | LXH -> 0x0147, all -> 0x0148 }
            java.util.List r2 = r1.A05     // Catch:{ LXF | LXG | LXH -> 0x0147, all -> 0x0148 }
            if (r2 == 0) goto L_0x0102
            X.67p r0 = X.C970167p.BYTE_SEGMENTS     // Catch:{ LXF | LXG | LXH -> 0x0147, all -> 0x0148 }
            r3.A00(r0, r2)     // Catch:{ LXF | LXG | LXH -> 0x0147, all -> 0x0148 }
        L_0x0102:
            java.lang.String r2 = r1.A03     // Catch:{ LXF | LXG | LXH -> 0x0147, all -> 0x0148 }
            if (r2 == 0) goto L_0x010b
            X.67p r0 = X.C970167p.ERROR_CORRECTION_LEVEL     // Catch:{ LXF | LXG | LXH -> 0x0147, all -> 0x0148 }
            r3.A00(r0, r2)     // Catch:{ LXF | LXG | LXH -> 0x0147, all -> 0x0148 }
        L_0x010b:
            int r2 = r1.A01     // Catch:{ LXF | LXG | LXH -> 0x0147, all -> 0x0148 }
            if (r2 < 0) goto L_0x013e
            int r0 = r1.A02     // Catch:{ LXF | LXG | LXH -> 0x0147, all -> 0x0148 }
            if (r0 < 0) goto L_0x013e
            X.67p r1 = X.C970167p.STRUCTURED_APPEND_SEQUENCE     // Catch:{ LXF | LXG | LXH -> 0x0147, all -> 0x0148 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ LXF | LXG | LXH -> 0x0147, all -> 0x0148 }
            r3.A00(r1, r0)     // Catch:{ LXF | LXG | LXH -> 0x0147, all -> 0x0148 }
            X.67p r1 = X.C970167p.STRUCTURED_APPEND_PARITY     // Catch:{ LXF | LXG | LXH -> 0x0147, all -> 0x0148 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)     // Catch:{ LXF | LXG | LXH -> 0x0147, all -> 0x0148 }
            r3.A00(r1, r0)     // Catch:{ LXF | LXG | LXH -> 0x0147, all -> 0x0148 }
            goto L_0x013e
        L_0x0126:
            X.7yJ r1 = r1.A00()     // Catch:{ LXF | LXG | LXH -> 0x0147, all -> 0x0148 }
            X.M2X r0 = new X.M2X     // Catch:{ LXF | LXG | LXH -> 0x0147, all -> 0x0148 }
            r0.<init>(r1)     // Catch:{ LXF | LXG | LXH -> 0x0147, all -> 0x0148 }
            X.6gv r2 = r0.A03(r3)     // Catch:{ LXF | LXG | LXH -> 0x0147, all -> 0x0148 }
            X.Ly7 r1 = r4.A00     // Catch:{ LXF | LXG | LXH -> 0x0147, all -> 0x0148 }
            X.7yJ r0 = r2.A00     // Catch:{ LXF | LXG | LXH -> 0x0147, all -> 0x0148 }
            X.6mS r1 = r1.A01(r0, r3)     // Catch:{ LXF | LXG | LXH -> 0x0147, all -> 0x0148 }
            X.LzK[] r0 = r2.A01     // Catch:{ LXF | LXG | LXH -> 0x0147, all -> 0x0148 }
            goto L_0x00dc
        L_0x013e:
            java.lang.String r0 = X.C18190wL.A0n(r3)
            X.79P r0 = A02(r8, r0)
            return r0
        L_0x0147:
            return r6
        L_0x0148:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C121477Gh.A01(X.6tt, X.7Gh):X.79P");
    }

    public static final AnonymousClass79P A02(C121477Gh r7, String str) {
        USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(new C10680ik(r7.A05).A00(), "ig_qr_code_url_parsed"), 1413);
        A0I.A0T("sanitized_url", C10730ip.A00(C15430rJ.A01(str), (C16120sW) null).D7I());
        try {
            AnonymousClass3RZ.A00();
            AnonymousClass3RZ.A00();
            Context context = r7.A04;
            try {
                String[] strArr = (String[]) C18250wR.A0h(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1).A02("www.fujitv.co.jp,fujitv.co.jp", 0).toArray(new String[0]);
                if (AnonymousClass00J.A0k(C06750aI.A17(Arrays.copyOf(strArr, strArr.length)), C15430rJ.A01(str).getAuthority())) {
                    A0I.A0Q("is_allowed_domain", true);
                    A0I.Bb4();
                    return new AnonymousClass79P(AnonymousClass22I.ALLOWED_DOMAIN_EXTERNAL_URL, str);
                }
            } catch (Exception unused) {
            }
            if (!str.equals(r7.A02) || System.currentTimeMillis() - r7.A00 > 5000) {
                C63813iO.A03(context, (String) null, 2131833866, 0);
                r7.A00 = System.currentTimeMillis();
            }
            r7.A02 = str;
            return null;
        } catch (SecurityException unused2) {
            A0I.A0Q("has_legacy_error", true);
            A0I.Bb4();
            return null;
        }
    }
}

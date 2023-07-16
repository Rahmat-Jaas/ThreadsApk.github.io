package X;

import android.app.Activity;
import android.content.Context;
import android.telephony.TelephonyManager;
import com.facebook.phonenumbers.PhoneNumberUtil;
import com.instagram.realtimeclient.GraphQLSubscriptionID;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* renamed from: X.3hp  reason: invalid class name and case insensitive filesystem */
public final class C63573hp {
    public static final C63573hp A00 = new C63573hp();

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0031, code lost:
        if (r1 == null) goto L_0x0026;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003a, code lost:
        return new X.C29621yy(r1, r8.A00);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0024, code lost:
        if (r1.length() != 0) goto L_0x0033;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.C29621yy A00(android.content.Context r6, X.C10300i6 r7, X.AnonymousClass24N r8, X.AnonymousClass265 r9) {
        /*
            r5 = 0
            boolean r4 = X.AnonymousClass0wJ.A1Z(r6, r7)
            r3 = 2
            X.C04220Ms.A0B(r8, r3)
            r1 = 3
            X.C04220Ms.A0B(r9, r1)
            int r0 = r8.ordinal()
            r2 = 0
            if (r0 == r5) goto L_0x0027
            if (r0 == r4) goto L_0x003b
            if (r0 == r3) goto L_0x002f
            if (r0 != r1) goto L_0x0026
            java.lang.String r1 = A03(r6)
            if (r1 == 0) goto L_0x0026
            int r0 = r1.length()
            if (r0 != 0) goto L_0x0033
        L_0x0026:
            return r2
        L_0x0027:
            X.C50672tN.A00(r6, r7, r9)
            java.lang.String r1 = A02(r6)
            goto L_0x0031
        L_0x002f:
            java.lang.String r1 = X.AnonymousClass2BE.A01
        L_0x0031:
            if (r1 == 0) goto L_0x0026
        L_0x0033:
            java.lang.String r0 = r8.A00
            X.1yy r2 = new X.1yy
            r2.<init>(r1, r0)
            return r2
        L_0x003b:
            X.44X r1 = X.AnonymousClass44X.A00()
            java.lang.String r0 = "ig_android_growth_fx_access_fb_ig_prefill_phone"
            r1.A03(r7, r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C63573hp.A00(android.content.Context, X.0i6, X.24N, X.265):X.1yy");
    }

    public static final String A01(Activity activity, C10300i6 r15, AnonymousClass265 r16, Integer num) {
        C10300i6 r7 = r15;
        Activity activity2 = activity;
        AnonymousClass0wJ.A1O(activity, r15);
        AnonymousClass265 r1 = r16;
        C04220Ms.A0B(r1, 3);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        HashMap A0y = AnonymousClass0wJ.A0y();
        PhoneNumberUtil A01 = PhoneNumberUtil.A01(activity);
        Object systemService = activity.getSystemService("phone");
        C04220Ms.A0C(systemService, AnonymousClass000.A00(188));
        TelephonyManager telephonyManager = (TelephonyManager) systemService;
        String country = Locale.getDefault().getCountry();
        C63573hp r5 = A00;
        String simCountryIso = telephonyManager.getSimCountryIso();
        C04220Ms.A06(A01);
        r5.A06(A01, r7, simCountryIso, "sim", A0y);
        r5.A06(A01, r7, telephonyManager.getNetworkCountryIso(), "network", A0y);
        r5.A06(A01, r7, country, GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_DEFAULT, A0y);
        for (C61583Uh r12 : A04(activity2, r7, r1, num)) {
            String str = r12.A01;
            C04220Ms.A06(country);
            String str2 = r12.A00;
            try {
                String valueOf = String.valueOf(A01.A0A(str, country).A00);
                AnonymousClass3V8 r0 = (AnonymousClass3V8) A0y.get(valueOf);
                if (r0 != null) {
                    List list = r0.A01;
                    if (list != null) {
                        list.add(str2);
                    }
                } else {
                    A0y.put(valueOf, new AnonymousClass3V8(valueOf, str2));
                }
            } catch (C32122Ah unused) {
                C15730rn A0T = C18230wP.A0T("failed_country_code");
                A0T.A0D("uuid", C18200wM.A0g());
                C18180wK.A1K(A0T, r7);
            }
        }
        ArrayList<AnonymousClass3V8> A0s = C18200wM.A0s(A0y.values());
        MMp A03 = C18987Aon.A00.A03(byteArrayOutputStream);
        A03.A0I();
        for (AnonymousClass3V8 r3 : A0s) {
            A03.A0J();
            String str3 = r3.A00;
            if (str3 != null) {
                A03.A0d("country_code", str3);
            }
            List list2 = r3.A01;
            if (list2 != null) {
                Iterator A0t = C18190wL.A0t(A03, "source", list2);
                while (A0t.hasNext()) {
                    String A0k = C18180wK.A0k(A0t);
                    if (A0k != null) {
                        A03.A0Y(A0k);
                    }
                }
                A03.A0F();
            }
            A03.A0G();
        }
        A03.A0F();
        A03.close();
        byteArrayOutputStream.close();
        String byteArrayOutputStream2 = byteArrayOutputStream.toString("UTF-8");
        C04220Ms.A06(byteArrayOutputStream2);
        return byteArrayOutputStream2;
    }

    public static final String A02(Context context) {
        C04220Ms.A0B(context, 0);
        if (!AnonymousClass7K8.A04(context)) {
            return null;
        }
        Object systemService = context.getSystemService("phone");
        C04220Ms.A0C(systemService, AnonymousClass000.A00(188));
        try {
            return ((TelephonyManager) systemService).getLine1Number();
        } catch (SecurityException unused) {
            return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0127, code lost:
        if (r0 == false) goto L_0x0129;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.String A03(android.content.Context r21) {
        /*
            java.lang.String r0 = "android.permission.READ_CONTACTS"
            r12 = r21
            int r0 = r12.checkSelfPermission(r0)
            boolean r0 = X.C18180wK.A1W(r0)
            r15 = 0
            if (r0 == 0) goto L_0x017b
            java.lang.String r0 = "android.permission.READ_PROFILE"
            int r0 = r12.checkSelfPermission(r0)
            boolean r0 = X.C18180wK.A1W(r0)
            if (r0 == 0) goto L_0x017b
            java.lang.String r7 = "vnd.android.cursor.item/email_v2"
            java.lang.String r6 = "vnd.android.cursor.item/phone_v2"
            java.lang.String r5 = "vnd.android.cursor.item/name"
            java.lang.String r8 = "data2"
            java.lang.String r1 = "data3"
            java.lang.String r9 = "mimetype"
            java.lang.String r0 = "data1"
            java.util.ArrayList r4 = X.AnonymousClass0wJ.A0v()
            java.util.ArrayList r3 = X.AnonymousClass0wJ.A0v()
            android.net.Uri r11 = android.provider.ContactsContract.Profile.CONTENT_URI
            java.lang.String r10 = "data"
            android.net.Uri r2 = android.net.Uri.withAppendedPath(r11, r10)
            android.content.ContentProviderClient r16 = X.C09400fM.A00(r12, r2)
            if (r16 == 0) goto L_0x0170
            r2 = 0
            android.net.Uri r17 = android.net.Uri.withAppendedPath(r11, r10)     // Catch:{ RemoteException -> 0x015e, all -> 0x014e }
            java.lang.String[] r18 = new java.lang.String[]{r9, r1, r8, r0, r0}     // Catch:{ RemoteException -> 0x015e, all -> 0x014e }
            java.lang.String r19 = "mimetype = ? OR mimetype in (?, ?)"
            java.lang.String[] r20 = new java.lang.String[]{r5, r6, r7}     // Catch:{ RemoteException -> 0x015e, all -> 0x014e }
            java.lang.String r21 = "is_primary DESC"
            android.database.Cursor r2 = r16.query(r17, r18, r19, r20, r21)     // Catch:{ RemoteException -> 0x015e, all -> 0x014e }
            if (r2 != 0) goto L_0x0058
            goto L_0x016d
        L_0x0058:
            int r11 = r2.getColumnIndex(r9)     // Catch:{ RemoteException -> 0x015e, all -> 0x014e }
            int r10 = r2.getColumnIndex(r8)     // Catch:{ RemoteException -> 0x015e, all -> 0x014e }
            int r9 = r2.getColumnIndex(r1)     // Catch:{ RemoteException -> 0x015e, all -> 0x014e }
            int r8 = r2.getColumnIndex(r0)     // Catch:{ RemoteException -> 0x015e, all -> 0x014e }
            int r12 = r2.getColumnIndex(r0)     // Catch:{ RemoteException -> 0x015e, all -> 0x014e }
        L_0x006c:
            boolean r0 = r2.moveToNext()     // Catch:{ RemoteException -> 0x015e, all -> 0x014e }
            if (r0 == 0) goto L_0x0141
            java.lang.String r1 = r2.getString(r11)     // Catch:{ RemoteException -> 0x015e, all -> 0x014e }
            boolean r0 = r5.equals(r1)     // Catch:{ RemoteException -> 0x015e, all -> 0x014e }
            if (r0 == 0) goto L_0x00e5
            java.lang.String r13 = r2.getString(r10)     // Catch:{ RemoteException -> 0x015e, all -> 0x014e }
            if (r13 == 0) goto L_0x0093
            java.lang.String r0 = r13.trim()     // Catch:{ RemoteException -> 0x015e, all -> 0x014e }
            boolean r0 = r0.isEmpty()     // Catch:{ RemoteException -> 0x015e, all -> 0x014e }
            if (r0 != 0) goto L_0x0093
            java.util.regex.Pattern r0 = android.util.Patterns.PHONE     // Catch:{ RemoteException -> 0x015e, all -> 0x014e }
            boolean r0 = X.C18240wQ.A1V(r13, r0)     // Catch:{ RemoteException -> 0x015e, all -> 0x014e }
            goto L_0x0094
        L_0x0093:
            r0 = 0
        L_0x0094:
            if (r0 == 0) goto L_0x0098
            r1 = r15
            goto L_0x00b1
        L_0x0098:
            if (r13 == 0) goto L_0x00ab
            java.lang.String r0 = r13.trim()     // Catch:{ RemoteException -> 0x015e, all -> 0x014e }
            boolean r0 = r0.isEmpty()     // Catch:{ RemoteException -> 0x015e, all -> 0x014e }
            if (r0 != 0) goto L_0x00ab
            java.util.regex.Pattern r0 = android.util.Patterns.EMAIL_ADDRESS     // Catch:{ RemoteException -> 0x015e, all -> 0x014e }
            boolean r0 = X.C18240wQ.A1V(r13, r0)     // Catch:{ RemoteException -> 0x015e, all -> 0x014e }
            goto L_0x00ac
        L_0x00ab:
            r0 = 0
        L_0x00ac:
            r1 = r13
            r13 = r15
            if (r0 != 0) goto L_0x00b1
            r1 = r15
        L_0x00b1:
            java.lang.String r14 = r2.getString(r9)     // Catch:{ RemoteException -> 0x015e, all -> 0x014e }
            if (r14 == 0) goto L_0x00c8
            java.lang.String r0 = r14.trim()     // Catch:{ RemoteException -> 0x015e, all -> 0x014e }
            boolean r0 = r0.isEmpty()     // Catch:{ RemoteException -> 0x015e, all -> 0x014e }
            if (r0 != 0) goto L_0x00c8
            java.util.regex.Pattern r0 = android.util.Patterns.PHONE     // Catch:{ RemoteException -> 0x015e, all -> 0x014e }
            boolean r0 = X.C18240wQ.A1V(r14, r0)     // Catch:{ RemoteException -> 0x015e, all -> 0x014e }
            goto L_0x00c9
        L_0x00c8:
            r0 = 0
        L_0x00c9:
            if (r0 == 0) goto L_0x00cd
            r13 = r14
            goto L_0x012b
        L_0x00cd:
            if (r14 == 0) goto L_0x00e0
            java.lang.String r0 = r14.trim()     // Catch:{ RemoteException -> 0x015e, all -> 0x014e }
            boolean r0 = r0.isEmpty()     // Catch:{ RemoteException -> 0x015e, all -> 0x014e }
            if (r0 != 0) goto L_0x00e0
            java.util.regex.Pattern r0 = android.util.Patterns.EMAIL_ADDRESS     // Catch:{ RemoteException -> 0x015e, all -> 0x014e }
            boolean r0 = X.C18240wQ.A1V(r14, r0)     // Catch:{ RemoteException -> 0x015e, all -> 0x014e }
            goto L_0x00e1
        L_0x00e0:
            r0 = 0
        L_0x00e1:
            if (r0 == 0) goto L_0x012b
            r1 = r14
            goto L_0x012b
        L_0x00e5:
            boolean r0 = r6.equals(r1)     // Catch:{ RemoteException -> 0x015e, all -> 0x014e }
            if (r0 == 0) goto L_0x0108
            java.lang.String r13 = r2.getString(r8)     // Catch:{ RemoteException -> 0x015e, all -> 0x014e }
            if (r13 == 0) goto L_0x0102
            java.lang.String r0 = r13.trim()     // Catch:{ RemoteException -> 0x015e, all -> 0x014e }
            boolean r0 = r0.isEmpty()     // Catch:{ RemoteException -> 0x015e, all -> 0x014e }
            if (r0 != 0) goto L_0x0102
            java.util.regex.Pattern r0 = android.util.Patterns.PHONE     // Catch:{ RemoteException -> 0x015e, all -> 0x014e }
            boolean r0 = X.C18240wQ.A1V(r13, r0)     // Catch:{ RemoteException -> 0x015e, all -> 0x014e }
            goto L_0x0103
        L_0x0102:
            r0 = 0
        L_0x0103:
            if (r0 != 0) goto L_0x0106
            r13 = r15
        L_0x0106:
            r1 = r15
            goto L_0x012b
        L_0x0108:
            boolean r0 = r7.equals(r1)     // Catch:{ RemoteException -> 0x015e, all -> 0x014e }
            if (r0 == 0) goto L_0x0129
            java.lang.String r1 = r2.getString(r12)     // Catch:{ RemoteException -> 0x015e, all -> 0x014e }
            if (r1 == 0) goto L_0x0125
            java.lang.String r0 = r1.trim()     // Catch:{ RemoteException -> 0x015e, all -> 0x014e }
            boolean r0 = r0.isEmpty()     // Catch:{ RemoteException -> 0x015e, all -> 0x014e }
            if (r0 != 0) goto L_0x0125
            java.util.regex.Pattern r0 = android.util.Patterns.EMAIL_ADDRESS     // Catch:{ RemoteException -> 0x015e, all -> 0x014e }
            boolean r0 = X.C18240wQ.A1V(r1, r0)     // Catch:{ RemoteException -> 0x015e, all -> 0x014e }
            goto L_0x0126
        L_0x0125:
            r0 = 0
        L_0x0126:
            r13 = r15
            if (r0 != 0) goto L_0x012b
        L_0x0129:
            r13 = r15
            r1 = r15
        L_0x012b:
            boolean r0 = android.text.TextUtils.isEmpty(r13)     // Catch:{ RemoteException -> 0x015e, all -> 0x014e }
            if (r0 != 0) goto L_0x0136
            r4.add(r13)     // Catch:{ RemoteException -> 0x015e, all -> 0x014e }
            goto L_0x006c
        L_0x0136:
            boolean r0 = android.text.TextUtils.isEmpty(r1)     // Catch:{ RemoteException -> 0x015e, all -> 0x014e }
            if (r0 != 0) goto L_0x006c
            r3.add(r1)     // Catch:{ RemoteException -> 0x015e, all -> 0x014e }
            goto L_0x006c
        L_0x0141:
            r16.release()
            boolean r0 = r2.isClosed()
            if (r0 != 0) goto L_0x0170
            r2.close()
            goto L_0x0170
        L_0x014e:
            r1 = move-exception
            r16.release()
            if (r2 == 0) goto L_0x015d
            boolean r0 = r2.isClosed()
            if (r0 != 0) goto L_0x015d
            r2.close()
        L_0x015d:
            throw r1
        L_0x015e:
            r16.release()
            if (r2 == 0) goto L_0x0170
            boolean r0 = r2.isClosed()
            if (r0 != 0) goto L_0x0170
            r2.close()
            goto L_0x0170
        L_0x016d:
            r16.release()
        L_0x0170:
            boolean r0 = r4.isEmpty()
            if (r0 != 0) goto L_0x017b
            r0 = 0
            java.lang.String r15 = X.C18190wL.A0q(r4, r0)
        L_0x017b:
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C63573hp.A03(android.content.Context):java.lang.String");
    }

    private final void A06(PhoneNumberUtil phoneNumberUtil, C10300i6 r5, String str, String str2, Map map) {
        if (str != null) {
            try {
                int A06 = phoneNumberUtil.A06(str);
                if (A06 > 0) {
                    String valueOf = String.valueOf(A06);
                    AnonymousClass3V8 r1 = (AnonymousClass3V8) map.get(valueOf);
                    if (r1 != null) {
                        C04220Ms.A0B(str2, 0);
                        List list = r1.A01;
                        if (list != null) {
                            list.add(str2);
                            return;
                        }
                        return;
                    }
                    map.put(valueOf, new AnonymousClass3V8(valueOf, str2));
                }
            } catch (IllegalArgumentException unused) {
                C15730rn A0T = C18230wP.A0T("failed_country_code");
                A0T.A0D("failed_country", str);
                A0T.A0D("uuid", C18200wM.A0g());
                C18180wK.A1K(A0T, r5);
            }
        }
    }

    public static final List A04(Context context, C10300i6 r4, AnonymousClass265 r5, Integer num) {
        EnumSet of;
        AnonymousClass0wJ.A1N(num, context);
        AnonymousClass0wJ.A1Q(r4, r5);
        if (num == AnonymousClass006.A0C || num == AnonymousClass006.A0N) {
            of = EnumSet.of(AnonymousClass24N.PHONE_NUMBER_SOURCE_MOBILE_SUBNO_SERVICE, AnonymousClass24N.PHONE_NUMBER_SOURCE_FB_FIRST_PARTY, AnonymousClass24N.PHONE_NUMBER_SOURCE_UIG_VIA_PHONE_ID);
        } else {
            of = EnumSet.of(AnonymousClass24N.PHONE_NUMBER_SOURCE_MOBILE_SUBNO_SERVICE);
        }
        EnumSet complementOf = EnumSet.complementOf(of);
        C04220Ms.A06(complementOf);
        return A05(context, r4, r5, complementOf);
    }

    public static final List A05(Context context, C10300i6 r4, AnonymousClass265 r5, EnumSet enumSet) {
        AnonymousClass0wJ.A1N(context, r4);
        C04220Ms.A0B(r5, 2);
        ArrayList A0v = AnonymousClass0wJ.A0v();
        Iterator it = enumSet.iterator();
        while (it.hasNext()) {
            AnonymousClass24N r0 = (AnonymousClass24N) it.next();
            C04220Ms.A04(r0);
            C29621yy A002 = A00(context, r4, r0, r5);
            if (A002 != null) {
                A0v.add(A002);
            }
        }
        Collections.sort(A0v, C73634Te.A00);
        return A0v;
    }
}

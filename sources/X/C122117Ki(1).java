package X;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.bloks.foa.core.lifecycles.impl.NativeLifecycleCallback$NativeCallback;
import com.instagram.business.fragment.SupportLinksFragment;
import com.instagram.service.session.UserSession;
import com.instagram.sponsored.analytics.SourceModelInfoParams;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;

/* renamed from: X.7Ki  reason: invalid class name and case insensitive filesystem */
public final class C122117Ki {
    public static Fragment A00(SourceModelInfoParams sourceModelInfoParams, String str) {
        C34642IcP icP = new C34642IcP();
        Bundle A06 = C18180wK.A06();
        A06.putString(I17.A00(175), str);
        A06.putParcelable(I17.A00(178), sourceModelInfoParams);
        A06.putBoolean(I17.A00(177), false);
        A06.putString(I17.A00(176), (String) null);
        icP.setArguments(A06);
        return icP;
    }

    public static FragmentActivity A01(AnonymousClass601 r1) {
        C04220Ms.A0B(r1, 1);
        return C63913ic.A04(C63913ic.A0D(r1));
    }

    public static C83284r8 A02(Bundle bundle, String str) {
        Integer num;
        C83284r8 r2;
        String str2;
        String str3;
        String string = bundle.getString(AnonymousClass00U.A0L(C18170wI.A00(614), str));
        if (string == null) {
            return null;
        }
        if (string.equals("BLOKS")) {
            num = AnonymousClass006.A00;
        } else if (string.equals("NATIVE")) {
            num = AnonymousClass006.A01;
        } else {
            throw C18190wL.A0a(string);
        }
        if (num.intValue() != 0) {
            NativeLifecycleCallback$NativeCallback nativeLifecycleCallback$NativeCallback = (NativeLifecycleCallback$NativeCallback) bundle.getParcelable(str);
            r2 = null;
            if (nativeLifecycleCallback$NativeCallback != null) {
                r2 = new C125207ci(nativeLifecycleCallback$NativeCallback);
            } else {
                str2 = "NativeLifecycleCallback";
                str3 = "Retrieved a null NativeCallback from the Bundle.";
                C30967GcS.A02(str2, str3);
            }
        } else {
            C61323St r0 = (C61323St) C62533aC.A02(C61323St.class, Integer.valueOf(bundle.getInt(str, -1)));
            r2 = null;
            if (r0 != null) {
                r2 = new AnonymousClass3yO(r0);
            } else {
                str2 = "BloksLifecycleCallback";
                str3 = "Retrieved a null ActionParseResult from the Bundle.";
                C30967GcS.A02(str2, str3);
            }
        }
        return r2;
    }

    public static C25786Drz A04(AnonymousClass601 r3) {
        C04220Ms.A0B(r3, 1);
        FragmentActivity A04 = C63913ic.A04(C63913ic.A0D(r3));
        C10300i6 A0E = C63913ic.A0E(C63913ic.A0D(r3));
        C04220Ms.A0C(A0E, "null cannot be cast to non-null type com.instagram.service.session.UserSession");
        C25786Drz drz = new C25786Drz(A04, A0E);
        drz.A08();
        return drz;
    }

    public static AnonymousClass3HX A05(AnonymousClass601 r1) {
        C04220Ms.A0B(r1, 1);
        return r1.A00;
    }

    public static ArrayList A09(UserSession userSession, Integer num) {
        C04220Ms.A0B(userSession, 1);
        Calendar instance = Calendar.getInstance();
        instance.set(11, 0);
        instance.set(12, 0);
        instance.set(13, 0);
        instance.set(14, 0);
        long timeInMillis = instance.getTimeInMillis() / ((long) 1000);
        ArrayList A00 = C60573Pq.A00(userSession, num);
        ArrayList A0v = AnonymousClass0wJ.A0v();
        Iterator it = A00.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (C18190wL.A08(next) >= timeInMillis) {
                A0v.add(next);
            }
        }
        return C18200wM.A0s(A0v);
    }

    public static void A0B(FragmentActivity fragmentActivity, UserSession userSession) {
        if (C121527Go.A01(fragmentActivity)) {
            C18180wK.A0Q(fragmentActivity, userSession).A0D(SupportLinksFragment.A06, 1);
        } else {
            C10650ih.A02(fragmentActivity, C62333Yi.A00(fragmentActivity));
        }
    }

    public static boolean A0C(int i) {
        if (i == 13326 || i == 13327 || i == 13616 || i == 13617 || i == 13635 || i == 13636 || i == 15727 || i == 15728) {
            return true;
        }
        switch (i) {
            case 13317:
            case 13320:
            case 13323:
            case 13329:
            case 13399:
            case 13408:
            case 13533:
            case 13546:
            case 13648:
            case 13666:
            case 13697:
            case 13708:
            case 13745:
            case 13775:
            case 13780:
            case 13797:
            case 13894:
            case 13907:
            case 13922:
            case 13944:
            case 13955:
            case 13982:
            case 14041:
            case 14045:
            case 14054:
            case 14093:
            case 15753:
            case 15768:
            case 15770:
            case 15778:
            case 15856:
            case 15892:
            case 15894:
            case 15900:
            case 15969:
            case 15981:
            case 16053:
            case 16068:
            case 16079:
            case 16095:
            case 16111:
            case 16122:
            case 16160:
            case 16166:
            case 16218:
            case 16229:
            case 16260:
            case 16265:
            case 16278:
            case 16355:
            case 16383:
            case 16390:
            case 16411:
            case 16444:
            case 16467:
            case 16586:
            case 16641:
            case 16675:
            case 16682:
            case 16688:
                return true;
            default:
                switch (i) {
                    case 13334:
                    case 13335:
                    case 13336:
                        return true;
                    default:
                        switch (i) {
                            case 13375:
                            case 13376:
                            case 13377:
                            case 13378:
                            case 13379:
                            case 13380:
                                return true;
                            default:
                                switch (i) {
                                    case 13387:
                                    case 13388:
                                    case 13389:
                                    case 13390:
                                    case 13391:
                                    case 13392:
                                    case 13393:
                                        return true;
                                    default:
                                        switch (i) {
                                            case 16534:
                                            case 16535:
                                            case 16536:
                                                return true;
                                            default:
                                                return false;
                                        }
                                }
                        }
                }
        }
    }

    public static boolean A0D(int i) {
        switch (i) {
            case 13313:
            case 13337:
            case 13383:
            case 13394:
            case 13538:
            case 13565:
            case 13566:
            case 13615:
            case 13627:
            case 13638:
            case 13656:
            case 13688:
            case 13712:
            case 13713:
            case 13748:
            case 13762:
            case 13768:
            case 13774:
            case 13914:
            case 13981:
            case 14001:
            case 15833:
            case 15909:
            case 16123:
            case 16310:
            case 16375:
            case 16409:
            case 16485:
            case 16493:
            case 16515:
            case 16529:
                return true;
            default:
                return false;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v1, resolved type: X.3DD} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v2, resolved type: X.17Q} */
    /* JADX WARNING: type inference failed for: r9v0 */
    /* JADX WARNING: type inference failed for: r9v3 */
    /* JADX WARNING: type inference failed for: r9v5 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0034  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C81864oW A03(X.C127397h3 r16, int r17) {
        /*
            r0 = 16542(0x409e, float:2.318E-41)
            r4 = r16
            r1 = r17
            if (r1 != r0) goto L_0x000e
            r0 = 0
            X.3yU r0 = X.C66883yU.A02(r0, r4)
            return r0
        L_0x000e:
            r0 = 16696(0x4138, float:2.3396E-41)
            if (r1 != r0) goto L_0x00d7
            r3 = 0
            r9 = 0
            r6 = 43
            android.util.SparseArray r1 = r4.A04     // Catch:{ 1zB -> 0x002b }
            java.lang.String r0 = X.C86114wI.A0m(r1, r6)     // Catch:{ 1zB -> 0x002b }
            if (r0 == 0) goto L_0x002b
            java.lang.String r0 = X.C86114wI.A0m(r1, r6)     // Catch:{ 1zB -> 0x002b }
            int r0 = X.AnonymousClass7Kk.A06(r0)     // Catch:{ 1zB -> 0x002b }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)     // Catch:{ 1zB -> 0x002b }
            goto L_0x002c
        L_0x002b:
            r2 = r9
        L_0x002c:
            r0 = 38
            X.7h3 r1 = r4.A0K(r0)
            if (r1 == 0) goto L_0x00c6
            r0 = 40
            X.7h3 r8 = r1.A0K(r0)
            r7 = 36
            r15 = 0
            if (r8 == 0) goto L_0x0049
            android.util.SparseArray r0 = r8.A04
            java.lang.String r5 = X.C86114wI.A0m(r0, r7)
        L_0x0045:
            r0 = 0
            if (r5 == 0) goto L_0x004f
            goto L_0x004b
        L_0x0049:
            r5 = r9
            goto L_0x0045
        L_0x004b:
            int r0 = X.AnonymousClass7Kk.A04(r5)     // Catch:{ 1zB -> 0x0054 }
        L_0x004f:
            java.lang.Integer r11 = java.lang.Integer.valueOf(r0)     // Catch:{ 1zB -> 0x0054 }
            goto L_0x0055
        L_0x0054:
            r11 = 0
        L_0x0055:
            r5 = 35
            if (r8 == 0) goto L_0x0063
            android.util.SparseArray r0 = r8.A04
            java.lang.String r8 = X.C86114wI.A0m(r0, r5)
        L_0x005f:
            r0 = 0
            if (r8 == 0) goto L_0x0069
            goto L_0x0065
        L_0x0063:
            r8 = r9
            goto L_0x005f
        L_0x0065:
            int r0 = X.AnonymousClass7Kk.A04(r8)     // Catch:{ 1zB -> 0x006e }
        L_0x0069:
            java.lang.Integer r12 = java.lang.Integer.valueOf(r0)     // Catch:{ 1zB -> 0x006e }
            goto L_0x006f
        L_0x006e:
            r12 = 0
        L_0x006f:
            java.lang.String r13 = X.C127397h3.A0D(r1)
            java.lang.String r14 = X.C127397h3.A0B(r1)
            r0 = 42
            X.7h3 r10 = r1.A0K(r0)
            X.7h3 r5 = r1.A0K(r5)
            if (r5 == 0) goto L_0x0089
            X.3DZ r0 = X.AnonymousClass17Q.A07
            X.17Q r9 = r0.A00(r5)
        L_0x0089:
            java.util.List r0 = r1.A0Q(r7)
            if (r0 == 0) goto L_0x00ae
            java.util.ArrayList r15 = X.AnonymousClass0wJ.A0w(r0)
            java.util.Iterator r7 = r0.iterator()
        L_0x0097:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x00ae
            X.7h3 r5 = X.C86144wL.A0V(r7)
            X.3DZ r0 = X.AnonymousClass17Q.A07
            X.C04220Ms.A04(r5)
            X.17Q r0 = r0.A00(r5)
            r15.add(r0)
            goto L_0x0097
        L_0x00ae:
            java.lang.Object r0 = X.C127397h3.A0A(r1, r6)
            boolean r17 = X.AnonymousClass2LL.A00(r0, r3)
            r0 = 44
            java.lang.Object r0 = X.C127397h3.A0A(r1, r0)
            boolean r16 = X.AnonymousClass2LL.A00(r0, r3)
            X.3DD r8 = new X.3DD
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17)
            r9 = r8
        L_0x00c6:
            r0 = 41
            X.6jp r1 = r4.A0L(r0)
            r0 = 36
            r4.A0T(r0, r3)
            X.3yS r0 = new X.3yS
            r0.<init>(r9, r1, r2)
            return r0
        L_0x00d7:
            java.lang.Object[] r1 = X.C18210wN.A1X(r1)
            java.lang.String r0 = "No implementation bound to key: %s"
            java.lang.String r0 = java.lang.String.format(r0, r1)
            java.lang.IllegalArgumentException r0 = X.C18190wL.A0a(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C122117Ki.A03(X.7h3, int):X.4oW");
    }

    public static C61743Ve A06() {
        return (C61743Ve) AnonymousClass315.A00.getValue();
    }

    public static Object A07(Fragment fragment, C25786Drz drz) {
        drz.A03 = fragment;
        drz.A05();
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2207:0x3614, code lost:
        if (r0 == r4) goto L_0x3f5b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2577:0x3f59, code lost:
        if (r0 != false) goto L_0x3f5b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2590:0x3f8d, code lost:
        if (r1.isPaused() == false) goto L_0x3f5b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2788:0x43ed, code lost:
        if (r3 != null) goto L_0x43ef;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3018:0x4921, code lost:
        if (r1 == X.AnonymousClass006.A0C) goto L_0x3f5b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3714:0x5a00, code lost:
        if (r3.length() == 0) goto L_0x5a02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4218:0x64ba, code lost:
        if (r0 != false) goto L_0x3f5b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0115, code lost:
        if (r0.A03.A08().getVisibility() != 0) goto L_0x0117;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0155, code lost:
        if (((X.C35241Iqy) r0).A01 != com.facebook.react.uimanager.BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) goto L_0x0117;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:845:0x1383, code lost:
        if (X.M6q.A06(r1) != null) goto L_0x3f5b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:4397:0x691f  */
    /* JADX WARNING: Removed duplicated region for block: B:837:0x1369  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.Object A08(X.AnonymousClass601 r28, X.C63893iY r29, java.lang.String r30) {
        /*
            java.lang.String r0 = "bk.action.bloks.PushBottomSheetV3"
            r3 = r30
            boolean r2 = r0.equals(r3)
            r1 = r28
            r0 = r29
            if (r2 == 0) goto L_0x0013
            java.lang.Object r9 = X.AnonymousClass2BU.A00(r1, r0)
        L_0x0012:
            return r9
        L_0x0013:
            java.lang.String r2 = "bk.action.caa.foa.AcceptOxygenPreloadTos"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x002d
            r2 = 1
            X.C04220Ms.A0B(r1, r2)
            X.3HX r0 = r1.A00
            r9 = 0
            if (r0 == 0) goto L_0x0028
            android.content.Context r0 = r0.A00
            if (r0 != 0) goto L_0x6b57
        L_0x0028:
            java.lang.Boolean r9 = X.C18180wK.A0X()
            return r9
        L_0x002d:
            java.lang.String r2 = "bk.action.caa.foa.ShouldAcceptOxygenPreloadTos"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L_0x00c4
            java.lang.String r2 = "bk.action.caa.login.GetDeviceEmails"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0042
            java.lang.Object r9 = X.AnonymousClass2BV.A00(r0)
            return r9
        L_0x0042:
            java.lang.String r2 = "bk.action.ig.userpay.FetchLocalizedPrice"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x004f
            java.lang.Object r9 = X.AnonymousClass2BW.A00(r1, r0)
            return r9
        L_0x004f:
            java.lang.String r2 = "bk.action.cds.UpdateBackButtonOverride"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0076
            boolean r4 = X.AnonymousClass0wJ.A1Y(r0, r1)
            java.lang.Object r0 = X.C63893iY.A0B(r0, r4)
            if (r0 != 0) goto L_0x0071
            r3 = 0
        L_0x0062:
            X.3HX r0 = r1.A00
            r9 = 0
            if (r0 == 0) goto L_0x0012
            android.content.Context r2 = r0.A00
            if (r2 == 0) goto L_0x0012
            if (r3 != 0) goto L_0x67db
            X.C63123bZ.A03(r2, r9)
            return r9
        L_0x0071:
            X.6eC r0 = (X.C105916eC) r0
            X.6jp r3 = r0.A00
            goto L_0x0062
        L_0x0076:
            java.lang.String r2 = "bk.ig.action.wa.RequestOtp"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0099
            X.3HX r0 = A05(r1)
            r9 = 0
            if (r0 == 0) goto L_0x0012
            android.content.Context r1 = r0.A00
            X.C04220Ms.A06(r1)
            java.lang.String r0 = "com.whatsapp"
            X.C62063Wz.A00(r1, r0)
            r0 = 147(0x93, float:2.06E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            X.C62063Wz.A00(r1, r0)
            return r9
        L_0x0099:
            r2 = 311(0x137, float:4.36E-43)
            java.lang.String r2 = X.C18170wI.A00(r2)
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x00aa
            java.lang.Object r9 = X.C32302Be.A00(r0)
            return r9
        L_0x00aa:
            java.lang.String r2 = "bk.action.screen.CloseScreen"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x00b7
            java.lang.Object r9 = X.C32312Bf.A00(r1, r0)
            return r9
        L_0x00b7:
            java.lang.String r2 = "bk.action.screen.Open"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x3943
            java.lang.Object r9 = X.C32332Bi.A00(r1, r0)
            return r9
        L_0x00c4:
            X.3HX r0 = A05(r1)
            if (r0 == 0) goto L_0x0117
            android.content.Context r0 = r0.A00
            if (r0 == 0) goto L_0x0117
            X.3FG r0 = X.AnonymousClass2CP.A00(r0)
            X.C04220Ms.A06(r0)
            boolean r2 = r0.A01
            goto L_0x3f5c
        L_0x00d9:
            java.lang.String r2 = "bk.action.video.GetIsCaptionDisplayed"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x011a
            X.3HX r3 = X.C86104wH.A0V(r0)
            r1 = 1
            X.7h3 r2 = X.C63893iY.A03(r0, r1)
            X.4rP r0 = r3.A02
            X.7qT r0 = (X.C130667qT) r0
            X.9V6 r1 = X.AnonymousClass6OG.A00(r0)
            java.lang.String r0 = X.C18220wO.A0o(r2)
            if (r0 == 0) goto L_0x67e4
            X.AgB r1 = r1.A00(r0)
            if (r1 == 0) goto L_0x0117
            X.7h3 r0 = r1.A04
            java.lang.String r0 = X.C127397h3.A0C(r0)
            if (r0 == 0) goto L_0x0117
            X.AVV r0 = r1.A00
            if (r0 == 0) goto L_0x0117
            X.Ayd r0 = r0.A03
            android.view.View r0 = r0.A08()
            int r0 = r0.getVisibility()
            r2 = 1
            if (r0 == 0) goto L_0x3f5c
        L_0x0117:
            r2 = 0
            goto L_0x3f5c
        L_0x011a:
            java.lang.String r2 = "bk.action.video.GetIsMuted"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0159
            X.3HX r2 = X.C86104wH.A0V(r0)
            r1 = 1
            X.7h3 r1 = X.C63893iY.A03(r0, r1)
            X.4rP r0 = r2.A02
            X.7qT r0 = (X.C130667qT) r0
            X.9V6 r3 = X.AnonymousClass6OG.A00(r0)
            java.lang.String r0 = X.C18220wO.A0o(r1)
            if (r0 == 0) goto L_0x67ee
            X.AgB r1 = r3.A00(r0)
            r2 = 1
            if (r1 == 0) goto L_0x3f5c
            java.util.HashMap r0 = r3.A03
            java.lang.Object r0 = r0.get(r1)
            if (r0 == 0) goto L_0x67e9
            X.9sw r0 = (X.C169229sw) r0
            X.C2j r0 = r0.A02
            if (r0 == 0) goto L_0x3f5c
            X.Iqy r0 = (X.C35241Iqy) r0
            float r1 = r0.A01
            r0 = 0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 != 0) goto L_0x0117
            goto L_0x3f5c
        L_0x0159:
            java.lang.String r2 = "bk.action.video.GetPlaybackState"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0166
            java.lang.Object r9 = X.C100726Ok.A00(r0)
            return r9
        L_0x0166:
            java.lang.String r2 = "bk.action.video.GetPosition"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x01a3
            X.3HX r2 = X.C86104wH.A0V(r0)
            r1 = 1
            X.7h3 r1 = X.C63893iY.A03(r0, r1)
            X.4rP r0 = r2.A02
            X.7qT r0 = (X.C130667qT) r0
            X.9V6 r3 = X.AnonymousClass6OG.A00(r0)
            java.lang.String r1 = X.C18220wO.A0o(r1)
            if (r1 == 0) goto L_0x67f8
            r0 = 0
            X.AgB r2 = r3.A00(r1)
            if (r2 == 0) goto L_0x019e
            java.util.HashMap r1 = r3.A03
            java.lang.Object r1 = r1.get(r2)
            if (r1 == 0) goto L_0x67f3
            X.9sw r1 = (X.C169229sw) r1
            X.C2j r1 = r1.A02
            if (r1 == 0) goto L_0x019e
            int r0 = r1.AbW()
        L_0x019e:
            java.lang.Integer r9 = java.lang.Integer.valueOf(r0)
            return r9
        L_0x01a3:
            java.lang.String r2 = "bk.action.video.SendEvent"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x01b0
            java.lang.Object r9 = X.C100736Ol.A00(r0)
            return r9
        L_0x01b0:
            java.lang.String r2 = "bk.action.video.SetPosition"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x01ed
            X.3HX r2 = X.C86104wH.A0V(r0)
            r1 = 1
            java.lang.Object r1 = X.C63893iY.A0A(r0, r1)
            int r3 = X.AnonymousClass0wJ.A04(r1)
            r1 = 2
            X.7h3 r1 = X.C63893iY.A03(r0, r1)
            X.4rP r0 = r2.A02
            X.7qT r0 = (X.C130667qT) r0
            X.9V6 r2 = X.AnonymousClass6OG.A00(r0)
            java.lang.String r0 = X.C18220wO.A0o(r1)
            if (r0 == 0) goto L_0x6802
            X.AgB r1 = r2.A00(r0)
            if (r1 == 0) goto L_0x395f
            java.util.HashMap r0 = r2.A03
            java.lang.Object r0 = r0.get(r1)
            if (r0 == 0) goto L_0x67fd
            X.9sw r0 = (X.C169229sw) r0
            r0.A00(r3)
            goto L_0x395f
        L_0x01ed:
            java.lang.String r2 = "bk.action.WebViewWithOnChange"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0215
            r3 = 0
            boolean r2 = X.AnonymousClass0wJ.A1Z(r0, r1)
            java.lang.String r4 = X.C63893iY.A0D(r0, r3)
            X.6jp r3 = X.C63893iY.A06(r0, r2)
            r2 = 2
            X.6jp r2 = X.C63893iY.A06(r0, r2)
            X.JhV r0 = new X.JhV
            r0.<init>((java.lang.String) r4)
            com.instagram.simplewebview.SimpleWebViewConfig r0 = r0.A00()
            X.C100746Om.A00(r1, r3, r2, r0)
            r9 = 0
            return r9
        L_0x0215:
            java.lang.String r2 = "bk.action.WebViewWithOnChangeV2"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0263
            r12 = 0
            boolean r2 = X.AnonymousClass0wJ.A1Z(r0, r1)
            r21 = 0
            java.lang.String r8 = X.C63893iY.A0D(r0, r12)
            X.6jp r4 = X.C63893iY.A06(r0, r2)
            r2 = 2
            X.6jp r3 = X.C63893iY.A06(r0, r2)
            r2 = 3
            java.lang.Object r2 = X.C63893iY.A0B(r0, r2)
            boolean r0 = r2 instanceof X.C127397h3
            r9 = 0
            if (r0 == 0) goto L_0x0249
            X.7h3 r2 = (X.C127397h3) r2
            if (r2 == 0) goto L_0x0249
            r0 = 35
            java.lang.Object r0 = X.C127397h3.A0A(r2, r0)
            boolean r21 = X.AnonymousClass2LL.A00(r0, r12)
        L_0x0249:
            r17 = 1
            com.instagram.simplewebview.SimpleWebViewConfig r7 = new com.instagram.simplewebview.SimpleWebViewConfig
            r10 = r9
            r11 = r9
            r13 = r12
            r14 = r12
            r15 = r12
            r16 = r12
            r18 = r12
            r19 = r17
            r20 = r12
            r22 = r12
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            X.C100746Om.A00(r1, r4, r3, r7)
            return r9
        L_0x0263:
            java.lang.String r2 = "bk.action.xav.switcher.ClearHorizontalBadgeCount"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0270
            java.lang.Object r9 = X.AnonymousClass2HV.A00(r1, r0)
            return r9
        L_0x0270:
            java.lang.String r2 = "bk.action.xav.switcher.SnoozeHorizontalBadge"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x027d
            java.lang.Object r9 = X.C100756On.A00(r1, r0)
            return r9
        L_0x027d:
            java.lang.String r2 = "bk.fbpay.connect.action.VerifyAuthFactor"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x028a
            java.lang.Object r9 = X.C100766Oo.A00(r1, r0)
            return r9
        L_0x028a:
            java.lang.String r2 = "bk.fx.action.ExitLinkingFlow"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x029c
            X.AnonymousClass0wJ.A1N(r0, r1)
            X.1dz r2 = X.C23521dz.A00
            java.lang.Object r9 = r2.A01(r1, r0)
            return r9
        L_0x029c:
            java.lang.String r2 = "bk.fx.action.FetchAllAvailableNativeAuthData"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x02a9
            java.lang.Object r9 = X.AnonymousClass2JD.A00(r1, r0)
            return r9
        L_0x02a9:
            java.lang.String r2 = "bk.fx.action.FetchAllAvailableNativeAuthDataForCaller"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x02b6
            java.lang.Object r9 = X.AnonymousClass2HW.A00(r1, r0)
            return r9
        L_0x02b6:
            java.lang.String r2 = "bk.fx.action.FetchAndDisplayIGQuickPromotion"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x02c3
            java.lang.Object r9 = X.AnonymousClass2HX.A00(r1, r0)
            return r9
        L_0x02c3:
            java.lang.String r2 = "bk.fx.action.FetchDeviceID"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x02d0
            java.lang.Object r9 = X.AnonymousClass2HY.A00(r1, r0)
            return r9
        L_0x02d0:
            java.lang.String r2 = "bk.fx.action.FetchFacebookAccountAuthData"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x02dd
            java.lang.Object r9 = X.AnonymousClass2HZ.A00(r1)
            return r9
        L_0x02dd:
            java.lang.String r2 = "bk.fx.action.FetchIGAccountAuthProof"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0305
            r3 = 0
            boolean r2 = X.AnonymousClass0wJ.A1Z(r0, r1)
            java.lang.String r5 = X.C63893iY.A0D(r0, r3)
            X.6jp r4 = X.C63893iY.A06(r0, r2)
            r0 = 34
            kotlin.jvm.internal.KtLambdaShape42S0200000_I2_3 r3 = new kotlin.jvm.internal.KtLambdaShape42S0200000_I2_3
            r3.<init>((X.AnonymousClass601) r1, (X.C109326jp) r4, (int) r0)
            r2 = 36
            kotlin.jvm.internal.KtLambdaShape20S0200000_I2_4 r0 = new kotlin.jvm.internal.KtLambdaShape20S0200000_I2_4
            r0.<init>((X.AnonymousClass601) r1, (X.C109326jp) r4, (int) r2)
            java.lang.Object r9 = X.AnonymousClass6P5.A00(r1, r5, r0, r3)
            return r9
        L_0x0305:
            java.lang.String r2 = "bk.fx.action.FetchIGAccountAuthProofV2"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0322
            r2 = 0
            boolean r3 = X.AnonymousClass0wJ.A1Z(r0, r1)
            java.lang.String r6 = X.C63893iY.A0D(r0, r2)
            java.lang.Object r2 = X.C63893iY.A0B(r0, r3)
            if (r2 != 0) goto L_0x6807
            X.3HX r5 = r1.A00
            if (r5 != 0) goto L_0x680e
            goto L_0x395f
        L_0x0322:
            java.lang.String r2 = "bk.fx.action.GetFamilyDeviceId"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0345
            r0 = 1
            X.C04220Ms.A0B(r1, r0)
            X.0i6 r0 = X.C63913ic.A0F(r1)
            X.0rQ r0 = X.C15500rQ.A01(r0)
            java.lang.String r9 = r0.BJN()
            boolean r0 = X.AnonymousClass0hA.A08(r9)
            if (r0 == 0) goto L_0x0012
            java.lang.String r9 = X.C18200wM.A0g()
            return r9
        L_0x0345:
            java.lang.String r2 = "bk.fx.action.IGLinkSuccess"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0352
            java.lang.Object r9 = X.C33782Ha.A00(r1, r0)
            return r9
        L_0x0352:
            java.lang.String r2 = "bk.fx.action.LogoutSingleUser"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x039a
            X.7qT r0 = X.C63913ic.A08(r1)
            X.0m7 r14 = X.C63913ic.A07(r1)
            r2 = 0
            X.C04220Ms.A0B(r1, r2)
            androidx.fragment.app.FragmentActivity r13 = X.C63913ic.A05(r1)
            X.0kW r15 = X.C63913ic.A0A(r1)
            com.instagram.service.session.UserSession r16 = X.C63913ic.A0J(r1)
            androidx.fragment.app.Fragment r0 = r0.A02
            r9 = 0
            r12 = r9
            if (r0 == 0) goto L_0x0379
            r12 = r0
        L_0x0379:
            X.3hk r1 = X.C63533hk.A02(r16)
            java.lang.String r0 = r16.getUserId()
            boolean r19 = r1.A0I(r0)
            android.content.Context r11 = r13.getApplicationContext()
            java.util.ArrayList r18 = X.AnonymousClass0wJ.A0v()
            java.lang.Integer r17 = X.AnonymousClass006.A00
            X.1jJ r10 = new X.1jJ
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19)
            java.lang.Void[] r0 = new java.lang.Void[r2]
            r10.A02(r0)
            return r9
        L_0x039a:
            java.lang.String r2 = "bk.fx.action.media.OpenMediaPicker"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x03a7
            java.lang.Object r9 = X.C100776Op.A00(r1, r0)
            return r9
        L_0x03a7:
            java.lang.String r2 = "bk.fx.action.OpenURLInIAB"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x03b4
            java.lang.Object r9 = X.C33792Hb.A00(r1, r0)
            return r9
        L_0x03b4:
            java.lang.String r2 = "bk.fx.action.RefreshSSOAccountCache"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x03cd
            r0 = 1
            X.C04220Ms.A0B(r1, r0)
            com.instagram.service.session.UserSession r0 = X.C86104wH.A0Y(r1)
            X.48y r0 = X.C49422rM.A00(r0)
            r9 = 0
            r0.A00(r9)
            return r9
        L_0x03cd:
            java.lang.String r2 = "bk.fx.action.TriggerLinkingFlowCallbackV2"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x03df
            X.AnonymousClass0wJ.A1N(r0, r1)
            X.1e0 r2 = X.AnonymousClass1e0.A00
            java.lang.Object r9 = r2.A01(r1, r0)
            return r9
        L_0x03df:
            r2 = 314(0x13a, float:4.4E-43)
            java.lang.String r2 = X.C18170wI.A00(r2)
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x03f0
            java.lang.Object r9 = X.C67153yx.A00(r1, r0)
            return r9
        L_0x03f0:
            java.lang.String r2 = "bk.ig.action.AcceptDmRequest"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x041c
            r4 = 0
            boolean r3 = X.AnonymousClass0wJ.A1Z(r0, r1)
            X.0i6 r2 = X.C63913ic.A0F(r1)
            X.C18200wM.A1R(r2)
            X.6jp r3 = X.C63893iY.A06(r0, r3)
            X.C04220Ms.A0B(r2, r4)
            X.KHq r2 = X.AnonymousClass3LY.A00(r2)
            X.7rJ r0 = new X.7rJ
            r0.<init>()
            r2.CWx(r0)
            X.C63893iY.A0G(r1, r3)
            r9 = 0
            return r9
        L_0x041c:
            java.lang.String r2 = "bk.ig.action.ConfirmFollowRequest"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x046a
            r8 = 0
            boolean r3 = X.AnonymousClass0wJ.A1Z(r0, r1)
            com.instagram.service.session.UserSession r7 = X.C86104wH.A0Y(r1)
            java.lang.Object r2 = X.C63893iY.A0A(r0, r8)
            java.lang.String r6 = X.C18190wL.A0n(r2)
            java.lang.Object r2 = X.C63893iY.A0B(r0, r3)
            r2.getClass()
            int r5 = X.AnonymousClass0wJ.A04(r2)
            r2 = 2
            X.6jp r4 = X.C63893iY.A06(r0, r2)
            com.instagram.user.model.User r3 = X.C18210wN.A0P(r7, r6)
            if (r3 == 0) goto L_0x045f
            X.C04220Ms.A0B(r7, r2)
            X.KHq r2 = X.AnonymousClass3LY.A00(r7)
            X.7rk r0 = new X.7rk
            r0.<init>(r3, r5)
            r2.CWx(r0)
        L_0x045a:
            X.C63893iY.A0G(r1, r4)
            r9 = 0
            return r9
        L_0x045f:
            X.3Y8 r2 = X.AnonymousClass3Y8.A02
            com.facebook.redex.IDxFListenerShape20S0101000_2_I2 r0 = new com.facebook.redex.IDxFListenerShape20S0101000_2_I2
            r0.<init>(r7, r5, r8)
            r2.A00(r7, r0, r6)
            goto L_0x045a
        L_0x046a:
            java.lang.String r2 = "bk.ig.action.DeleteDmRequest"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0496
            r4 = 0
            boolean r3 = X.AnonymousClass0wJ.A1Z(r0, r1)
            X.0i6 r2 = X.C63913ic.A0F(r1)
            X.C18200wM.A1R(r2)
            X.6jp r3 = X.C63893iY.A06(r0, r3)
            X.C04220Ms.A0B(r2, r4)
            X.KHq r2 = X.AnonymousClass3LY.A00(r2)
            X.7rK r0 = new X.7rK
            r0.<init>()
            r2.CWx(r0)
            X.C63893iY.A0G(r1, r3)
            r9 = 0
            return r9
        L_0x0496:
            java.lang.String r2 = "bk.ig.action.IgnoreFollowRequest"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x04e4
            r2 = 0
            boolean r8 = X.AnonymousClass0wJ.A1Z(r0, r1)
            java.lang.Object r2 = X.C63893iY.A0A(r0, r2)
            java.lang.String r7 = X.C18190wL.A0n(r2)
            java.lang.Object r2 = X.C63893iY.A0B(r0, r8)
            r2.getClass()
            int r6 = X.AnonymousClass0wJ.A04(r2)
            r2 = 2
            X.6jp r5 = X.C63893iY.A06(r0, r2)
            com.instagram.service.session.UserSession r4 = X.C86104wH.A0Y(r1)
            com.instagram.user.model.User r3 = X.C18210wN.A0P(r4, r7)
            if (r3 == 0) goto L_0x04d9
            X.C04220Ms.A0B(r4, r2)
            X.KHq r2 = X.AnonymousClass3LY.A00(r4)
            X.7rl r0 = new X.7rl
            r0.<init>(r3, r6)
            r2.CWx(r0)
        L_0x04d4:
            X.C63893iY.A0G(r1, r5)
            r9 = 0
            return r9
        L_0x04d9:
            X.3Y8 r2 = X.AnonymousClass3Y8.A02
            com.facebook.redex.IDxFListenerShape20S0101000_2_I2 r0 = new com.facebook.redex.IDxFListenerShape20S0101000_2_I2
            r0.<init>(r4, r6, r8)
            r2.A00(r4, r0, r7)
            goto L_0x04d4
        L_0x04e4:
            java.lang.String r2 = "bk.ig.action.ixt.EventEnded"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x050d
            r2 = 0
            java.lang.Object r3 = X.C63893iY.A0B(r0, r2)
            java.util.Map r3 = (java.util.Map) r3
            r2 = 2131302288(0x7f091790, float:1.8222658E38)
            java.lang.Class<X.3If> r0 = X.AnonymousClass3If.class
            java.lang.Object r1 = X.C63913ic.A0L(r1, r0, r2)
            X.3If r1 = (X.AnonymousClass3If) r1
            r9 = 0
            if (r1 == 0) goto L_0x0012
            if (r3 == 0) goto L_0x050b
            java.util.HashMap r0 = X.C63913ic.A0N(r3)
        L_0x0507:
            r1.A05(r0)
            return r9
        L_0x050b:
            r0 = r9
            goto L_0x0507
        L_0x050d:
            java.lang.String r2 = "bk.ig.action.OpenQuiteModeSettings"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x051a
            java.lang.Object r9 = X.C33802Hc.A00(r1, r0)
            return r9
        L_0x051a:
            java.lang.String r2 = "bk.ig.action.SimpleActionHandler"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0527
            java.lang.Object r9 = X.C33812Hd.A00(r1, r0)
            return r9
        L_0x0527:
            java.lang.String r2 = "bk.ig.action.wa.HasWhatsApp"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0552
            X.3HX r0 = A05(r1)
            if (r0 == 0) goto L_0x0550
            android.content.Context r1 = r0.A00
        L_0x0537:
            r2 = 0
            if (r1 == 0) goto L_0x3f5c
            boolean r0 = X.C09650fs.A07(r1)
            if (r0 != 0) goto L_0x3f5b
            android.content.pm.PackageManager r1 = r1.getPackageManager()
            r0 = 147(0x93, float:2.06E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            boolean r0 = X.C09650fs.A09(r1, r0)
            goto L_0x3f59
        L_0x0550:
            r1 = 0
            goto L_0x0537
        L_0x0552:
            java.lang.String r2 = "bk.ig.android.GoToNotificationSettings"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0567
            X.3HX r0 = A05(r1)
            r9 = 0
            if (r0 == 0) goto L_0x0012
            android.content.Context r0 = r0.A00
            X.C63853iS.A0B(r0)
            return r9
        L_0x0567:
            java.lang.String r2 = "bk.ig.notification.AreNotificationsEnabled"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0594
            boolean r2 = X.AnonymousClass0wJ.A1Y(r0, r1)
            X.6jp r3 = X.C63893iY.A06(r0, r2)
            X.3HX r0 = r1.A00
            r9 = 0
            if (r0 == 0) goto L_0x0012
            android.content.Context r2 = r0.A00
            X.C04220Ms.A06(r2)
            X.7EV r0 = new X.7EV
            r0.<init>(r2)
            android.app.NotificationManager r0 = r0.A00
            boolean r0 = r0.areNotificationsEnabled()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            X.C86124wJ.A1Q(r1, r3, r0)
            return r9
        L_0x0594:
            java.lang.String r2 = "bk.ig.notification.IsChannelEnabled"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x05a1
            java.lang.Object r9 = X.C33822He.A00(r1, r0)
            return r9
        L_0x05a1:
            java.lang.String r2 = "bk.ig.notification.IsUserInQuietMode"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x05c8
            X.3HX r0 = A05(r1)
            java.lang.Boolean r9 = X.C18180wK.A0X()
            if (r0 == 0) goto L_0x0012
            X.0i6 r1 = X.C63913ic.A0E(r0)
            boolean r0 = r1 instanceof com.instagram.service.session.UserSession
            if (r0 == 0) goto L_0x0012
            com.instagram.service.session.UserSession r1 = (com.instagram.service.session.UserSession) r1
            if (r1 == 0) goto L_0x0012
            boolean r0 = X.C63823iP.A0E(r1)
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r0)
            return r9
        L_0x05c8:
            java.lang.String r2 = "bk.ig.notification.OpenDeviceNotificationSettings"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x05dd
            X.3HX r0 = A05(r1)
            r9 = 0
            if (r0 == 0) goto L_0x0012
            android.content.Context r0 = r0.A00
            X.C09660ft.A00(r0)
            return r9
        L_0x05dd:
            java.lang.String r2 = "bk.ig.notification.ShouldDecoupleFromChannel"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x060a
            r4 = 0
            boolean r3 = X.AnonymousClass0wJ.A1Z(r0, r1)
            X.0i6 r2 = X.C63913ic.A0F(r1)
            X.C18200wM.A1R(r2)
            java.util.List r0 = r0.A00
            r0.get(r4)
            X.C04220Ms.A0B(r2, r4)
            java.lang.Class<X.7tQ> r1 = X.C132147tQ.class
            kotlin.jvm.internal.KtLambdaShape65S0100000_I2_45 r0 = new kotlin.jvm.internal.KtLambdaShape65S0100000_I2_45
            r0.<init>(r2, r3)
            r2.A01(r1, r0)
            java.lang.String r0 = "isInAppNotificationEnabled"
            java.lang.NullPointerException r2 = X.C18210wN.A0W(r0)
            throw r2
        L_0x060a:
            java.lang.String r2 = "bk.mini.action.DidUpdateSSHSettings"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x063b
            boolean r3 = X.AnonymousClass0wJ.A1Y(r0, r1)
            X.0i6 r1 = X.C63913ic.A0F(r1)
            com.instagram.service.session.UserSession r2 = X.C05030Qo.A03(r1)
            java.lang.Object r1 = X.C63893iY.A0B(r0, r3)
            X.7h3 r1 = (X.C127397h3) r1
            if (r2 == 0) goto L_0x395f
            if (r1 == 0) goto L_0x395f
            X.KHq r2 = X.AnonymousClass3LY.A00(r2)
            r0 = 35
            r1.A0T(r0, r3)
            X.7rR r0 = new X.7rR
            r0.<init>()
        L_0x0636:
            r2.CWx(r0)
            goto L_0x395f
        L_0x063b:
            java.lang.String r2 = "bloks.browser_history.OpenIAW"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0648
            java.lang.Object r9 = X.C100786Oq.A00(r1, r0)
            return r9
        L_0x0648:
            java.lang.String r2 = "bloks.browser_history.UpdateProperty"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0655
            java.lang.Object r9 = X.C100796Or.A00(r1, r0)
            return r9
        L_0x0655:
            java.lang.String r2 = "bk.action.cxf.experimental.cpdp.Prefetch"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0662
            java.lang.Object r9 = X.C33832Hf.A00(r1, r0)
            return r9
        L_0x0662:
            java.lang.String r2 = "bk.action.ig.cxf.AutomatedLoggingTap"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0697
            r2 = 0
            boolean r3 = X.AnonymousClass0wJ.A1Z(r0, r1)
            java.lang.Object r2 = X.C63893iY.A0B(r0, r2)
            X.7h3 r2 = (X.C127397h3) r2
            r9 = 0
            if (r2 == 0) goto L_0x0695
            X.3HX r0 = r1.A00
            android.view.View r2 = r2.A0J(r0)
        L_0x067e:
            X.0i6 r0 = X.C63913ic.A0F(r1)
            com.instagram.service.session.UserSession r0 = X.C05030Qo.A02(r0)
            X.C04220Ms.A0B(r0, r3)
            if (r2 == 0) goto L_0x6825
            X.Jn1 r1 = X.C37235Jn1.A00(r0)
            X.9zS r0 = X.C171469zS.TAP
            r1.A03(r2, r0)
            return r9
        L_0x0695:
            r2 = r9
            goto L_0x067e
        L_0x0697:
            java.lang.String r2 = "bk.action.ig.cxf.HandleVideoPlayingAfterScrollingToLightboxIndex"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0708
            r2 = 0
            boolean r3 = X.AnonymousClass0wJ.A1Z(r0, r1)
            java.lang.Object r2 = X.C63893iY.A0B(r0, r2)
            r2.getClass()
            java.lang.Object r0 = X.C63893iY.A0A(r0, r3)
            int r4 = X.AnonymousClass0wJ.A04(r0)
            X.0i6 r0 = X.C63913ic.A0F(r1)
            X.C05030Qo.A02(r0)
            int r1 = X.C103566Zr.A00
            r9 = 0
            if (r4 == r1) goto L_0x0012
            r3 = -1
            if (r1 == r3) goto L_0x06e1
            java.util.HashMap r0 = X.C103566Zr.A01
            java.lang.Object r0 = X.C86164wN.A0c(r0, r1)
            java.lang.ref.Reference r0 = (java.lang.ref.Reference) r0
            if (r0 == 0) goto L_0x06e1
            java.lang.Object r0 = r0.get()
            X.9Ug r0 = (X.C157889Ug) r0
            if (r0 == 0) goto L_0x06e1
            X.At4 r1 = r0.A0Z()
            r0 = 454(0x1c6, float:6.36E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r1.A03(r0)
        L_0x06e1:
            java.util.HashMap r0 = X.C103566Zr.A01
            java.lang.Object r0 = X.C86164wN.A0c(r0, r4)
            java.lang.ref.Reference r0 = (java.lang.ref.Reference) r0
            if (r0 == 0) goto L_0x682d
            java.lang.Object r2 = r0.get()
            X.9Ug r2 = (X.C157889Ug) r2
            if (r2 == 0) goto L_0x682d
            X.C103566Zr.A00 = r4
            X.At4 r0 = r2.A0Z()
            X.BKU r1 = r2.A0W()
            r0.A00(r1)
            android.view.View r0 = r2.A0T()
            r2.A0a(r0, r1)
            return r9
        L_0x0708:
            java.lang.String r2 = "bk.action.ig.cxf.SendMessageToMerchant"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0715
            java.lang.Object r9 = X.C33842Hg.A00(r1, r0)
            return r9
        L_0x0715:
            java.lang.String r2 = "bk.action.ig.cxf.ShareProduct"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0722
            java.lang.Object r9 = X.C33852Hh.A00(r1, r0)
            return r9
        L_0x0722:
            java.lang.String r2 = "fbpay.action.GeneratePTT"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0774
            java.lang.Object r8 = X.C63893iY.A08(r0)
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r7 = X.C63893iY.A09(r0)
            java.util.Map r7 = (java.util.Map) r7
            r2 = 3
            X.6jp r6 = X.C63893iY.A06(r0, r2)
            r2 = 4
            X.6jp r5 = X.C63893iY.A06(r0, r2)
            r2 = 5
            java.lang.Object r2 = X.C63893iY.A0B(r0, r2)
            r2.getClass()
            java.util.Collection r2 = (java.util.Collection) r2
            X.7HL r4 = X.AnonymousClass76O.A00()
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>(r2)
            X.6gh r3 = new X.6gh
            r3.<init>(r7, r0)
            java.util.Set r2 = java.util.Collections.emptySet()
            java.util.Map r0 = java.util.Collections.emptyMap()
            X.7Dl r0 = X.C120977Dl.A01(r4, r3, r8, r0, r2)
            X.M5J r3 = X.C92975kL.A00(r0)
            r2 = 30
            com.facebook.redex.IDxObserverShape55S0300000_2_I2 r0 = new com.facebook.redex.IDxObserverShape55S0300000_2_I2
            r0.<init>((X.AnonymousClass601) r1, (X.C109326jp) r6, (X.C109326jp) r5, (int) r2)
            X.AnonymousClass7Kx.A0H(r3, r0)
            r9 = 0
            return r9
        L_0x0774:
            java.lang.String r2 = "fbpay.action.navigation.Authenticate"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0781
            java.lang.Object r9 = X.C100806Os.A00(r1, r0)
            return r9
        L_0x0781:
            java.lang.String r2 = "fx.action.crossposting.SetReelsAutoCrossposting"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x07a0
            boolean r2 = X.AnonymousClass0wJ.A1Y(r0, r1)
            boolean r2 = X.AnonymousClass3WF.A01(r0, r2)
            X.0i6 r0 = X.C63913ic.A0F(r1)
            com.instagram.service.session.UserSession r0 = (com.instagram.service.session.UserSession) r0
            X.49f r0 = X.C49252r5.A00(r0)
            r0.A03(r2)
            r9 = 0
            return r9
        L_0x07a0:
            java.lang.String r2 = "ig.action.ad4ad.PresentBoostPostV2"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x07ad
            java.lang.Object r9 = X.C35651IzR.A00(r1, r0)
            return r9
        L_0x07ad:
            java.lang.String r2 = "ig.action.ads.PromotionManagerShouldRefresh"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x07cf
            r0 = 1
            X.C04220Ms.A0B(r1, r0)
            X.0i6 r0 = X.C63913ic.A0F(r1)
            com.instagram.service.session.UserSession r0 = X.C05030Qo.A02(r0)
            X.KHq r1 = X.AnonymousClass3LY.A00(r0)
            X.7rI r0 = new X.7rI
            r0.<init>()
            r1.CWx(r0)
            r9 = 0
            return r9
        L_0x07cf:
            java.lang.String r2 = "ig.action.AgeVerificationFlowExited"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x07dc
            java.lang.Object r9 = X.C33862Hi.A00(r1, r0)
            return r9
        L_0x07dc:
            java.lang.String r2 = "ig.action.AnnounceRemixSettingsUpdated"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0800
            r0 = 1
            X.C04220Ms.A0B(r1, r0)
            X.0i6 r1 = X.C63913ic.A0F(r1)
            boolean r0 = r1 instanceof com.instagram.service.session.UserSession
            r9 = 0
            if (r0 == 0) goto L_0x6830
            if (r1 == 0) goto L_0x6830
            X.KHq r1 = X.AnonymousClass3LY.A00(r1)
            X.7rN r0 = new X.7rN
            r0.<init>()
            r1.CWx(r0)
            return r9
        L_0x0800:
            java.lang.String r2 = "ig.action.birthday.OpenBirthdayBottomSheet"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x080d
            java.lang.Object r9 = X.C33872Hj.A00(r1, r0)
            return r9
        L_0x080d:
            java.lang.String r2 = "ig.action.branded_content.OpenEditPaidPartnershipLabelScreen"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x081a
            java.lang.Object r9 = X.C33882Hk.A00(r1, r0)
            return r9
        L_0x081a:
            java.lang.String r2 = "ig.action.branded_content.OpenPartnershipThreadWithUser"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x084e
            boolean r2 = X.AnonymousClass0wJ.A1Z(r0, r1)
            java.lang.Object r0 = X.C63893iY.A0B(r0, r2)
            r0.getClass()
            java.lang.String r6 = r0.toString()
            X.0i6 r5 = X.C63913ic.A0F(r1)
            com.instagram.service.session.UserSession r5 = (com.instagram.service.session.UserSession) r5
            androidx.fragment.app.Fragment r2 = X.C63913ic.A01(r1)
            androidx.fragment.app.FragmentActivity r3 = X.C63913ic.A05(r1)
            X.0kW r4 = X.C63913ic.A0A(r1)
            r0 = 853(0x355, float:1.195E-42)
            java.lang.String r7 = X.C18170wI.A00(r0)
            X.AnonymousClass2NP.A00(r2, r3, r4, r5, r6, r7)
            r9 = 0
            return r9
        L_0x084e:
            java.lang.String r2 = "ig.action.business.GetBusinessUserAccessToken"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0861
            com.instagram.service.session.UserSession r0 = X.C63913ic.A0J(r1)
            X.6dy r0 = X.AnonymousClass6PN.A00(r0)
            java.lang.String r9 = r0.A00
            return r9
        L_0x0861:
            java.lang.String r2 = "ig.action.ccu.GetCcuTurnedOn"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0882
            r0 = 1
            X.C04220Ms.A0B(r1, r0)
            X.0i6 r0 = X.C63913ic.A0F(r1)
            com.instagram.service.session.UserSession r1 = X.C05030Qo.A02(r0)
            android.content.Context r0 = X.C18230wP.A08()
            boolean r0 = X.C34832Lb.A00(r0, r1)
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r0)
            return r9
        L_0x0882:
            java.lang.String r2 = "ig.action.ccu.SetCcuTurnedOn"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x08a3
            boolean r2 = X.AnonymousClass0wJ.A1Y(r0, r1)
            boolean r2 = X.AnonymousClass3WF.A01(r0, r2)
            X.0i6 r0 = X.C63913ic.A0F(r1)
            com.instagram.service.session.UserSession r0 = X.C05030Qo.A02(r0)
            X.1tl r0 = X.AnonymousClass3WS.A01(r0)
            r0.A0N(r2)
            r9 = 0
            return r9
        L_0x08a3:
            java.lang.String r2 = "ig.action.cdsdialog.OpenDialog"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x08b0
            java.lang.Object r9 = X.C59403Kr.A01(r1, r0)
            return r9
        L_0x08b0:
            java.lang.String r2 = "ig.action.challenges.BackToLogin"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x08cb
            X.3YR r3 = X.AnonymousClass3YR.A00
            r0 = 0
            X.C04220Ms.A0B(r1, r0)
            androidx.fragment.app.FragmentActivity r2 = X.C63913ic.A05(r1)
            X.0i6 r0 = X.C63913ic.A0F(r1)
            r9 = 0
            r3.A02(r2, r9, r0)
            return r9
        L_0x08cb:
            java.lang.String r2 = "ig.action.challenges.HandleSuccess"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x08fc
            boolean r2 = X.AnonymousClass0wJ.A1Y(r0, r1)
            java.lang.Object r2 = X.C63893iY.A0B(r0, r2)
            r2.getClass()
            X.C18240wQ.A1I(r2)
            java.lang.String r0 = "escalation_appeal"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x395f
            X.0i6 r0 = X.C63913ic.A0F(r1)
            com.instagram.service.session.UserSession r0 = X.C05030Qo.A02(r0)
            X.KHq r2 = X.AnonymousClass3LY.A00(r0)
            X.7rV r0 = new X.7rV
            r0.<init>()
            goto L_0x0636
        L_0x08fc:
            java.lang.String r2 = "ig.action.challenges.LogEvent"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0944
            r3 = 0
            boolean r2 = X.AnonymousClass0wJ.A1Z(r0, r1)
            java.lang.Object r4 = X.C63893iY.A0B(r0, r3)
            r4.getClass()
            java.lang.String r3 = X.C86164wN.A0h(r4)
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r5 = X.C63893iY.A0C(r0, r3, r2)
            java.lang.String r5 = (java.lang.String) r5
            r2 = 2
            java.lang.Object r6 = X.C63893iY.A0C(r0, r3, r2)
            java.lang.String r6 = (java.lang.String) r6
            r2 = 3
            java.lang.Object r7 = X.C63893iY.A0C(r0, r3, r2)
            java.lang.String r7 = (java.lang.String) r7
            r3 = 4
            java.util.List r2 = r0.A00
            java.lang.String r8 = X.C18190wL.A0q(r2, r3)
            r0 = 5
            java.lang.String r9 = X.C18190wL.A0q(r2, r0)
            r0 = 6
            java.lang.String r10 = X.C18190wL.A0q(r2, r0)
            X.0i6 r3 = X.C63913ic.A0F(r1)
            X.C37359JqC.A05(r3, r4, r5, r6, r7, r8, r9, r10)
            r9 = 0
            return r9
        L_0x0944:
            java.lang.String r2 = "ig.action.challenges.LogChallengeEvent"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x098b
            r3 = 0
            boolean r2 = X.AnonymousClass0wJ.A1Z(r0, r1)
            java.lang.Object r6 = X.C63893iY.A0B(r0, r3)
            r6.getClass()
            java.lang.String r3 = X.C86164wN.A0h(r6)
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r5 = X.C63893iY.A0C(r0, r3, r2)
            java.lang.String r5 = (java.lang.String) r5
            r2 = 2
            java.lang.Object r4 = X.C63893iY.A0C(r0, r3, r2)
            java.lang.String r4 = (java.lang.String) r4
            r2 = 3
            java.lang.Object r3 = X.C63893iY.A0C(r0, r3, r2)
            java.lang.String r3 = (java.lang.String) r3
            r2 = 4
            java.lang.Object r0 = X.C63893iY.A0B(r0, r2)
            java.lang.String r0 = (java.lang.String) r0
            X.0i6 r10 = X.C63913ic.A0F(r1)
            r9 = 0
            r11 = r6
            r12 = r5
            r13 = r4
            r14 = r3
            r15 = r9
            r16 = r9
            r17 = r0
            X.C37359JqC.A05(r10, r11, r12, r13, r14, r15, r16, r17)
            return r9
        L_0x098b:
            java.lang.String r2 = "ig.action.challenges.Logout"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0998
            java.lang.Object r9 = X.C33892Hl.A00(r1)
            return r9
        L_0x0998:
            java.lang.String r2 = "ig.action.challenges.ShowCheckpoint"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x09a5
            java.lang.Object r9 = X.C33902Hm.A00(r1, r0)
            return r9
        L_0x09a5:
            java.lang.String r2 = "ig.action.challenges.SwitchToPlatform"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x09b2
            java.lang.Object r9 = X.C33912Hn.A00(r1, r0)
            return r9
        L_0x09b2:
            java.lang.String r2 = "ig.action.civic_action.RefreshVotingInfoCenter"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x09d0
            r0 = 1
            X.C04220Ms.A0B(r1, r0)
            r2 = 2131302025(0x7f091689, float:1.8222124E38)
            java.lang.Class<X.8jB> r0 = X.AnonymousClass8jB.class
            java.lang.Object r0 = X.C63913ic.A0L(r1, r0, r2)
            X.8jB r0 = (X.AnonymousClass8jB) r0
            if (r0 == 0) goto L_0x395f
            r0.CFB()
            goto L_0x395f
        L_0x09d0:
            java.lang.String r2 = "ig.action.clips.OnSfpltMenuClick"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x09f3
            java.lang.Object r0 = X.C63893iY.A07(r0)
            X.AnonymousClass3WF.A02(r0)
            X.7qT r0 = X.C63913ic.A08(r1)
            java.lang.Class<X.8eq> r2 = X.C142428eq.class
            r1 = 2131298647(0x7f090957, float:1.8215273E38)
            android.util.SparseArray r0 = r0.A01
            java.lang.Object r0 = r0.get(r1)
            r2.cast(r0)
            r9 = 0
            return r9
        L_0x09f3:
            java.lang.String r2 = "ig.action.clips.OnSfpltMenuDismiss"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0a0f
            X.7qT r0 = X.C63913ic.A08(r1)
            java.lang.Class<X.8er> r2 = X.C142438er.class
            r1 = 2131298648(0x7f090958, float:1.8215275E38)
            android.util.SparseArray r0 = r0.A01
            java.lang.Object r0 = r0.get(r1)
            r2.cast(r0)
            r9 = 0
            return r9
        L_0x0a0f:
            java.lang.String r2 = "ig.action.contacts.GetLastSeenDiscoverPeopleUpsell"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0a2a
            com.instagram.service.session.UserSession r0 = X.C63913ic.A0J(r1)
            android.content.SharedPreferences r1 = X.C28161tl.A04(r0)
            java.lang.String r0 = "last_seen_upsell_on_discover_people_timestamp"
            long r0 = X.C18180wK.A05(r1, r0)
            java.lang.Long r9 = java.lang.Long.valueOf(r0)
            return r9
        L_0x0a2a:
            java.lang.String r2 = "ig.action.contacts.GetNumTimesSeenUpsell"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0a52
            r0 = 1
            X.C04220Ms.A0B(r1, r0)
            X.0i6 r0 = X.C63913ic.A0F(r1)
            com.instagram.service.session.UserSession r0 = X.C05030Qo.A02(r0)
            android.content.SharedPreferences r2 = X.C28161tl.A04(r0)
            r0 = 1267(0x4f3, float:1.775E-42)
            java.lang.String r1 = X.C18170wI.A00(r0)
            r0 = 0
            int r0 = r2.getInt(r1, r0)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r0)
            return r9
        L_0x0a52:
            java.lang.String r2 = "ig.action.contacts.ImportAddressBook"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0a88
            r3 = 0
            X.6jp r6 = X.C63893iY.A06(r0, r3)
            r2 = 1
            X.6jp r7 = X.C63893iY.A06(r0, r2)
            X.C04220Ms.A0B(r1, r3)
            androidx.fragment.app.FragmentActivity r3 = X.C63913ic.A05(r1)
            androidx.fragment.app.Fragment r4 = X.C63913ic.A01(r1)
            com.instagram.service.session.UserSession r8 = X.C63913ic.A0J(r1)
            X.482 r2 = new X.482
            r5 = r1
            r2.<init>(r3, r4, r5, r6, r7, r8)
            r0 = 23
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            java.lang.String[] r0 = new java.lang.String[]{r0}
            X.AnonymousClass7K8.A02(r3, r2, r0)
            r9 = 0
            return r9
        L_0x0a88:
            java.lang.String r2 = "ig.action.contacts.SetLastSeenDiscoverPeopleUpsell"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0ab3
            boolean r2 = X.AnonymousClass0wJ.A1Y(r0, r1)
            java.lang.Object r0 = X.C63893iY.A0A(r0, r2)
            long r2 = X.C18190wL.A08(r0)
            X.0i6 r0 = X.C63913ic.A0F(r1)
            com.instagram.service.session.UserSession r0 = X.C05030Qo.A02(r0)
            android.content.SharedPreferences r0 = X.C28161tl.A04(r0)
            android.content.SharedPreferences$Editor r1 = r0.edit()
            java.lang.String r0 = "last_seen_upsell_on_discover_people_timestamp"
            X.AnonymousClass0wJ.A12(r1, r0, r2)
            r9 = 0
            return r9
        L_0x0ab3:
            java.lang.String r2 = "ig.action.contacts.SetNumTimesSeenUpsell"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0ac0
            java.lang.Object r9 = X.C33922Ho.A00(r1, r0)
            return r9
        L_0x0ac0:
            java.lang.String r2 = "ig.action.data.ReadApiField"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0ae8
            r3 = 0
            X.C04220Ms.A0B(r0, r3)
            java.lang.Object r2 = X.C63893iY.A0B(r0, r3)
            r2.getClass()
            java.util.Map r2 = (java.util.Map) r2
            r1 = 1
            java.lang.Object r0 = X.C63893iY.A0B(r0, r1)
            r0.getClass()
            X.C18240wQ.A1I(r0)
            X.C04220Ms.A0B(r2, r3)
            java.lang.Object r9 = r2.get(r0)
            return r9
        L_0x0ae8:
            java.lang.String r2 = "ig.action.data.WriteApiField"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0af5
            java.lang.Object r9 = X.C100816Ot.A00(r1, r0)
            return r9
        L_0x0af5:
            java.lang.String r2 = "ig.action.DidCreateLeadGenForm"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0b02
            java.lang.Object r9 = X.C100826Ou.A00(r1, r0)
            return r9
        L_0x0b02:
            java.lang.String r2 = "ig.action.equity.BusinessOwnerDiversityCategoriesUpdated"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0b45
            r0 = 1
            X.C04220Ms.A0B(r1, r0)
            com.instagram.service.session.UserSession r1 = X.C86104wH.A0Y(r1)
            X.4tj r0 = X.C62523aB.A00
            if (r0 != 0) goto L_0x0b1d
            X.4N7 r0 = new X.4N7
            r0.<init>()
            X.C62523aB.A00 = r0
        L_0x0b1d:
            X.C62523aB.A01()
            r0 = 0
            X.C04220Ms.A0B(r1, r0)
            com.instagram.wellbeing.equity.diversity.DiversityInfoRepository r4 = X.C60523Pl.A00(r1)
            java.lang.String r3 = r1.getUserId()
            X.C04220Ms.A0B(r3, r0)
            X.48m r0 = com.instagram.wellbeing.equity.diversity.DiversityInfoRepository.A00(r4)
            android.util.LruCache r0 = r0.A00
            r0.remove(r3)
            X.4qz r2 = r4.A01
            r9 = 0
            com.instagram.wellbeing.equity.diversity.DiversityInfoRepository$updateCacheAndDispatch$1 r1 = new com.instagram.wellbeing.equity.diversity.DiversityInfoRepository$updateCacheAndDispatch$1
            r1.<init>(r4, r3, r9)
            r0 = 3
            X.C25237DiI.A00(r9, r9, r1, r2, r0)
            return r9
        L_0x0b45:
            java.lang.String r2 = "ig.action.equity.DeleteBusinessOwnerDiversityProfile"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0b54
            X.3U7 r2 = X.AnonymousClass3U7.A00
            java.lang.Object r9 = r2.A00(r1, r0)
            return r9
        L_0x0b54:
            java.lang.String r2 = "ig.action.equity.GetBusinessOwnerDiversityInfo"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0b61
            java.lang.Object r9 = X.AnonymousClass3XG.A00(r1, r0)
            return r9
        L_0x0b61:
            java.lang.String r2 = "ig.action.equity.GetBusinessOwnerDiversityProfile"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0b70
            X.3U8 r2 = X.AnonymousClass3U8.A00
            java.lang.Object r9 = r2.A00(r1, r0)
            return r9
        L_0x0b70:
            java.lang.String r2 = "ig.action.equity.GetBusinessOwnerDiversityProfileWithPlatformVisibility"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0b7f
            X.3U9 r2 = X.AnonymousClass3U9.A00
            java.lang.Object r9 = r2.A00(r1, r0)
            return r9
        L_0x0b7f:
            java.lang.String r2 = "ig.action.equity.OpenDestinationShareSheet"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0b8c
            java.lang.Object r9 = X.C33932Hp.A00(r1, r0)
            return r9
        L_0x0b8c:
            java.lang.String r2 = "ig.action.equity.SetBusinessOwnerDiversityProfile"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0b9b
            X.3UA r2 = X.AnonymousClass3UA.A00
            java.lang.Object r9 = r2.A00(r1, r0)
            return r9
        L_0x0b9b:
            java.lang.String r2 = "ig.action.facebook_account.AuthorizeFb"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0bc1
            java.lang.Object r3 = X.C63893iY.A07(r0)
            java.util.List r3 = (java.util.List) r3
            r2 = 1
            X.6jp r5 = X.C63893iY.A06(r0, r2)
            r2 = 2
            X.6jp r6 = X.C63893iY.A06(r0, r2)
            r2 = 3
            X.6jp r7 = X.C63893iY.A06(r0, r2)
            java.lang.String r8 = "ig_default"
            r4 = r1
            r9 = r3
            X.C35742Oq.A00(r4, r5, r6, r7, r8, r9)
            r9 = 0
            return r9
        L_0x0bc1:
            java.lang.String r2 = "ig.action.facebook_account.GetFbAccessToken"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0be7
            com.instagram.service.session.UserSession r3 = X.C63913ic.A0J(r1)
            com.instagram.user.model.User r0 = X.AnonymousClass0wJ.A0Y(r3)
            boolean r2 = r0.A3D()
            java.lang.String r1 = "ig_blocks_fb_extensions"
            com.facebook.common.callercontext.CallerContext r0 = X.C125617dc.A00
            if (r2 == 0) goto L_0x0be2
            java.lang.String r9 = X.C61853Wb.A00(r0, r3, r1)
        L_0x0bdf:
            if (r9 == 0) goto L_0x41a4
            return r9
        L_0x0be2:
            java.lang.String r9 = X.C62963bD.A01(r0, r3, r1)
            goto L_0x0bdf
        L_0x0be7:
            java.lang.String r2 = "ig.action.facebook_account.HasFbPermissions"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0bf4
            java.lang.Object r9 = X.C33942Hq.A00(r1, r0)
            return r9
        L_0x0bf4:
            java.lang.String r2 = "ig.action.facebook_account.LinkToFBAccount"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0c20
            java.lang.Object r4 = X.C63893iY.A07(r0)
            java.util.List r4 = (java.util.List) r4
            r2 = 1
            java.lang.Object r3 = X.C63893iY.A0B(r0, r2)
            java.lang.String r3 = (java.lang.String) r3
            r2 = 2
            X.6jp r6 = X.C63893iY.A06(r0, r2)
            r2 = 3
            X.6jp r7 = X.C63893iY.A06(r0, r2)
            r2 = 4
            X.6jp r8 = X.C63893iY.A06(r0, r2)
            r5 = r1
            r9 = r3
            r10 = r4
            X.C35742Oq.A00(r5, r6, r7, r8, r9, r10)
            r9 = 0
            return r9
        L_0x0c20:
            java.lang.String r2 = "ig.action.feed.GetFeedItemRankingWeight"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0c4b
            java.lang.Object r2 = X.C63893iY.A07(r0)
            java.lang.String r2 = (java.lang.String) r2
            com.instagram.service.session.UserSession r0 = X.C63913ic.A0J(r1)
            X.BKU r0 = X.C86114wI.A0W(r0, r2)
            java.lang.Float r1 = X.BKU.A0i
            if (r0 == 0) goto L_0x0c41
            X.BKN r0 = r0.A0f
            java.lang.Float r0 = r0.A3D
            if (r0 == 0) goto L_0x0c41
            r1 = r0
        L_0x0c41:
            float r0 = r1.floatValue()
            double r0 = (double) r0
            java.lang.Number r9 = X.AnonymousClass3WF.A00(r0)
            return r9
        L_0x0c4b:
            java.lang.String r2 = "ig.action.feed.GetFeedItemType"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0c68
            java.lang.Object r2 = X.C63893iY.A07(r0)
            java.lang.String r2 = (java.lang.String) r2
            com.instagram.service.session.UserSession r0 = X.C63913ic.A0J(r1)
            X.BKU r0 = X.C86114wI.A0W(r0, r2)
            if (r0 == 0) goto L_0x6837
            X.Iu1 r9 = r0.Ai2()
            return r9
        L_0x0c68:
            java.lang.String r2 = "ig.action.feed.UpdateTopicStatus"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0caa
            r3 = 0
            boolean r2 = X.AnonymousClass0wJ.A1Z(r0, r1)
            X.0i6 r6 = X.C63913ic.A0F(r1)
            X.C18200wM.A1R(r6)
            java.lang.Object r1 = X.C63893iY.A0A(r0, r3)
            long r4 = X.C18190wL.A08(r1)
            java.lang.Object r3 = X.C63893iY.A0B(r0, r2)
            java.lang.String r3 = (java.lang.String) r3
            r9 = 0
            r1 = 0
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0012
            if (r3 == 0) goto L_0x0012
            java.lang.Class<X.Adr> r1 = X.C18341Adr.class
            X.86F r0 = X.AnonymousClass86F.A00
            java.lang.Object r2 = r6.A01(r1, r0)
            X.Adr r2 = (X.C18341Adr) r2
            java.lang.String r1 = java.lang.String.valueOf(r4)
            com.instagram.topic.Topic r0 = new com.instagram.topic.Topic
            r0.<init>(r3, r1)
            r2.A00(r0)
            return r9
        L_0x0caa:
            java.lang.String r2 = "ig.action.FollowUser"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0cb7
            java.lang.Object r9 = X.C33952Hr.A00(r1, r0)
            return r9
        L_0x0cb7:
            java.lang.String r2 = "ig.action.GetBoolFromLocalDeviceCache"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0ce6
            boolean r3 = X.AnonymousClass0wJ.A1Y(r0, r1)
            java.lang.String r2 = X.C63893iY.A0D(r0, r3)
            X.0i6 r1 = X.C63913ic.A0F(r1)
            boolean r0 = r1 instanceof com.instagram.service.session.UserSession
            if (r0 == 0) goto L_0x683a
            com.instagram.service.session.UserSession r1 = (com.instagram.service.session.UserSession) r1
            if (r1 == 0) goto L_0x683a
            X.49q r1 = X.AnonymousClass3Zs.A03(r1)
            X.D2R r0 = X.D2R.A2Z
            android.content.SharedPreferences r0 = r1.A01(r0)
            boolean r0 = r0.getBoolean(r2, r3)
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r0)
            return r9
        L_0x0ce6:
            java.lang.String r2 = "ig.action.GetFloatFromLocalDeviceCache"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0d16
            boolean r2 = X.AnonymousClass0wJ.A1Y(r0, r1)
            java.lang.String r2 = X.C63893iY.A0D(r0, r2)
            X.0i6 r1 = X.C63913ic.A0F(r1)
            boolean r0 = r1 instanceof com.instagram.service.session.UserSession
            if (r0 == 0) goto L_0x6845
            com.instagram.service.session.UserSession r1 = (com.instagram.service.session.UserSession) r1
            if (r1 == 0) goto L_0x6845
            X.49q r1 = X.AnonymousClass3Zs.A03(r1)
            X.D2R r0 = X.D2R.A2Z
            android.content.SharedPreferences r1 = r1.A01(r0)
            r0 = 0
            float r0 = r1.getFloat(r2, r0)
            java.lang.Float r9 = java.lang.Float.valueOf(r0)
            return r9
        L_0x0d16:
            java.lang.String r2 = "ig.action.GetGetQuotePartner"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0d60
            com.instagram.service.session.UserSession r2 = X.C63913ic.A0J(r1)
            r1 = 1
            java.lang.Object r1 = X.C63893iY.A0B(r0, r1)
            X.7h3 r1 = (X.C127397h3) r1
            if (r1 == 0) goto L_0x395f
            r6 = 0
            r0 = 35
            java.lang.String r5 = ""
            java.lang.String r8 = r1.A0O(r0, r5)
            r0 = 38
            java.lang.String r10 = r1.A0O(r0, r5)
            r0 = 40
            java.lang.String r1 = r1.A0O(r0, r5)
            java.util.Map r0 = com.instagram.api.schemas.ActionButtonPartnerType.A01
            java.lang.Object r4 = r0.get(r1)
            com.instagram.api.schemas.ActionButtonPartnerType r4 = (com.instagram.api.schemas.ActionButtonPartnerType) r4
            if (r4 != 0) goto L_0x0d4c
            com.instagram.api.schemas.ActionButtonPartnerType r4 = com.instagram.api.schemas.ActionButtonPartnerType.UNRECOGNIZED
        L_0x0d4c:
            X.5KP r3 = new X.5KP
            r7 = r5
            r9 = r6
            r11 = r5
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11)
            com.instagram.user.model.User r0 = X.AnonymousClass0wJ.A0Y(r2)
            r0.A1k(r3)
            X.C18210wN.A1J(r2, r0)
            goto L_0x395f
        L_0x0d60:
            java.lang.String r2 = "ig.action.GetIntFromLocalDeviceCache"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0d8f
            boolean r3 = X.AnonymousClass0wJ.A1Y(r0, r1)
            java.lang.String r2 = X.C63893iY.A0D(r0, r3)
            X.0i6 r1 = X.C63913ic.A0F(r1)
            boolean r0 = r1 instanceof com.instagram.service.session.UserSession
            if (r0 == 0) goto L_0x6850
            com.instagram.service.session.UserSession r1 = (com.instagram.service.session.UserSession) r1
            if (r1 == 0) goto L_0x6850
            X.49q r1 = X.AnonymousClass3Zs.A03(r1)
            X.D2R r0 = X.D2R.A2Z
            android.content.SharedPreferences r0 = r1.A01(r0)
            int r0 = r0.getInt(r2, r3)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r0)
            return r9
        L_0x0d8f:
            java.lang.String r2 = "ig.action.GetSmbDeliveryPartner"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0df2
            com.instagram.service.session.UserSession r2 = X.C63913ic.A0J(r1)
            java.lang.Object r4 = X.C63893iY.A07(r0)
            X.7h3 r4 = (X.C127397h3) r4
            r1 = 35
            android.util.SparseArray r0 = r4.A04
            java.lang.String r0 = X.C86114wI.A0m(r0, r1)
            r9 = 0
            if (r0 != 0) goto L_0x0dba
            r3 = r9
        L_0x0dad:
            com.instagram.user.model.User r1 = X.AnonymousClass0wJ.A0Y(r2)
            X.MeW r0 = r1.A05
            r0.Cpy(r3)
            X.C18210wN.A1J(r2, r1)
            return r9
        L_0x0dba:
            java.lang.String r3 = ""
            java.lang.String r5 = r4.A0O(r1, r3)
            r0 = 36
            java.lang.String r7 = r4.A0O(r0, r3)
            r0 = 38
            java.lang.String r8 = r4.A0O(r0, r3)
            r0 = 41
            java.lang.String r10 = r4.A0O(r0, r3)
            r0 = 42
            java.lang.String r1 = r4.A0O(r0, r3)
            java.util.Map r0 = com.instagram.api.schemas.ActionButtonPartnerType.A01
            java.lang.Object r1 = r0.get(r1)
            com.instagram.api.schemas.ActionButtonPartnerType r1 = (com.instagram.api.schemas.ActionButtonPartnerType) r1
            if (r1 != 0) goto L_0x0de4
            com.instagram.api.schemas.ActionButtonPartnerType r1 = com.instagram.api.schemas.ActionButtonPartnerType.UNRECOGNIZED
        L_0x0de4:
            r0 = 43
            java.lang.String r11 = r4.A0O(r0, r3)
            X.5KP r3 = new X.5KP
            r4 = r1
            r6 = r9
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11)
            goto L_0x0dad
        L_0x0df2:
            java.lang.String r2 = "ig.action.GetStringFromLocalDeviceCache"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0e1e
            boolean r2 = X.AnonymousClass0wJ.A1Y(r0, r1)
            java.lang.String r3 = X.C63893iY.A0D(r0, r2)
            X.0i6 r1 = X.C63913ic.A0F(r1)
            boolean r0 = r1 instanceof com.instagram.service.session.UserSession
            r2 = 0
            if (r0 == 0) goto L_0x685b
            com.instagram.service.session.UserSession r1 = (com.instagram.service.session.UserSession) r1
            if (r1 == 0) goto L_0x685b
            X.49q r1 = X.AnonymousClass3Zs.A03(r1)
            X.D2R r0 = X.D2R.A2Z
            android.content.SharedPreferences r0 = r1.A01(r0)
            java.lang.String r9 = r0.getString(r3, r2)
            return r9
        L_0x0e1e:
            java.lang.String r2 = "ig.action.GetTimeSpentDataV2"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0e2b
            java.lang.Object r9 = X.C33962Hs.A00(r1)
            return r9
        L_0x0e2b:
            java.lang.String r2 = "ig.action.hashtagfollowbutton.GetHashtag"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0e49
            r1 = 0
            java.lang.Object r1 = X.C63893iY.A0B(r0, r1)
            X.7h3 r1 = (X.C127397h3) r1
            if (r1 == 0) goto L_0x395f
            r0 = 35
            java.lang.Object r0 = X.C127397h3.A0A(r1, r0)
            X.6ds r0 = (X.C105716ds) r0
            if (r0 == 0) goto L_0x395f
            com.instagram.model.hashtag.Hashtag r9 = r0.A00
            return r9
        L_0x0e49:
            java.lang.String r2 = "ig.action.idfa.CloseDialog"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0e56
            java.lang.Object r9 = X.C33972Ht.A00(r1, r0)
            return r9
        L_0x0e56:
            java.lang.String r2 = "ig.action.idfa.OpenDialogV2"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0e63
            java.lang.Object r9 = X.C33982Hu.A00(r1, r0)
            return r9
        L_0x0e63:
            java.lang.String r2 = "ig.action.InspirationHubExposeIsEnabled"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0e8d
            r0 = 1
            X.C04220Ms.A0B(r1, r0)
            X.0i6 r0 = X.C63913ic.A0F(r1)
            com.instagram.service.session.UserSession r3 = X.C05030Qo.A02(r0)
            r0 = 0
            X.C04220Ms.A0B(r3, r0)
            boolean r0 = X.C63483hZ.A05(r3)
            if (r0 == 0) goto L_0x395f
            X.0TJ r2 = X.AnonymousClass0TJ.A05
            r0 = 36314373689444235(0x8103bb0000078b, double:3.028694375225891E-306)
        L_0x0e88:
            X.C63803iN.A0E(r2, r3, r0)
            goto L_0x395f
        L_0x0e8d:
            java.lang.String r2 = "ig.action.InspirationHubM1ExposeIsEnabled"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0ec6
            r0 = 1
            X.C04220Ms.A0B(r1, r0)
            X.0i6 r0 = X.C63913ic.A0F(r1)
            com.instagram.service.session.UserSession r3 = X.C05030Qo.A02(r0)
            r0 = 0
            X.C04220Ms.A0B(r3, r0)
            boolean r0 = X.C63483hZ.A05(r3)
            if (r0 == 0) goto L_0x0eb8
            X.0TJ r2 = X.AnonymousClass0TJ.A05
            r0 = 2342161467417104839(0x20810772000111c7, double:4.064278567516748E-152)
            boolean r0 = X.C63803iN.A0E(r2, r3, r0)
            if (r0 != 0) goto L_0x395f
        L_0x0eb8:
            boolean r0 = X.C63483hZ.A06(r3)
            if (r0 == 0) goto L_0x395f
            X.0TJ r2 = X.AnonymousClass0TJ.A05
            r0 = 36318462498378185(0x810773000111c9, double:3.031280154460033E-306)
            goto L_0x0e88
        L_0x0ec6:
            java.lang.String r2 = "ig.action.instagram.mwb_hw.SetPredefinedListState"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0ed3
            java.lang.Object r9 = X.C33992Hv.A00(r0)
            return r9
        L_0x0ed3:
            java.lang.String r2 = "ig.action.IsDarkModeEnabled"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0ee8
            android.content.Context r0 = X.C18230wP.A08()
            boolean r0 = X.C34822La.A00(r0)
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r0)
            return r9
        L_0x0ee8:
            java.lang.String r4 = "ig.action.linechart.ClearSelection"
            boolean r2 = r4.equals(r3)
            if (r2 == 0) goto L_0x0f0c
            r2 = 0
            java.lang.Object r2 = X.C63893iY.A0B(r0, r2)
            X.7h3 r2 = (X.C127397h3) r2
            X.3HX r0 = X.C63913ic.A0D(r1)
            r9 = 0
            if (r2 == 0) goto L_0x0012
            java.lang.Object r0 = X.AnonymousClass7K7.A04(r0, r2)
            X.6dm r0 = (X.C105656dm) r0
            if (r0 != 0) goto L_0x678c
            java.lang.String r0 = "Null controller for linechart component"
            X.C30967GcS.A02(r4, r0)
            return r9
        L_0x0f0c:
            java.lang.String r2 = "ig.action.logging.LogEvent"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L_0x6beb
            java.lang.String r2 = "ig.action.LogOutAllAccounts"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0f45
            androidx.fragment.app.FragmentActivity r3 = A01(r1)
            X.0i6 r7 = X.C63913ic.A0F(r1)
            X.C18200wM.A1R(r7)
            com.instagram.service.session.UserSession r7 = (com.instagram.service.session.UserSession) r7
            androidx.fragment.app.Fragment r2 = X.C63913ic.A01(r1)
            X.0m7 r4 = X.C63913ic.A07(r1)
            X.06E r5 = X.AnonymousClass06E.A00(r2)
            X.0kW r6 = X.C63913ic.A0A(r1)
            X.3iC r1 = new X.3iC
            r1.<init>(r2, r3, r4, r5, r6, r7)
            java.lang.Integer r0 = X.AnonymousClass006.A0C
            r1.A0C(r0)
            r9 = 0
            return r9
        L_0x0f45:
            java.lang.String r2 = "ig.action.media.GetCreateTimestamp"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0f6d
            boolean r2 = X.AnonymousClass0wJ.A1Y(r0, r1)
            java.lang.String r2 = X.C63893iY.A0D(r0, r2)
            X.0i6 r0 = X.C63913ic.A0F(r1)
            com.instagram.service.session.UserSession r0 = X.C05030Qo.A02(r0)
            X.BKU r0 = X.C86114wI.A0W(r0, r2)
            if (r0 == 0) goto L_0x0f69
            long r0 = r0.A1t()
            goto L_0x39a8
        L_0x0f69:
            r0 = -1
            goto L_0x39a8
        L_0x0f6d:
            java.lang.String r2 = "ig.action.media.GetMediaType"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0f95
            boolean r2 = X.AnonymousClass0wJ.A1Y(r0, r1)
            java.lang.String r2 = X.C63893iY.A0D(r0, r2)
            X.0i6 r0 = X.C63913ic.A0F(r1)
            com.instagram.service.session.UserSession r0 = X.C05030Qo.A02(r0)
            X.BKU r0 = X.C86114wI.A0W(r0, r2)
            if (r0 == 0) goto L_0x6759
            X.Ffc r0 = r0.Aup()
            if (r0 == 0) goto L_0x6759
            int r0 = r0.A00
            goto L_0x019e
        L_0x0f95:
            java.lang.String r2 = "ig.action.media.IsImageVideoCached"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0fc1
            boolean r2 = X.AnonymousClass0wJ.A1Y(r0, r1)
            java.lang.String r3 = X.C63893iY.A0D(r0, r2)
            X.0i6 r0 = X.C63913ic.A0F(r1)
            com.instagram.service.session.UserSession r0 = X.C05030Qo.A02(r0)
            X.BKU r3 = X.C86114wI.A0W(r0, r3)
            if (r3 == 0) goto L_0x3f5c
            X.JSE r2 = X.AnonymousClass6SP.A00(r0)
            androidx.fragment.app.FragmentActivity r0 = X.C63913ic.A05(r1)
            boolean r2 = r2.A00(r0, r3)
            goto L_0x3f5c
        L_0x0fc1:
            java.lang.String r2 = "ig.action.media.IsSeen"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0ff0
            r2 = 0
            java.lang.String r0 = X.C86154wM.A0l(r0, r2)
            com.instagram.service.session.UserSession r1 = X.C63913ic.A0J(r1)
            X.BKU r3 = X.C86114wI.A0W(r1, r0)
            if (r3 == 0) goto L_0x3f5c
            boolean r0 = r3.A3p()
            if (r0 != 0) goto L_0x3f5b
            android.content.Context r0 = X.C18230wP.A08()
            X.3Z0 r1 = X.C132457tv.A00(r0, r1)
            X.BKN r0 = r3.A0f
            java.lang.String r0 = r0.A4Y
            boolean r0 = r1.A03(r0)
            goto L_0x3f59
        L_0x0ff0:
            java.lang.String r2 = "ig.action.media.IsSponsored"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x100d
            r2 = 0
            java.lang.String r3 = X.C86154wM.A0l(r0, r2)
            com.instagram.service.session.UserSession r0 = X.C63913ic.A0J(r1)
            X.BKU r0 = X.C86114wI.A0W(r0, r3)
            if (r0 == 0) goto L_0x3f5c
            boolean r0 = r0.BYi()
            goto L_0x3f59
        L_0x100d:
            java.lang.String r2 = "ig.action.media.LocalFileToBase64EncodedString"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x102a
            r7 = 0
            boolean r2 = X.AnonymousClass0wJ.A1Z(r0, r1)
            java.lang.String r3 = X.C63893iY.A0D(r0, r7)
            X.6jp r6 = X.C63893iY.A06(r0, r2)
            r2 = 2
            X.6jp r4 = X.C63893iY.A06(r0, r2)
            r9 = 0
            goto L_0x6794
        L_0x102a:
            java.lang.String r2 = "ig.action.media.UploadMedia"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x104e
            java.util.List r4 = r0.A00
            int r3 = r4.size()
            r9 = 0
            r2 = 3
            if (r3 < r2) goto L_0x0012
            java.lang.Object r2 = X.C63893iY.A07(r0)
            java.lang.String r2 = (java.lang.String) r2
            r7 = 1
            X.6jp r6 = X.C18190wL.A0R(r4, r7)
            r0 = 2
            X.6jp r3 = X.C18190wL.A0R(r4, r0)
            goto L_0x6867
        L_0x104e:
            java.lang.String r2 = "ig.action.media.UploadMediaV2"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x1074
            r5 = 0
            java.lang.String r6 = X.C86154wM.A0l(r0, r5)
            r3 = 1
            java.util.List r2 = r0.A00
            java.lang.String r17 = X.C18190wL.A0q(r2, r3)
            r0 = 2
            X.6jp r13 = X.C18190wL.A0R(r2, r0)
            r0 = 3
            X.6jp r4 = X.C18190wL.A0R(r2, r0)
            r0 = 4
            X.6jp r2 = X.C18190wL.A0R(r2, r0)
            r9 = 0
            goto L_0x68a7
        L_0x1074:
            java.lang.String r2 = "ig.action.media.UploadMediaV3"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x109a
            r4 = 0
            java.lang.String r5 = X.C86154wM.A0l(r0, r4)
            r3 = 1
            java.util.List r2 = r0.A00
            java.lang.String r8 = X.C18190wL.A0q(r2, r3)
            r0 = 3
            X.6jp r7 = X.C18190wL.A0R(r2, r0)
            r0 = 4
            X.6jp r6 = X.C18190wL.A0R(r2, r0)
            r0 = 5
            X.6jp r2 = X.C18190wL.A0R(r2, r0)
            r9 = 0
            goto L_0x68dd
        L_0x109a:
            java.lang.String r2 = "ig.action.NavigateToLeadGenFlaggedFormWarningScreen"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x10bf
            androidx.fragment.app.FragmentActivity r2 = A01(r1)
            X.0i6 r0 = X.C63913ic.A0F(r1)
            X.Drz r1 = X.C18180wK.A0Q(r2, r0)
            X.Dd0 r0 = X.C62883b4.A01()
            r0.A00()
            X.5xJ r0 = new X.5xJ
            r0.<init>()
            java.lang.Object r9 = A07(r0, r1)
            return r9
        L_0x10bf:
            java.lang.String r2 = "ig.action.navigation.activityfeed.OpenDiscoverPeople"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x10ef
            r3 = 0
            boolean r2 = X.AnonymousClass0wJ.A1Z(r0, r1)
            java.util.List r0 = r0.A00
            r0.get(r3)
            r0.get(r2)
            androidx.fragment.app.FragmentActivity r2 = X.C63913ic.A05(r1)
            X.0i6 r1 = X.C63913ic.A0F(r1)
            X.C18200wM.A1R(r1)
            X.Drz r0 = new X.Drz
            r0.<init>(r2, r1)
            r0 = 123(0x7b, float:1.72E-43)
            java.lang.String r0 = X.C18170wI.A00(r0)
            java.lang.RuntimeException r2 = X.C18250wR.A0V(r0)
            throw r2
        L_0x10ef:
            java.lang.String r2 = "ig.action.navigation.AddFundraiserDetailsToFeedPost"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x10fc
            java.lang.Object r9 = X.C24008D5j.A00(r1, r0)
            return r9
        L_0x10fc:
            java.lang.String r2 = "ig.action.navigation.AlternateTopicMediaInfo"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x1109
            java.lang.Object r9 = X.C17263A3f.A00(r1, r0)
            return r9
        L_0x1109:
            java.lang.String r2 = "ig.action.navigation.AttachDonateButtonToFeedPost"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x112a
            r0 = 1
            X.C04220Ms.A0B(r1, r0)
            X.0i6 r0 = X.C63913ic.A0F(r1)
            X.C18200wM.A1R(r0)
            X.KHq r1 = X.AnonymousClass3LY.A00(r0)
            X.7rU r0 = new X.7rU
            r0.<init>()
            r1.CWx(r0)
            r9 = 0
            return r9
        L_0x112a:
            java.lang.String r2 = "ig.action.navigation.ClearChallenge"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x114a
            androidx.fragment.app.FragmentActivity r3 = A01(r1)
            boolean r0 = r3 instanceof com.instagram.challenge.activity.ChallengeActivity
            if (r0 == 0) goto L_0x395f
            X.0IB r2 = X.C10450iM.A00()
            java.lang.String r1 = "challenges_finish_source"
            java.lang.String r0 = "d"
            r2.CYW(r1, r0)
        L_0x1145:
            r3.finish()
            goto L_0x395f
        L_0x114a:
            java.lang.String r2 = "ig.action.navigation.ClearChallengeWithParam"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x118a
            java.lang.Object r6 = X.C63893iY.A07(r0)
            java.lang.String r6 = (java.lang.String) r6
            r2 = 1
            boolean r5 = X.AnonymousClass3WF.A01(r0, r2)
            r0 = 0
            X.C04220Ms.A0B(r1, r0)
            androidx.fragment.app.FragmentActivity r4 = X.C63913ic.A05(r1)
            boolean r0 = r4 instanceof com.instagram.challenge.activity.ChallengeActivity
            if (r0 == 0) goto L_0x1177
            X.0IB r3 = X.C10450iM.A00()
            java.lang.String r2 = "challenges_finish_source"
            java.lang.String r0 = "d"
            r3.CYW(r2, r0)
            r4.finish()
        L_0x1177:
            if (r5 == 0) goto L_0x395f
            X.3GW r2 = X.AnonymousClass3GW.A00
            X.0i6 r0 = X.C63913ic.A0F(r1)
            X.49w r0 = r2.A00(r0)
            if (r0 == 0) goto L_0x395f
            r0.A05(r6)
            goto L_0x395f
        L_0x118a:
            java.lang.String r2 = "ig.action.navigation.ClearChallengeWithParams"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x11db
            boolean r2 = X.AnonymousClass0wJ.A1Z(r0, r1)
            java.lang.Object r5 = X.C63893iY.A0B(r0, r2)
            r5.getClass()
            X.7h3 r5 = (X.C127397h3) r5
            androidx.fragment.app.FragmentActivity r4 = X.C63913ic.A05(r1)
            boolean r0 = r4 instanceof com.instagram.challenge.activity.ChallengeActivity
            if (r0 == 0) goto L_0x11b5
            X.0IB r3 = X.C10450iM.A00()
            java.lang.String r2 = "challenges_finish_source"
            java.lang.String r0 = "d"
            r3.CYW(r2, r0)
            r4.finish()
        L_0x11b5:
            r0 = 36
            r2 = 0
            java.lang.Object r0 = X.C127397h3.A0A(r5, r0)
            boolean r0 = X.AnonymousClass2LL.A00(r0, r2)
            if (r0 == 0) goto L_0x395f
            X.3GW r2 = X.AnonymousClass3GW.A00
            X.0i6 r0 = X.C63913ic.A0F(r1)
            X.49w r2 = r2.A00(r0)
            if (r2 == 0) goto L_0x395f
            r1 = 35
            java.lang.String r0 = ""
            java.lang.String r0 = r5.A0O(r1, r0)
            r2.A05(r0)
            goto L_0x395f
        L_0x11db:
            java.lang.String r2 = "ig.action.navigation.CloseModalWithResult"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x121d
            r2 = 1
            java.lang.Object r2 = X.C63893iY.A0B(r0, r2)
            java.util.Map r2 = (java.util.Map) r2
            r0 = 0
            X.C04220Ms.A0B(r1, r0)
            androidx.fragment.app.FragmentActivity r3 = X.C63913ic.A05(r1)
            r9 = 0
            if (r2 == 0) goto L_0x1214
            java.util.HashMap r2 = X.C63913ic.A0N(r2)
            boolean r0 = r3 instanceof com.instagram.modal.ModalActivity
            if (r0 == 0) goto L_0x0012
            android.content.Intent r1 = X.C18230wP.A0B()
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L_0x1210
            r0 = 141(0x8d, float:1.98E-43)
            java.lang.String r0 = X.C18170wI.A00(r0)
            r1.putExtra(r0, r2)
        L_0x1210:
            X.C18200wM.A10(r3, r1)
            return r9
        L_0x1214:
            boolean r0 = r3 instanceof com.instagram.modal.ModalActivity
            if (r0 == 0) goto L_0x0012
            android.content.Intent r1 = X.C18230wP.A0B()
            goto L_0x1210
        L_0x121d:
            java.lang.String r2 = "ig.action.navigation.CloseScreen"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x1234
            if (r28 == 0) goto L_0x690d
            X.0m7 r2 = X.C63913ic.A07(r1)
            androidx.fragment.app.FragmentActivity r0 = X.C63913ic.A05(r1)
            X.AnonymousClass3WA.A00(r0, r2)
            r9 = 0
            return r9
        L_0x1234:
            java.lang.String r2 = "ig.action.navigation.CloseShoppingSignup"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x125e
            r0 = 0
            X.C04220Ms.A0B(r1, r0)
            androidx.fragment.app.FragmentActivity r2 = X.C63913ic.A05(r1)
            boolean r0 = r2 instanceof com.instagram.business.activity.BusinessConversionActivity
            r9 = 0
            if (r0 == 0) goto L_0x1251
            r0 = -1
            r2.setResult(r0)
        L_0x124d:
            r2.finish()
            return r9
        L_0x1251:
            boolean r0 = r2 instanceof com.instagram.modal.ModalActivity
            if (r0 == 0) goto L_0x0012
            android.content.Intent r1 = X.C18230wP.A0B()
            r0 = -1
            r2.setResult(r0, r1)
            goto L_0x124d
        L_0x125e:
            java.lang.String r2 = "ig.action.navigation.CloseShoppingSignupWithParam"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x1295
            java.lang.Object r0 = X.C63893iY.A07(r0)
            java.lang.String r2 = r0.toString()
            r0 = 0
            X.C04220Ms.A0B(r1, r0)
            androidx.fragment.app.FragmentActivity r3 = X.C63913ic.A05(r1)
            boolean r0 = r3 instanceof com.instagram.business.activity.BusinessConversionActivity
            if (r0 == 0) goto L_0x1289
            android.content.Intent r1 = X.C18230wP.A0B()
            java.lang.String r0 = "EXTRA_SCREEN_ID"
            r1.putExtra(r0, r2)
            r0 = -1
            r3.setResult(r0, r1)
            goto L_0x1145
        L_0x1289:
            X.0m7 r1 = X.C63913ic.A07(r1)
            if (r1 == 0) goto L_0x395f
            r0 = 1
            r1.A11(r2, r0)
            goto L_0x395f
        L_0x1295:
            java.lang.String r2 = "ig.action.navigation.CloseToScreen"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x12bf
            r2 = 0
            boolean r4 = X.AnonymousClass0wJ.A1Z(r0, r1)
            java.lang.Object r2 = X.C63893iY.A0B(r0, r2)
            r9 = 0
            if (r2 == 0) goto L_0x12bd
            java.lang.String r3 = X.AnonymousClass70K.A00(r2)
        L_0x12ad:
            boolean r0 = X.AnonymousClass3WF.A01(r0, r4)
            X.0m7 r2 = X.C63913ic.A07(r1)
            if (r3 == 0) goto L_0x6912
            if (r2 == 0) goto L_0x0012
            r2.A11(r3, r0)
            return r9
        L_0x12bd:
            r3 = r9
            goto L_0x12ad
        L_0x12bf:
            java.lang.String r2 = "ig.action.navigation.CloseToScreenV2"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x12e5
            r3 = 0
            boolean r2 = X.AnonymousClass0wJ.A1Z(r0, r1)
            java.lang.Object r3 = X.C63893iY.A0B(r0, r3)
            java.lang.String r3 = (java.lang.String) r3
            boolean r2 = X.AnonymousClass3WF.A01(r0, r2)
            r9 = 0
            if (r3 != 0) goto L_0x43ef
            X.0m7 r2 = X.C63913ic.A07(r1)
            androidx.fragment.app.FragmentActivity r0 = X.C63913ic.A05(r1)
            X.AnonymousClass3WA.A00(r0, r2)
            return r9
        L_0x12e5:
            java.lang.String r2 = "ig.action.navigation.CreateFundraiserWithFeedPost"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x12f2
            java.lang.Object r9 = X.C29299Flq.A00(r0)
            return r9
        L_0x12f2:
            java.lang.String r2 = "ig.action.navigation.DismissBottomSheet"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x1305
            java.lang.String r2 = "Required value was null."
            if (r29 == 0) goto L_0x691a
            if (r28 != 0) goto L_0x6be6
            java.lang.IllegalStateException r2 = X.C18180wK.A0a(r2)
            throw r2
        L_0x1305:
            java.lang.String r2 = "ig.action.navigation.DismissBottomSheetV2"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L_0x6be6
            java.lang.String r2 = "ig.action.navigation.ExitApp"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x133a
            r0 = 289(0x121, float:4.05E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            android.content.Intent r2 = X.C18250wR.A05(r0)
            r0 = 763(0x2fb, float:1.069E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r2.addCategory(r0)
            r0 = 268435456(0x10000000, float:2.5243549E-29)
            r2.setFlags(r0)
            r0 = 0
            X.C04220Ms.A0B(r1, r0)
            androidx.fragment.app.FragmentActivity r0 = X.C63913ic.A05(r1)
            X.C10650ih.A0B(r0, r2)
            r9 = 0
            return r9
        L_0x133a:
            java.lang.String r2 = "ig.action.navigation.ExitProductOnboarding"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x136f
            r2 = 0
            boolean r3 = X.AnonymousClass0wJ.A1Z(r0, r1)
            boolean r4 = X.AnonymousClass3WF.A01(r0, r2)
            java.util.List r2 = r0.A00
            int r2 = r2.size()
            r9 = 0
            if (r2 <= r3) goto L_0x136d
            java.lang.Object r3 = X.C63893iY.A0B(r0, r3)
            r3.getClass()
            boolean r0 = r3 instanceof java.lang.String
            if (r0 == 0) goto L_0x136d
            java.lang.String r3 = (java.lang.String) r3
        L_0x1361:
            androidx.fragment.app.FragmentActivity r2 = X.C63913ic.A05(r1)
            boolean r0 = r2 instanceof com.instagram.payout.activity.PayoutOnboardingFlowActivity
            if (r0 == 0) goto L_0x691f
            r2.finish()
            return r9
        L_0x136d:
            r3 = r9
            goto L_0x1361
        L_0x136f:
            java.lang.String r2 = "ig.action.navigation.HasAcceptedIncentivePlatformDeal"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L_0x395f
            java.lang.String r2 = "ig.action.navigation.IsHostBottomSheet"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x1387
            X.Jqm r0 = X.M6q.A06(r1)
            if (r0 == 0) goto L_0x0117
            goto L_0x3f5b
        L_0x1387:
            java.lang.String r2 = "ig.action.navigation.IsHostModal"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x139a
            androidx.fragment.app.FragmentActivity r0 = A01(r1)
            boolean r0 = r0 instanceof com.instagram.modal.ModalActivity
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r0)
            return r9
        L_0x139a:
            java.lang.String r2 = "ig.action.navigation.LaunchComposerWithFundraiser"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L_0x395f
            java.lang.String r2 = "ig.action.navigation.LaunchCreateDonationStickerStory"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x13bd
            com.instagram.service.session.UserSession r3 = X.C63913ic.A0J(r1)
            X.9zz r2 = X.C171799zz.A1s
            r0 = 0
            X.C04220Ms.A0B(r1, r0)
            androidx.fragment.app.FragmentActivity r0 = X.C63913ic.A05(r1)
            X.C19286Atp.A00(r0, r2, r3)
            r9 = 0
            return r9
        L_0x13bd:
            java.lang.String r2 = "ig.action.navigation.LaunchCreateExclusiveStoryCamera"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x13ca
            java.lang.Object r9 = X.C34002Hw.A00(r1)
            return r9
        L_0x13ca:
            java.lang.String r2 = "ig.action.navigation.LaunchFanClubPromotionalVideosSettings"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x13d7
            java.lang.Object r9 = X.C34012Hx.A00(r1, r0)
            return r9
        L_0x13d7:
            java.lang.String r2 = "ig.action.navigation.LaunchFRXReportingFlow"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x140c
            java.lang.Object r4 = X.C63893iY.A07(r0)
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r2 = X.C63893iY.A08(r0)
            int r5 = X.AnonymousClass0wJ.A04(r2)
            java.lang.Object r0 = X.C63893iY.A09(r0)
            int r6 = X.AnonymousClass0wJ.A04(r0)
            com.instagram.service.session.UserSession r2 = X.C63913ic.A0J(r1)
            r0 = 0
            X.C04220Ms.A0B(r1, r0)
            androidx.fragment.app.FragmentActivity r0 = X.C63913ic.A05(r1)
            X.0kW r1 = X.C63913ic.A0A(r1)
            X.25O r3 = X.AnonymousClass25O.REPORT_BUTTON
            X.C34022Hy.A00(r0, r1, r2, r3, r4, r5, r6)
            r9 = 0
            return r9
        L_0x140c:
            java.lang.String r2 = "ig.action.navigation.LaunchFRXReportingFlowWithEntryPoint"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x1419
            java.lang.Object r9 = X.C34032Hz.A00(r1, r0)
            return r9
        L_0x1419:
            java.lang.String r2 = "ig.action.navigation.LaunchFRXV2"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x1426
            java.lang.Object r9 = X.AnonymousClass2I0.A00(r1, r0)
            return r9
        L_0x1426:
            java.lang.String r2 = "ig.action.navigation.LaunchLiveWithFundraiser"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x1433
            java.lang.Object r9 = X.C17264A3g.A00(r1, r0)
            return r9
        L_0x1433:
            java.lang.String r2 = "ig.action.navigation.LaunchMediaPickerV2"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x1440
            java.lang.Object r9 = X.AnonymousClass2I1.A00(r1, r0)
            return r9
        L_0x1440:
            java.lang.String r2 = "ig.action.navigation.LaunchNetEgoClipsViewer"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x144d
            java.lang.Object r9 = X.C17265A3h.A00(r1, r0)
            return r9
        L_0x144d:
            java.lang.String r2 = "ig.action.navigation.LaunchStoryCameraMode"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x1466
            com.instagram.service.session.UserSession r2 = X.C63913ic.A0J(r1)
            r0 = 0
            X.C04220Ms.A0B(r1, r0)
            androidx.fragment.app.FragmentActivity r0 = X.C63913ic.A05(r1)
            X.AnonymousClass2TN.A00(r0, r2)
            r9 = 0
            return r9
        L_0x1466:
            java.lang.String r2 = "ig.action.navigation.LaunchStoryDonationStickerCreation"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x1473
            java.lang.Object r9 = X.C24009D5k.A00(r1, r0)
            return r9
        L_0x1473:
            java.lang.String r2 = "ig.action.navigation.LaunchStoryWithPersonalFundraiserSticker"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x1480
            java.lang.Object r9 = X.C100836Ov.A00(r1, r0)
            return r9
        L_0x1480:
            java.lang.String r2 = "ig.action.navigation.LaunchStripeBankAccountInfoForm"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x148d
            java.lang.Object r9 = X.AnonymousClass2I2.A00(r1, r0)
            return r9
        L_0x148d:
            java.lang.String r2 = "ig.action.navigation.LaunchStripeInfoCollectionFlow"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x14c5
            java.lang.Object r5 = X.C63893iY.A07(r0)
            java.lang.String r5 = (java.lang.String) r5
            com.instagram.service.session.UserSession r4 = X.C63913ic.A0J(r1)
            r0 = 0
            X.C04220Ms.A0B(r1, r0)
            androidx.fragment.app.FragmentActivity r3 = X.C63913ic.A05(r1)
            android.os.Bundle r2 = X.C18180wK.A06()
            java.lang.String r0 = "igUserId"
            r2.putString(r0, r5)
            X.C63343hJ.getInstance()
            X.4Ja r1 = new X.4Ja
            r1.<init>(r4)
            java.lang.String r0 = "IgFundraiserLandingRoute"
            r1.CpK(r0)
            r1.Cod(r2)
            r1.BaN(r3)
            r9 = 0
            return r9
        L_0x14c5:
            java.lang.String r2 = "ig.action.navigation.LaunchVoterRegistrationStickerStory"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x14d2
            java.lang.Object r9 = X.C17266A3i.A00(r1)
            return r9
        L_0x14d2:
            java.lang.String r6 = "ig.action.navigation.Login"
            boolean r2 = r6.equals(r3)
            if (r2 == 0) goto L_0x14f6
            boolean r5 = X.AnonymousClass0wJ.A1Y(r0, r1)
            java.lang.Object r0 = X.C63893iY.A0B(r0, r5)
            r0.getClass()
            X.74x r0 = (X.C1193774x) r0
            com.instagram.user.model.User r4 = r0.A00
            r9 = 0
            if (r4 != 0) goto L_0x6930
            r0 = 699(0x2bb, float:9.8E-43)
            java.lang.String r0 = X.C18170wI.A00(r0)
            X.C30967GcS.A02(r6, r0)
            return r9
        L_0x14f6:
            r2 = 395(0x18b, float:5.54E-43)
            java.lang.String r2 = X.C18170wI.A00(r2)
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x1507
            java.lang.Object r9 = X.AnonymousClass2I3.A00(r1, r0)
            return r9
        L_0x1507:
            java.lang.String r2 = "ig.action.navigation.NativeScreenDemo"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x1530
            boolean r2 = X.AnonymousClass0wJ.A1Y(r0, r1)
            X.6jp r2 = X.C63893iY.A06(r0, r2)
            X.5wi r3 = new X.5wi
            r3.<init>()
            X.6hV r0 = new X.6hV
            r0.<init>(r1, r2)
            r3.A00 = r0
            androidx.fragment.app.FragmentActivity r2 = X.C63913ic.A05(r1)
            X.0i6 r0 = X.C63913ic.A0F(r1)
            X.AnonymousClass0wJ.A19(r3, r2, r0)
            r9 = 0
            return r9
        L_0x1530:
            java.lang.String r2 = "ig.action.navigation.NavigateToClipsPromptPivotPage"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x153d
            java.lang.Object r9 = X.C100846Ow.A00(r1, r0)
            return r9
        L_0x153d:
            java.lang.String r2 = "ig.action.navigation.OpenAccessibility"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x1556
            X.Drz r1 = A04(r1)
            X.C18190wL.A10()
            X.1wL r0 = new X.1wL
            r0.<init>()
            java.lang.Object r9 = A07(r0, r1)
            return r9
        L_0x1556:
            java.lang.String r2 = "ig.action.navigation.OpenAccountInsightsSurvey"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x1575
            X.3IR r3 = X.AnonymousClass3IR.A00
            if (r3 == 0) goto L_0x395f
            r0 = 0
            X.C04220Ms.A0B(r1, r0)
            androidx.fragment.app.FragmentActivity r2 = X.C63913ic.A05(r1)
            com.instagram.service.session.UserSession r1 = X.C63913ic.A0J(r1)
            java.lang.String r0 = "221413735630339"
            r3.A02(r1, r2, r0)
            goto L_0x395f
        L_0x1575:
            java.lang.String r2 = "ig.action.navigation.OpenACDYI"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x15a5
            r4 = 0
            X.C04220Ms.A0B(r0, r4)
            X.3HX r1 = X.C63893iY.A01(r0, r4)
            X.4rP r0 = r1.A02
            X.7qT r0 = (X.C130667qT) r0
            androidx.fragment.app.Fragment r3 = r0.A02
            X.IcN r3 = (X.C34640IcN) r3
            if (r3 == 0) goto L_0x395f
            X.0i6 r2 = X.C63913ic.A0E(r1)
            X.C18200wM.A1R(r2)
            com.instagram.service.session.UserSession r2 = (com.instagram.service.session.UserSession) r2
            java.lang.String r1 = "ig_your_activity"
            r0 = 1464(0x5b8, float:2.052E-42)
            java.lang.String r0 = X.C18170wI.A00(r0)
            X.C63013bK.A02(r3, r2, r1, r0, r4)
            goto L_0x395f
        L_0x15a5:
            java.lang.String r2 = "ig.action.navigation.OpenACStandaloneDYI"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x15b2
            java.lang.Object r9 = X.AnonymousClass2I4.A00(r0)
            return r9
        L_0x15b2:
            java.lang.String r2 = "ig.action.navigation.OpenACStandaloneTYI"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x15bf
            java.lang.Object r9 = X.AnonymousClass2I5.A00(r0)
            return r9
        L_0x15bf:
            java.lang.String r2 = "ig.action.navigation.OpenActionSheet"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x15cc
            java.lang.Object r9 = X.AnonymousClass2I6.A00(r1, r0)
            return r9
        L_0x15cc:
            java.lang.String r2 = "ig.action.navigation.OpenActionSheetV2"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x15d9
            java.lang.Object r9 = X.AnonymousClass2I7.A00(r1, r0)
            return r9
        L_0x15d9:
            java.lang.String r2 = "ig.action.navigation.OpenActivityCenterAdActivity"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x15ef
            X.Drz r1 = A04(r1)
            com.instagram.adshistory.fragment.RecentAdActivityFragment r0 = new com.instagram.adshistory.fragment.RecentAdActivityFragment
            r0.<init>()
            java.lang.Object r9 = A07(r0, r1)
            return r9
        L_0x15ef:
            java.lang.String r2 = "ig.action.navigation.OpenActivityCenterMediaFeed"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x164a
            java.lang.Object r7 = X.C63893iY.A07(r0)
            java.lang.String r7 = (java.lang.String) r7
            r6 = 1
            X.6jp r2 = X.C63893iY.A06(r0, r6)
            java.lang.Object r0 = X.C63893iY.A09(r0)
            boolean r5 = X.AnonymousClass0wJ.A1X(r0)
            com.instagram.service.session.UserSession r4 = X.C63913ic.A0J(r1)
            X.7xk r0 = new X.7xk
            r0.<init>(r1, r2)
            X.AnonymousClass6DJ.A01 = r0
            r0 = 0
            X.C04220Ms.A0B(r1, r0)
            androidx.fragment.app.FragmentActivity r3 = X.C63913ic.A05(r1)
            java.lang.Class<com.instagram.modal.ModalActivity> r2 = com.instagram.modal.ModalActivity.class
            com.instagram.util.fragment.IgFragmentFactoryImpl.A00()
            r9 = 0
            X.C04220Ms.A0B(r7, r0)
            if (r5 == 0) goto L_0x1647
            X.24E r10 = X.AnonymousClass24E.LIKES
        L_0x162a:
            r11 = r9
            r12 = r7
            r13 = r9
            r14 = r0
            r15 = r0
            r16 = r6
            r17 = r0
            android.os.Bundle r1 = X.C19504AxR.A00(r9, r10, r11, r12, r13, r14, r15, r16, r17)
            r0 = 131(0x83, float:1.84E-43)
            java.lang.String r0 = X.I17.A00(r0)
            X.3iT r1 = X.C63863iT.A05(r3, r1, r4, r2, r0)
            r0 = 1005(0x3ed, float:1.408E-42)
            r1.A0H(r3, r0)
            return r9
        L_0x1647:
            X.24E r10 = X.AnonymousClass24E.FEED_MEDIA
            goto L_0x162a
        L_0x164a:
            java.lang.String r2 = "ig.action.navigation.OpenActivityCenterMediaHighlight"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x1657
            java.lang.Object r9 = X.C100856Ox.A00(r1, r0)
            return r9
        L_0x1657:
            java.lang.String r2 = "ig.action.navigation.OpenActivityCenterMediaIGTV"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x1689
            java.lang.Object r5 = X.C63893iY.A07(r0)
            java.lang.String r5 = (java.lang.String) r5
            r4 = 1
            X.6jp r3 = X.C63893iY.A06(r0, r4)
            java.lang.Object r0 = X.C63893iY.A09(r0)
            boolean r2 = X.AnonymousClass0wJ.A1X(r0)
            r0 = 0
            X.C04220Ms.A0B(r1, r0)
            X.0i6 r0 = X.C63913ic.A0F(r1)
            X.C05030Qo.A02(r0)
            if (r2 == 0) goto L_0x1686
            X.24E r0 = X.AnonymousClass24E.LIKES
        L_0x1681:
            X.AnonymousClass7GJ.A01(r1, r3, r0, r5, r4)
            r9 = 0
            return r9
        L_0x1686:
            X.24E r0 = X.AnonymousClass24E.IGTV_MEDIA
            goto L_0x1681
        L_0x1689:
            java.lang.String r2 = "ig.action.navigation.OpenActivityCenterMediaReel"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x16b9
            r5 = 0
            X.C04220Ms.A0B(r0, r5)
            java.lang.String r4 = X.C63893iY.A0D(r0, r5)
            r2 = 1
            X.6jp r3 = X.C63893iY.A06(r0, r2)
            java.lang.Object r2 = X.C63893iY.A09(r0)
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.Boolean"
            X.C04220Ms.A0C(r2, r0)
            boolean r0 = X.AnonymousClass0wJ.A1X(r2)
            if (r28 == 0) goto L_0x694d
            if (r0 == 0) goto L_0x16b6
            X.24E r0 = X.AnonymousClass24E.LIKES
        L_0x16b1:
            X.AnonymousClass7GJ.A01(r1, r3, r0, r4, r5)
            r9 = 0
            return r9
        L_0x16b6:
            X.24E r0 = X.AnonymousClass24E.CLIPS_MEDIA
            goto L_0x16b1
        L_0x16b9:
            java.lang.String r2 = "ig.action.navigation.OpenAddAccount"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x16e6
            androidx.fragment.app.FragmentActivity r4 = A01(r1)
            com.instagram.service.session.UserSession r1 = X.C86104wH.A0Y(r1)
            java.lang.String r0 = "settings"
            androidx.fragment.app.Fragment r3 = X.C48952qb.A00(r1, r0)
            X.Jj9 r2 = new X.Jj9
            r2.<init>(r1)
            android.content.res.Resources r1 = r4.getResources()
            r0 = 2131821017(0x7f1101d9, float:1.9274765E38)
            java.lang.String r0 = r1.getString(r0)
            r2.A0O = r0
            X.C18200wM.A16(r4, r3, r2)
            r9 = 0
            return r9
        L_0x16e6:
            java.lang.String r2 = "ig.action.navigation.OpenAddNewProfessionalAccount"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x1714
            r0 = 1
            X.C04220Ms.A0B(r1, r0)
            X.C63913ic.A05(r1)
            com.instagram.service.session.UserSession r3 = X.C86104wH.A0Y(r1)
            androidx.fragment.app.Fragment r2 = X.C63913ic.A01(r1)
            r0 = 12
            java.lang.String r0 = X.C18170wI.A00(r0)
            X.C04220Ms.A0C(r2, r0)
            X.IcN r2 = (X.C34640IcN) r2
            X.3Vj r1 = new X.3Vj
            r1.<init>(r2, r3)
            X.24p r0 = X.C311924p.PROFESSIONAL_SIGNUP_FLOW
            r1.A01(r0)
            r9 = 0
            return r9
        L_0x1714:
            java.lang.String r2 = "ig.action.navigation.OpenAdPreview"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x1721
            java.lang.Object r9 = X.C100866Oy.A00(r1, r0)
            return r9
        L_0x1721:
            java.lang.String r2 = "ig.action.navigation.OpenAdsManager"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x174a
            r2 = 0
            java.lang.Object r0 = X.C63893iY.A0B(r0, r2)
            r0.getClass()
            java.lang.String r0 = (java.lang.String) r0
            com.instagram.service.session.UserSession r5 = X.C63913ic.A0J(r1)
            X.3GV r3 = X.C34552Jz.A00()
            X.C04220Ms.A0B(r1, r2)
            androidx.fragment.app.FragmentActivity r4 = X.C63913ic.A05(r1)
            r9 = 0
            r6 = r0
            r7 = r9
            r8 = r2
            r3.A01(r4, r5, r6, r7, r8)
            return r9
        L_0x174a:
            java.lang.String r2 = "ig.action.navigation.OpenAppLanguage"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x176d
            androidx.fragment.app.FragmentActivity r0 = A01(r1)
            com.instagram.service.session.UserSession r2 = X.C86104wH.A0Y(r1)
            X.Drz r1 = X.AnonymousClass0wJ.A0Q(r0, r2)
            X.6om r0 = X.C111986om.A01
            X.6vI r0 = r0.A00()
            androidx.fragment.app.Fragment r0 = r0.A02(r2)
            java.lang.Object r9 = A07(r0, r1)
            return r9
        L_0x176d:
            java.lang.String r2 = "ig.action.navigation.OpenApprovedShopAccounts"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x178e
            java.lang.Object r4 = X.C63893iY.A07(r0)
            java.lang.String r4 = (java.lang.String) r4
            X.Axa r3 = X.C19513Axa.A00
            r0 = 0
            X.C04220Ms.A0B(r1, r0)
            androidx.fragment.app.FragmentActivity r2 = X.C63913ic.A05(r1)
            com.instagram.service.session.UserSession r0 = X.C63913ic.A0J(r1)
            r3.A14(r2, r0, r4)
            r9 = 0
            return r9
        L_0x178e:
            java.lang.String r2 = "ig.action.navigation.OpenArchive"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x17bc
            r2 = 1
            X.C04220Ms.A0B(r1, r2)
            androidx.fragment.app.FragmentActivity r4 = X.C63913ic.A05(r1)
            android.os.Bundle r3 = X.C18180wK.A06()
            r0 = 57
            java.lang.String r0 = X.C18170wI.A00(r0)
            r3.putBoolean(r0, r2)
            X.0i6 r2 = X.C63913ic.A0F(r1)
            java.lang.Class<com.instagram.modal.ModalActivity> r1 = com.instagram.modal.ModalActivity.class
            r0 = 50
            java.lang.String r0 = X.C18170wI.A00(r0)
            X.C63863iT.A09(r4, r3, r2, r1, r0)
            r9 = 0
            return r9
        L_0x17bc:
            java.lang.String r2 = "ig.action.navigation.OpenAvatarPrivacySettings"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x17e0
            androidx.fragment.app.FragmentActivity r2 = A01(r1)
            X.0i6 r0 = X.C63913ic.A0F(r1)
            X.C18200wM.A1R(r0)
            X.C18190wL.A10()
            X.1wX r1 = new X.1wX
            r1.<init>()
            X.Drz r0 = X.AnonymousClass0wJ.A0Q(r2, r0)
            java.lang.Object r9 = A07(r1, r0)
            return r9
        L_0x17e0:
            java.lang.String r2 = "ig.action.navigation.OpenBlockedAccounts"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x1807
            r0 = 1
            X.C04220Ms.A0B(r1, r0)
            com.instagram.service.session.UserSession r3 = X.C86104wH.A0Y(r1)
            androidx.fragment.app.FragmentActivity r2 = X.C63913ic.A05(r1)
            X.36t r0 = X.C50452t1.A00()
            X.ExX r0 = r0.A00
            androidx.fragment.app.Fragment r1 = r0.BhZ(r3)
            X.Drz r0 = X.AnonymousClass0wJ.A0Q(r2, r3)
            java.lang.Object r9 = A07(r1, r0)
            return r9
        L_0x1807:
            java.lang.String r2 = "ig.action.navigation.OpenBottomSheet"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x1831
            X.3HX r4 = X.C63913ic.A0D(r1)
            r2 = 0
            X.C04220Ms.A0B(r1, r2)
            androidx.fragment.app.FragmentActivity r2 = X.C63913ic.A05(r1)
            X.7qT r3 = X.C63913ic.A08(r1)
            java.lang.Object r0 = X.C63893iY.A07(r0)
            X.7h3 r0 = (X.C127397h3) r0
            r9 = 0
            X.0i6 r7 = X.C63913ic.A0E(r4)
            r5 = r1
            r6 = r0
            r8 = r9
            X.M6q.A0A(r2, r3, r4, r5, r6, r7, r8)
            return r9
        L_0x1831:
            java.lang.String r2 = "ig.action.navigation.OpenBrandedContent"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x184e
            X.Drz r1 = A04(r1)
            X.C24016D5r.A00()
            X.DsG r0 = new X.DsG
            r0.<init>()
            androidx.fragment.app.Fragment r0 = r0.A06()
            java.lang.Object r9 = A07(r0, r1)
            return r9
        L_0x184e:
            java.lang.String r2 = "ig.action.navigation.OpenBrowserSettings"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x186f
            r3 = 1
            X.C04220Ms.A0B(r1, r3)
            androidx.fragment.app.FragmentActivity r2 = X.C63913ic.A05(r1)
            com.instagram.service.session.UserSession r0 = X.C86104wH.A0Y(r1)
            X.Drz r1 = X.C18180wK.A0Q(r2, r0)
            androidx.fragment.app.Fragment r0 = X.C101836Su.A00(r0, r3)
            java.lang.Object r9 = A07(r0, r1)
            return r9
        L_0x186f:
            java.lang.String r2 = "ig.action.navigation.OpenBusiness"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x187c
            java.lang.Object r9 = X.AnonymousClass2I8.A00(r1, r0)
            return r9
        L_0x187c:
            java.lang.String r2 = "ig.action.navigation.OpenCatalogSelection"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x1889
            java.lang.Object r9 = X.AnonymousClass2I9.A00(r1, r0)
            return r9
        L_0x1889:
            java.lang.String r2 = "ig.action.navigation.OpenCellularData"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x18a2
            X.Drz r1 = A04(r1)
            X.C18190wL.A10()
            X.1wN r0 = new X.1wN
            r0.<init>()
            java.lang.Object r9 = A07(r0, r1)
            return r9
        L_0x18a2:
            java.lang.String r2 = "ig.action.navigation.OpenChooseLocations"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x18d7
            r0 = 1
            X.C04220Ms.A0B(r1, r0)
            com.instagram.service.session.UserSession r5 = X.C86104wH.A0Y(r1)
            androidx.fragment.app.FragmentActivity r4 = X.C63913ic.A05(r1)
            X.1tl r0 = X.AnonymousClass3WS.A01(r5)
            java.lang.String r2 = "reel"
            java.util.Set r0 = r0.A0H(r2)
            java.util.ArrayList r3 = X.C18200wM.A0s(r0)
            X.1tl r0 = X.AnonymousClass3WS.A01(r5)
            boolean r2 = r0.A0R(r2)
            X.3HX r0 = r1.A00
            if (r0 == 0) goto L_0x6952
            android.content.Context r0 = r0.A00
            X.AnonymousClass3OS.A01(r0, r4, r5, r3, r2)
            r9 = 0
            return r9
        L_0x18d7:
            java.lang.String r2 = "ig.action.navigation.OpenClipsCameraWithPromptSticker"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x18e4
            java.lang.Object r9 = X.C100876Oz.A00(r1, r0)
            return r9
        L_0x18e4:
            java.lang.String r2 = "ig.action.navigation.OpenCloseFriends"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x1900
            androidx.fragment.app.FragmentActivity r2 = A01(r1)
            com.instagram.service.session.UserSession r0 = X.C86104wH.A0Y(r1)
            X.433 r1 = new X.433
            r1.<init>(r2, r0)
            X.24t r0 = X.C312224t.SETTINGS
            r1.BaO(r0)
            r9 = 0
            return r9
        L_0x1900:
            java.lang.String r2 = "ig.action.navigation.OpenCommentsV2"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x190d
            java.lang.Object r9 = X.C17267A3j.A00(r1, r0)
            return r9
        L_0x190d:
            java.lang.String r2 = "ig.action.navigation.OpenCommentThreadV2"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x191a
            java.lang.Object r9 = X.C17268A3k.A00(r1, r0)
            return r9
        L_0x191a:
            java.lang.String r2 = "ig.action.navigation.OpenCountryCodeDialog"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x194d
            boolean r2 = X.AnonymousClass0wJ.A1Y(r0, r1)
            X.6jp r4 = X.C63893iY.A06(r0, r2)
            X.1XY r3 = new X.1XY
            r3.<init>()
            android.os.Bundle r2 = X.C18180wK.A06()
            X.0i6 r0 = X.C63913ic.A0F(r1)
            X.C05050Qq.A00(r2, r0)
            r3.setArguments(r2)
            X.4FF r0 = new X.4FF
            r0.<init>(r1, r4)
            r3.A01 = r0
            X.0m7 r0 = X.C63913ic.A07(r1)
            r9 = 0
            r3.A0A(r0, r9)
            return r9
        L_0x194d:
            java.lang.String r2 = "ig.action.navigation.OpenCreateClipsFlow"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x195a
            java.lang.Object r9 = X.AnonymousClass2IA.A00(r1)
            return r9
        L_0x195a:
            java.lang.String r2 = "ig.action.navigation.OpenCreateIGTVFlow"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x1967
            java.lang.Object r9 = X.AnonymousClass2IB.A00(r1)
            return r9
        L_0x1967:
            java.lang.String r2 = "ig.action.navigation.OpenCreatePostFlow"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x1990
            androidx.fragment.app.FragmentActivity r4 = A01(r1)
            X.DnJ r3 = X.C25529DnJ.A02
            r0 = 2
            com.facebook.redex.IDxHDelegateShape496S0100000_1_I2 r2 = new com.facebook.redex.IDxHDelegateShape496S0100000_1_I2
            r2.<init>(r4, r0)
            X.0i6 r0 = X.C63913ic.A0F(r1)
            com.instagram.service.session.UserSession r0 = X.C05030Qo.A02(r0)
            X.4tU r2 = r3.A02(r4, r2, r0)
            X.FeI r1 = X.C28923FeI.FOLLOWERS_SHARE
            X.9vX r0 = X.C170769vX.INSIGHTS
            r2.Cuz(r0, r1)
            r9 = 0
            return r9
        L_0x1990:
            java.lang.String r2 = "ig.action.navigation.OpenCreatePostFlowOnMainScreen"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x19a1
            r0 = 1
            X.C04220Ms.A0B(r1, r0)
            X.C63913ic.A05(r1)
            r9 = 0
            return r9
        L_0x19a1:
            java.lang.String r2 = "ig.action.navigation.OpenCreatePromotionFlow"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x19ca
            r2 = 0
            java.lang.Object r0 = X.C63893iY.A0B(r0, r2)
            r0.getClass()
            java.lang.String r0 = (java.lang.String) r0
            com.instagram.service.session.UserSession r5 = X.C63913ic.A0J(r1)
            X.JjS r3 = X.AnonymousClass2K0.A00()
            X.C04220Ms.A0B(r1, r2)
            androidx.fragment.app.FragmentActivity r4 = X.C63913ic.A05(r1)
            r9 = 0
            r6 = r0
            r7 = r9
            r8 = r2
            r3.A04(r4, r5, r6, r7, r8)
            return r9
        L_0x19ca:
            java.lang.String r2 = "ig.action.navigation.OpenCreateStoryFlow"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x19d7
            X.C63913ic.A06(r1)
            r9 = 0
            return r9
        L_0x19d7:
            java.lang.String r2 = "ig.action.navigation.OpenCreator"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x19e4
            java.lang.Object r9 = X.AnonymousClass2IC.A00(r1, r0)
            return r9
        L_0x19e4:
            java.lang.String r2 = "ig.action.navigation.OpenDatePickerActivityCenter"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x19f1
            java.lang.Object r9 = X.AnonymousClass2ID.A00(r1, r0)
            return r9
        L_0x19f1:
            java.lang.String r2 = "ig.action.navigation.OpenDeletedMediaFeed"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x1a3b
            r7 = 0
            java.lang.String r6 = X.C86154wM.A0l(r0, r7)
            r5 = 1
            X.6jp r2 = X.C63893iY.A06(r0, r5)
            com.instagram.service.session.UserSession r4 = X.C63913ic.A0J(r1)
            X.C04220Ms.A0B(r1, r7)
            androidx.fragment.app.FragmentActivity r3 = X.C63913ic.A05(r1)
            X.7xn r0 = new X.7xn
            r0.<init>(r1, r2)
            X.AnonymousClass6DF.A00 = r0
            java.lang.Class<com.instagram.modal.ModalActivity> r2 = com.instagram.modal.ModalActivity.class
            com.instagram.util.fragment.IgFragmentFactoryImpl.A00()
            r9 = 0
            X.C04220Ms.A0B(r6, r7)
            r8 = r9
            r10 = r9
            r11 = r6
            r12 = r9
            r13 = r5
            r14 = r7
            r15 = r5
            r16 = r5
            android.os.Bundle r1 = X.C19504AxR.A00(r8, r9, r10, r11, r12, r13, r14, r15, r16)
            r0 = 131(0x83, float:1.84E-43)
            java.lang.String r0 = X.I17.A00(r0)
            X.3iT r1 = X.C63863iT.A05(r3, r1, r4, r2, r0)
            r0 = 1001(0x3e9, float:1.403E-42)
            r1.A0H(r3, r0)
            return r9
        L_0x1a3b:
            java.lang.String r2 = "ig.action.navigation.OpenDeletedMediaIGTV"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x1a55
            r2 = 0
            boolean r3 = X.AnonymousClass0wJ.A1Z(r0, r1)
            java.lang.String r2 = X.C63893iY.A0D(r0, r2)
            X.6jp r0 = X.C63893iY.A06(r0, r3)
            X.AnonymousClass7GJ.A02(r1, r0, r2, r3)
            r9 = 0
            return r9
        L_0x1a55:
            java.lang.String r2 = "ig.action.navigation.OpenDeletedMediaReel"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x1a71
            r4 = 0
            X.C04220Ms.A0B(r0, r4)
            java.lang.String r3 = X.C63893iY.A0D(r0, r4)
            r2 = 1
            X.6jp r0 = X.C63893iY.A06(r0, r2)
            if (r28 == 0) goto L_0x6957
            X.AnonymousClass7GJ.A02(r1, r0, r3, r4)
            r9 = 0
            return r9
        L_0x1a71:
            java.lang.String r2 = "ig.action.navigation.OpenDeletedMediaStory"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x1ac5
            java.lang.Object r2 = X.C63893iY.A07(r0)
            r9 = 1
            X.6jp r14 = X.C63893iY.A06(r0, r9)
            java.lang.Object r8 = X.C63893iY.A09(r0)
            X.7h3 r8 = (X.C127397h3) r8
            com.instagram.service.session.UserSession r7 = X.C63913ic.A0J(r1)
            r0 = 0
            X.C04220Ms.A0B(r1, r0)
            androidx.fragment.app.FragmentActivity r6 = X.C63913ic.A05(r1)
            X.06E r0 = X.AnonymousClass06E.A00(r6)
            X.AxZ r5 = new X.AxZ
            r5.<init>(r6, r0, r7)
            com.instagram.reels.recentlydeleted.ReelRecentlyDeletedViewerController r4 = new com.instagram.reels.recentlydeleted.ReelRecentlyDeletedViewerController
            r4.<init>(r6)
            java.util.ArrayList r0 = X.AnonymousClass0wJ.A0v()
            r0.add(r2)
            X.H8c r3 = X.C86104wH.A0U(r7, r0)
            X.6mA r2 = new X.6mA
            r10 = r2
            r11 = r6
            r12 = r1
            r13 = r8
            r15 = r4
            r16 = r7
            r10.<init>(r11, r12, r13, r14, r15, r16)
            X.9wH r1 = X.C171229wH.A0H
            com.facebook.redex.IDxCallbackShape142S0300000_2_I2 r0 = new com.facebook.redex.IDxCallbackShape142S0300000_2_I2
            r0.<init>(r9, r2, r1, r4)
            r5.A06(r3, r0)
            r9 = 0
            return r9
        L_0x1ac5:
            java.lang.String r2 = "ig.action.navigation.OpenDeletePromotion"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x1ad2
            java.lang.Object r9 = X.AnonymousClass2IE.A00(r1, r0)
            return r9
        L_0x1ad2:
            java.lang.String r2 = "ig.action.navigation.OpenDialog"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x1af3
            boolean r2 = X.AnonymousClass0wJ.A1Y(r0, r1)
            X.7h3 r4 = X.C63893iY.A03(r0, r2)
            X.3HX r3 = X.C63913ic.A0D(r1)
            androidx.fragment.app.FragmentActivity r2 = X.C63913ic.A05(r1)
            X.0kW r0 = X.C63913ic.A0A(r1)
            X.C59413Ks.A01(r2, r0, r3, r1, r4)
            r9 = 0
            return r9
        L_0x1af3:
            java.lang.String r2 = "ig.action.navigation.OpenDialogV2"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x1b22
            r2 = 0
            boolean r3 = X.AnonymousClass0wJ.A1Z(r0, r1)
            java.lang.Object r2 = X.C63893iY.A0B(r0, r2)
            r2.getClass()
            X.7Jj r2 = (X.C121997Jj) r2
            X.3HX r4 = X.C63893iY.A01(r0, r3)
            X.7h3 r0 = r2.A02
            r9 = 0
            if (r0 == 0) goto L_0x0012
            X.7h3 r3 = X.C101046Pr.A00(r4, r1, r0)
            androidx.fragment.app.FragmentActivity r2 = X.C63913ic.A05(r1)
            X.0kW r0 = X.C63913ic.A0A(r1)
            X.C59413Ks.A01(r2, r0, r4, r1, r3)
            return r9
        L_0x1b22:
            java.lang.String r2 = "ig.action.navigation.OpenDirectMessageShareSheet"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x1b2f
            java.lang.Object r9 = X.AnonymousClass2IF.A00(r1, r0)
            return r9
        L_0x1b2f:
            java.lang.String r2 = "ig.action.navigation.OpenDYI"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x1b50
            r0 = 1
            X.C04220Ms.A0B(r1, r0)
            X.C18190wL.A10()
            X.1uw r3 = new X.1uw
            r3.<init>()
            androidx.fragment.app.FragmentActivity r2 = X.C63913ic.A05(r1)
            X.0i6 r0 = X.C63913ic.A0F(r1)
            X.AnonymousClass0wJ.A19(r3, r2, r0)
            r9 = 0
            return r9
        L_0x1b50:
            java.lang.String r2 = "ig.action.navigation.OpenEditAudiencePromotionFlow"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x1b5d
            java.lang.Object r9 = X.C35652IzS.A00(r1, r0)
            return r9
        L_0x1b5d:
            java.lang.String r2 = "ig.action.navigation.OpenEditProfile"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L_0x393a
            java.lang.String r2 = "ig.action.navigation.OpenEditPromotion"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x1b72
            java.lang.Object r9 = X.AnonymousClass2IG.A00(r1, r0)
            return r9
        L_0x1b72:
            java.lang.String r2 = "ig.action.navigation.OpenEndOfYearHighlightCreation"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x1b9b
            r0 = 0
            X.C04220Ms.A0B(r1, r0)
            X.0kW r5 = X.C63913ic.A0A(r1)
            androidx.fragment.app.FragmentActivity r4 = X.C63913ic.A05(r1)
            com.instagram.service.session.UserSession r3 = X.C63913ic.A0J(r1)
            X.H8c r2 = X.C101346Qv.A00(r3)
            r1 = 3
            com.instagram.common.api.base.IDxACallbackShape16S0300000_2_I2 r0 = new com.instagram.common.api.base.IDxACallbackShape16S0300000_2_I2
            r0.<init>(r1, r4, r5, r3)
            r2.A00 = r0
            X.C31155GhB.A03(r2)
            r9 = 0
            return r9
        L_0x1b9b:
            java.lang.String r2 = "ig.action.navigation.OpenFacebookAndMessengerFriendsCanMessageYou"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x1bb7
            androidx.fragment.app.FragmentActivity r2 = A01(r1)
            com.instagram.service.session.UserSession r0 = X.C86104wH.A0Y(r1)
            X.4Kf r1 = new X.4Kf
            r1.<init>(r2, r0)
            java.lang.String r0 = "fb_friends"
            r1.A00(r0)
            r9 = 0
            return r9
        L_0x1bb7:
            java.lang.String r2 = "ig.action.navigation.OpenFavorites"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x1bd9
            androidx.fragment.app.FragmentActivity r2 = A01(r1)
            com.instagram.service.session.UserSession r0 = X.C86104wH.A0Y(r1)
            X.433 r3 = new X.433
            r3.<init>(r2, r0)
            java.lang.String r2 = X.C18230wP.A0h()
            java.lang.String r1 = "settings"
            java.lang.String r0 = "SETTINGS"
            r3.A02(r0, r2, r1)
            r9 = 0
            return r9
        L_0x1bd9:
            java.lang.String r2 = "ig.action.navigation.OpenFeedbackChannel"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x1be6
            java.lang.Object r9 = X.AnonymousClass2IH.A00(r1)
            return r9
        L_0x1be6:
            java.lang.String r2 = "ig.action.navigation.OpenFollowAndInviteFriends"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x1bff
            X.Drz r1 = A04(r1)
            X.C18190wL.A10()
            X.1wH r0 = new X.1wH
            r0.<init>()
            java.lang.Object r9 = A07(r0, r1)
            return r9
        L_0x1bff:
            java.lang.String r2 = "ig.action.navigation.OpenFollowListActivity"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x1c0c
            java.lang.Object r9 = X.AnonymousClass2II.A00(r1)
            return r9
        L_0x1c0c:
            java.lang.String r2 = "ig.action.navigation.OpenFreshTopics"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x1c19
            java.lang.Object r9 = X.AnonymousClass2IJ.A00(r1, r0)
            return r9
        L_0x1c19:
            java.lang.String r2 = "ig.action.navigation.OpenFriendsOfFriendsOnFacebookCanMessageYou"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x1c39
            androidx.fragment.app.FragmentActivity r2 = A01(r1)
            com.instagram.service.session.UserSession r0 = X.C86104wH.A0Y(r1)
            X.4Kf r1 = new X.4Kf
            r1.<init>(r2, r0)
            r0 = 1053(0x41d, float:1.476E-42)
            java.lang.String r0 = X.C18170wI.A00(r0)
            r1.A00(r0)
            r9 = 0
            return r9
        L_0x1c39:
            java.lang.String r2 = "ig.action.navigation.OpenFundraiserCheckoutFlow"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x1c88
            com.instagram.service.session.UserSession r7 = X.C63913ic.A0J(r1)
            r4 = 0
            java.lang.Object r2 = X.C63893iY.A0B(r0, r4)
            java.lang.String r2 = (java.lang.String) r2
            android.os.Bundle r6 = X.C18180wK.A06()
            X.JhV r0 = new X.JhV
            r0.<init>((java.lang.String) r2)
            r0.A0A = r4
            r3 = 1
            r0.A06 = r3
            r0.A07 = r4
            r0.A04 = r3
            com.instagram.simplewebview.SimpleWebViewConfig r2 = r0.A00()
            r0 = 17
            java.lang.String r0 = X.C18170wI.A00(r0)
            r6.putParcelable(r0, r2)
            java.lang.Class<com.instagram.modal.ModalActivity> r8 = com.instagram.modal.ModalActivity.class
            X.C04220Ms.A0B(r1, r4)
            androidx.fragment.app.FragmentActivity r5 = X.C63913ic.A05(r1)
            r0 = 156(0x9c, float:2.19E-43)
            java.lang.String r9 = X.AnonymousClass000.A00(r0)
            X.3iT r4 = new X.3iT
            r4.<init>(r5, r6, r7, r8, r9)
            androidx.fragment.app.Fragment r0 = X.C63913ic.A01(r1)
            r4.A0J(r0, r3)
            r9 = 0
            return r9
        L_0x1c88:
            java.lang.String r2 = "ig.action.navigation.OpenGoLiveFlow"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x1ca4
            androidx.fragment.app.FragmentActivity r1 = A01(r1)
            r0 = 60
            java.lang.String r0 = X.I17.A00(r0)
            X.C04220Ms.A0C(r1, r0)
            java.lang.String r0 = "getConfig"
            java.lang.NullPointerException r2 = X.C18210wN.A0W(r0)
            throw r2
        L_0x1ca4:
            java.lang.String r2 = "ig.action.navigation.OpenHashtag"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x1d11
            r2 = 0
            boolean r3 = X.AnonymousClass0wJ.A1Z(r0, r1)
            X.3HX r2 = X.C63893iY.A01(r0, r2)
            java.lang.Object r0 = X.C63893iY.A0B(r0, r3)
            r0.getClass()
            X.7Jj r0 = (X.C121997Jj) r0
            X.7h3 r0 = r0.A02
            X.C04220Ms.A06(r0)
            X.7h3 r0 = X.C101046Pr.A00(r2, r1, r0)
            java.lang.String r6 = X.C18230wP.A0o(r0)
            java.lang.String r4 = X.C18220wO.A0o(r0)
            X.0i6 r3 = X.C63913ic.A0F(r1)
            boolean r0 = r3 instanceof com.instagram.service.session.UserSession
            if (r0 == 0) goto L_0x395f
            if (r6 == 0) goto L_0x395f
            java.lang.String r0 = "default"
            boolean r0 = X.C04220Ms.A0I(r4, r0)
            java.lang.String r5 = "DEFAULT"
            java.lang.String r2 = "caption"
            if (r0 != 0) goto L_0x1cec
            boolean r0 = X.C04220Ms.A0I(r4, r2)
            if (r0 == 0) goto L_0x1cec
            r5 = r2
        L_0x1cec:
            androidx.fragment.app.FragmentActivity r0 = X.C63913ic.A05(r1)
            X.Drz r4 = X.C18180wK.A0Q(r0, r3)
            X.Afn r0 = X.C18456Afn.A01
            X.AfW r3 = r0.A00()
            com.instagram.model.hashtag.Hashtag r2 = X.C19274Atd.A00(r6)
            X.0kW r0 = X.C63913ic.A0A(r1)
            java.lang.String r0 = r0.getModuleName()
            androidx.fragment.app.Fragment r0 = r3.A01(r2, r0, r5)
            r4.A03 = r0
            r4.A05()
            goto L_0x395f
        L_0x1d11:
            java.lang.String r2 = "ig.action.navigation.OpenHashtagFeed"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x1d45
            boolean r2 = X.AnonymousClass0wJ.A1Y(r0, r1)
            java.lang.Object r4 = X.C63893iY.A0B(r0, r2)
            r4.getClass()
            com.instagram.model.hashtag.Hashtag r4 = (com.instagram.model.hashtag.Hashtag) r4
            androidx.fragment.app.FragmentActivity r2 = X.C63913ic.A05(r1)
            X.0i6 r0 = X.C63913ic.A0F(r1)
            X.Drz r3 = X.C18180wK.A0Q(r2, r0)
            X.Afn r0 = X.C18456Afn.A01
            X.AfW r2 = r0.A00()
            java.lang.String r1 = "blok_view"
            java.lang.String r0 = "DEFAULT"
            androidx.fragment.app.Fragment r0 = r2.A01(r4, r1, r0)
            java.lang.Object r9 = A07(r0, r3)
            return r9
        L_0x1d45:
            java.lang.String r2 = "ig.action.navigation.OpenHashtagFeedWithMediaFocus"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x1d52
            java.lang.Object r9 = X.AnonymousClass6P0.A00(r1, r0)
            return r9
        L_0x1d52:
            java.lang.String r2 = "ig.action.navigation.OpenHideFrom"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x1d6b
            X.Drz r1 = A04(r1)
            X.C19554AyF.A02()
            X.1cN r0 = new X.1cN
            r0.<init>()
            java.lang.Object r9 = A07(r0, r1)
            return r9
        L_0x1d6b:
            java.lang.String r2 = "ig.action.navigation.OpenIACWebviewUrl"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x1d78
            java.lang.Object r9 = X.AnonymousClass2IK.A00(r1, r0)
            return r9
        L_0x1d78:
            java.lang.String r2 = "ig.action.navigation.OpenInformationCenter"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x1dda
            r2 = 0
            boolean r3 = X.AnonymousClass0wJ.A1Z(r0, r1)
            java.util.List r4 = r0.A00
            java.lang.Object r2 = r4.get(r2)
            java.lang.String r3 = X.C18190wL.A0q(r4, r3)
            r0 = 2
            java.lang.String r7 = X.C18190wL.A0q(r4, r0)
            r0 = 3
            java.lang.String r8 = X.C18190wL.A0q(r4, r0)
            r0 = 4
            java.lang.String r9 = X.C18190wL.A0q(r4, r0)
            androidx.fragment.app.FragmentActivity r4 = X.C63913ic.A05(r1)
            X.0i6 r0 = X.C63913ic.A0F(r1)
            com.instagram.service.session.UserSession r6 = X.C05030Qo.A02(r0)
            X.6rV r0 = X.C113486rV.A01
            if (r0 == 0) goto L_0x395f
            if (r2 == 0) goto L_0x395f
            X.ItK r5 = X.C101866Sx.A00(r3)
            java.lang.String r0 = "voting_information_center"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x1dc5
            X.6rV r3 = X.C101876Sy.A00()
            r3.A01(r4, r5, r6, r7, r8, r9)
            goto L_0x395f
        L_0x1dc5:
            r0 = 52
            java.lang.String r0 = X.I17.A00(r0)
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x395f
            X.6rV r3 = X.C101876Sy.A00()
            r3.A00(r4, r5, r6, r7, r8, r9)
            goto L_0x395f
        L_0x1dda:
            java.lang.String r2 = "ig.action.navigation.OpenInsightsClipsViewer"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x1df7
            boolean r4 = X.AnonymousClass0wJ.A1Y(r0, r1)
            java.lang.String r3 = X.C63893iY.A0D(r0, r4)
            com.instagram.service.session.UserSession r2 = X.C86104wH.A0Y(r1)
            androidx.fragment.app.FragmentActivity r0 = X.C63913ic.A05(r1)
            X.AnonymousClass7GJ.A00(r0, r1, r2, r3, r4)
            r9 = 0
            return r9
        L_0x1df7:
            java.lang.String r2 = "ig.action.navigation.OpenInsightsIGTVViewer"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x1e19
            r2 = 0
            boolean r4 = X.AnonymousClass0wJ.A1Z(r0, r1)
            java.lang.String r3 = X.C63893iY.A0D(r0, r2)
            X.0i6 r0 = X.C63913ic.A0F(r1)
            com.instagram.service.session.UserSession r2 = X.C05030Qo.A02(r0)
            androidx.fragment.app.FragmentActivity r0 = X.C63913ic.A05(r1)
            X.AnonymousClass7GJ.A00(r0, r1, r2, r3, r4)
            r9 = 0
            return r9
        L_0x1e19:
            java.lang.String r2 = "ig.action.navigation.OpenInsightsStoryViewer"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x1e5e
            r8 = 0
            java.lang.Object r2 = X.C63893iY.A0B(r0, r8)
            r2.getClass()
            X.C04220Ms.A0B(r1, r8)
            androidx.fragment.app.FragmentActivity r7 = X.C63913ic.A05(r1)
            com.instagram.service.session.UserSession r6 = X.C63913ic.A0J(r1)
            X.06E r0 = X.AnonymousClass06E.A00(r7)
            X.AxZ r5 = new X.AxZ
            r5.<init>(r7, r0, r6)
            X.5zy r4 = new X.5zy
            r4.<init>(r7)
            java.util.ArrayList r0 = X.AnonymousClass0wJ.A0v()
            r0.add(r2)
            X.H8c r3 = X.C86104wH.A0U(r6, r0)
            X.7pS r2 = new X.7pS
            r2.<init>(r7, r4, r1, r6)
            X.9wH r1 = X.C171229wH.A0L
            com.facebook.redex.IDxCallbackShape142S0300000_2_I2 r0 = new com.facebook.redex.IDxCallbackShape142S0300000_2_I2
            r0.<init>(r8, r2, r1, r4)
            r5.A06(r3, r0)
            r9 = 0
            return r9
        L_0x1e5e:
            java.lang.String r2 = "ig.action.navigation.OpenInsightsStoryViewerV2"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x1eac
            java.lang.Object r2 = X.C63893iY.A07(r0)
            java.lang.Object r9 = X.C63893iY.A08(r0)
            X.7h3 r9 = (X.C127397h3) r9
            r8 = 0
            X.C04220Ms.A0B(r1, r8)
            androidx.fragment.app.FragmentActivity r7 = X.C63913ic.A05(r1)
            com.instagram.service.session.UserSession r6 = X.C63913ic.A0J(r1)
            X.06E r0 = X.AnonymousClass06E.A00(r7)
            X.AxZ r5 = new X.AxZ
            r5.<init>(r7, r0, r6)
            X.5zy r4 = new X.5zy
            r4.<init>(r7)
            java.util.ArrayList r0 = X.AnonymousClass0wJ.A0v()
            r0.add(r2)
            X.H8c r3 = X.C86104wH.A0U(r6, r0)
            X.7pT r2 = new X.7pT
            r10 = r2
            r11 = r7
            r12 = r4
            r13 = r1
            r14 = r9
            r15 = r6
            r10.<init>(r11, r12, r13, r14, r15)
            X.9wH r1 = X.C171229wH.A0L
            com.facebook.redex.IDxCallbackShape142S0300000_2_I2 r0 = new com.facebook.redex.IDxCallbackShape142S0300000_2_I2
            r0.<init>(r8, r2, r1, r4)
            r5.A06(r3, r0)
            r9 = 0
            return r9
        L_0x1eac:
            java.lang.String r2 = "ig.action.navigation.OpenInternalSettings"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x1ec5
            X.Drz r1 = A04(r1)
            X.C18190wL.A10()
            X.1wI r0 = new X.1wI
            r0.<init>()
            java.lang.Object r9 = A07(r0, r1)
            return r9
        L_0x1ec5:
            java.lang.String r2 = "ig.action.navigation.OpenItemDetails"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x1ee4
            r4 = 0
            java.lang.Object r3 = X.C63893iY.A0B(r0, r4)
            java.lang.String r3 = (java.lang.String) r3
            com.instagram.service.session.UserSession r2 = X.C63913ic.A0J(r1)
            X.C04220Ms.A0B(r1, r4)
            androidx.fragment.app.FragmentActivity r0 = X.C63913ic.A05(r1)
            X.AnonymousClass3ib.A0E(r0, r2, r3)
            r9 = 0
            return r9
        L_0x1ee4:
            java.lang.String r2 = "ig.action.navigation.OpenLikers"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x1ef1
            java.lang.Object r9 = X.AnonymousClass2IL.A00(r1, r0)
            return r9
        L_0x1ef1:
            java.lang.String r2 = "ig.action.navigation.OpenLinksVisited"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x1efe
            java.lang.Object r9 = X.AnonymousClass2IM.A00(r1)
            return r9
        L_0x1efe:
            java.lang.String r2 = "ig.action.navigation.OpenLive"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x1f0b
            java.lang.Object r9 = X.C24010D5l.A00(r1, r0)
            return r9
        L_0x1f0b:
            java.lang.String r2 = "ig.action.navigation.OpenLiveAndIGTVNotificationSettings"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x1f4f
            androidx.fragment.app.FragmentActivity r6 = A01(r1)
            X.0i6 r0 = X.C63913ic.A0F(r1)
            com.instagram.service.session.UserSession r1 = X.C05030Qo.A02(r0)
            android.os.Bundle r5 = X.C18180wK.A06()
            X.C86134wK.A15(r5, r1)
            X.Drz r4 = X.AnonymousClass0wJ.A0Q(r6, r1)
            X.6om r0 = X.C111986om.A01
            X.6vI r3 = r0.A00()
            java.lang.String r2 = r1.token
            android.content.Context r1 = r6.getApplicationContext()
            r0 = 2131829705(0x7f1123c9, float:1.9292387E38)
            java.lang.String r1 = r1.getString(r0)
            r0 = 227(0xe3, float:3.18E-43)
            java.lang.String r0 = X.C18170wI.A00(r0)
            androidx.fragment.app.Fragment r0 = r3.A04(r2, r0, r1)
            r4.A0A(r5, r0)
            r4.A05()
            r9 = 0
            return r9
        L_0x1f4f:
            java.lang.String r2 = "ig.action.navigation.OpenLocationPage"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x1f7c
            java.lang.Object r3 = X.C63893iY.A07(r0)
            java.lang.String r3 = (java.lang.String) r3
            r0 = 0
            X.C04220Ms.A0B(r1, r0)
            androidx.fragment.app.FragmentActivity r2 = X.C63913ic.A05(r1)
            com.instagram.service.session.UserSession r0 = X.C63913ic.A0J(r1)
            X.Drz r1 = X.C18180wK.A0Q(r2, r0)
            X.Ds0 r0 = X.C25787Ds0.A00
            X.4q1 r0 = r0.getFragmentFactory()
            androidx.fragment.app.Fragment r0 = r0.Bhg(r3)
            java.lang.Object r9 = A07(r0, r1)
            return r9
        L_0x1f7c:
            java.lang.String r2 = "ig.action.navigation.OpenLoginActivity"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x1f9f
            androidx.fragment.app.FragmentActivity r2 = A01(r1)
            X.0i6 r0 = X.C63913ic.A0F(r1)
            X.Drz r1 = X.C18180wK.A0Q(r2, r0)
            r9 = 0
            X.1dd r0 = new X.1dd
            r0.<init>()
            r1.A03 = r0
            r1.A08()
            r1.A05()
            return r9
        L_0x1f9f:
            java.lang.String r2 = "ig.action.navigation.OpenLoginInfo"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x1fac
            java.lang.Object r9 = X.AnonymousClass2IN.A00(r1, r0)
            return r9
        L_0x1fac:
            java.lang.String r2 = "ig.action.navigation.OpenManuallyApproveTags"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x1fc9
            r0 = 1
            X.C04220Ms.A0B(r1, r0)
            X.0i6 r0 = X.C63913ic.A0F(r1)
            com.instagram.service.session.UserSession r2 = X.C05030Qo.A02(r0)
            androidx.fragment.app.FragmentActivity r0 = X.C63913ic.A05(r1)
            X.C60113Ns.A01(r0, r2)
            goto L_0x404b
        L_0x1fc9:
            java.lang.String r2 = "ig.action.navigation.OpenMessageAndStoryReplies"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x1ff8
            androidx.fragment.app.FragmentActivity r3 = A01(r1)
            X.0i6 r2 = X.C63913ic.A0F(r1)
            X.C18200wM.A1R(r2)
            X.C18190wL.A10()
            X.1wE r1 = new X.1wE
            r1.<init>()
            android.os.Bundle r0 = r1.mArguments
            if (r0 != 0) goto L_0x1fec
            android.os.Bundle r0 = X.C18180wK.A06()
        L_0x1fec:
            r1.setArguments(r0)
            X.Drz r0 = X.AnonymousClass0wJ.A0Q(r3, r2)
            java.lang.Object r9 = A07(r1, r0)
            return r9
        L_0x1ff8:
            java.lang.String r2 = "ig.action.navigation.OpenMessageRequests"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x2005
            java.lang.Object r9 = X.AnonymousClass2IO.A00(r1)
            return r9
        L_0x2005:
            java.lang.String r2 = "ig.action.navigation.OpenModalBottomSheet"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x2024
            r2 = 0
            X.C04220Ms.A0B(r1, r2)
            X.0i6 r3 = X.C63913ic.A0F(r1)
            androidx.fragment.app.FragmentActivity r2 = X.C63913ic.A05(r1)
            java.lang.Object r0 = X.C63893iY.A07(r0)
            X.7h3 r0 = (X.C127397h3) r0
            X.M6q.A0C(r2, r1, r0, r3)
            r9 = 0
            return r9
        L_0x2024:
            java.lang.String r2 = "ig.action.navigation.OpenMonetizationProductOnboardingFlow"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x204f
            com.instagram.service.session.UserSession r2 = X.C63913ic.A0J(r1)
            r0 = 0
            X.C04220Ms.A0B(r1, r0)
            androidx.fragment.app.FragmentActivity r0 = X.C63913ic.A05(r1)
            X.Drz r2 = X.AnonymousClass0wJ.A0Q(r0, r2)
            X.3Vl r0 = X.AnonymousClass3WJ.A01()
            X.3Hg r1 = r0.A01()
            java.lang.String r0 = "SETTINGS"
            androidx.fragment.app.Fragment r0 = r1.A02(r0)
            java.lang.Object r9 = A07(r0, r2)
            return r9
        L_0x204f:
            java.lang.String r2 = "ig.action.navigation.OpenMutedWordsDictionaryManager"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x2083
            r0 = 0
            X.C04220Ms.A0B(r1, r0)
            androidx.fragment.app.FragmentActivity r4 = X.C63913ic.A05(r1)
            com.instagram.service.session.UserSession r3 = X.C63913ic.A0J(r1)
            android.os.Bundle r2 = X.C18180wK.A06()
            r0 = 351(0x15f, float:4.92E-43)
            java.lang.String r1 = X.C18170wI.A00(r0)
            java.lang.String r0 = "bloks"
            r2.putString(r1, r0)
            java.lang.Class<com.instagram.modal.ModalActivity> r1 = com.instagram.modal.ModalActivity.class
            r0 = 197(0xc5, float:2.76E-43)
            java.lang.String r0 = X.C18170wI.A00(r0)
            X.3iT r0 = X.C63863iT.A05(r4, r2, r3, r1, r0)
            r0.A0I(r4)
            r9 = 0
            return r9
        L_0x2083:
            java.lang.String r2 = "ig.action.navigation.OpenMutedWordsDictionaryManagerV2"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x2090
            java.lang.Object r9 = X.AnonymousClass2IP.A00(r1, r0)
            return r9
        L_0x2090:
            java.lang.String r2 = "ig.action.navigation.OpenNelsonHome"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x20c1
            com.instagram.service.session.UserSession r3 = X.C63913ic.A0J(r1)
            r0 = 0
            X.C04220Ms.A0B(r1, r0)
            androidx.fragment.app.FragmentActivity r0 = X.C63913ic.A05(r1)
            X.Drz r2 = X.C18180wK.A0Q(r0, r3)
            X.JXd r0 = X.C36480JXd.A02
            r0.A01()
            android.os.Bundle r1 = X.C18180wK.A06()
            X.C86134wK.A15(r1, r3)
            com.instagram.wellbeing.restrict.fragment.RestrictHomeFragment r0 = new com.instagram.wellbeing.restrict.fragment.RestrictHomeFragment
            r0.<init>()
            r0.setArguments(r1)
            java.lang.Object r9 = A07(r0, r2)
            return r9
        L_0x20c1:
            java.lang.String r2 = "ig.action.navigation.OpenNotifications"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x20fc
            androidx.fragment.app.FragmentActivity r4 = A01(r1)
            X.0i6 r3 = X.C63913ic.A0F(r1)
            X.C18200wM.A1R(r3)
            X.0TJ r2 = X.AnonymousClass0TJ.A05
            r0 = 36326219209254363(0x810e81000025db, double:3.036185529651896E-306)
            boolean r2 = X.C63803iN.A0E(r2, r3, r0)
            X.6om r0 = X.C111986om.A01
            X.6vI r1 = r0.A00()
            if (r2 == 0) goto L_0x20f6
            X.LbR r0 = X.LbR.NOTIFICATIONS
            androidx.fragment.app.Fragment r0 = r1.A03(r0)
        L_0x20ed:
            X.Drz r1 = X.AnonymousClass0wJ.A0Q(r4, r3)
            java.lang.Object r9 = A07(r0, r1)
            return r9
        L_0x20f6:
            X.1xd r0 = new X.1xd
            r0.<init>()
            goto L_0x20ed
        L_0x20fc:
            java.lang.String r2 = "ig.action.navigation.OpenOrderCancellation"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x2109
            java.lang.Object r9 = X.AnonymousClass2IQ.A00(r1, r0)
            return r9
        L_0x2109:
            java.lang.String r2 = "ig.action.navigation.OpenOrderContactMerchant"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x2116
            java.lang.Object r9 = X.AnonymousClass2IR.A00(r1, r0)
            return r9
        L_0x2116:
            java.lang.String r2 = "ig.action.navigation.OpenOrderDetails"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x2139
            boolean r2 = X.AnonymousClass0wJ.A1Y(r0, r1)
            java.lang.Object r3 = X.C63893iY.A0B(r0, r2)
            java.lang.String r3 = (java.lang.String) r3
            X.0i6 r0 = X.C63913ic.A0F(r1)
            com.instagram.service.session.UserSession r2 = X.C05030Qo.A02(r0)
            androidx.fragment.app.FragmentActivity r0 = X.C63913ic.A05(r1)
            X.AnonymousClass3ib.A0F(r0, r2, r3)
            r9 = 0
            return r9
        L_0x2139:
            java.lang.String r2 = "ig.action.navigation.OpenOrderDisputeStatus"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x2146
            java.lang.Object r9 = X.AnonymousClass2IS.A00(r1, r0)
            return r9
        L_0x2146:
            java.lang.String r2 = "ig.action.navigation.OpenOrderReturn"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x2153
            java.lang.Object r9 = X.AnonymousClass2IT.A00(r1, r0)
            return r9
        L_0x2153:
            java.lang.String r2 = "ig.action.navigation.OpenOriginalPhotos"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x2173
            X.Drz r2 = A04(r1)
            X.C18190wL.A10()
            android.os.Bundle r1 = X.C18180wK.A06()
            X.1wZ r0 = new X.1wZ
            r0.<init>()
            r0.setArguments(r1)
            java.lang.Object r9 = A07(r0, r2)
            return r9
        L_0x2173:
            java.lang.String r2 = "ig.action.navigation.OpenOthersOnFacebookCanMessageYou"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x2193
            androidx.fragment.app.FragmentActivity r2 = A01(r1)
            com.instagram.service.session.UserSession r0 = X.C86104wH.A0Y(r1)
            X.4Kf r1 = new X.4Kf
            r1.<init>(r2, r0)
            r0 = 1274(0x4fa, float:1.785E-42)
            java.lang.String r0 = X.C18170wI.A00(r0)
            r1.A00(r0)
            r9 = 0
            return r9
        L_0x2193:
            java.lang.String r2 = "ig.action.navigation.OpenOthersOnInstagramCanMessageYou"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x21b3
            androidx.fragment.app.FragmentActivity r2 = A01(r1)
            com.instagram.service.session.UserSession r0 = X.C86104wH.A0Y(r1)
            X.4Kf r1 = new X.4Kf
            r1.<init>(r2, r0)
            r0 = 1275(0x4fb, float:1.787E-42)
            java.lang.String r0 = X.C18170wI.A00(r0)
            r1.A00(r0)
            r9 = 0
            return r9
        L_0x21b3:
            java.lang.String r2 = "ig.action.navigation.OpenPasswordChange"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x21de
            com.instagram.service.session.UserSession r3 = X.C63913ic.A0J(r1)
            X.3hW r0 = X.C63463hW.A02()
            X.3Vf r2 = r0.A06()
            java.lang.Integer r0 = X.AnonymousClass006.A0N
            java.lang.String r0 = X.C36152Qf.A00(r0)
            androidx.fragment.app.Fragment r2 = r2.A04(r3, r0)
            r0 = 0
            X.C04220Ms.A0B(r1, r0)
            androidx.fragment.app.FragmentActivity r0 = X.C63913ic.A05(r1)
            X.AnonymousClass0wJ.A19(r2, r0, r3)
            r9 = 0
            return r9
        L_0x21de:
            java.lang.String r2 = "ig.action.navigation.OpenPayoutOnboardingFlow"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x220f
            X.AnonymousClass0wJ.A1N(r0, r1)
            java.util.List r3 = r0.A00
            int r2 = r3.size()
            r9 = 0
            r0 = 5
            if (r2 >= r0) goto L_0x2209
            r3 = r9
        L_0x21f4:
            X.0i6 r0 = X.C63913ic.A0F(r1)
            X.KHq r2 = X.AnonymousClass3LY.A00(r0)
            androidx.fragment.app.FragmentActivity r1 = X.C63913ic.A05(r1)
            X.7rj r0 = new X.7rj
            r0.<init>(r1, r3)
            r2.CWx(r0)
            return r9
        L_0x2209:
            r0 = 4
            java.lang.String r3 = X.C18190wL.A0q(r3, r0)
            goto L_0x21f4
        L_0x220f:
            java.lang.String r2 = "ig.action.navigation.OpenPeopleWithYourPhoneNumberCanMessageYou"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x222f
            androidx.fragment.app.FragmentActivity r2 = A01(r1)
            com.instagram.service.session.UserSession r0 = X.C86104wH.A0Y(r1)
            X.4Kf r1 = new X.4Kf
            r1.<init>(r2, r0)
            r0 = 1285(0x505, float:1.8E-42)
            java.lang.String r0 = X.C18170wI.A00(r0)
            r1.A00(r0)
            r9 = 0
            return r9
        L_0x222f:
            java.lang.String r2 = "ig.action.navigation.OpenPersonalInformation"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L_0x393a
            java.lang.String r2 = "ig.action.navigation.OpenPostsSettings"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x2250
            androidx.fragment.app.FragmentActivity r2 = A01(r1)
            X.0i6 r0 = X.C63913ic.A0F(r1)
            com.instagram.service.session.UserSession r0 = X.C05030Qo.A02(r0)
            X.C54522za.A00(r2, r0)
            r9 = 0
            return r9
        L_0x2250:
            java.lang.String r2 = "ig.action.navigation.OpenPrivacy"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x225d
            java.lang.Object r9 = X.AnonymousClass2IU.A00(r1, r0)
            return r9
        L_0x225d:
            java.lang.String r2 = "ig.action.navigation.OpenPrivacySettings"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x227e
            r0 = 1
            X.C04220Ms.A0B(r1, r0)
            X.C18190wL.A10()
            X.1wV r3 = new X.1wV
            r3.<init>()
            androidx.fragment.app.FragmentActivity r2 = X.C63913ic.A05(r1)
            X.0i6 r0 = X.C63913ic.A0F(r1)
            X.AnonymousClass0wJ.A19(r3, r2, r0)
            r9 = 0
            return r9
        L_0x227e:
            java.lang.String r2 = "ig.action.navigation.OpenProductVariantSelector"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x22c6
            r2 = 0
            boolean r4 = X.AnonymousClass0wJ.A1Z(r0, r1)
            java.lang.Object r3 = X.C63893iY.A0B(r0, r2)
            r3.getClass()
            boolean r2 = r3 instanceof X.C127397h3
            r9 = 0
            if (r2 == 0) goto L_0x22c4
            X.7h3 r3 = (X.C127397h3) r3
        L_0x2299:
            java.lang.Object r0 = X.C63893iY.A0B(r0, r4)
            r0.getClass()
            X.6eC r0 = (X.C105916eC) r0
            X.6jp r2 = r0.A00
            if (r3 == 0) goto L_0x0012
            X.Axa r5 = X.C19513Axa.A00
            androidx.fragment.app.FragmentActivity r6 = X.C63913ic.A05(r1)
            X.0i6 r0 = X.C63913ic.A0F(r1)
            com.instagram.service.session.UserSession r8 = X.C05030Qo.A02(r0)
            com.instagram.model.shopping.Product r7 = X.C19249AtE.A01(r3)
            X.7xJ r0 = new X.7xJ
            r0.<init>(r1, r2)
            r10 = r0
            r11 = r4
            r12 = r4
            r5.A0u(r6, r7, r8, r9, r10, r11, r12)
            return r9
        L_0x22c4:
            r3 = r9
            goto L_0x2299
        L_0x22c6:
            java.lang.String r2 = "ig.action.navigation.OpenPromotionFlow"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x22d3
            java.lang.Object r9 = X.C35653IzT.A00(r1, r0)
            return r9
        L_0x22d3:
            java.lang.String r2 = "ig.action.navigation.OpenPromotionPreview"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x22e2
            java.lang.String r0 = "The OpenPromotionPreview should already be deprecated. Please use ig.action.navigation.OpenAdPreview instead."
            java.lang.IllegalStateException r2 = X.C18180wK.A0a(r0)
            throw r2
        L_0x22e2:
            java.lang.String r2 = "ig.action.navigation.OpenPurchaseOptionAddUrl"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x2337
            java.lang.Object r3 = X.C63893iY.A07(r0)
            X.7h3 r3 = (X.C127397h3) r3
            r0 = 0
            X.C04220Ms.A0B(r1, r0)
            androidx.fragment.app.FragmentActivity r2 = X.C63913ic.A05(r1)
            X.0i6 r0 = X.C63913ic.A0F(r1)
            X.Drz r2 = X.C18180wK.A0Q(r2, r0)
            X.Dd0 r0 = X.C62883b4.A01()
            X.DeW r4 = r0.A00()
            r0 = 45
            android.util.SparseArray r1 = r3.A04
            java.lang.String r5 = X.C86114wI.A0m(r1, r0)
            java.lang.String r6 = X.C18230wP.A0o(r3)
            r0 = 42
            java.lang.String r7 = X.C86114wI.A0m(r1, r0)
            r0 = 48
            java.lang.String r8 = X.C86114wI.A0m(r1, r0)
            r0 = 38
            java.lang.String r10 = X.C86114wI.A0m(r1, r0)
            r0 = 44
            java.lang.String r11 = X.C86114wI.A0m(r1, r0)
            r9 = 0
            androidx.fragment.app.Fragment r0 = r4.A08(r5, r6, r7, r8, r9, r10, r11)
            r2.A03 = r0
            r2.A05()
            return r9
        L_0x2337:
            java.lang.String r2 = "ig.action.navigation.OpenReelViewerSettings"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x2358
            androidx.fragment.app.FragmentActivity r2 = A01(r1)
            X.0i6 r0 = X.C63913ic.A0F(r1)
            X.Drz r1 = X.AnonymousClass0wJ.A0Q(r2, r0)
            X.C19554AyF.A02()
            X.1cN r0 = new X.1cN
            r0.<init>()
            java.lang.Object r9 = A07(r0, r1)
            return r9
        L_0x2358:
            java.lang.String r2 = "ig.action.navigation.OpenReportUser"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x2365
            java.lang.Object r9 = X.AnonymousClass2IV.A00(r1, r0)
            return r9
        L_0x2365:
            java.lang.String r2 = "ig.action.navigation.OpenRestrictedAccounts"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x2392
            androidx.fragment.app.FragmentActivity r0 = A01(r1)
            com.instagram.service.session.UserSession r3 = X.C86104wH.A0Y(r1)
            X.Drz r2 = X.C18180wK.A0Q(r0, r3)
            X.JXd r0 = X.C36480JXd.A02
            r0.A01()
            android.os.Bundle r1 = X.C18180wK.A06()
            X.C86134wK.A15(r1, r3)
            com.instagram.wellbeing.restrict.fragment.RestrictHomeFragment r0 = new com.instagram.wellbeing.restrict.fragment.RestrictHomeFragment
            r0.<init>()
            r0.setArguments(r1)
            java.lang.Object r9 = A07(r0, r2)
            return r9
        L_0x2392:
            java.lang.String r2 = "ig.action.navigation.OpenScreen"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x239f
            java.lang.Object r9 = X.AnonymousClass2IW.A00(r1, r0)
            return r9
        L_0x239f:
            java.lang.String r2 = "ig.action.navigation.OpenSearchHistory"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x23c8
            r0 = 1
            X.C04220Ms.A0B(r1, r0)
            android.os.Bundle r3 = X.C18180wK.A06()
            X.6om r0 = X.C111986om.A01
            X.6vI r2 = r0.A00()
            java.lang.String r0 = "activity_center_search_history"
            androidx.fragment.app.Fragment r3 = r2.A01(r3, r0)
            androidx.fragment.app.FragmentActivity r2 = X.C63913ic.A05(r1)
            X.0i6 r0 = X.C63913ic.A0F(r1)
            X.AnonymousClass0wJ.A19(r3, r2, r0)
            r9 = 0
            return r9
        L_0x23c8:
            java.lang.String r2 = "ig.action.navigation.OpenShareOtherApps"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x23e1
            X.Drz r1 = A04(r1)
            com.instagram.util.fragment.IgFragmentFactoryImpl.A00()
            X.1x1 r0 = new X.1x1
            r0.<init>()
            java.lang.Object r9 = A07(r0, r1)
            return r9
        L_0x23e1:
            java.lang.String r2 = "ig.action.navigation.OpenShareSheet"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x23ff
            r0 = 1
            X.C04220Ms.A0B(r1, r0)
            r2 = 2131303917(0x7f091ded, float:1.8225962E38)
            java.lang.Class<X.8j5> r0 = X.AnonymousClass8j5.class
            java.lang.Object r0 = X.C63913ic.A0L(r1, r0, r2)
            X.8j5 r0 = (X.AnonymousClass8j5) r0
            if (r0 == 0) goto L_0x395f
            r0.CVf()
            goto L_0x395f
        L_0x23ff:
            java.lang.String r2 = "ig.action.navigation.OpenShopManagement"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x240c
            java.lang.Object r9 = X.AnonymousClass2IX.A00(r1, r0)
            return r9
        L_0x240c:
            java.lang.String r2 = "ig.action.navigation.OpenShoppingReconDestination"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x2419
            java.lang.Object r9 = X.AnonymousClass6P1.A00(r1, r0)
            return r9
        L_0x2419:
            java.lang.String r2 = "ig.action.navigation.OpenShoppingReconsideration"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x2426
            java.lang.Object r9 = X.AnonymousClass2IY.A00(r1, r0)
            return r9
        L_0x2426:
            java.lang.String r2 = "ig.action.navigation.OpenShopsYouCanTag"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x2447
            java.lang.Object r4 = X.C63893iY.A07(r0)
            java.lang.String r4 = (java.lang.String) r4
            X.Axa r3 = X.C19513Axa.A00
            r0 = 0
            X.C04220Ms.A0B(r1, r0)
            androidx.fragment.app.FragmentActivity r2 = X.C63913ic.A05(r1)
            com.instagram.service.session.UserSession r0 = X.C63913ic.A0J(r1)
            r3.A13(r2, r0, r4)
            r9 = 0
            return r9
        L_0x2447:
            java.lang.String r2 = "ig.action.navigation.OpenSingleMedia"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x247d
            boolean r4 = X.AnonymousClass0wJ.A1Y(r0, r1)
            java.lang.String r3 = X.C63893iY.A0D(r0, r4)
            androidx.fragment.app.FragmentActivity r2 = X.C63913ic.A05(r1)
            X.0i6 r0 = X.C63913ic.A0F(r1)
            com.instagram.service.session.UserSession r0 = X.C05030Qo.A02(r0)
            X.Drz r1 = X.C18180wK.A0Q(r2, r0)
            com.instagram.util.fragment.IgFragmentFactoryImpl.A00()
            X.AxR r0 = new X.AxR
            r0.<init>()
            X.C04220Ms.A0B(r3, r4)
            r0.A04 = r3
            androidx.fragment.app.Fragment r0 = r0.A05()
            java.lang.Object r9 = A07(r0, r1)
            return r9
        L_0x247d:
            java.lang.String r2 = "ig.action.navigation.OpenStoryViewer"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x248a
            java.lang.Object r9 = X.AnonymousClass6P2.A00(r1, r0)
            return r9
        L_0x248a:
            java.lang.String r2 = "ig.action.navigation.OpenStoryViewerWithMediaIDs"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x2497
            java.lang.Object r9 = X.AnonymousClass6P3.A00(r1, r0)
            return r9
        L_0x2497:
            java.lang.String r2 = "ig.action.navigation.OpenSupportInbox"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x24de
            r4 = 1
            X.C04220Ms.A0B(r1, r4)
            X.0i6 r0 = X.C63913ic.A0F(r1)
            com.instagram.service.session.UserSession r3 = X.C05030Qo.A02(r0)
            androidx.fragment.app.FragmentActivity r2 = X.C63913ic.A05(r1)
            X.0kW r1 = X.C63913ic.A0A(r1)
            r9 = 0
            X.C04220Ms.A0B(r2, r4)
            X.AnonymousClass0wJ.A1Q(r3, r1)
            java.lang.String r0 = X.C18230wP.A0n(r1)
            java.util.Map r16 = X.C54372zL.A00(r0)
            java.lang.Integer r13 = X.AnonymousClass006.A01
            r0 = 332(0x14c, float:4.65E-43)
            java.lang.String r14 = X.C18170wI.A00(r0)
            X.1yz r11 = new X.1yz
            r11.<init>()
            X.3ad r5 = new X.3ad
            r6 = r2
            r7 = r9
            r8 = r1
            r10 = r3
            r12 = r9
            r15 = r9
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            r5.A04()
            return r9
        L_0x24de:
            java.lang.String r2 = "ig.action.navigation.OpenSupportInboxV2"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x24eb
            java.lang.Object r9 = X.AnonymousClass2IZ.A00(r1, r0)
            return r9
        L_0x24eb:
            java.lang.String r2 = "ig.action.navigation.OpenSwitchToProfessionalAccount"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x2516
            r0 = 1
            X.C04220Ms.A0B(r1, r0)
            com.instagram.service.session.UserSession r3 = X.C86104wH.A0Y(r1)
            androidx.fragment.app.Fragment r2 = X.C63913ic.A01(r1)
            r0 = 12
            java.lang.String r0 = X.C18170wI.A00(r0)
            X.C04220Ms.A0C(r2, r0)
            X.IcN r2 = (X.C34640IcN) r2
            X.3Vj r1 = new X.3Vj
            r1.<init>(r2, r3)
            X.24p r0 = X.C311924p.INTEREST_ACCOUNT_CONVERSION
            r1.A01(r0)
            r9 = 0
            return r9
        L_0x2516:
            java.lang.String r2 = "ig.action.navigation.OpenTimeReminderSetting"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x2523
            java.lang.Object r9 = X.C34042Ia.A00(r1, r0)
            return r9
        L_0x2523:
            java.lang.String r2 = "ig.action.navigation.OpenTimeReminderSettingV2"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x2530
            java.lang.Object r9 = X.C34052Ib.A00(r1, r0)
            return r9
        L_0x2530:
            java.lang.String r2 = "ig.action.navigation.OpenTimeReminderSettingV3"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x253d
            java.lang.Object r9 = X.C34062Ic.A00(r1, r0)
            return r9
        L_0x253d:
            java.lang.String r2 = "ig.action.navigation.OpenTimeSpent"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x2568
            r0 = 1
            X.C04220Ms.A0B(r1, r0)
            X.0i6 r4 = X.C63913ic.A0F(r1)
            X.3UZ r0 = X.AnonymousClass3UZ.A02
            if (r0 == 0) goto L_0x395f
            X.3IP r3 = r0.A00()
            java.lang.Integer r2 = X.AnonymousClass006.A0C
            com.instagram.service.session.UserSession r0 = X.C05030Qo.A02(r4)
            androidx.fragment.app.Fragment r0 = r3.A02(r0, r2)
            androidx.fragment.app.FragmentActivity r3 = X.C63913ic.A05(r1)
        L_0x2563:
            X.AnonymousClass0wJ.A19(r0, r3, r4)
            goto L_0x395f
        L_0x2568:
            java.lang.String r2 = "ig.action.navigation.OpenTwoFac"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x259f
            androidx.fragment.app.FragmentActivity r2 = A01(r1)
            X.0i6 r0 = X.C63913ic.A0F(r1)
            X.Drz r3 = X.C18180wK.A0Q(r2, r0)
            X.3aT r0 = X.C62653aT.A02
            X.3Hi r2 = r0.A03()
            java.lang.Integer r1 = X.AnonymousClass006.A0Y
            r0 = 0
            androidx.fragment.app.Fragment r0 = r2.A01(r1, r0, r0)
            r3.A03 = r0
            r2 = 19
            r1 = 24
            r0 = 49
            java.lang.String r0 = X.C61983Wp.A01(r2, r1, r0)
            r3.A07 = r0
            r3.A08()
            r3.A05()
            r9 = 0
            return r9
        L_0x259f:
            java.lang.String r2 = "ig.action.navigation.OpenTwoFacV2"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x25ac
            java.lang.Object r9 = X.C34072Id.A00(r1, r0)
            return r9
        L_0x25ac:
            java.lang.String r2 = "ig.action.navigation.OpenUrlSupportsDfa"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x25c1
            boolean r2 = X.AnonymousClass0wJ.A1Y(r0, r1)
            java.lang.String r0 = X.C63893iY.A0D(r0, r2)
            r9 = 0
            X.AnonymousClass2HC.A00(r1, r0, r9, r9)
            return r9
        L_0x25c1:
            java.lang.String r2 = "ig.action.navigation.OpenUrlWithAdTrackingTokenAndAdId"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x25ed
            r2 = 0
            boolean r3 = X.AnonymousClass0wJ.A1Z(r0, r1)
            java.lang.Object r4 = X.C63893iY.A0B(r0, r2)
            r4.getClass()
            java.lang.String r2 = X.C86164wN.A0h(r4)
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r3 = X.C63893iY.A0C(r0, r2, r3)
            java.lang.String r3 = (java.lang.String) r3
            r2 = 2
            java.lang.Object r0 = X.C63893iY.A0B(r0, r2)
            java.lang.String r0 = (java.lang.String) r0
            X.AnonymousClass2HC.A00(r1, r4, r3, r0)
            r9 = 0
            return r9
        L_0x25ed:
            java.lang.String r2 = "ig.action.navigation.OpenVoterInformationCenter"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x2623
            r2 = 0
            boolean r3 = X.AnonymousClass0wJ.A1Z(r0, r1)
            java.util.List r0 = r0.A00
            java.lang.String r2 = X.C18190wL.A0q(r0, r2)
            java.lang.String r6 = X.C18190wL.A0q(r0, r3)
            X.6rV r0 = X.C113486rV.A01
            if (r0 == 0) goto L_0x395f
            X.ItK r4 = X.C101866Sx.A00(r2)
            X.6rV r2 = X.C101876Sy.A00()
            androidx.fragment.app.FragmentActivity r3 = X.C63913ic.A05(r1)
            X.0i6 r0 = X.C63913ic.A0F(r1)
            com.instagram.service.session.UserSession r5 = X.C05030Qo.A02(r0)
            r7 = 0
            r8 = r7
        L_0x261e:
            r2.A01(r3, r4, r5, r6, r7, r8)
            goto L_0x395f
        L_0x2623:
            java.lang.String r2 = "ig.action.navigation.OpenVotingInfoCenterV2"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x265d
            r2 = 0
            boolean r4 = X.AnonymousClass0wJ.A1Z(r0, r1)
            java.util.List r3 = r0.A00
            java.lang.String r2 = X.C18190wL.A0q(r3, r2)
            java.lang.String r6 = X.C18190wL.A0q(r3, r4)
            r0 = 2
            java.lang.String r7 = X.C18190wL.A0q(r3, r0)
            r0 = 3
            java.lang.String r8 = X.C18190wL.A0q(r3, r0)
            X.6rV r0 = X.C113486rV.A01
            if (r0 == 0) goto L_0x395f
            X.ItK r4 = X.C101866Sx.A00(r2)
            X.6rV r2 = X.C101876Sy.A00()
            androidx.fragment.app.FragmentActivity r3 = X.C63913ic.A05(r1)
            X.0i6 r0 = X.C63913ic.A0F(r1)
            com.instagram.service.session.UserSession r5 = X.C05030Qo.A02(r0)
            goto L_0x261e
        L_0x265d:
            java.lang.String r2 = "ig.action.navigation.OpenWebviewUrl"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x266a
            java.lang.Object r9 = X.C34082Ie.A00(r1, r0)
            return r9
        L_0x266a:
            java.lang.String r2 = "ig.action.navigation.OpenWhoCanAddYouToGroups"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x2683
            X.Drz r1 = A04(r1)
            X.C18190wL.A10()
            X.1xd r0 = new X.1xd
            r0.<init>()
            java.lang.Object r9 = A07(r0, r1)
            return r9
        L_0x2683:
            java.lang.String r2 = "ig.action.navigation.OpenYourActivity"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x26ab
            r0 = 0
            X.C04220Ms.A0B(r1, r0)
            X.0i6 r4 = X.C63913ic.A0F(r1)
            com.instagram.service.session.UserSession r2 = X.C05030Qo.A02(r4)
            androidx.fragment.app.FragmentActivity r3 = X.C63913ic.A05(r1)
            X.3UZ r0 = X.AnonymousClass3UZ.A02
            if (r0 == 0) goto L_0x395f
            X.3IP r1 = r0.A00()
            java.lang.Integer r0 = X.AnonymousClass006.A0Y
            androidx.fragment.app.Fragment r0 = r1.A02(r2, r0)
            goto L_0x2563
        L_0x26ab:
            java.lang.String r2 = "ig.action.navigation.OpenYourFollowersCanMessageYou"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x26cb
            androidx.fragment.app.FragmentActivity r2 = A01(r1)
            com.instagram.service.session.UserSession r0 = X.C86104wH.A0Y(r1)
            X.4Kf r1 = new X.4Kf
            r1.<init>(r2, r0)
            r0 = 1138(0x472, float:1.595E-42)
            java.lang.String r0 = X.C18170wI.A00(r0)
            r1.A00(r0)
            r9 = 0
            return r9
        L_0x26cb:
            java.lang.String r2 = "ig.action.navigation.PopBottomSheet"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x26fa
            X.3HX r0 = A05(r1)
            r9 = 0
            if (r0 != 0) goto L_0x26e4
            java.lang.String r1 = "IGBloksActionNavigationPopBottomSheetImpl"
            r0 = 753(0x2f1, float:1.055E-42)
        L_0x26de:
            java.lang.String r0 = X.C18170wI.A00(r0)
            goto L_0x58b2
        L_0x26e4:
            r1 = 2131297646(0x7f09056e, float:1.8213243E38)
            android.util.SparseArray r0 = r0.A01
            java.lang.Object r0 = r0.get(r1)
            X.Jqm r0 = (X.C37383Jqm) r0
            if (r0 != 0) goto L_0x695c
            r0 = 607(0x25f, float:8.5E-43)
            java.lang.String r1 = X.C18170wI.A00(r0)
            r0 = 618(0x26a, float:8.66E-43)
            goto L_0x26de
        L_0x26fa:
            java.lang.String r2 = "ig.action.navigation.PresentModalWithResult"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x2739
            java.lang.Object r3 = X.C63893iY.A07(r0)
            X.7h3 r3 = (X.C127397h3) r3
            java.lang.Object r2 = X.C63893iY.A08(r0)
            java.util.Map r2 = (java.util.Map) r2
            java.util.HashMap r10 = X.C63913ic.A0N(r2)
            r2 = 2
            java.lang.Object r0 = X.C63893iY.A0B(r0, r2)
            if (r0 != 0) goto L_0x2734
            r2 = 0
        L_0x271a:
            r0 = 0
            X.C04220Ms.A0B(r1, r0)
            X.0i6 r8 = X.C63913ic.A0F(r1)
            androidx.fragment.app.FragmentActivity r4 = X.C63913ic.A05(r1)
            r0 = 1245(0x4dd, float:1.745E-42)
            java.lang.String r9 = X.C18170wI.A00(r0)
            r5 = r1
            r6 = r3
            r7 = r2
            X.C34092If.A00(r4, r5, r6, r7, r8, r9, r10)
            r9 = 0
            return r9
        L_0x2734:
            X.6eC r0 = (X.C105916eC) r0
            X.6jp r2 = r0.A00
            goto L_0x271a
        L_0x2739:
            java.lang.String r2 = "ig.action.navigation.PresentModalWithModalObject"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x2772
            java.lang.Object r3 = X.C63893iY.A07(r0)
            X.7h3 r3 = (X.C127397h3) r3
            java.lang.Object r2 = X.C63893iY.A08(r0)
            java.util.Map r2 = (java.util.Map) r2
            java.util.HashMap r10 = X.C63913ic.A0N(r2)
            java.lang.Object r2 = X.C63893iY.A09(r0)
            X.7h3 r2 = (X.C127397h3) r2
            r0 = 0
            X.C04220Ms.A0B(r1, r0)
            X.0i6 r8 = X.C63913ic.A0F(r1)
            androidx.fragment.app.FragmentActivity r4 = X.C63913ic.A05(r1)
            java.lang.String r9 = X.C127397h3.A0C(r2)
            X.6jp r7 = X.C127397h3.A08(r2)
            r5 = r1
            r6 = r3
            X.C34092If.A00(r4, r5, r6, r7, r8, r9, r10)
            r9 = 0
            return r9
        L_0x2772:
            java.lang.String r2 = "ig.action.navigation.PushBottomSheet"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x279c
            java.lang.Object r3 = X.C63893iY.A07(r0)
            X.7h3 r3 = (X.C127397h3) r3
            r2 = 1
            boolean r10 = X.AnonymousClass3WF.A01(r0, r2)
            X.3HX r6 = X.C63913ic.A0D(r1)
            X.7qT r5 = X.C63913ic.A08(r1)
            r0 = 0
            X.C04220Ms.A0B(r1, r0)
            androidx.fragment.app.FragmentActivity r4 = X.C63913ic.A05(r1)
            r9 = 0
            r7 = r1
            r8 = r3
            X.M6q.A0B(r4, r5, r6, r7, r8, r9, r10)
            return r9
        L_0x279c:
            java.lang.String r2 = "ig.action.navigation.ResumeStoryPlayback"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L_0x3930
            java.lang.String r2 = "ig.action.navigation.SetNavBarButtonEnabled"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x27b1
            java.lang.Object r9 = X.C34102Ig.A00(r1, r0)
            return r9
        L_0x27b1:
            java.lang.String r2 = "ig.action.navigation.UpdateCommentAudienceControl"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x27d9
            com.instagram.service.session.UserSession r2 = X.C63913ic.A0J(r1)
            r1 = 0
            java.lang.Object r1 = X.C63893iY.A0B(r0, r1)
            com.instagram.user.model.User r2 = X.AnonymousClass0wJ.A0Y(r2)
            java.util.Map r0 = com.instagram.api.schemas.CommentAudienceControlType.A01
            java.lang.Object r1 = r0.get(r1)
            com.instagram.api.schemas.CommentAudienceControlType r1 = (com.instagram.api.schemas.CommentAudienceControlType) r1
            if (r1 != 0) goto L_0x27d2
            com.instagram.api.schemas.CommentAudienceControlType r1 = com.instagram.api.schemas.CommentAudienceControlType.UNRECOGNIZED
        L_0x27d2:
            X.MeW r0 = r2.A05
            r0.Chj(r1)
            r9 = 0
            return r9
        L_0x27d9:
            java.lang.String r2 = "ig.action.navigation.UpdateCustomTitle"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x27e6
            java.lang.Object r9 = X.C34112Ih.A00(r1, r0)
            return r9
        L_0x27e6:
            java.lang.String r2 = "ig.action.navigation.UpdateMentionsSetting"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x280c
            boolean r3 = X.AnonymousClass0wJ.A1Y(r0, r1)
            X.0i6 r1 = X.C63913ic.A0F(r1)
            com.instagram.service.session.UserSession r2 = X.C05030Qo.A02(r1)
            java.lang.String r1 = X.C63893iY.A0D(r0, r3)
            com.instagram.user.model.User r0 = X.AnonymousClass0wJ.A0Y(r2)
            X.C04220Ms.A0B(r1, r3)
            X.MeW r0 = r0.A05
            r0.Chh(r1)
            r9 = 0
            return r9
        L_0x280c:
            java.lang.String r2 = "ig.action.navigation.UpdateTagsSetting"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x2832
            boolean r3 = X.AnonymousClass0wJ.A1Y(r0, r1)
            X.0i6 r1 = X.C63913ic.A0F(r1)
            com.instagram.service.session.UserSession r2 = X.C05030Qo.A02(r1)
            java.lang.String r1 = X.C63893iY.A0D(r0, r3)
            com.instagram.user.model.User r0 = X.AnonymousClass0wJ.A0Y(r2)
            X.C04220Ms.A0B(r1, r3)
            X.MeW r0 = r0.A05
            r0.Chi(r1)
            r9 = 0
            return r9
        L_0x2832:
            java.lang.String r2 = "ig.action.navigation.UpdateTitle"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x285b
            boolean r2 = X.AnonymousClass0wJ.A1Y(r0, r1)
            java.lang.String r2 = X.C63893iY.A0D(r0, r2)
            androidx.fragment.app.Fragment r1 = X.C63913ic.A01(r1)
            boolean r0 = r1 instanceof X.AnonymousClass1c8
            if (r0 == 0) goto L_0x395f
            X.1c8 r1 = (X.AnonymousClass1c8) r1
            com.instagram.bloks.hosting.IgBloksScreenConfig r0 = r1.A0A
            r0.A0S = r2
            androidx.fragment.app.FragmentActivity r0 = r1.A03
            X.E2V r0 = X.E2V.A03(r0)
            r0.setTitle(r2)
            goto L_0x395f
        L_0x285b:
            java.lang.String r2 = "ig.action.navigation.UpdateWhatsAppNumber"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x2878
            r0 = 1
            X.C04220Ms.A0B(r1, r0)
            X.0i6 r0 = X.C63913ic.A0F(r1)
            com.instagram.service.session.UserSession r2 = X.C05030Qo.A02(r0)
            X.3hI r1 = X.C67023yk.A00
            java.lang.Class<X.7db> r0 = X.C125607db.class
            r1.A07(r2, r0)
            r9 = 0
            return r9
        L_0x2878:
            java.lang.String r2 = "ig.action.negative_action.RestrictUserV2"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x2887
            X.3Tr r2 = X.C61503Tr.A00
            java.lang.Object r9 = r2.A00(r1, r0)
            return r9
        L_0x2887:
            java.lang.String r2 = "ig.action.negative_action.SingleBlockUser"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x2896
            X.77E r2 = X.AnonymousClass77E.A00
            java.lang.Object r9 = r2.A00(r1, r0)
            return r9
        L_0x2896:
            java.lang.String r2 = "ig.action.netego_extension_context.GetPercentVisible"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x28b1
            java.lang.Object r1 = X.C86124wJ.A0m(r0)
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.bloks.common.NetegoExtensionContext"
            X.C04220Ms.A0C(r1, r0)
            X.6di r1 = (X.C105616di) r1
            float r0 = r1.A00
            double r0 = (double) r0
            java.lang.Number r9 = X.AnonymousClass3WF.A00(r0)
            return r9
        L_0x28b1:
            java.lang.String r2 = "ig.action.network.GetLastMeasuredBandwidth"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x28c7
            X.KGk r0 = X.C38014KGk.A00()
            double r2 = r0.A02()
            long r0 = (long) r2
            java.lang.Long r9 = java.lang.Long.valueOf(r0)
            return r9
        L_0x28c7:
            java.lang.String r2 = "ig.action.network.GetLastMeasuredBandwidthExperimental"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x28d6
            X.KGk r0 = X.C38014KGk.A00()
            monitor-enter(r0)
            goto L_0x6960
        L_0x28d6:
            java.lang.String r2 = "ig.action.network.GetNetworkType"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x28ed
            android.net.NetworkInfo r0 = X.AnonymousClass0fS.A00()
            X.0fT r0 = X.AnonymousClass0fS.A03(r0)
            java.lang.Integer r0 = r0.A01
            java.lang.String r9 = X.AnonymousClass0fV.A00(r0)
            return r9
        L_0x28ed:
            java.lang.String r2 = "ig.action.network.IsConnected"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x2902
            android.content.Context r0 = X.C18230wP.A08()
            boolean r0 = X.AnonymousClass0fS.A0A(r0)
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r0)
            return r9
        L_0x2902:
            java.lang.String r2 = "ig.action.OpenAdRatingSurvey"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x2930
            r3 = 1
            X.C04220Ms.A0B(r1, r3)
            X.0i6 r2 = X.C63913ic.A0F(r1)
            X.C18200wM.A1R(r2)
            androidx.fragment.app.FragmentActivity r0 = X.C63913ic.A05(r1)
            X.Drz r2 = X.C18180wK.A0Q(r0, r2)
            com.instagram.util.fragment.IgFragmentFactoryImpl r1 = com.instagram.util.fragment.IgFragmentFactoryImpl.A00()
            java.lang.String r0 = "raters"
            r9 = 0
            androidx.fragment.app.Fragment r0 = r1.A03(r0, r9)
            r2.A03 = r0
            r2.A0D = r3
            r2.A05()
            return r9
        L_0x2930:
            java.lang.String r2 = "ig.action.OpenAppUpdatesScreen"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x293d
            java.lang.Object r9 = X.C34122Ii.A00(r1)
            return r9
        L_0x293d:
            java.lang.String r2 = "ig.action.OpenOrganicLeadGenCreationFlow"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x2990
            r17 = 0
            boolean r6 = X.AnonymousClass0wJ.A1Z(r0, r1)
            androidx.fragment.app.FragmentActivity r5 = X.C63913ic.A05(r1)
            X.0i6 r4 = X.C63913ic.A0F(r1)
            X.C18200wM.A1R(r4)
            java.util.List r1 = r0.A00
            java.lang.String r3 = X.C18190wL.A0q(r1, r6)
            r0 = 2
            java.lang.String r0 = X.C18190wL.A0q(r1, r0)
            if (r0 != 0) goto L_0x298b
            r2 = 0
        L_0x2964:
            X.DeW r1 = X.C86144wL.A0U()
            X.9vb r10 = X.C170809vb.A04
            r9 = 0
            java.lang.String r11 = ""
            java.util.ArrayList r15 = X.AnonymousClass0wJ.A0v()
            com.instagram.leadgen.organic.model.LeadGenFormData r0 = new com.instagram.leadgen.organic.model.LeadGenFormData
            r8 = r0
            r12 = r11
            r13 = r11
            r14 = r9
            r16 = r6
            r18 = r17
            r19 = r17
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            if (r3 != 0) goto L_0x2983
            r3 = r11
        L_0x2983:
            androidx.fragment.app.Fragment r0 = r1.A04(r2, r0, r3)
            X.AnonymousClass0wJ.A19(r0, r5, r4)
            return r9
        L_0x298b:
            com.instagram.common.typedurl.SimpleImageUrl r2 = X.C18250wR.A0K(r0)
            goto L_0x2964
        L_0x2990:
            java.lang.String r2 = "ig.action.OpenUnfollowChaining"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x29a2
            boolean r6 = X.AnonymousClass0wJ.A1Y(r0, r1)
            java.lang.String r0 = X.C63893iY.A0D(r0, r6)
            goto L_0x6969
        L_0x29a2:
            java.lang.String r2 = "ig.action.perf.AnnotateTTIEvent"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x29db
            java.lang.Object r1 = X.C63893iY.A07(r0)
            java.util.Map r1 = (java.util.Map) r1
            java.lang.Object r0 = X.C63893iY.A08(r0)
            int r5 = X.AnonymousClass0wJ.A04(r0)
            java.util.HashMap r0 = X.C63913ic.A0N(r1)
            java.util.Iterator r4 = X.C18190wL.A0u(r0)
        L_0x29c0:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x395f
            java.util.Map$Entry r0 = X.C18180wK.A0o(r4)
            java.lang.String r3 = X.C18200wM.A0p(r0)
            java.lang.String r2 = X.C18230wP.A0u(r0)
            r1 = 719983200(0x2aea1260, float:4.15795E-13)
            X.01V r0 = X.AnonymousClass01V.A0p
            r0.markerAnnotate((int) r1, (int) r5, (java.lang.String) r3, (java.lang.String) r2)
            goto L_0x29c0
        L_0x29db:
            java.lang.String r2 = "ig.action.perf.AnnotateTTIEventV2"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x2a19
            java.lang.Object r1 = X.C63893iY.A07(r0)
            int r5 = X.AnonymousClass0wJ.A04(r1)
            java.lang.Object r1 = X.C63893iY.A08(r0)
            int r4 = X.AnonymousClass0wJ.A04(r1)
            java.lang.Object r0 = X.C63893iY.A09(r0)
            java.util.Map r0 = (java.util.Map) r0
            java.util.HashMap r0 = X.C63913ic.A0N(r0)
            java.util.Iterator r3 = X.C18190wL.A0u(r0)
        L_0x2a01:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x395f
            java.util.Map$Entry r0 = X.C18180wK.A0o(r3)
            java.lang.String r2 = X.C18200wM.A0p(r0)
            java.lang.String r1 = X.C18230wP.A0u(r0)
            X.01V r0 = X.AnonymousClass01V.A0p
            r0.markerAnnotate((int) r5, (int) r4, (java.lang.String) r2, (java.lang.String) r1)
            goto L_0x2a01
        L_0x2a19:
            java.lang.String r2 = "ig.action.perf.EndTTIEvent"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x2a5d
            java.lang.Object r1 = X.C63893iY.A07(r0)
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r0 = X.C63893iY.A08(r0)
            int r3 = X.AnonymousClass0wJ.A04(r0)
            java.lang.String r0 = "success"
            boolean r0 = r1.equals(r0)
            r2 = 719983200(0x2aea1260, float:4.15795E-13)
            if (r0 == 0) goto L_0x2a41
            X.7qa r0 = X.C130677qa.A01
            r0.AKf(r2, r3)
            goto L_0x395f
        L_0x2a41:
            java.lang.String r0 = "failure"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x2a51
            X.01V r1 = X.AnonymousClass01V.A0p
            r0 = 3
        L_0x2a4c:
            r1.markerEnd(r2, r3, r0)
            goto L_0x395f
        L_0x2a51:
            java.lang.String r0 = "cancel"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x395f
            X.01V r1 = X.AnonymousClass01V.A0p
            r0 = 4
            goto L_0x2a4c
        L_0x2a5d:
            java.lang.String r2 = "ig.action.perf.EndTTIEventV2"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x2a85
            java.lang.Object r1 = X.C63893iY.A07(r0)
            int r3 = X.AnonymousClass0wJ.A04(r1)
            java.lang.Object r1 = X.C63893iY.A08(r0)
            int r2 = X.AnonymousClass0wJ.A04(r1)
            java.lang.Object r0 = X.C63893iY.A09(r0)
            int r0 = X.AnonymousClass0wJ.A04(r0)
            X.01V r1 = X.AnonymousClass01V.A0p
            short r0 = (short) r0
            r1.markerEnd(r3, r2, r0)
            r9 = 0
            return r9
        L_0x2a85:
            java.lang.String r2 = "ig.action.perf.StartTTIEvent"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x2ab7
            r1 = 0
            X.C04220Ms.A0B(r0, r1)
            java.lang.String r3 = X.C63893iY.A0D(r0, r1)
            r1 = 1
            java.lang.Object r0 = X.C63893iY.A0A(r0, r1)
            int r4 = X.AnonymousClass0wJ.A04(r0)
            r2 = 719983200(0x2aea1260, float:4.15795E-13)
            X.01V r1 = X.AnonymousClass01V.A0p
            java.lang.String r0 = "product"
            r1.markerStart((int) r2, (int) r4, (java.lang.String) r0, (java.lang.String) r3)
            android.os.Handler r3 = X.C130677qa.A00
            X.7zs r2 = new X.7zs
            r2.<init>(r4)
            r0 = 60000(0xea60, double:2.9644E-319)
            r3.postDelayed(r2, r0)
            r9 = 0
            return r9
        L_0x2ab7:
            java.lang.String r2 = "ig.action.privacy.GetHasHiddenWordsGlobalEnabled"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x2ad0
            r0 = 1
            X.C04220Ms.A0B(r1, r0)
            com.instagram.service.session.UserSession r0 = X.C86104wH.A0Y(r1)
            com.instagram.user.model.User r0 = X.AnonymousClass0wJ.A0Y(r0)
            java.lang.Boolean r9 = r0.A0j()
            return r9
        L_0x2ad0:
            java.lang.String r2 = "ig.action.privacy.GetIsHideMoreCommentEnabled"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x2ae9
            r0 = 1
            X.C04220Ms.A0B(r1, r0)
            com.instagram.service.session.UserSession r0 = X.C86104wH.A0Y(r1)
            com.instagram.user.model.User r0 = X.AnonymousClass0wJ.A0Y(r0)
            java.lang.Boolean r9 = r0.A0i()
            return r9
        L_0x2ae9:
            java.lang.String r2 = "ig.action.privacy.GetPeerDeviceSecurityAlertsAreOn"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x2b1e
            r11 = 0
            X.6jp r12 = X.C63893iY.A06(r0, r11)
            java.lang.Object r16 = X.C63893iY.A08(r0)
            com.instagram.service.session.UserSession r4 = X.C63913ic.A0J(r1)
            r9 = 0
            X.Jil r3 = new X.Jil
            r3.<init>(r9)
            java.lang.String r0 = "IGBloksActionPrivacyGetPeerDeviceSecurityAlertsAreOn"
            X.H89 r0 = X.H89.A01(r4, r0)
            X.Gh5 r2 = r0.A03
            X.FzX r0 = X.GZ3.A00
            X.Gh5 r0 = r2.A0J(r0)
            com.facebook.redex.IDxConsumerShape16S0500000_5_I2 r10 = new com.facebook.redex.IDxConsumerShape16S0500000_5_I2
            r13 = r3
            r14 = r1
            r15 = r4
            r10.<init>(r11, r12, r13, r14, r15, r16)
            r3.A02(r10, r0)
            return r9
        L_0x2b1e:
            java.lang.String r2 = "ig.action.privacy.GetSecurityAlertsAreOn"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x2b52
            r2 = 0
            X.6jp r5 = X.C63893iY.A06(r0, r2)
            java.lang.Object r4 = X.C63893iY.A08(r0)
            X.3HX r4 = (X.AnonymousClass3HX) r4
            com.instagram.service.session.UserSession r2 = X.C63913ic.A0J(r1)
            r9 = 0
            X.Jil r3 = new X.Jil
            r3.<init>(r9)
            java.lang.String r0 = "IGBloksActionPrivacyGetSecurityAlertsAreOn"
            X.H89 r0 = X.H89.A01(r2, r0)
            X.Gh5 r2 = r0.A03
            X.FzX r0 = X.GZ3.A00
            X.Gh5 r2 = r2.A0J(r0)
            X.H54 r0 = new X.H54
            r0.<init>(r4, r1, r5, r3)
            r3.A02(r0, r2)
            return r9
        L_0x2b52:
            java.lang.String r2 = "ig.action.privacy.limit.GetReminderDayDescription"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x2b5f
            java.lang.Object r9 = X.C34132Ij.A00(r1, r0)
            return r9
        L_0x2b5f:
            java.lang.String r2 = "ig.action.privacy.limit.SetLimitedInteractionsEnabled"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x2b82
            boolean r2 = X.AnonymousClass0wJ.A1Y(r0, r1)
            com.instagram.service.session.UserSession r1 = X.C86104wH.A0Y(r1)
            boolean r2 = X.AnonymousClass3WF.A01(r0, r2)
            com.instagram.user.model.User r0 = X.AnonymousClass0wJ.A0Y(r1)
            X.MeW r1 = r0.A05
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
            r1.CmX(r0)
            r9 = 0
            return r9
        L_0x2b82:
            java.lang.String r2 = "ig.action.privacy.OpenBlocklist"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x2b8f
            java.lang.Object r9 = X.C34142Ik.A00(r1, r0)
            return r9
        L_0x2b8f:
            java.lang.String r2 = "ig.action.privacy.PresentLimitsSettingReminder"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x2bbe
            r2 = 0
            boolean r4 = X.AnonymousClass0wJ.A1Z(r0, r1)
            X.3HX r7 = r1.A00
            java.lang.Object r2 = X.C63893iY.A0A(r0, r2)
            long r2 = X.C18190wL.A08(r2)
            X.6jp r6 = X.C63893iY.A06(r0, r4)
            X.0i6 r5 = X.C63913ic.A0F(r1)
            X.C18200wM.A1R(r5)
            r9 = 0
            if (r7 == 0) goto L_0x0012
            X.6Z2 r0 = X.AnonymousClass6Z2.A00
            if (r0 != 0) goto L_0x6992
            java.lang.String r0 = "plugin"
            X.C04220Ms.A0E(r0)
            throw r9
        L_0x2bbe:
            java.lang.String r2 = "ig.action.privacy.ProAccountSafetyStepViewControllerDidSaveSettingsDelegate"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x2bcb
            java.lang.Object r9 = X.C34152Il.A00(r1, r0)
            return r9
        L_0x2bcb:
            java.lang.String r2 = "ig.action.privacy.SetActivityStatus"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x2bd8
            java.lang.Object r9 = X.C34162Im.A00(r1, r0)
            return r9
        L_0x2bd8:
            java.lang.String r2 = "ig.action.privacy.SetCoPresenceStatus"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x2be5
            java.lang.Object r9 = X.C34172In.A00(r1, r0)
            return r9
        L_0x2be5:
            java.lang.String r2 = "ig.action.privacy.SetHasHiddenWordsGlobalEnabled"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x2bf2
            java.lang.Object r9 = X.C34182Io.A00(r1, r0)
            return r9
        L_0x2bf2:
            java.lang.String r2 = "ig.action.privacy.SetIsHideMoreCommentEnabled"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x2c13
            boolean r2 = X.AnonymousClass0wJ.A1Y(r0, r1)
            com.instagram.service.session.UserSession r1 = X.C86104wH.A0Y(r1)
            boolean r0 = X.AnonymousClass3WF.A01(r0, r2)
            com.instagram.user.model.User r1 = X.AnonymousClass0wJ.A0Y(r1)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r1.A27(r0)
            r9 = 0
            return r9
        L_0x2c13:
            java.lang.String r2 = "ig.action.privacy.SetPeerDeviceSecurityAlertSetting"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x2c48
            r4 = 0
            java.lang.Object r3 = X.C63893iY.A0B(r0, r4)
            r3.getClass()
            com.instagram.service.session.UserSession r1 = X.C63913ic.A0J(r1)
            r9 = 0
            X.Jil r2 = new X.Jil
            r2.<init>(r9)
            java.lang.String r0 = "IGBloksActionPrivacySetPeerDeviceSecurityAlertSetting"
            X.H89 r0 = X.H89.A01(r1, r0)
            X.Gh5 r0 = r0.A03
            X.Gh5 r1 = r0.A0B()
            X.FzX r0 = X.GZ3.A00
            X.Gh5 r1 = r1.A0J(r0)
            com.facebook.redex.IDxConsumerShape379S0100000_5_I2 r0 = new com.facebook.redex.IDxConsumerShape379S0100000_5_I2
            r0.<init>((java.lang.Object) r3, (int) r4)
            r2.A02(r0, r1)
            return r9
        L_0x2c48:
            java.lang.String r2 = "ig.action.privacy.SetSecurityAlertSetting"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x2c79
            r4 = 0
            java.lang.Object r3 = X.C63893iY.A0B(r0, r4)
            r3.getClass()
            com.instagram.service.session.UserSession r1 = X.C63913ic.A0J(r1)
            r9 = 0
            X.Jil r2 = new X.Jil
            r2.<init>(r9)
            java.lang.String r0 = "IGBloksActionPrivacySetSecurityAlertSetting"
            X.H89 r0 = X.H89.A01(r1, r0)
            X.Gh5 r1 = r0.A03
            X.FzX r0 = X.GZ3.A00
            X.Gh5 r1 = r1.A0J(r0)
            com.facebook.redex.IDxConsumerShape144S0200000_5_I2 r0 = new com.facebook.redex.IDxConsumerShape144S0200000_5_I2
            r0.<init>(r4, r2, r3)
            r2.A02(r0, r1)
            return r9
        L_0x2c79:
            java.lang.String r2 = "ig.action.privacy.UnpauseActivityStatus"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x2c86
            java.lang.Object r9 = X.AnonymousClass3XH.A00(r1, r0)
            return r9
        L_0x2c86:
            java.lang.String r2 = "ig.action.ptrcontainer.GetIsRefreshing"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x2ca9
            r2 = 0
            java.lang.Object r1 = X.C63893iY.A0B(r0, r2)
            X.7h3 r1 = (X.C127397h3) r1
            java.lang.Object r0 = X.C63893iY.A08(r0)
            X.3HX r0 = (X.AnonymousClass3HX) r0
            if (r1 == 0) goto L_0x3f5c
            java.lang.Object r0 = X.AnonymousClass7K7.A04(r0, r1)
            X.7qb r0 = (X.C130687qb) r0
            if (r0 == 0) goto L_0x3f5c
            boolean r0 = r0.A01
            goto L_0x3f59
        L_0x2ca9:
            java.lang.String r2 = "ig.action.quickpromotion.DismissQuickPromotion"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x2ccb
            r0 = 1
            X.C04220Ms.A0B(r1, r0)
            r2 = 2131297503(0x7f0904df, float:1.8212953E38)
            java.lang.Class<X.3Ai> r0 = X.C57253Ai.class
            java.lang.Object r5 = X.C63913ic.A0L(r1, r0, r2)
            X.3Ai r5 = (X.C57253Ai) r5
            if (r5 == 0) goto L_0x395f
        L_0x2cc2:
            X.4tx r1 = r5.A02
            X.4o8 r0 = r5.A01
            r1.CEA(r0)
            goto L_0x395f
        L_0x2ccb:
            java.lang.String r2 = "ig.action.quickpromotion.HandleQuickPromotionActionClick"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x2d02
            boolean r4 = X.AnonymousClass0wJ.A1Z(r0, r1)
            r3 = 2131297503(0x7f0904df, float:1.8212953E38)
            java.lang.Class<X.3Ai> r2 = X.C57253Ai.class
            java.lang.Object r5 = X.C63913ic.A0L(r1, r2, r3)
            X.3Ai r5 = (X.C57253Ai) r5
            if (r5 == 0) goto L_0x395f
            java.util.List r1 = r0.A00
            int r1 = r1.size()
            if (r1 <= r4) goto L_0x395f
            java.lang.String r0 = X.C63893iY.A0D(r0, r4)
            java.lang.Integer r3 = X.AnonymousClass2SZ.A00(r0)
            java.lang.Integer r0 = X.AnonymousClass006.A0N
            if (r3 == r0) goto L_0x2cc2
            X.4tx r2 = r5.A02
            X.4o8 r1 = r5.A01
            r0 = 0
            r2.CE9(r1, r3, r0)
            goto L_0x395f
        L_0x2d02:
            java.lang.String r2 = "ig.action.quickpromotion.HandleQuickPromotionButtonClick"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x2d0f
            java.lang.Object r9 = X.C34192Ip.A00(r1, r0)
            return r9
        L_0x2d0f:
            java.lang.String r2 = "ig.action.remove_personal_ads_link.RemoveAdsLink"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x2d32
            r0 = 1
            X.C04220Ms.A0B(r1, r0)
            com.instagram.service.session.UserSession r2 = X.C86104wH.A0Y(r1)
            X.0aP r0 = X.C04620Ok.A00(r2)
            com.instagram.user.model.User r1 = r0.A00
            r9 = 0
            X.MeW r0 = r1.A05
            r0.Cnt(r9)
            r0.Cnu(r9)
            r1.A1t(r2)
            return r9
        L_0x2d32:
            java.lang.String r2 = "ig.action.RemoveValueFromLocalDeviceCache"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x2d61
            boolean r2 = X.AnonymousClass0wJ.A1Y(r0, r1)
            java.lang.String r2 = X.C63893iY.A0D(r0, r2)
            X.0i6 r1 = X.C63913ic.A0F(r1)
            boolean r0 = r1 instanceof com.instagram.service.session.UserSession
            r9 = 0
            if (r0 == 0) goto L_0x69b8
            com.instagram.service.session.UserSession r1 = (com.instagram.service.session.UserSession) r1
            if (r1 == 0) goto L_0x69b8
            X.49q r1 = X.AnonymousClass3Zs.A03(r1)
            X.D2R r0 = X.D2R.A2Z
            android.content.SharedPreferences r0 = r1.A01(r0)
            android.content.SharedPreferences$Editor r0 = r0.edit()
            X.C18180wK.A0u(r0, r2)
            return r9
        L_0x2d61:
            java.lang.String r2 = "bk.action.rp.cowatch.PlayMedia"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x2d70
            X.3Ts r1 = X.C61513Ts.A00
            java.lang.Object r9 = r1.A00(r0)
            return r9
        L_0x2d70:
            java.lang.String r2 = "ig.action.search.MergeResults"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x2da8
            r1 = 0
            X.C04220Ms.A0B(r0, r1)
            X.7h3 r2 = X.C63893iY.A03(r0, r1)
            java.lang.Object r6 = X.C63893iY.A08(r0)
            r1 = 413(0x19d, float:5.79E-43)
            java.lang.String r1 = X.AnonymousClass000.A00(r1)
            X.C04220Ms.A0C(r6, r1)
            r5 = 2
            X.3HX r0 = X.C63893iY.A01(r0, r5)
            X.7HV r4 = X.AnonymousClass7K7.A01(r0)
            int r0 = r2.A02
            long r2 = (long) r0
            com.instagram.common.bloks.mutations.IDxUOperationShape121S0100000_2_I2 r1 = new com.instagram.common.bloks.mutations.IDxUOperationShape121S0100000_2_I2
            r1.<init>(r6, r5)
            X.7r4 r0 = new X.7r4
            r0.<init>(r2)
            r4.A0A(r0, r1)
            r9 = 0
            return r9
        L_0x2da8:
            java.lang.String r2 = "ig.action.SetBoolInLocalDeviceCache"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x2e02
            r5 = 0
            boolean r2 = X.AnonymousClass0wJ.A1Z(r0, r1)
            java.lang.String r4 = X.C63893iY.A0D(r0, r5)
            boolean r3 = X.AnonymousClass3WF.A01(r0, r2)
            java.lang.Object r2 = X.C63893iY.A09(r0)
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.Boolean"
            X.C04220Ms.A0C(r2, r0)
            boolean r0 = X.AnonymousClass0wJ.A1X(r2)
            r9 = 0
            if (r0 == 0) goto L_0x2deb
            androidx.fragment.app.FragmentActivity r2 = X.C63913ic.A05(r1)
            java.lang.String r1 = r2.getPackageName()
            r0 = 753(0x2f1, float:1.055E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            java.lang.String r0 = X.AnonymousClass00U.A0L(r1, r0)
            android.content.SharedPreferences r0 = r2.getSharedPreferences(r0, r5)
        L_0x2de3:
            android.content.SharedPreferences$Editor r0 = r0.edit()
            X.AnonymousClass0wJ.A13(r0, r4, r3)
            return r9
        L_0x2deb:
            X.0i6 r1 = X.C63913ic.A0F(r1)
            boolean r0 = r1 instanceof com.instagram.service.session.UserSession
            if (r0 == 0) goto L_0x69c3
            com.instagram.service.session.UserSession r1 = (com.instagram.service.session.UserSession) r1
            if (r1 == 0) goto L_0x69c3
            X.49q r1 = X.AnonymousClass3Zs.A03(r1)
            X.D2R r0 = X.D2R.A2Z
            android.content.SharedPreferences r0 = r1.A01(r0)
            goto L_0x2de3
        L_0x2e02:
            java.lang.String r2 = "ig.action.SetFloatInLocalDeviceCache"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x2e0f
            java.lang.Object r9 = X.C34202Iq.A00(r1, r0)
            return r9
        L_0x2e0f:
            java.lang.String r2 = "ig.action.SetIntInLocalDeviceCache"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x2e1c
            java.lang.Object r9 = X.C34212Ir.A00(r1, r0)
            return r9
        L_0x2e1c:
            java.lang.String r2 = "ig.action.SetStringInLocalDeviceCache"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x2e29
            java.lang.Object r9 = X.C34222Is.A00(r1, r0)
            return r9
        L_0x2e29:
            java.lang.String r2 = "ig.action.settings.OpenSingleMedia"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x2e38
            X.Ar9 r2 = X.C19132Ar9.A00
            java.lang.Object r9 = r2.A00(r1, r0)
            return r9
        L_0x2e38:
            java.lang.String r2 = "ig.action.SignOut"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x2e69
            androidx.fragment.app.FragmentActivity r3 = A01(r1)
            X.0i6 r7 = X.C63913ic.A0F(r1)
            X.C18200wM.A1R(r7)
            com.instagram.service.session.UserSession r7 = (com.instagram.service.session.UserSession) r7
            androidx.fragment.app.Fragment r2 = X.C63913ic.A01(r1)
            X.0kW r6 = X.C63913ic.A0A(r1)
            X.0m7 r4 = X.C63913ic.A07(r1)
            X.06E r5 = X.AnonymousClass06E.A00(r2)
            X.3iC r1 = new X.3iC
            r1.<init>(r2, r3, r4, r5, r6, r7)
            java.lang.Integer r0 = X.AnonymousClass006.A00
            r1.A0C(r0)
            r9 = 0
            return r9
        L_0x2e69:
            java.lang.String r2 = "ig.action.string.StringPrintf"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x2e85
            java.lang.Object r3 = X.C63893iY.A07(r0)
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r2 = "(%\\d)"
            java.lang.String r1 = "$0\\$s"
            java.lang.String r9 = r3.replaceAll(r2, r1)
            java.util.ArrayList r2 = X.AnonymousClass0wJ.A0v()
            goto L_0x69ce
        L_0x2e85:
            java.lang.String r2 = "ig.action.string.ValidateEmail"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x2e9f
            r2 = 0
            X.C04220Ms.A0B(r0, r2)
            java.lang.Object r0 = X.C63893iY.A0B(r0, r2)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L_0x3f5c
            boolean r2 = X.AnonymousClass0hA.A09(r0)
            goto L_0x3f5c
        L_0x2e9f:
            java.lang.String r2 = "ig.action.survey.shops.MarkSearchUpdatedMiniShopsExitV1"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x2ec3
            r2 = 0
            java.lang.Object r2 = X.C63893iY.A0B(r0, r2)
            if (r2 == 0) goto L_0x395f
            com.instagram.service.session.UserSession r0 = X.C63913ic.A0J(r1)
            X.7tI r1 = X.AnonymousClass6VG.A00(r0)
            java.lang.String r0 = r1.A02
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x395f
            r0 = 1
            r1.A05 = r0
            goto L_0x395f
        L_0x2ec3:
            java.lang.String r2 = "ig.action.survey.shops.PauseMiniShopsExitV1"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x2ef7
            r2 = 0
            java.lang.Object r2 = X.C63893iY.A0B(r0, r2)
            if (r2 == 0) goto L_0x395f
            com.instagram.service.session.UserSession r5 = X.C63913ic.A0J(r1)
            X.7tI r4 = X.AnonymousClass6VG.A00(r5)
            java.lang.String r0 = r4.A02
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x2eeb
            long r2 = r4.A01
            long r0 = java.lang.System.currentTimeMillis()
            long r2 = r2 + r0
            r4.A01 = r2
        L_0x2eeb:
            X.7tI r1 = X.AnonymousClass6VG.A00(r5)
            int r0 = r1.A00
            int r0 = r0 + -1
            r1.A00 = r0
            goto L_0x395f
        L_0x2ef7:
            java.lang.String r2 = "ig.action.survey.shops.ResumeMiniShopsExitV1"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x2f28
            boolean r2 = X.AnonymousClass0wJ.A1Y(r0, r1)
            java.lang.Object r2 = X.C63893iY.A0B(r0, r2)
            if (r2 == 0) goto L_0x395f
            X.0i6 r0 = X.C63913ic.A0F(r1)
            com.instagram.service.session.UserSession r0 = X.C05030Qo.A02(r0)
            X.7tI r4 = X.AnonymousClass6VG.A00(r0)
            java.lang.String r0 = r4.A02
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x395f
            long r2 = r4.A01
            long r0 = java.lang.System.currentTimeMillis()
            long r2 = r2 - r0
            r4.A01 = r2
            goto L_0x395f
        L_0x2f28:
            java.lang.String r2 = "ig.action.survey.shops.UpdateMiniShopsExitV1"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x2f6c
            r3 = 0
            java.util.List r2 = r0.A00
            java.lang.String r4 = X.C18190wL.A0q(r2, r3)
            r0 = 1
            java.lang.String r3 = X.C18190wL.A0q(r2, r0)
            r0 = 2
            java.lang.String r2 = X.C18190wL.A0q(r2, r0)
            if (r4 == 0) goto L_0x395f
            if (r3 == 0) goto L_0x395f
            if (r2 == 0) goto L_0x395f
            com.instagram.service.session.UserSession r0 = X.C63913ic.A0J(r1)
            X.7tI r1 = X.AnonymousClass6VG.A00(r0)
            int r0 = r1.A00
            int r0 = r0 + 1
            r1.A00 = r0
            java.lang.String r0 = r1.A02
            if (r0 == 0) goto L_0x2f5a
            r4 = r0
        L_0x2f5a:
            r1.A02 = r4
            java.lang.String r0 = r1.A03
            if (r0 == 0) goto L_0x2f61
            r3 = r0
        L_0x2f61:
            r1.A03 = r3
            java.lang.String r0 = r1.A04
            if (r0 == 0) goto L_0x2f68
            r2 = r0
        L_0x2f68:
            r1.A04 = r2
            goto L_0x395f
        L_0x2f6c:
            java.lang.String r2 = "ig.action.switch.GetState"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x2f81
            r1 = 0
            X.C04220Ms.A0B(r0, r1)
            X.7h3 r0 = X.C63893iY.A03(r0, r1)
            java.lang.String r9 = X.C18230wP.A0o(r0)
            return r9
        L_0x2f81:
            java.lang.String r4 = "ig.action.testing.ForceDarkMode"
            boolean r2 = r4.equals(r3)
            if (r2 == 0) goto L_0x2fa0
            androidx.fragment.app.FragmentActivity r1 = A01(r1)
            boolean r0 = r1 instanceof com.instagram.base.activity.IgFragmentActivity
            if (r0 == 0) goto L_0x2f99
            com.instagram.base.activity.IgFragmentActivity r1 = (com.instagram.base.activity.IgFragmentActivity) r1
            r0 = 2
            r1.setDefaultNightMode(r0)
            goto L_0x395f
        L_0x2f99:
            java.lang.String r0 = "ig.action.testing.ForceDarkMode: expecting host activity to be IgFragmentActivity"
            X.C30967GcS.A02(r4, r0)
            goto L_0x395f
        L_0x2fa0:
            java.lang.String r2 = "ig.action.walinking.LogFunnelEvent"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x2fc1
            boolean r3 = X.AnonymousClass0wJ.A1Y(r0, r1)
            X.0i6 r1 = X.C63913ic.A0F(r1)
            com.instagram.service.session.UserSession r2 = X.C05030Qo.A02(r1)
            java.lang.String r1 = X.C63893iY.A0D(r0, r3)
            X.3F9 r0 = X.C49182qy.A00(r2)
            r0.A00(r1)
            r9 = 0
            return r9
        L_0x2fc1:
            java.lang.String r2 = "ig.action.wellbeing.EnableQuietModeAction"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x2fce
            java.lang.Object r9 = X.C34232It.A00(r1, r0)
            return r9
        L_0x2fce:
            java.lang.String r2 = "ig.action.wellbeing.media_overlay.ClearCover"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x3011
            r3 = 1
            java.util.List r2 = r0.A00
            java.lang.String r3 = X.C18190wL.A0q(r2, r3)
            r0 = 2
            java.lang.String r2 = X.C18190wL.A0q(r2, r0)
            if (r2 == 0) goto L_0x395f
            java.lang.String r0 = "_"
            java.lang.String r0 = X.AnonymousClass00U.A0V(r3, r0, r2)
            com.instagram.service.session.UserSession r3 = X.C63913ic.A0J(r1)
            X.BKU r0 = X.C86114wI.A0W(r3, r0)
            if (r0 == 0) goto L_0x395f
            X.C18703Ajv.A01(r0, r3)
            r0.AAy(r3)
            X.BKN r2 = r0.A0f
            java.lang.String r0 = r2.A4F
            if (r0 == 0) goto L_0x395f
            X.Awj r1 = X.C19462Awj.A01(r3)
            java.lang.String r0 = r2.A4F
            X.BKU r0 = r1.A05(r0)
            if (r0 == 0) goto L_0x395f
            r0.AAy(r3)
            goto L_0x395f
        L_0x3011:
            java.lang.String r2 = "ig.action.wellbeing.QuietMode2ClickEnableFlowAction"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x301e
            java.lang.Object r9 = X.C34242Iu.A00(r1, r0)
            return r9
        L_0x301e:
            java.lang.String r2 = "ig.action.wellbeing.SetTimeReminderSetting"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x302b
            java.lang.Object r9 = X.C34252Iv.A00(r1, r0)
            return r9
        L_0x302b:
            java.lang.String r2 = "ig.callbacks.OnContentFilterSettingsChange"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x3038
            java.lang.Object r9 = X.C34262Iw.A00(r1, r0)
            return r9
        L_0x3038:
            java.lang.String r2 = "ig.reels_and_remix.SetCrossPostingToFB"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x3045
            java.lang.Object r9 = X.C34272Ix.A00(r1, r0)
            return r9
        L_0x3045:
            java.lang.String r2 = "ig.reels_and_remix.SetReelsRecommendation"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x3052
            java.lang.Object r9 = X.C60733Qh.A00(r1, r0)
            return r9
        L_0x3052:
            java.lang.String r2 = "ig.reels_and_remix.ShowReelsXPostingAsCurrentOption"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x307d
            r0 = 1
            X.C04220Ms.A0B(r1, r0)
            X.0i6 r2 = X.C63913ic.A0F(r1)
            boolean r0 = r2 instanceof com.instagram.service.session.UserSession
            if (r0 == 0) goto L_0x69f3
            com.instagram.service.session.UserSession r2 = (com.instagram.service.session.UserSession) r2
            if (r2 == 0) goto L_0x69f3
            r1 = 0
            boolean r0 = X.C67343zO.A08(r2)
            if (r0 != 0) goto L_0x3077
            boolean r0 = X.C67343zO.A05(r2)
            if (r0 == 0) goto L_0x0117
        L_0x3077:
            boolean r0 = X.C67343zO.A01(r1, r2)
            goto L_0x64ba
        L_0x307d:
            java.lang.String r2 = "ig.settings.help.ShowReportProblem"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x30b4
            boolean r4 = X.AnonymousClass0wJ.A1Z(r0, r1)
            X.0i6 r2 = X.C63913ic.A0F(r1)
            com.instagram.service.session.UserSession r3 = X.C05030Qo.A03(r2)
            java.lang.Object r2 = X.C63893iY.A0B(r0, r4)
            if (r2 == 0) goto L_0x30a1
            java.util.Map r0 = X.AnonymousClass25S.A01
            java.lang.Object r2 = r0.get(r2)
            X.25S r2 = (X.AnonymousClass25S) r2
            if (r2 != 0) goto L_0x30a3
        L_0x30a1:
            X.25S r2 = X.AnonymousClass25S.UNKNOWN
        L_0x30a3:
            X.25S r0 = X.AnonymousClass25S.UNKNOWN
            if (r2 != r0) goto L_0x30a9
            X.25S r2 = X.AnonymousClass25S.BLOKS
        L_0x30a9:
            if (r3 == 0) goto L_0x395f
            androidx.fragment.app.FragmentActivity r0 = X.C63913ic.A05(r1)
            X.C63493hb.A00(r0, r2, r3)
            goto L_0x395f
        L_0x30b4:
            java.lang.String r2 = "bk.action.ig.igds.ActionableToast"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x30c1
            java.lang.Object r9 = X.C34282Iy.A00(r1, r0)
            return r9
        L_0x30c1:
            java.lang.String r2 = "bk.action.io.CurrentTimeMillis"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x30ce
            java.lang.Long r9 = X.C18200wM.A0c()
            return r9
        L_0x30ce:
            r2 = 312(0x138, float:4.37E-43)
            java.lang.String r2 = X.C18170wI.A00(r2)
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x30df
            java.lang.Object r9 = X.C34292Iz.A00(r1, r0)
            return r9
        L_0x30df:
            r2 = 394(0x18a, float:5.52E-43)
            java.lang.String r2 = X.C18170wI.A00(r2)
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x30f0
            java.lang.Object r9 = X.AnonymousClass2J0.A00(r1, r0)
            return r9
        L_0x30f0:
            java.lang.String r2 = "ig.action.navigation.IGToast"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x3115
            r2 = 0
            X.C04220Ms.A0B(r0, r2)
            android.widget.Toast r1 = X.AnonymousClass6DB.A00
            if (r1 == 0) goto L_0x3103
            r1.cancel()
        L_0x3103:
            java.lang.Object r1 = X.C63893iY.A0B(r0, r2)
            java.lang.String r1 = (java.lang.String) r1
            android.content.Context r0 = X.C18230wP.A08()
            r9 = 0
            android.widget.Toast r0 = X.C63813iO.A02(r0, r1, r9, r2)
            X.AnonymousClass6DB.A00 = r0
            return r9
        L_0x3115:
            java.lang.String r2 = "ig.action.io.ShowSnackbarV2"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x3122
            java.lang.Object r9 = X.AnonymousClass2J1.A00(r1, r0)
            return r9
        L_0x3122:
            java.lang.String r2 = "bk.action.io.Toast"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x3147
            r2 = 0
            java.lang.Object r1 = X.C63893iY.A0B(r0, r2)
            java.lang.String r1 = (java.lang.String) r1
            android.widget.Toast r0 = X.AnonymousClass6DC.A00
            if (r0 == 0) goto L_0x3138
            r0.cancel()
        L_0x3138:
            android.content.Context r0 = X.C18230wP.A08()
            android.widget.Toast r0 = android.widget.Toast.makeText(r0, r1, r2)
            X.AnonymousClass6DC.A00 = r0
            r0.show()
            r9 = 0
            return r9
        L_0x3147:
            java.lang.String r2 = "mini.action.MaybeShowShopsNux"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x3154
            java.lang.Object r9 = X.C17269A3l.A00(r1, r0)
            return r9
        L_0x3154:
            java.lang.String r2 = "mini.action.OpenProductDetails"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x3161
            java.lang.Object r9 = X.C18617AiW.A00(r1, r0)
            return r9
        L_0x3161:
            java.lang.String r2 = "mini.action.OpenProductDetailsPage"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x316e
            java.lang.Object r9 = X.AnonymousClass2J2.A00(r1, r0)
            return r9
        L_0x316e:
            java.lang.String r2 = "bk.action.cds.CloseScreen"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x31a3
            r3 = 0
            boolean r2 = X.AnonymousClass0wJ.A1Z(r0, r1)
            java.lang.Object r4 = X.C63893iY.A0B(r0, r3)
            X.7h3 r4 = (X.C127397h3) r4
            r9 = 0
            if (r4 == 0) goto L_0x31a1
            X.6jp r3 = X.C18230wP.A0V(r4)
        L_0x3188:
            java.lang.Object r2 = X.C63893iY.A0B(r0, r2)
            r2.getClass()
            X.3HX r2 = (X.AnonymousClass3HX) r2
            androidx.fragment.app.FragmentActivity r0 = X.C63913ic.A05(r1)
            java.lang.Object r0 = X.AnonymousClass3ZR.A01(r0)
            X.1Xb r0 = (X.AnonymousClass1Xb) r0
            if (r0 == 0) goto L_0x69fe
            r0.A0P(r2, r4, r3, r9)
            return r9
        L_0x31a1:
            r3 = r9
            goto L_0x3188
        L_0x31a3:
            java.lang.String r2 = "bk.action.cds.DismissCdsBottomSheet"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x31bc
            androidx.fragment.app.FragmentActivity r0 = A01(r1)
            r9 = 0
            java.lang.Object r0 = X.AnonymousClass3ZR.A01(r0)
            X.1Xb r0 = (X.AnonymousClass1Xb) r0
            if (r0 == 0) goto L_0x6a05
            r0.A0P(r9, r9, r9, r9)
            return r9
        L_0x31bc:
            java.lang.String r2 = "bk.action.cds.internal.InsertBeforeCdsBottomSheet"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x31c9
            java.lang.Object r9 = X.AnonymousClass2J3.A00(r1, r0)
            return r9
        L_0x31c9:
            java.lang.String r2 = "bk.action.cds.internal.RemoveCdsBottomSheet"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x31d6
            java.lang.Object r9 = X.AnonymousClass2J4.A00(r0)
            return r9
        L_0x31d6:
            java.lang.String r2 = "bk.action.cds.OpenCdsBottomSheet"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x31e3
            java.lang.Object r9 = X.AnonymousClass2J5.A00(r1, r0)
            return r9
        L_0x31e3:
            java.lang.String r2 = "bk.action.cds.OpenScreen"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x31f0
            java.lang.Object r9 = X.AnonymousClass2J6.A00(r1, r0)
            return r9
        L_0x31f0:
            java.lang.String r2 = "bk.action.cds.PopCdsBottomSheet"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x320d
            boolean r2 = X.AnonymousClass0wJ.A1Y(r0, r1)
            X.7h3 r0 = X.C63893iY.A03(r0, r2)
            androidx.fragment.app.FragmentActivity r1 = X.C63913ic.A05(r1)
            java.lang.String r0 = X.C18220wO.A0o(r0)
            r9 = 0
            X.C63123bZ.A04(r1, r9, r0)
            return r9
        L_0x320d:
            java.lang.String r2 = "bk.action.cds.PopScreen"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x3235
            boolean r2 = X.AnonymousClass0wJ.A1Y(r0, r1)
            X.7h3 r3 = X.C63893iY.A03(r0, r2)
            r2 = 35
            java.lang.String r0 = "default"
            java.lang.String r0 = r3.A0O(r2, r0)
            java.lang.Integer r2 = X.C32272Bb.A00(r0)
            X.C04220Ms.A06(r2)
            androidx.fragment.app.FragmentActivity r0 = X.C63913ic.A05(r1)
            r9 = 0
            X.C63123bZ.A04(r0, r2, r9)
            return r9
        L_0x3235:
            r2 = 309(0x135, float:4.33E-43)
            java.lang.String r2 = X.C18170wI.A00(r2)
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x3246
            java.lang.Object r9 = X.AnonymousClass2J7.A00(r1, r0)
            return r9
        L_0x3246:
            java.lang.String r2 = "bk.action.cds.PushScreen"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x3253
            java.lang.Object r9 = X.AnonymousClass2J8.A00(r1, r0)
            return r9
        L_0x3253:
            java.lang.String r2 = "bk.action.cds.UnwindToScreen"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x3260
            java.lang.Object r9 = X.AnonymousClass2J9.A00(r1, r0)
            return r9
        L_0x3260:
            java.lang.String r2 = "ig.action.navigation.OpenAvatarUpdater"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x326d
            java.lang.Object r9 = X.AnonymousClass2JA.A00(r1, r0)
            return r9
        L_0x326d:
            java.lang.String r2 = "ig.action.navigation.OpenCovidInfoCenterFactsShareSheet"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x327a
            java.lang.Object r9 = X.AnonymousClass2JB.A00(r1, r0)
            return r9
        L_0x327a:
            java.lang.String r2 = "ig.action.navigation.OpenIGTV"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x3287
            java.lang.Object r9 = X.C17270A3m.A00(r1, r0)
            return r9
        L_0x3287:
            java.lang.String r2 = "ig.action.navigation.PopToProfile"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x329c
            androidx.fragment.app.FragmentActivity r1 = A01(r1)
            android.content.Intent r0 = X.C62333Yi.A00(r1)
            X.C10650ih.A02(r1, r0)
            r9 = 0
            return r9
        L_0x329c:
            java.lang.String r2 = "ig.action.navigation.OpenReactNativeRoute"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x32a9
            java.lang.Object r9 = X.AnonymousClass2JC.A00(r1, r0)
            return r9
        L_0x32a9:
            java.lang.String r2 = "fbpay.action.navigation.OnAuthException"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x32f6
            r2 = 0
            boolean r3 = X.AnonymousClass0wJ.A1Z(r0, r1)
            java.util.List r0 = r0.A00
            java.lang.Object r2 = r0.get(r2)
            java.lang.String r3 = X.C18190wL.A0q(r0, r3)
            androidx.fragment.app.FragmentActivity r0 = X.C63913ic.A05(r1)
            r9 = 0
            if (r2 == 0) goto L_0x0012
            if (r0 == 0) goto L_0x0012
            if (r3 == 0) goto L_0x0012
            X.7IU r1 = new X.7IU
            r1.<init>(r0)
            java.lang.Class<X.573> r0 = X.AnonymousClass573.class
            X.3ak r1 = r1.A01(r0)
            X.573 r1 = (X.AnonymousClass573) r1
            java.util.Map r0 = r1.A01
            java.lang.Object r0 = r0.get(r2)
            X.6gR r0 = (X.C107246gR) r0
            if (r0 == 0) goto L_0x0012
            X.56r r2 = r0.A01
            com.google.gson.Gson r1 = r1.A00
            java.lang.Class<X.5kB> r0 = X.C92885kB.class
            java.lang.Object r0 = r1.A06(r3, r0)
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            X.7Kx r0 = X.AnonymousClass7Kx.A0B(r9, r0)
            r2.A0G(r0)
            return r9
        L_0x32f6:
            java.lang.String r2 = "fbpay.action.navigation.StartDynamicAuthenticate"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x3303
            java.lang.Object r9 = X.AnonymousClass6P4.A00(r1, r0)
            return r9
        L_0x3303:
            java.lang.String r2 = "fbpay.action.navigation.StopDynamicAuthenticate"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x333e
            boolean r2 = X.AnonymousClass0wJ.A1Y(r0, r1)
            java.lang.Object r3 = X.C63893iY.A0B(r0, r2)
            androidx.fragment.app.FragmentActivity r2 = X.C63913ic.A05(r1)
            r9 = 0
            if (r3 == 0) goto L_0x0012
            if (r2 == 0) goto L_0x0012
            X.7IU r1 = new X.7IU
            r1.<init>(r2)
            java.lang.Class<X.573> r0 = X.AnonymousClass573.class
            X.3ak r0 = r1.A01(r0)
            X.573 r0 = (X.AnonymousClass573) r0
            java.util.Map r0 = r0.A01
            java.lang.Object r1 = r0.remove(r3)
            X.6gR r1 = (X.C107246gR) r1
            if (r1 == 0) goto L_0x0012
            X.56r r0 = r1.A01
            r0.A0B(r2)
            X.M5J r0 = r1.A00
            r0.A0B(r2)
            return r9
        L_0x333e:
            java.lang.String r2 = "bk.fx.action.FetchWebAuthData"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x334b
            java.lang.Object r9 = X.C59423Kt.A00(r1, r0)
            return r9
        L_0x334b:
            java.lang.String r2 = "bk.fx.action.HideInitialLoadingState"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x3379
            r4 = 0
            java.lang.Object r0 = X.C63893iY.A0B(r0, r4)
            if (r0 != 0) goto L_0x3374
            r3 = 0
        L_0x335b:
            X.3Gl r2 = X.C35682Ok.A00()
            X.C04220Ms.A0B(r1, r4)
            androidx.fragment.app.FragmentActivity r0 = X.C63913ic.A05(r1)
            android.view.Window r0 = r0.getWindow()
            r2.A01(r0)
            if (r3 == 0) goto L_0x395f
            X.C63893iY.A0G(r1, r3)
            goto L_0x395f
        L_0x3374:
            X.6eC r0 = (X.C105916eC) r0
            X.6jp r3 = r0.A00
            goto L_0x335b
        L_0x3379:
            java.lang.String r2 = "bk.fx.action.LoadingOverlay"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x3386
            java.lang.Object r9 = X.AnonymousClass2JE.A00(r1, r0)
            return r9
        L_0x3386:
            java.lang.String r2 = "bk.fx.action.UpdateLinkedFBPage"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x3393
            java.lang.Object r9 = X.AnonymousClass2JF.A00(r1, r0)
            return r9
        L_0x3393:
            java.lang.String r2 = "bk.fx.action.UpdateLinkedFBUser"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x33a0
            java.lang.Object r9 = X.AnonymousClass2JG.A00(r1, r0)
            return r9
        L_0x33a0:
            java.lang.String r2 = "fx.action.crossposting.SetFeedAutoCrossposting"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x33be
            r2 = 0
            boolean r4 = X.AnonymousClass0wJ.A1Z(r0, r1)
            boolean r3 = X.AnonymousClass3WF.A01(r0, r2)
            com.instagram.service.session.UserSession r2 = X.C86104wH.A0Y(r1)
            X.3Xq r1 = X.C67263zF.A03
            java.lang.String r0 = "bloks"
            r1.A02(r2, r0, r3, r4)
            r9 = 0
            return r9
        L_0x33be:
            java.lang.String r2 = "fx.action.crossposting.SetStoryAutoCrossposting"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x33e3
            r2 = 0
            boolean r5 = X.AnonymousClass0wJ.A1Z(r0, r1)
            boolean r4 = X.AnonymousClass3WF.A01(r0, r2)
            X.0i6 r1 = X.C63913ic.A0F(r1)
            X.C18200wM.A1R(r1)
            com.instagram.service.session.UserSession r1 = (com.instagram.service.session.UserSession) r1
            X.3Tm r0 = X.C67233zC.A08
            java.lang.Integer r2 = X.AnonymousClass006.A00
            java.lang.String r3 = "bloks"
            r0.A01(r1, r2, r3, r4, r5)
            r9 = 0
            return r9
        L_0x33e3:
            java.lang.String r2 = "bk.action.DeeplinkToOtherAppOrDirectToAppStore"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x33f0
            java.lang.Object r9 = X.C60743Qi.A00(r1, r0)
            return r9
        L_0x33f0:
            java.lang.String r2 = "ig.action.shopping.RegisterProductSaveState"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x341c
            r4 = 0
            boolean r3 = X.AnonymousClass0wJ.A1Z(r0, r1)
            X.7h3 r2 = X.C63893iY.A03(r0, r4)
            X.0i6 r0 = X.C63913ic.A0F(r1)
            com.instagram.service.session.UserSession r0 = X.C05030Qo.A02(r0)
            r9 = 0
            X.C04220Ms.A0B(r0, r3)
            X.C04220Ms.A0B(r2, r4)
            com.instagram.model.shopping.Product r1 = X.C19249AtE.A01(r2)
            X.BEh r0 = X.AnonymousClass6VN.A00(r0)
            r0.A04(r1)
            return r9
        L_0x341c:
            java.lang.String r2 = "bk.action.ig.shopping.AddProductItem"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x343d
            r0 = 1
            X.C04220Ms.A0B(r1, r0)
            X.0i6 r0 = X.C63913ic.A0F(r1)
            X.C18200wM.A1R(r0)
            X.KHq r1 = X.AnonymousClass3LY.A00(r0)
            X.7rP r0 = new X.7rP
            r0.<init>()
            r1.CWx(r0)
            r9 = 0
            return r9
        L_0x343d:
            java.lang.String r2 = "bk.action.ig.shopping.DeleteProductItem"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x345e
            r0 = 1
            X.C04220Ms.A0B(r1, r0)
            X.0i6 r0 = X.C63913ic.A0F(r1)
            X.C18200wM.A1R(r0)
            X.KHq r1 = X.AnonymousClass3LY.A00(r0)
            X.7rQ r0 = new X.7rQ
            r0.<init>()
            r1.CWx(r0)
            r9 = 0
            return r9
        L_0x345e:
            java.lang.String r2 = "ig.action.shopping.IsProductCollectionReminderSet"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x34a9
            r4 = 0
            boolean r3 = X.AnonymousClass0wJ.A1Z(r0, r1)
            java.lang.Object r2 = X.C63893iY.A0B(r0, r3)
            r2.getClass()
            X.C18240wQ.A1I(r2)
            X.0i6 r0 = X.C63913ic.A0F(r1)
            com.instagram.service.session.UserSession r0 = X.C05030Qo.A02(r0)
            X.Adc r1 = X.C50102sS.A00(r0)
            r0 = 2
            X.C04220Ms.A0B(r1, r0)
            java.util.HashMap r0 = r1.A02
            java.lang.Object r1 = r0.get(r2)
            boolean r0 = X.C18190wL.A1Z(r1, r3)
            if (r0 == 0) goto L_0x349d
            java.lang.Integer r0 = X.AnonymousClass006.A00
        L_0x3493:
            int r0 = r0.intValue()
            switch(r0) {
                case 0: goto L_0x6a0f;
                case 1: goto L_0x6a0c;
                default: goto L_0x349a;
            }
        L_0x349a:
            java.lang.String r9 = "unknown"
            return r9
        L_0x349d:
            boolean r0 = X.C18190wL.A1Z(r1, r4)
            if (r0 == 0) goto L_0x34a6
            java.lang.Integer r0 = X.AnonymousClass006.A01
            goto L_0x3493
        L_0x34a6:
            java.lang.Integer r0 = X.AnonymousClass006.A0C
            goto L_0x3493
        L_0x34a9:
            java.lang.String r2 = "ig.action.shopping.IsProductSaved"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x34ef
            r5 = 0
            boolean r4 = X.AnonymousClass0wJ.A1Z(r0, r1)
            X.7h3 r3 = X.C63893iY.A03(r0, r5)
            X.0i6 r0 = X.C63913ic.A0F(r1)
            com.instagram.service.session.UserSession r0 = X.C05030Qo.A02(r0)
            X.BEh r2 = X.AnonymousClass6VJ.A00(r0)
            r1 = 2
            X.C04220Ms.A0B(r2, r1)
            X.C04220Ms.A0B(r3, r5)
            com.instagram.model.shopping.Product r0 = X.C19249AtE.A01(r3)
            X.9wD r0 = r2.A03(r0)
            int r0 = r0.ordinal()
            if (r0 == r5) goto L_0x34ec
            if (r0 == r4) goto L_0x34e9
            if (r0 != r1) goto L_0x6a18
            java.lang.Integer r0 = X.AnonymousClass006.A0C
        L_0x34e1:
            int r0 = r0.intValue()
            switch(r0) {
                case 0: goto L_0x6a12;
                case 1: goto L_0x6a15;
                default: goto L_0x34e8;
            }
        L_0x34e8:
            goto L_0x349a
        L_0x34e9:
            java.lang.Integer r0 = X.AnonymousClass006.A01
            goto L_0x34e1
        L_0x34ec:
            java.lang.Integer r0 = X.AnonymousClass006.A00
            goto L_0x34e1
        L_0x34ef:
            java.lang.String r2 = "ig.action.shopping.RegisterProductCollectionReminderSet"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x352f
            r6 = 0
            boolean r2 = X.AnonymousClass0wJ.A1Z(r0, r1)
            java.lang.String r5 = X.C63893iY.A0D(r0, r6)
            boolean r11 = X.AnonymousClass3WF.A01(r0, r2)
            r4 = 2
            X.3HX r3 = X.C63893iY.A01(r0, r4)
            X.0i6 r0 = X.C63913ic.A0F(r1)
            com.instagram.service.session.UserSession r2 = X.C05030Qo.A02(r0)
            androidx.fragment.app.Fragment r0 = X.C63913ic.A01(r1)
            X.06E r8 = X.AnonymousClass06E.A00(r0)
            r9 = 0
            X.C04220Ms.A0B(r2, r4)
            android.content.Context r0 = r3.A00
            X.C04220Ms.A06(r0)
            X.C04220Ms.A0B(r5, r6)
            X.Adc r6 = X.C50102sS.A00(r2)
            r7 = r0
            r10 = r5
            r6.A00(r7, r8, r9, r10, r11)
            return r9
        L_0x352f:
            java.lang.String r2 = "ig.action.shopping.SaveProduct"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x353c
            java.lang.Object r9 = X.C17271A3n.A00(r1, r0)
            return r9
        L_0x353c:
            java.lang.String r2 = "ig.action.shopping.SetProductCollectionReminder"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x3549
            java.lang.Object r9 = X.C17272A3o.A00(r1, r0)
            return r9
        L_0x3549:
            java.lang.String r2 = "bk.action.ig.cfr.CartExitPointV2"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x3556
            java.lang.Object r9 = X.C17273A3p.A00(r1, r0)
            return r9
        L_0x3556:
            java.lang.String r2 = "bk.action.ig.cfr.PrefetchShoppingCart"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x3581
            r5 = 0
            java.util.List r2 = r0.A00
            java.lang.String r4 = X.C18190wL.A0q(r2, r5)
            r0 = 2
            java.lang.String r3 = X.C18190wL.A0q(r2, r0)
            com.instagram.service.session.UserSession r2 = X.C63913ic.A0J(r1)
            X.C04220Ms.A0B(r1, r5)
            androidx.fragment.app.FragmentActivity r1 = X.C63913ic.A05(r1)
            X.Axa r0 = X.C19513Axa.A00
            r0.A0c(r1, r2, r4)
            X.Axa r0 = X.C19513Axa.A00
            r0.A1C(r2, r3)
            r9 = 0
            return r9
        L_0x3581:
            java.lang.String r2 = "ig.action.story_reels.GetLatestItemTimestamp"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x35a6
            boolean r2 = X.AnonymousClass0wJ.A1Y(r0, r1)
            java.lang.String r2 = X.C63893iY.A0D(r0, r2)
            X.0i6 r0 = X.C63913ic.A0F(r1)
            com.instagram.service.session.UserSession r0 = X.C05030Qo.A02(r0)
            com.instagram.model.reels.Reel r0 = X.C86114wI.A0X(r0, r2)
            if (r0 == 0) goto L_0x6a1d
            long r0 = r0.A03
            java.lang.Long r9 = java.lang.Long.valueOf(r0)
            return r9
        L_0x35a6:
            java.lang.String r2 = "ig.action.story_reels.GetNextMediaId"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x35c9
            boolean r2 = X.AnonymousClass0wJ.A1Y(r0, r1)
            java.lang.String r3 = X.C63893iY.A0D(r0, r2)
            X.0i6 r0 = X.C63913ic.A0F(r1)
            com.instagram.service.session.UserSession r2 = X.C05030Qo.A02(r0)
            com.instagram.model.reels.Reel r0 = X.C86114wI.A0X(r2, r3)
            if (r0 == 0) goto L_0x395f
            java.lang.Object r1 = r0.A1b
            monitor-enter(r1)
            goto L_0x6a22
        L_0x35c9:
            java.lang.String r2 = "ig.action.story_reels.GetOriginalRankedPosition"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x35ec
            java.lang.Object r2 = X.C63893iY.A07(r0)
            java.lang.String r2 = (java.lang.String) r2
            com.instagram.service.session.UserSession r0 = X.C63913ic.A0J(r1)
            com.instagram.model.reels.Reel r0 = X.C86114wI.A0X(r0, r2)
            if (r0 == 0) goto L_0x35e5
            long r0 = r0.A05
            goto L_0x39a8
        L_0x35e5:
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            goto L_0x39a8
        L_0x35ec:
            java.lang.String r2 = "ig.action.story_reels.HasPendingMedia"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x3618
            r3 = 0
            boolean r4 = X.AnonymousClass0wJ.A1Z(r0, r1)
            r2 = 0
            java.lang.String r3 = X.C63893iY.A0D(r0, r3)
            X.0i6 r0 = X.C63913ic.A0F(r1)
            com.instagram.service.session.UserSession r0 = X.C05030Qo.A02(r0)
            com.instagram.model.reels.Reel r0 = X.C86114wI.A0X(r0, r3)
            if (r0 == 0) goto L_0x3f5c
            java.util.List r0 = r0.A13
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ 1
        L_0x3614:
            if (r0 != r4) goto L_0x3f5c
            goto L_0x3f5b
        L_0x3618:
            java.lang.String r2 = "ig.action.story_reels.HasVideo"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x363f
            r2 = 0
            java.lang.String r3 = X.C86154wM.A0l(r0, r2)
            com.instagram.service.session.UserSession r0 = X.C63913ic.A0J(r1)
            com.instagram.model.reels.Reel r1 = X.C86114wI.A0X(r0, r3)
            if (r1 == 0) goto L_0x3f5c
            boolean r0 = r1.A0c()
            if (r0 != 0) goto L_0x3f5b
            java.lang.Boolean r0 = r1.A0d
            if (r0 == 0) goto L_0x3f5c
            boolean r0 = r0.booleanValue()
            goto L_0x3f59
        L_0x363f:
            java.lang.String r2 = "ig.action.story_reels.IsBroadcast"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x3664
            r3 = 0
            boolean r4 = X.AnonymousClass0wJ.A1Z(r0, r1)
            r2 = 0
            java.lang.String r3 = X.C63893iY.A0D(r0, r3)
            X.0i6 r0 = X.C63913ic.A0F(r1)
            com.instagram.service.session.UserSession r0 = X.C05030Qo.A02(r0)
            com.instagram.model.reels.Reel r0 = X.C86114wI.A0X(r0, r3)
            if (r0 == 0) goto L_0x3f5c
            boolean r0 = r0.A0c()
            goto L_0x3614
        L_0x3664:
            java.lang.String r2 = "ig.action.story_reels.IsCached"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x3671
            java.lang.Object r9 = X.C24011D5m.A00(r1, r0)
            return r9
        L_0x3671:
            java.lang.String r2 = "ig.action.story_reels.IsCurrentUserStory"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x3696
            boolean r3 = X.AnonymousClass0wJ.A1Y(r0, r1)
            r2 = 0
            java.lang.String r3 = X.C63893iY.A0D(r0, r3)
            X.0i6 r0 = X.C63913ic.A0F(r1)
            com.instagram.service.session.UserSession r0 = X.C05030Qo.A02(r0)
            com.instagram.model.reels.Reel r0 = X.C86114wI.A0X(r0, r3)
            if (r0 == 0) goto L_0x3f5c
            boolean r0 = r0.A0d()
            goto L_0x3f59
        L_0x3696:
            java.lang.String r2 = "ig.action.story_reels.IsGroupReel"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L_0x6bc9
            java.lang.String r2 = "ig.action.story_reels.IsHighlights"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x36c4
            r3 = 0
            boolean r4 = X.AnonymousClass0wJ.A1Z(r0, r1)
            r2 = 0
            java.lang.String r3 = X.C63893iY.A0D(r0, r3)
            X.0i6 r0 = X.C63913ic.A0F(r1)
            com.instagram.service.session.UserSession r0 = X.C05030Qo.A02(r0)
            com.instagram.model.reels.Reel r0 = X.C86114wI.A0X(r0, r3)
            if (r0 == 0) goto L_0x3f5c
            boolean r0 = r0.A0f()
            goto L_0x3614
        L_0x36c4:
            java.lang.String r2 = "ig.action.story_reels.IsMuted"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x36e8
            r3 = 0
            boolean r4 = X.AnonymousClass0wJ.A1Z(r0, r1)
            r2 = 0
            java.lang.String r3 = X.C63893iY.A0D(r0, r3)
            X.0i6 r0 = X.C63913ic.A0F(r1)
            com.instagram.service.session.UserSession r0 = X.C05030Qo.A02(r0)
            com.instagram.model.reels.Reel r0 = X.C86114wI.A0X(r0, r3)
            if (r0 == 0) goto L_0x3f5c
            boolean r0 = r0.A1T
            goto L_0x3614
        L_0x36e8:
            java.lang.String r2 = "ig.action.story_reels.IsNuxReel"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x370c
            r3 = 0
            boolean r4 = X.AnonymousClass0wJ.A1Z(r0, r1)
            r2 = 0
            java.lang.String r3 = X.C63893iY.A0D(r0, r3)
            X.0i6 r0 = X.C63913ic.A0F(r1)
            com.instagram.service.session.UserSession r0 = X.C05030Qo.A02(r0)
            com.instagram.model.reels.Reel r0 = X.C86114wI.A0X(r0, r3)
            if (r0 == 0) goto L_0x3f5c
            boolean r0 = r0.A1L
            goto L_0x3614
        L_0x370c:
            java.lang.String r2 = "ig.action.story_reels.IsSeen"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x3732
            r3 = 0
            boolean r4 = X.AnonymousClass0wJ.A1Z(r0, r1)
            r2 = 0
            java.lang.String r3 = X.C63893iY.A0D(r0, r3)
            X.0i6 r0 = X.C63913ic.A0F(r1)
            com.instagram.service.session.UserSession r1 = X.C05030Qo.A02(r0)
            com.instagram.model.reels.Reel r0 = X.C86114wI.A0X(r1, r3)
            if (r0 == 0) goto L_0x3f5c
            boolean r0 = r0.A0t(r1)
            goto L_0x3614
        L_0x3732:
            java.lang.String r2 = "ig.action.story_reels.IsSkipped"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x374f
            r2 = 0
            java.lang.String r0 = X.C86154wM.A0l(r0, r2)
            com.instagram.service.session.UserSession r1 = X.C63913ic.A0J(r1)
            com.instagram.model.reels.Reel r0 = X.C86114wI.A0X(r1, r0)
            if (r0 == 0) goto L_0x3f5c
            boolean r0 = r0.A0v(r1)
            goto L_0x3f59
        L_0x374f:
            java.lang.String r2 = "bk.action.storyviewer.CloseOverlay"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x375c
            java.lang.Object r9 = X.AnonymousClass2JH.A00(r1, r0)
            return r9
        L_0x375c:
            java.lang.String r2 = "bk.action.storyviewer.GetLogEventExtras"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x3769
            java.lang.Object r9 = X.C17274A3q.A00(r1)
            return r9
        L_0x3769:
            java.lang.String r2 = "bk.action.storyviewer.IncrementMentionsTapCount"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x379d
            boolean r2 = X.AnonymousClass0wJ.A1Y(r0, r1)
            java.lang.String r3 = X.C63893iY.A0D(r0, r2)
            r2 = 2131307517(0x7f092bfd, float:1.8233264E38)
            java.lang.Class<X.6ez> r0 = X.C106406ez.class
            java.lang.Object r0 = X.C63913ic.A0L(r1, r0, r2)
            X.6ez r0 = (X.C106406ez) r0
            if (r0 == 0) goto L_0x395f
            X.7s8 r0 = r0.A00
            X.C3T r0 = r0.A02
            X.BKH r1 = r0.AbP()
            if (r1 == 0) goto L_0x395f
            com.instagram.reels.fragment.ReelViewerFragment r0 = (com.instagram.reels.fragment.ReelViewerFragment) r0
            X.Ez6 r0 = r0.A1C
            X.Avn r0 = r0.BDW(r1)
            r0.A06(r3)
            goto L_0x395f
        L_0x379d:
            java.lang.String r2 = "bk.action.storyviewer.OpenOverlay"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x37aa
            java.lang.Object r9 = X.AnonymousClass2JI.A00(r1, r0)
            return r9
        L_0x37aa:
            java.lang.String r4 = "bk.action.storyviewer.PauseStoryViewer"
            boolean r2 = r4.equals(r3)
            if (r2 == 0) goto L_0x37bd
            X.3S8 r0 = X.AnonymousClass3S8.A01
            X.C3T r0 = r0.A00
            if (r0 == 0) goto L_0x395f
            r0.CeE(r4)
            goto L_0x395f
        L_0x37bd:
            java.lang.String r2 = "bk.action.storyviewer.ResumeStoryViewer"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L_0x3930
            java.lang.String r2 = "bk.action.qpl.MarkerAnnotate"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x3818
            r1 = 0
            X.C04220Ms.A0B(r0, r1)
            java.lang.Object r1 = X.C63893iY.A0B(r0, r1)
            r1.getClass()
            java.lang.String r2 = "null cannot be cast to non-null type kotlin.Number"
            int r5 = X.AnonymousClass0wJ.A04(r1)
            r1 = 1
            java.lang.Object r1 = X.C63893iY.A0C(r0, r2, r1)
            int r4 = X.AnonymousClass0wJ.A04(r1)
            r1 = 2
            java.lang.Object r0 = X.C63893iY.A0B(r0, r1)
            java.util.Map r0 = (java.util.Map) r0
            r9 = 0
            if (r0 == 0) goto L_0x0012
            java.util.HashMap r0 = X.C63913ic.A0N(r0)
            java.util.Set r0 = r0.entrySet()
            X.C04220Ms.A06(r0)
            java.util.Iterator r3 = r0.iterator()
        L_0x3800:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0012
            java.util.Map$Entry r0 = X.C18180wK.A0o(r3)
            java.lang.String r2 = X.C18200wM.A0p(r0)
            java.lang.String r1 = X.C18230wP.A0u(r0)
            X.01V r0 = X.AnonymousClass01V.A0p
            r0.markerAnnotate((int) r5, (int) r4, (java.lang.String) r2, (java.lang.String) r1)
            goto L_0x3800
        L_0x3818:
            java.lang.String r2 = "bk.action.qpl.MarkerDrop"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x383d
            java.lang.Object r1 = X.C86124wJ.A0m(r0)
            java.lang.String r3 = "null cannot be cast to non-null type kotlin.Number"
            X.C04220Ms.A0C(r1, r3)
            int r2 = X.AnonymousClass0wJ.A04(r1)
            r1 = 1
            java.lang.Object r0 = X.C63893iY.A0C(r0, r3, r1)
            int r1 = X.AnonymousClass0wJ.A04(r0)
            X.01V r0 = X.AnonymousClass01V.A0p
            r0.markerDrop(r2, r1)
            r9 = 0
            return r9
        L_0x383d:
            java.lang.String r2 = "bk.action.qpl.MarkerEndV2"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x386c
            java.lang.Object r1 = X.C86124wJ.A0m(r0)
            java.lang.String r4 = "null cannot be cast to non-null type kotlin.Number"
            X.C04220Ms.A0C(r1, r4)
            int r3 = X.AnonymousClass0wJ.A04(r1)
            r1 = 1
            java.lang.Object r1 = X.C63893iY.A0C(r0, r4, r1)
            int r2 = X.AnonymousClass0wJ.A04(r1)
            r1 = 2
            java.lang.Object r0 = X.C63893iY.A0C(r0, r4, r1)
            int r0 = X.AnonymousClass0wJ.A04(r0)
            X.01V r1 = X.AnonymousClass01V.A0p
            short r0 = (short) r0
            r1.markerEnd(r3, r2, r0)
            r9 = 0
            return r9
        L_0x386c:
            java.lang.String r2 = "bk.action.qpl.MarkerPoint"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x3879
            java.lang.Object r9 = X.AnonymousClass2JJ.A00(r1, r0)
            return r9
        L_0x3879:
            java.lang.String r2 = "bk.action.qpl.MarkerStartV2"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x3888
            X.3Tt r2 = X.C61523Tt.A00
            java.lang.Object r9 = r2.A00(r1, r0)
            return r9
        L_0x3888:
            java.lang.String r2 = "bk.action.ttrc.AddPoint"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x38b4
            java.lang.Object r1 = X.C63893iY.A07(r0)
            int r4 = X.AnonymousClass0wJ.A04(r1)
            r1 = 1
            java.lang.Object r3 = X.C63893iY.A0B(r0, r1)
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r2 = X.C63893iY.A09(r0)
            java.lang.String r2 = (java.lang.String) r2
            r1 = 3
            java.lang.Object r0 = X.C63893iY.A0B(r0, r1)
            r0.getClass()
            java.util.Map r0 = (java.util.Map) r0
            r9 = 0
            X.C63223h1.A03(r9, r3, r2, r0, r4)
            return r9
        L_0x38b4:
            java.lang.String r2 = "bk.action.ttrc.AddQuery"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x38c1
            java.lang.Object r9 = X.AnonymousClass2JK.A00(r0)
            return r9
        L_0x38c1:
            java.lang.String r2 = "ig.action.negative_action.BlockUser"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x6a32
            java.lang.Object r2 = X.C63893iY.A07(r0)
            java.lang.String r7 = r2.toString()
            r6 = 1
            X.6jp r10 = X.C63893iY.A06(r0, r6)
            r8 = 2
            X.6jp r9 = X.C63893iY.A06(r0, r8)
            r2 = 3
            java.util.List r3 = r0.A00
            java.lang.String r2 = X.C18190wL.A0q(r3, r2)
            r0 = 4
            java.lang.String r15 = X.C18190wL.A0q(r3, r0)
            X.7q1 r5 = new X.7q1
            r5.<init>(r2)
            com.instagram.service.session.UserSession r4 = X.C63913ic.A0J(r1)
            r0 = 0
            X.C04220Ms.A0B(r1, r0)
            androidx.fragment.app.FragmentActivity r3 = X.C63913ic.A05(r1)
            com.instagram.user.model.User r13 = X.C18210wN.A0P(r4, r7)
            if (r13 == 0) goto L_0x3913
            r14 = 0
            X.C04220Ms.A0B(r3, r6)
            X.C04220Ms.A0B(r4, r8)
            X.Jqm r11 = X.M6q.A06(r1)
            r16 = r14
            r6 = r3
            r7 = r5
            r8 = r1
            r12 = r4
            X.C102446Vf.A00(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            goto L_0x395f
        L_0x3913:
            X.3Y8 r2 = X.AnonymousClass3Y8.A02
            com.facebook.redex.IDxFListenerShape1S1600000_2_I2 r0 = new com.facebook.redex.IDxFListenerShape1S1600000_2_I2
            r16 = r0
            r17 = r3
            r18 = r5
            r19 = r1
            r20 = r9
            r21 = r10
            r22 = r4
            r23 = r15
            r24 = r6
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24)
            r2.A00(r4, r0, r7)
            goto L_0x395f
        L_0x3930:
            X.3S8 r0 = X.AnonymousClass3S8.A01
            X.C3T r0 = r0.A00
            if (r0 == 0) goto L_0x395f
            r0.CeG()
            goto L_0x395f
        L_0x393a:
            r0 = 1
            X.C04220Ms.A0B(r1, r0)
            X.C60113Ns.A00()
            goto L_0x404b
        L_0x3943:
            java.lang.String r2 = "bk.action.bloks.ClearCachedAsyncComponents"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x3961
            r0 = 1
            X.C04220Ms.A0B(r1, r0)
        L_0x394f:
            X.3HX r1 = r1.A00
            if (r1 == 0) goto L_0x395f
            r0 = 2131297449(0x7f0904a9, float:1.8212843E38)
            java.lang.Object r0 = r1.A00(r0)
            X.8ig r0 = (X.C144548ig) r0
            r0.get()
        L_0x395f:
            r9 = 0
            return r9
        L_0x3961:
            java.lang.String r2 = "bk.action.bloks.FetchAsyncComponents"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x396e
            java.lang.Object r9 = X.AnonymousClass6G6.A00(r1, r0)
            return r9
        L_0x396e:
            java.lang.String r2 = "bk.action.bloks.InvalidateCachedAsyncComponents"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x398d
            r2 = 0
            boolean r3 = X.AnonymousClass0wJ.A1Z(r0, r1)
            java.lang.Object r2 = X.C63893iY.A0B(r0, r2)
            r2.getClass()
            X.C18240wQ.A1I(r2)
            java.lang.Object r0 = X.C63893iY.A0B(r0, r3)
            r0.getClass()
            goto L_0x394f
        L_0x398d:
            java.lang.String r2 = "bk.action.bloks.TimestampOfLastTouchUp"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x39ad
            X.3Xc r2 = X.C62093Xc.A04
            X.0Kk r0 = r2.A01
            long r0 = r0.now()
            long r5 = X.C62093Xc.A00(r2, r0)
            r3 = -1
            int r2 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r2 == 0) goto L_0x39a8
            r0 = r5
        L_0x39a8:
            java.lang.Long r9 = java.lang.Long.valueOf(r0)
            return r9
        L_0x39ad:
            java.lang.String r2 = "bk.action.bloks.TimestampOfLastTouchUpV2"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x39c6
            X.3Xc r2 = X.C62093Xc.A04
            X.0Kk r0 = r2.A01
            long r0 = r0.now()
            long r0 = X.C62093Xc.A00(r2, r0)
            java.lang.Long r9 = java.lang.Long.valueOf(r0)
            return r9
        L_0x39c6:
            java.lang.String r2 = "bk.action.caa.FoaFetchOpenIdTokens"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x39d3
            java.lang.Object r9 = X.AnonymousClass2Bj.A00(r1, r0)
            return r9
        L_0x39d3:
            java.lang.String r5 = "bk.action.errorreporting.ReportError"
            boolean r2 = r5.equals(r3)
            if (r2 == 0) goto L_0x39f5
            r4 = 0
            boolean r3 = X.AnonymousClass0wJ.A1Z(r0, r1)
            java.lang.String r2 = X.C63893iY.A0D(r0, r4)
            java.lang.Object r0 = X.C63893iY.A0B(r0, r3)
            r0.getClass()
            X.AnonymousClass3WF.A02(r0)
            X.3HX r0 = r1.A00
            r9 = 0
            X.C30967GcS.A01(r0, r5, r2, r9, r4)
            return r9
        L_0x39f5:
            java.lang.String r2 = "bk.action.reliability.CrashNowV2"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x3a28
            r1 = 0
            X.C04220Ms.A0B(r0, r1)
            java.lang.String r2 = X.C63893iY.A0D(r0, r1)
            int r1 = r2.hashCode()
            r0 = -1488800881(0xffffffffa742b38f, float:-2.7020247E-15)
            if (r1 == r0) goto L_0x64f8
            r0 = -26746833(0xfffffffffe67e02f, float:-7.7053924E37)
            if (r1 == r0) goto L_0x64eb
            r0 = 78445(0x1326d, float:1.09925E-40)
            if (r1 != r0) goto L_0x395f
            java.lang.String r0 = "OOM"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x395f
            java.lang.String r1 = "Bloks Action bk.action.reliability.CrashNow triggered OOM"
            java.lang.OutOfMemoryError r0 = new java.lang.OutOfMemoryError
            r0.<init>(r1)
            throw r0
        L_0x3a28:
            java.lang.String r2 = "bk.action.reliability.SetAppTerminationValue"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x3a51
            r1 = 0
            X.C04220Ms.A0B(r0, r1)
            java.lang.String r2 = X.C63893iY.A0D(r0, r1)
            r1 = 1
            java.lang.Object r1 = X.C63893iY.A0B(r0, r1)
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r0 = X.C63893iY.A09(r0)
            X.AnonymousClass3WF.A02(r0)
            X.0ON r0 = X.AnonymousClass0MS.A00(r2)
            if (r1 == 0) goto L_0x650b
            X.AnonymousClass0MI.A06(r0, r1)
            goto L_0x395f
        L_0x3a51:
            java.lang.String r2 = "bk.action.SetBlockScreenshot"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x3a80
            boolean r2 = X.AnonymousClass0wJ.A1Y(r0, r1)
            boolean r2 = X.AnonymousClass3WF.A01(r0, r2)
            X.3HX r0 = r1.A00
            r9 = 0
            if (r0 == 0) goto L_0x0012
            android.content.Context r1 = r0.A00
            if (r1 == 0) goto L_0x0012
            X.7CG r0 = X.AnonymousClass7CG.A00
            android.app.Activity r0 = X.AnonymousClass7CG.A00(r1, r0)
            if (r0 == 0) goto L_0x0012
            android.view.Window r1 = r0.getWindow()
            if (r1 == 0) goto L_0x0012
            r0 = 8192(0x2000, float:1.14794E-41)
            if (r2 == 0) goto L_0x6af7
            r1.addFlags(r0)
            return r9
        L_0x3a80:
            java.lang.String r2 = "bk.action.string.MatchesRegex"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x3aaf
            r4 = 0
            X.C04220Ms.A0B(r0, r4)
            java.lang.Object r3 = X.C63893iY.A0B(r0, r4)
            r3.getClass()
            java.lang.String r2 = X.C86164wN.A0h(r3)
            java.lang.String r3 = (java.lang.String) r3
            r1 = 1
            java.lang.Object r0 = X.C63893iY.A0C(r0, r2, r1)
            java.lang.String r0 = (java.lang.String) r0
            X.C04220Ms.A0B(r3, r4)
            X.C04220Ms.A0B(r0, r1)
            boolean r0 = com.bloks.foa.extensions.regex.StringRegexUtils.matchesRegex(r3, r0)
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r0)
            return r9
        L_0x3aaf:
            java.lang.String r2 = "bk.action.string.SplitWithString"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x3ada
            r3 = 0
            java.lang.String r2 = X.C86154wM.A0l(r0, r3)
            java.lang.Object r0 = X.C63893iY.A08(r0)
            java.lang.String r0 = (java.lang.String) r0
            java.util.ArrayList r9 = X.AnonymousClass0wJ.A0v()
            java.lang.String r1 = java.util.regex.Pattern.quote(r0)
            r0 = -1
            java.lang.String[] r2 = r2.split(r1, r0)
            int r1 = r2.length
        L_0x3ad0:
            if (r3 >= r1) goto L_0x0012
            r0 = r2[r3]
            r9.add(r0)
            int r3 = r3 + 1
            goto L_0x3ad0
        L_0x3ada:
            java.lang.String r2 = "bk.action.string.Trim"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x3aef
            r1 = 0
            X.C04220Ms.A0B(r0, r1)
            java.lang.String r0 = X.C63893iY.A0D(r0, r1)
            java.lang.String r9 = X.AnonymousClass8bP.A0P(r0)
            return r9
        L_0x3aef:
            java.lang.String r2 = "bk.action.text.IsTruncated"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x3b00
            boolean r0 = X.AnonymousClass6G7.A00(r1, r0)
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r0)
            return r9
        L_0x3b00:
            java.lang.String r2 = "bk.action.trace.BeginSection"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x3b15
            r1 = 0
            X.C04220Ms.A0B(r0, r1)
            java.lang.String r0 = X.C63893iY.A0D(r0, r1)
            X.C41228M0s.A01(r0)
            r9 = 0
            return r9
        L_0x3b15:
            java.lang.String r2 = "bk.action.trace.EndSection"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x3b22
            X.C41228M0s.A00()
            r9 = 0
            return r9
        L_0x3b22:
            java.lang.String r2 = "bk.action.ttrc.AddStep"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x3b55
            r1 = 0
            X.C04220Ms.A0B(r0, r1)
            java.lang.Object r1 = X.C63893iY.A0A(r0, r1)
            int r4 = X.AnonymousClass0wJ.A04(r1)
            java.lang.Object r3 = X.C63893iY.A08(r0)
            java.lang.String r1 = X.C86164wN.A0h(r3)
            java.lang.String r3 = (java.lang.String) r3
            r2 = 2
            java.lang.Object r1 = X.C63893iY.A0C(r0, r1, r2)
            java.lang.String r1 = (java.lang.String) r1
            X.C04220Ms.A0B(r1, r2)
            X.4tg r0 = X.C63223h1.A00(r3, r4)
            if (r0 == 0) goto L_0x395f
            r0.A7g(r1)
            goto L_0x395f
        L_0x3b55:
            java.lang.String r2 = "bk.action.ttrc.CachedContentDisplayed"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x3b62
            java.lang.Object r9 = X.AnonymousClass2Bk.A00(r0)
            return r9
        L_0x3b62:
            java.lang.String r2 = "bk.action.ttrc.CompleteStep"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x3b95
            r1 = 0
            X.C04220Ms.A0B(r0, r1)
            java.lang.Object r1 = X.C63893iY.A0A(r0, r1)
            int r4 = X.AnonymousClass0wJ.A04(r1)
            java.lang.Object r3 = X.C63893iY.A08(r0)
            java.lang.String r1 = X.C86164wN.A0h(r3)
            java.lang.String r3 = (java.lang.String) r3
            r2 = 2
            java.lang.Object r1 = X.C63893iY.A0C(r0, r1, r2)
            java.lang.String r1 = (java.lang.String) r1
            X.C04220Ms.A0B(r1, r2)
            X.4tg r0 = X.C63223h1.A00(r3, r4)
            if (r0 == 0) goto L_0x395f
            r0.Cvv(r1)
            goto L_0x395f
        L_0x3b95:
            java.lang.String r2 = "bk.action.ttrc.MarkerStart"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x3ba2
            java.lang.Object r9 = X.C32342Bl.A00(r0)
            return r9
        L_0x3ba2:
            java.lang.String r2 = "bk.action.ttrc.NetworkContentDisplayed"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x3bd0
            r1 = 0
            X.C04220Ms.A0B(r0, r1)
            java.lang.Object r1 = X.C63893iY.A0A(r0, r1)
            int r5 = X.AnonymousClass0wJ.A04(r1)
            r4 = 1
            java.lang.Object r3 = X.C63893iY.A0B(r0, r4)
            java.lang.String r3 = (java.lang.String) r3
            r2 = 2
            java.lang.String r1 = X.C63893iY.A0D(r0, r2)
            X.C04220Ms.A0B(r1, r2)
            X.4tg r0 = X.C63223h1.A00(r3, r5)
            if (r0 == 0) goto L_0x395f
            r0.BhX(r1, r4)
            goto L_0x395f
        L_0x3bd0:
            java.lang.String r2 = "bk.action.ttrc.SurfaceLeft"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x3bf4
            r1 = 0
            X.C04220Ms.A0B(r0, r1)
            java.lang.Object r1 = X.C63893iY.A0A(r0, r1)
            int r2 = X.AnonymousClass0wJ.A04(r1)
            r1 = 1
            java.lang.String r0 = X.C63893iY.A0D(r0, r1)
            X.4tg r0 = X.C63223h1.A00(r0, r2)
            if (r0 == 0) goto L_0x395f
            r0.BaY()
            goto L_0x395f
        L_0x3bf4:
            java.lang.String r2 = "bk.action.AsyncComponentCacheWrite"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x3c39
            r2 = 0
            boolean r3 = X.AnonymousClass0wJ.A1Z(r0, r1)
            java.lang.Object r2 = X.C63893iY.A0B(r0, r2)
            r2.getClass()
            X.C86164wN.A0h(r2)
            java.lang.Object r2 = X.C63893iY.A0B(r0, r3)
            r2.getClass()
            r2 = 2
            java.lang.Object r2 = X.C63893iY.A0A(r0, r2)
            java.lang.Number r2 = (java.lang.Number) r2
            r2.longValue()
            r2 = 3
            r0.A0H(r2)
            X.3HX r1 = r1.A00
            r9 = 0
            if (r1 == 0) goto L_0x3c31
            r0 = 2131297449(0x7f0904a9, float:1.8212843E38)
            java.lang.Object r0 = r1.A00(r0)
            X.8ig r0 = (X.C144548ig) r0
            r0.get()
        L_0x3c31:
            java.lang.String r1 = "BKBloksActionAsyncComponentCacheWriteImpl"
            java.lang.String r0 = "Failed to get query store"
            X.C30967GcS.A02(r0, r1)
            return r9
        L_0x3c39:
            java.lang.String r2 = "bk.action.caa.foa.reg.GetAgeFromBirthdayTimestamp"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x3c46
            java.lang.Object r9 = X.C32352Bm.A00(r0)
            return r9
        L_0x3c46:
            java.lang.String r2 = "bk.action.fs.GetAvailableStorageSpace"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x3c5b
            X.0Kh r0 = X.C03690Kh.A01()
            long r0 = r0.A05()
            java.lang.Long r9 = java.lang.Long.valueOf(r0)
            return r9
        L_0x3c5b:
            java.lang.String r2 = "bk.action.ttrc.AddAnnotation"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x3c94
            r1 = 0
            X.C04220Ms.A0B(r0, r1)
            java.lang.Object r1 = X.C63893iY.A0A(r0, r1)
            int r4 = X.AnonymousClass0wJ.A04(r1)
            r1 = 1
            java.util.List r0 = r0.A00
            java.lang.String r3 = X.C18190wL.A0q(r0, r1)
            r2 = 2
            java.lang.Object r1 = r0.get(r2)
            r0 = 1264(0x4f0, float:1.771E-42)
            java.lang.String r0 = X.C18170wI.A00(r0)
            X.C04220Ms.A0C(r1, r0)
            java.util.Map r1 = (java.util.Map) r1
            X.C04220Ms.A0B(r1, r2)
            X.4tg r0 = X.C63223h1.A00(r3, r4)
            if (r0 == 0) goto L_0x395f
            X.C63223h1.A02(r0, r1)
            goto L_0x395f
        L_0x3c94:
            java.lang.String r2 = "bk.action.ttrc.AddPointV2"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x3cd9
            r1 = 0
            X.C04220Ms.A0B(r0, r1)
            java.lang.Object r1 = X.C63893iY.A0A(r0, r1)
            int r5 = X.AnonymousClass0wJ.A04(r1)
            java.lang.Object r4 = X.C63893iY.A08(r0)
            java.lang.String r2 = "null cannot be cast to non-null type kotlin.String"
            X.C04220Ms.A0C(r4, r2)
            java.lang.String r4 = (java.lang.String) r4
            r1 = 2
            java.lang.Object r3 = X.C63893iY.A0C(r0, r2, r1)
            java.lang.String r3 = (java.lang.String) r3
            r1 = 3
            java.lang.Object r2 = X.C63893iY.A0B(r0, r1)
            r2.getClass()
            java.util.Map r2 = (java.util.Map) r2
            r1 = 4
            java.lang.Object r1 = X.C63893iY.A0B(r0, r1)
            r0 = 29
            java.lang.String r0 = X.C18170wI.A00(r0)
            X.C04220Ms.A0C(r1, r0)
            java.lang.Long r1 = (java.lang.Long) r1
            X.C63223h1.A03(r1, r4, r3, r2, r5)
            r9 = 0
            return r9
        L_0x3cd9:
            java.lang.String r2 = "bk.action.animated.AddOnCompleteListener"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x3d03
            r4 = 0
            boolean r2 = X.AnonymousClass0wJ.A1Z(r0, r1)
            X.3HX r3 = r1.A00
            if (r3 == 0) goto L_0x395f
            java.lang.Object r9 = X.C63893iY.A0B(r0, r4)
            r9.getClass()
            android.animation.Animator r9 = (android.animation.Animator) r9
            X.6jp r2 = X.C63893iY.A06(r0, r2)
            X.C04220Ms.A0B(r9, r4)
            X.0wW r0 = new X.0wW
            r0.<init>(r3, r1, r2)
            r9.addListener(r0)
            return r9
        L_0x3d03:
            java.lang.String r2 = "bk.action.animated.Build"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x3d25
            r3 = 0
            boolean r2 = X.AnonymousClass0wJ.A1Z(r0, r1)
            X.3HX r1 = r1.A00
            if (r1 == 0) goto L_0x395f
            java.lang.Object r9 = X.C63893iY.A0B(r0, r3)
            r9.getClass()
            android.animation.Animator r9 = (android.animation.Animator) r9
            java.lang.String r0 = X.C63893iY.A0D(r0, r2)
            X.AnonymousClass7Jm.A04(r9, r1, r0)
            return r9
        L_0x3d25:
            java.lang.String r2 = "bk.action.animated.Cancel"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x3d3d
            java.lang.Object r1 = X.C86124wJ.A0m(r0)
            java.lang.String r0 = "null cannot be cast to non-null type android.animation.Animator"
            X.C04220Ms.A0C(r1, r0)
            android.animation.Animator r1 = (android.animation.Animator) r1
            r1.cancel()
            r9 = 0
            return r9
        L_0x3d3d:
            java.lang.String r2 = "bk.action.animated.CancelToken"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x3d5c
            boolean r2 = X.AnonymousClass0wJ.A1Y(r0, r1)
            X.3HX r1 = r1.A00
            r9 = 0
            if (r1 == 0) goto L_0x0012
            java.lang.String r0 = X.C63893iY.A0D(r0, r2)
            android.animation.Animator r0 = X.AnonymousClass7Jm.A01(r1, r0)
            if (r0 == 0) goto L_0x0012
        L_0x3d58:
            r0.cancel()
            return r9
        L_0x3d5c:
            java.lang.String r2 = "bk.action.animated.CancelWithToken"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x3d78
            boolean r2 = X.AnonymousClass0wJ.A1Y(r0, r1)
            X.3HX r1 = r1.A00
            r9 = 0
            if (r1 == 0) goto L_0x0012
            java.lang.String r0 = X.C63893iY.A0D(r0, r2)
            android.animation.Animator r0 = X.AnonymousClass7Jm.A01(r1, r0)
            if (r0 == 0) goto L_0x0012
            goto L_0x3d58
        L_0x3d78:
            java.lang.String r2 = "bk.action.animated.Create"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x3d85
            java.lang.Object r9 = X.AnonymousClass6GA.A00(r1, r0)
            return r9
        L_0x3d85:
            java.lang.String r2 = "bk.action.animated.CreateColor"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x3d92
            java.lang.Object r9 = X.AnonymousClass6GB.A00(r1, r0)
            return r9
        L_0x3d92:
            java.lang.String r2 = "bk.action.animated.CreateDimension"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x3d9f
            java.lang.Object r9 = X.AnonymousClass6GC.A00(r1, r0)
            return r9
        L_0x3d9f:
            java.lang.String r2 = "bk.action.animated.Destroy"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x3dc7
            boolean r3 = X.AnonymousClass0wJ.A1Y(r0, r1)
            X.3HX r2 = r1.A00
            r9 = 0
            if (r2 == 0) goto L_0x0012
            java.lang.Object r1 = X.C63893iY.A0B(r0, r3)
            r1.getClass()
            X.C18240wQ.A1I(r1)
            r0 = 2131297447(0x7f0904a7, float:1.821284E38)
            java.lang.Object r0 = r2.A00(r0)
            java.util.AbstractMap r0 = (java.util.AbstractMap) r0
            r0.remove(r1)
            return r9
        L_0x3dc7:
            java.lang.String r2 = "bk.action.animated.easing.CreateCubicBezier"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x3dfd
            java.lang.Object r1 = X.C86124wJ.A0m(r0)
            java.lang.String r5 = "null cannot be cast to non-null type kotlin.Number"
            X.C04220Ms.A0C(r1, r5)
            float r4 = X.C18240wQ.A00(r1)
            r1 = 1
            java.lang.Object r1 = X.C63893iY.A0C(r0, r5, r1)
            float r3 = X.C18240wQ.A00(r1)
            r1 = 2
            java.lang.Object r1 = X.C63893iY.A0C(r0, r5, r1)
            float r2 = X.C18240wQ.A00(r1)
            r1 = 3
            java.lang.Object r0 = X.C63893iY.A0C(r0, r5, r1)
            float r0 = X.C18240wQ.A00(r0)
            android.view.animation.PathInterpolator r9 = new android.view.animation.PathInterpolator
            r9.<init>(r4, r3, r2, r0)
            return r9
        L_0x3dfd:
            java.lang.String r2 = "bk.action.animated.GetCurrentColorValue"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x3e26
            java.lang.Object r1 = X.C86124wJ.A0m(r0)
            java.lang.String r0 = "null cannot be cast to non-null type android.animation.ValueAnimator"
            X.C04220Ms.A0C(r1, r0)
            android.animation.ValueAnimator r1 = (android.animation.ValueAnimator) r1
            java.lang.Object r0 = X.C86134wK.A0e(r1)
            java.util.Locale r2 = java.util.Locale.US
            r1 = 1
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r0, r1)
            java.lang.String r0 = "#%08x"
            java.lang.String r9 = X.C86154wM.A0o(r2, r0, r1)
            return r9
        L_0x3e26:
            java.lang.String r2 = "bk.action.animated.GetCurrentDimensionValue"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x3e6b
            r7 = 0
            X.C04220Ms.A0B(r0, r7)
            java.lang.Object r0 = X.C63893iY.A0B(r0, r7)
            r0.getClass()
            X.5CT r0 = (X.AnonymousClass5CT) r0
            java.lang.Object r6 = X.C86144wL.A0e(r0)
            java.lang.Number r6 = (java.lang.Number) r6
            float r5 = r6.floatValue()
            java.lang.Integer r4 = r0.A00
            java.lang.Integer r0 = X.AnonymousClass006.A00
            r3 = 1
            java.util.Locale r2 = java.util.Locale.US
            java.lang.Object[] r1 = new java.lang.Object[r3]
            if (r4 != r0) goto L_0x3e5d
            r1[r7] = r6
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r1, r3)
            java.lang.String r0 = "%.2f%%"
        L_0x3e58:
            java.lang.String r9 = X.C86154wM.A0o(r2, r0, r1)
            return r9
        L_0x3e5d:
            int r0 = X.AnonymousClass8bA.A02(r5)
            X.C86164wN.A1O(r1, r0, r7)
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r1, r3)
            java.lang.String r0 = "%dpx"
            goto L_0x3e58
        L_0x3e6b:
            java.lang.String r2 = "bk.action.animated.GetCurrentPlayTime"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x3e97
            boolean r2 = X.AnonymousClass0wJ.A1Y(r0, r1)
            X.3HX r1 = r1.A00
            java.lang.Float r9 = X.C86124wJ.A0g()
            if (r1 == 0) goto L_0x0012
            java.lang.String r0 = X.C63893iY.A0D(r0, r2)
            android.animation.Animator r0 = X.AnonymousClass7Jm.A01(r1, r0)
            if (r0 == 0) goto L_0x0012
            long r0 = X.AnonymousClass7Jm.A00(r0)
            float r3 = (float) r0
            long r1 = X.AnonymousClass7Jm.A00
            float r0 = (float) r1
            float r3 = r3 / r0
            java.lang.Float r9 = java.lang.Float.valueOf(r3)
            return r9
        L_0x3e97:
            java.lang.String r2 = "bk.action.animated.GetCurrentValue"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x3eb8
            java.lang.Object r1 = X.C86124wJ.A0m(r0)
            java.lang.String r0 = "null cannot be cast to non-null type android.animation.ValueAnimator"
            X.C04220Ms.A0C(r1, r0)
            android.animation.ValueAnimator r1 = (android.animation.ValueAnimator) r1
            java.lang.Object r0 = X.C86144wL.A0e(r1)
            float r0 = X.C18240wQ.A00(r0)
            double r0 = (double) r0
            java.lang.Number r9 = X.AnonymousClass3WF.A00(r0)
            return r9
        L_0x3eb8:
            java.lang.String r2 = "bk.action.animated.GetTotalDuration"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x3ee2
            boolean r2 = X.AnonymousClass0wJ.A1Y(r0, r1)
            X.3HX r1 = r1.A00
            r9 = 0
            if (r1 == 0) goto L_0x0012
            java.lang.String r0 = X.C63893iY.A0D(r0, r2)
            android.animation.Animator r0 = X.AnonymousClass7Jm.A01(r1, r0)
            if (r0 == 0) goto L_0x0012
            long r4 = r0.getTotalDuration()
            r1 = -1
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x6afb
            java.lang.Long r9 = java.lang.Long.valueOf(r1)
            return r9
        L_0x3ee2:
            java.lang.String r2 = "bk.action.animated.IsInitialized"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x3ef8
            boolean r3 = X.AnonymousClass0wJ.A1Y(r0, r1)
            X.3HX r2 = r1.A00
            r1 = 0
            if (r2 != 0) goto L_0x6b05
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r3)
            return r9
        L_0x3ef8:
            java.lang.String r2 = "bk.action.animated.Loop"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x3f20
            r4 = 0
            boolean r3 = X.AnonymousClass0wJ.A1Z(r0, r1)
            X.3HX r2 = r1.A00
            if (r2 == 0) goto L_0x395f
            java.lang.Object r1 = X.C63893iY.A0A(r0, r4)
            int r1 = X.AnonymousClass0wJ.A04(r1)
            java.lang.Object r0 = X.C63893iY.A0B(r0, r3)
            r0.getClass()
            android.animation.Animator r0 = (android.animation.Animator) r0
            X.4wQ r9 = new X.4wQ
            r9.<init>(r0, r2, r1)
            return r9
        L_0x3f20:
            java.lang.String r2 = "bk.action.animated.Parallel"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x3f2d
            java.lang.Object r9 = X.AnonymousClass6GD.A00(r1, r0)
            return r9
        L_0x3f2d:
            java.lang.String r2 = "bk.action.animated.Pause"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x3f61
            boolean r3 = X.AnonymousClass0wJ.A1Y(r0, r1)
            X.3HX r1 = r1.A00
            r2 = 0
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r3)
            if (r1 == 0) goto L_0x0012
            java.lang.String r0 = X.C63893iY.A0D(r0, r3)
            android.animation.Animator r1 = X.AnonymousClass7Jm.A01(r1, r0)
            if (r1 == 0) goto L_0x0012
            boolean r0 = r1.isPaused()
            r1.pause()
            if (r0 != 0) goto L_0x3f5c
            boolean r0 = r1.isPaused()
        L_0x3f59:
            if (r0 == 0) goto L_0x3f5c
        L_0x3f5b:
            r2 = 1
        L_0x3f5c:
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r2)
            return r9
        L_0x3f61:
            java.lang.String r2 = "bk.action.animated.Resume"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x3f90
            boolean r3 = X.AnonymousClass0wJ.A1Y(r0, r1)
            X.3HX r1 = r1.A00
            r2 = 0
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r3)
            if (r1 == 0) goto L_0x0012
            java.lang.String r0 = X.C63893iY.A0D(r0, r3)
            android.animation.Animator r1 = X.AnonymousClass7Jm.A01(r1, r0)
            if (r1 == 0) goto L_0x0012
            boolean r0 = r1.isPaused()
            r1.resume()
            if (r0 == 0) goto L_0x3f5c
            boolean r0 = r1.isPaused()
            if (r0 != 0) goto L_0x3f5c
            goto L_0x3f5b
        L_0x3f90:
            java.lang.String r2 = "bk.action.animated.Sequence"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x3fd8
            r3 = 0
            boolean r2 = X.AnonymousClass0wJ.A1Z(r0, r1)
            X.3HX r8 = r1.A00
            if (r8 == 0) goto L_0x395f
            java.lang.Object r7 = X.C63893iY.A0B(r0, r3)
            r7.getClass()
            java.util.List r7 = (java.util.List) r7
            X.C04220Ms.A0B(r7, r2)
            int r6 = r7.size()
            if (r6 == r2) goto L_0x6b25
            r5 = 0
        L_0x3fb4:
            if (r5 >= r6) goto L_0x6b15
            java.lang.Object r4 = r7.get(r5)
            android.animation.Animator r4 = (android.animation.Animator) r4
            X.AnonymousClass7K7.A06(r4, r8)
            if (r5 <= 0) goto L_0x3fd5
            int r0 = r5 + -1
            java.lang.Object r0 = r7.get(r0)
            android.animation.Animator r0 = (android.animation.Animator) r0
            long r2 = r0.getStartDelay()
            long r0 = r0.getDuration()
            long r2 = r2 + r0
            X.AnonymousClass7Jm.A02(r4, r2)
        L_0x3fd5:
            int r5 = r5 + 1
            goto L_0x3fb4
        L_0x3fd8:
            java.lang.String r2 = "bk.action.animated.SetCurrentPlayTime"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x4005
            r4 = 0
            boolean r3 = X.AnonymousClass0wJ.A1Z(r0, r1)
            X.3HX r2 = r1.A00
            r9 = 0
            if (r2 == 0) goto L_0x0012
            java.lang.String r1 = X.C63893iY.A0D(r0, r4)
            java.lang.Object r0 = X.C63893iY.A0A(r0, r3)
            float r4 = X.C18240wQ.A00(r0)
            android.animation.Animator r3 = X.AnonymousClass7Jm.A01(r2, r1)
            if (r3 == 0) goto L_0x0012
            long r1 = X.AnonymousClass7Jm.A00
            float r0 = (float) r1
            float r4 = r4 * r0
            long r0 = (long) r4
            X.AnonymousClass7Jm.A03(r3, r0)
            return r9
        L_0x4005:
            java.lang.String r2 = "bk.action.animated.Stagger"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x4059
            r2 = 0
            boolean r4 = X.AnonymousClass0wJ.A1Z(r0, r1)
            X.3HX r8 = r1.A00
            if (r8 == 0) goto L_0x395f
            java.lang.Object r1 = X.C63893iY.A0A(r0, r2)
            float r3 = X.C18240wQ.A00(r1)
            java.lang.Object r7 = X.C63893iY.A0B(r0, r4)
            r7.getClass()
            java.util.List r7 = (java.util.List) r7
            long r1 = X.AnonymousClass7Jm.A00
            float r0 = (float) r1
            float r3 = r3 * r0
            long r5 = (long) r3
            X.C04220Ms.A0B(r7, r4)
            int r0 = r7.size()
            if (r0 == r4) goto L_0x6b25
            r1 = 0
            java.util.Iterator r4 = r7.iterator()
        L_0x403a:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x6b1d
            java.lang.Object r3 = r4.next()
            int r2 = r1 + 1
            if (r1 >= 0) goto L_0x404d
            X.C06750aI.A1A()
        L_0x404b:
            r0 = 0
            throw r0
        L_0x404d:
            android.animation.Animator r3 = (android.animation.Animator) r3
            X.AnonymousClass7K7.A06(r3, r8)
            long r0 = (long) r1
            long r0 = r0 * r5
            X.AnonymousClass7Jm.A02(r3, r0)
            r1 = r2
            goto L_0x403a
        L_0x4059:
            java.lang.String r2 = "bk.action.animated.Start"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x408b
            r2 = 0
            boolean r5 = X.AnonymousClass0wJ.A1Z(r0, r1)
            X.3HX r4 = r1.A00
            r9 = 0
            if (r4 == 0) goto L_0x0012
            java.lang.Object r3 = X.C63893iY.A0B(r0, r2)
            r3.getClass()
            android.animation.Animator r3 = (android.animation.Animator) r3
            X.7Jm r2 = X.AnonymousClass7Jm.A01
            java.lang.String r0 = "NO_ID"
            java.lang.StringBuilder r1 = X.C18190wL.A0s(r0)
            java.util.UUID r0 = java.util.UUID.randomUUID()
            java.lang.String r0 = X.C18200wM.A0m(r0, r1)
            X.AnonymousClass7Jm.A04(r3, r4, r0)
            r2.A05(r4, r0, r5)
            return r9
        L_0x408b:
            java.lang.String r2 = "bk.action.animated.StartToken"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x40a6
            boolean r3 = X.AnonymousClass0wJ.A1Y(r0, r1)
            X.3HX r2 = r1.A00
            r9 = 0
            if (r2 == 0) goto L_0x0012
            java.lang.String r1 = X.C63893iY.A0D(r0, r3)
            X.7Jm r0 = X.AnonymousClass7Jm.A01
            r0.A05(r2, r1, r3)
            return r9
        L_0x40a6:
            java.lang.String r2 = "bk.action.animated.StartWithToken"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x40d6
            r2 = 0
            boolean r4 = X.AnonymousClass0wJ.A1Z(r0, r1)
            X.3HX r3 = r1.A00
            r9 = 0
            if (r3 == 0) goto L_0x0012
            java.lang.Object r2 = X.C63893iY.A0B(r0, r2)
            r2.getClass()
            android.animation.Animator r2 = (android.animation.Animator) r2
            java.lang.Object r1 = X.C63893iY.A0B(r0, r4)
            r1.getClass()
            X.C18240wQ.A1I(r1)
            java.lang.String r1 = (java.lang.String) r1
            X.7Jm r0 = X.AnonymousClass7Jm.A01
            X.AnonymousClass7Jm.A04(r2, r3, r1)
            r0.A05(r3, r1, r4)
            return r9
        L_0x40d6:
            java.lang.String r2 = "bk.action.collection.GetVisibleCollectionItemAt"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x40e3
            java.lang.Object r9 = X.AnonymousClass6GE.A00(r1, r0)
            return r9
        L_0x40e3:
            java.lang.String r6 = "bk.action.media.LoadAlbums"
            boolean r2 = r6.equals(r3)
            if (r2 == 0) goto L_0x4115
            r2 = 0
            boolean r5 = X.AnonymousClass0wJ.A1Z(r0, r1)
            X.3HX r4 = r1.A00
            r9 = 0
            if (r4 == 0) goto L_0x0012
            java.lang.String r1 = "media_store"
            X.8ij r3 = X.AnonymousClass7K7.A02(r4, r1)
            boolean r1 = r3 instanceof X.AnonymousClass7r0
            if (r1 == 0) goto L_0x6b2a
            X.7r0 r3 = (X.AnonymousClass7r0) r3
            if (r3 == 0) goto L_0x6b2a
            java.lang.String r2 = X.C63893iY.A0D(r0, r2)
            X.C04220Ms.A0B(r2, r5)
            java.util.concurrent.ExecutorService r1 = r3.A02
            X.828 r0 = new X.828
            r0.<init>(r3, r4, r2)
            r1.execute(r0)
            return r9
        L_0x4115:
            java.lang.String r4 = "bk.action.media.LoadMediaV3"
            boolean r2 = r4.equals(r3)
            if (r2 == 0) goto L_0x4179
            r2 = 0
            boolean r3 = X.AnonymousClass0wJ.A1Z(r0, r1)
            X.3HX r5 = r1.A00
            r9 = 0
            if (r5 == 0) goto L_0x0012
            java.lang.String r1 = "media_store"
            X.8ij r12 = X.AnonymousClass7K7.A02(r5, r1)
            boolean r1 = r12 instanceof X.AnonymousClass7r0
            if (r1 == 0) goto L_0x6b30
            X.7r0 r12 = (X.AnonymousClass7r0) r12
            if (r12 == 0) goto L_0x6b30
            java.lang.Object r2 = X.C63893iY.A0B(r0, r2)
            r2.getClass()
            X.C18240wQ.A1I(r2)
            java.lang.String r2 = (java.lang.String) r2
            java.util.List r4 = r0.A00
            java.util.List r17 = X.C86164wN.A0k(r4, r3)
            r0 = 2
            java.lang.String r14 = X.C18190wL.A0q(r4, r0)
            r0 = 3
            java.lang.Object r1 = r4.get(r0)
            java.lang.Number r1 = (java.lang.Number) r1
            r0 = 4
            java.lang.String r15 = X.C18190wL.A0q(r4, r0)
            android.content.Context r11 = r5.A00
            X.C04220Ms.A06(r11)
            if (r1 == 0) goto L_0x4177
            int r0 = r1.intValue()
            java.lang.Integer r13 = java.lang.Integer.valueOf(r0)
        L_0x4167:
            X.C04220Ms.A0B(r2, r3)
            java.util.concurrent.ExecutorService r0 = r12.A02
            X.83E r10 = new X.83E
            r16 = r2
            r10.<init>(r11, r12, r13, r14, r15, r16, r17)
            r0.execute(r10)
            return r9
        L_0x4177:
            r13 = r9
            goto L_0x4167
        L_0x4179:
            java.lang.String r2 = "bk.action.textinput.GetText"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x41a7
            r2 = 0
            boolean r3 = X.AnonymousClass0wJ.A1Z(r0, r1)
            X.7h3 r2 = X.C63893iY.A03(r0, r2)
            X.3HX r0 = X.C131677sb.A01(r1, r0, r3)
            java.lang.Object r0 = X.AnonymousClass7K7.A04(r0, r2)
            X.6n9 r0 = (X.C111326n9) r0
            if (r0 == 0) goto L_0x41a4
            android.text.Editable r0 = r0.A0L
            java.lang.String r0 = r0.toString()
            if (r0 == 0) goto L_0x41a4
            java.lang.String r9 = r0.toString()
            if (r9 != 0) goto L_0x0012
        L_0x41a4:
            java.lang.String r9 = ""
            return r9
        L_0x41a7:
            java.lang.String r2 = "bk.action.textinput.SetText"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L_0x66fc
            java.lang.String r2 = "bk.action.textinput.SetTextV2"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L_0x66fc
            java.lang.String r6 = "bk.action.tooltip.Hide"
            boolean r2 = r6.equals(r3)
            if (r2 == 0) goto L_0x41fc
            r5 = 0
            boolean r4 = X.AnonymousClass0wJ.A1Z(r0, r1)
            X.3HX r2 = r1.A00
            if (r2 == 0) goto L_0x6b36
            java.lang.Object r3 = X.C63893iY.A0B(r0, r5)
            r3.getClass()
            X.7h3 r3 = (X.C127397h3) r3
            int r1 = r3.A03
            r0 = 16444(0x403c, float:2.3043E-41)
            if (r1 != r0) goto L_0x6510
            java.lang.Object r2 = X.AnonymousClass7K7.A03(r2, r3)
            X.76c r2 = (X.C1196076c) r2
            X.0Oa r1 = r2.A04
            java.lang.Object r0 = X.C18190wL.A0f(r1)
            X.6qE r0 = (X.C112806qE) r0
            X.51x r0 = r0.A02
            boolean r0 = r0.isShowing()
            if (r0 == 0) goto L_0x395f
            java.lang.Object r0 = X.C18190wL.A0f(r1)
            X.6qE r0 = (X.C112806qE) r0
            boolean r0 = r0.A01
            if (r0 != 0) goto L_0x395f
            X.C1196076c.A00(r2, r3, r5, r4)
            goto L_0x395f
        L_0x41fc:
            java.lang.String r2 = "bk.action.tooltip.Show"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x4209
            java.lang.Object r9 = X.AnonymousClass6GF.A00(r1, r0)
            return r9
        L_0x4209:
            java.lang.String r2 = "bk.action.i18n.LanguagePackResolveFbt"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x4216
            java.lang.Object r9 = X.AnonymousClass6GN.A00(r0)
            return r9
        L_0x4216:
            java.lang.String r2 = "fbpay.action.DAGeneratePTT"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x4223
            java.lang.Object r9 = X.C99166Ij.A00(r1, r0)
            return r9
        L_0x4223:
            java.lang.String r2 = "ig.action.navigation.OpenUserDetail"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x4242
            boolean r2 = X.AnonymousClass0wJ.A1Y(r0, r1)
            java.lang.String r2 = X.C63893iY.A0D(r0, r2)
            androidx.fragment.app.FragmentActivity r1 = X.C63913ic.A05(r1)
            java.lang.String r0 = "barcelona://user?id="
            java.lang.String r0 = X.AnonymousClass00U.A0L(r0, r2)
            X.C63753iH.A04(r1, r0)
            r9 = 0
            return r9
        L_0x4242:
            java.lang.String r2 = "bk.fx.action.UpdateClientLinkageCache"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x424f
            java.lang.Object r9 = X.C67143yw.A00(r1, r0)
            return r9
        L_0x424f:
            java.lang.String r2 = "bk.action.bloks.AsyncAction"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x425c
            java.lang.Object r9 = X.C62053Wy.A01(r1, r0)
            return r9
        L_0x425c:
            java.lang.String r2 = "bk.action.bloks.AsyncActionWithDataManifest"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x4269
            java.lang.Object r9 = X.AnonymousClass2G1.A00(r1, r0)
            return r9
        L_0x4269:
            java.lang.String r2 = "bk.action.bloks.AsyncActionWithDataManifestV2"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x4276
            java.lang.Object r9 = X.AnonymousClass2G2.A00(r1, r0)
            return r9
        L_0x4276:
            java.lang.String r2 = "bk.action.bloks.AsyncLoadV2"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x4283
            java.lang.Object r9 = X.AnonymousClass2G3.A00(r1, r0)
            return r9
        L_0x4283:
            java.lang.String r2 = "authenticity.action.OpenIdCapture"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x4290
            java.lang.Object r9 = X.C30596GMj.A00(r1, r0)
            return r9
        L_0x4290:
            java.lang.String r2 = "authenticity.action.OpenSelfieCapture"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x429d
            java.lang.Object r9 = X.AnonymousClass2G4.A00(r1, r0)
            return r9
        L_0x429d:
            java.lang.String r2 = "authenticity.action.Upload"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x42aa
            java.lang.Object r9 = X.C29297Flo.A00(r1, r0)
            return r9
        L_0x42aa:
            java.lang.String r2 = "bk.action.ad_activity.OpenAdActivityChain"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x42b7
            java.lang.Object r9 = X.C19250AtF.A00(r1, r0)
            return r9
        L_0x42b7:
            java.lang.String r2 = "bk.action.ais.max.AddDirectInstallListener"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x42de
            r2 = 0
            boolean r3 = X.AnonymousClass0wJ.A1Z(r0, r1)
            java.lang.String r2 = X.C63893iY.A0D(r0, r2)
            X.6jp r3 = X.C63893iY.A06(r0, r3)
            X.M1U r2 = X.AnonymousClass738.A00(r2)
            X.408 r0 = new X.408
            r0.<init>(r1, r3)
            int r0 = r2.A01(r0)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r0)
            return r9
        L_0x42de:
            java.lang.String r2 = "bk.action.ais.max.DirectInstallAddListener"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x4305
            r2 = 0
            boolean r3 = X.AnonymousClass0wJ.A1Z(r0, r1)
            java.lang.String r2 = X.C63893iY.A0D(r0, r2)
            X.6jp r3 = X.C63893iY.A06(r0, r3)
            X.M1U r2 = X.AnonymousClass738.A00(r2)
            X.409 r0 = new X.409
            r0.<init>(r1, r3)
            int r0 = r2.A01(r0)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r0)
            return r9
        L_0x4305:
            java.lang.String r2 = "bk.action.ais.max.DirectInstallAppEvent"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x4312
            java.lang.Object r9 = X.C40430LgD.A00(r0)
            return r9
        L_0x4312:
            java.lang.String r2 = "bk.action.ais.max.DirectInstallRemoveListener"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x4334
            r1 = 0
            X.C04220Ms.A0B(r0, r1)
            java.lang.String r2 = X.C63893iY.A0D(r0, r1)
            java.lang.Object r1 = X.C63893iY.A08(r0)
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.Int"
            X.C04220Ms.A0C(r1, r0)
            X.M1U r0 = X.AnonymousClass738.A00(r2)
            java.util.HashMap r0 = r0.A05
            monitor-enter(r0)
            goto L_0x6b3d
        L_0x4334:
            java.lang.String r2 = "bk.action.ais.OnAutoOpenShown"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x434c
            r2 = 1
            X.C04220Ms.A0B(r1, r2)
            com.instagram.service.session.UserSession r0 = X.C86104wH.A0Y(r1)
            X.7tg r0 = X.AnonymousClass6HM.A00(r0)
            r0.A00 = r2
            r9 = 0
            return r9
        L_0x434c:
            java.lang.String r2 = "bk.action.ais.OnAutoOpenToggle"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x4379
            boolean r2 = X.AnonymousClass0wJ.A1Y(r0, r1)
            boolean r2 = X.AnonymousClass3WF.A01(r0, r2)
            com.instagram.service.session.UserSession r0 = X.C86104wH.A0Y(r1)
            X.7tg r0 = X.AnonymousClass6HM.A00(r0)
            android.content.SharedPreferences r0 = r0.A01
            android.content.SharedPreferences$Editor r1 = r0.edit()
            r0 = 240(0xf0, float:3.36E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            android.content.SharedPreferences$Editor r0 = r1.putBoolean(r0, r2)
            r0.commit()
            r9 = 0
            return r9
        L_0x4379:
            java.lang.String r2 = "bk.action.array.I18nJoiner"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x439f
            java.lang.Object r2 = X.C86124wJ.A0m(r0)
            r0 = 9
            java.lang.String r0 = X.C18170wI.A00(r0)
            X.C04220Ms.A0C(r2, r0)
            java.util.List r2 = (java.util.List) r2
            android.content.Context r1 = X.C18230wP.A08()
            android.content.res.Configuration r0 = X.C86114wI.A0B(r1)
            java.util.Locale r0 = r0.locale
            java.lang.String r9 = X.AnonymousClass6QJ.A00(r1, r2, r0)
            return r9
        L_0x439f:
            java.lang.String r2 = "bk.action.avatar.CaptureAutogenCamera"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x43bd
            r0 = 1
            X.C04220Ms.A0B(r1, r0)
            X.0i6 r0 = X.C63913ic.A0F(r1)
            X.KHq r1 = X.AnonymousClass3LY.A00(r0)
            X.7rE r0 = new X.7rE
            r0.<init>()
            r1.CWx(r0)
            r9 = 0
            return r9
        L_0x43bd:
            java.lang.String r2 = "bk.action.biig.tas.ToggleFlagThread"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x43ca
            java.lang.Object r9 = X.A3W.A00(r1, r0)
            return r9
        L_0x43ca:
            java.lang.String r2 = "bk.action.bloks.CloseScreenV2"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x43f9
            boolean r4 = X.AnonymousClass0wJ.A1Y(r0, r1)
            java.lang.Object r2 = X.C63893iY.A0B(r0, r4)
            X.7h3 r2 = (X.C127397h3) r2
            r9 = 0
            if (r2 == 0) goto L_0x6b46
            java.lang.String r3 = X.C18220wO.A0o(r2)
            r0 = 36
            java.lang.Object r0 = X.C127397h3.A0A(r2, r0)
            boolean r2 = X.AnonymousClass2LL.A00(r0, r4)
            if (r3 == 0) goto L_0x6b46
        L_0x43ef:
            X.0m7 r0 = X.C63913ic.A07(r1)
            if (r0 == 0) goto L_0x0012
            r0.A11(r3, r2)
            return r9
        L_0x43f9:
            java.lang.String r2 = "bk.action.bloks.DismissBottomSheet"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L_0x6be6
            java.lang.String r2 = "bk.action.bloks.GetIgAndroidDeviceId"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x441a
            r0 = 0
            X.C04220Ms.A0B(r1, r0)
            androidx.fragment.app.Fragment r0 = X.C63913ic.A01(r1)
            android.content.Context r0 = r0.getContext()
            java.lang.String r9 = X.C09140ev.A00(r0)
            return r9
        L_0x441a:
            java.lang.String r2 = "bk.action.bloks.IsAppInstalled"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x4427
            java.lang.Object r9 = X.AnonymousClass2G6.A00(r1, r0)
            return r9
        L_0x4427:
            java.lang.String r2 = "bk.action.bloks.OpenAppStore"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x444e
            X.AnonymousClass0wJ.A1N(r0, r1)
            X.3HX r1 = X.C63913ic.A0D(r1)
            android.content.Context r3 = r1.A00
            X.C04220Ms.A06(r3)
            r1 = 2
            java.util.List r2 = r0.A00
            java.lang.String r1 = X.C18190wL.A0q(r2, r1)
            r0 = 4
            java.lang.String r0 = X.C18190wL.A0q(r2, r0)
            if (r1 == 0) goto L_0x6b52
            X.C09650fs.A01(r3, r1, r0)
            r9 = 0
            return r9
        L_0x444e:
            java.lang.String r2 = "bk.action.bloks.OpenBottomSheet"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x447a
            java.lang.Object r2 = X.C63893iY.A07(r0)
            X.7h3 r2 = (X.C127397h3) r2
            X.3HX r5 = X.C63913ic.A0D(r1)
            r0 = 0
            X.C04220Ms.A0B(r1, r0)
            androidx.fragment.app.FragmentActivity r3 = X.C63913ic.A05(r1)
            X.7qT r4 = X.C63913ic.A08(r1)
            X.7h3 r7 = X.M6q.A04(r2)
            r9 = 0
            X.0i6 r8 = X.C63913ic.A0E(r5)
            r6 = r1
            X.M6q.A0A(r3, r4, r5, r6, r7, r8, r9)
            return r9
        L_0x447a:
            java.lang.String r2 = "bk.action.bloks.OpenBottomSheetV2"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x44b4
            java.lang.Object r3 = X.C63893iY.A07(r0)
            X.7Jj r3 = (X.C121997Jj) r3
            android.util.Pair r0 = X.C101016Po.A00(r3)
            java.lang.Object r2 = r0.first
            X.7h3 r2 = (X.C127397h3) r2
            r0 = 65
            java.util.Map r10 = X.C63763iI.A0B(r1, r2, r0)
            X.3HX r6 = X.C63913ic.A0D(r1)
            r0 = 0
            X.C04220Ms.A0B(r1, r0)
            androidx.fragment.app.FragmentActivity r4 = X.C63913ic.A05(r1)
            X.7qT r5 = X.C63913ic.A08(r1)
            X.7h3 r8 = X.M6q.A03(r3)
            X.0i6 r9 = X.C63913ic.A0E(r6)
            r7 = r1
            X.M6q.A0A(r4, r5, r6, r7, r8, r9, r10)
            r9 = 0
            return r9
        L_0x44b4:
            java.lang.String r2 = "bk.action.bloks.OpenBottomSheetV3"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x44e4
            java.lang.Object r4 = X.C63893iY.A07(r0)
            X.7h3 r4 = (X.C127397h3) r4
            java.lang.Object r3 = X.C63893iY.A08(r0)
            java.util.Map r3 = (java.util.Map) r3
            r2 = 3
            java.lang.Object r0 = X.C63893iY.A0B(r0, r2)
            java.util.List r0 = (java.util.List) r0
            X.3HX r6 = X.C63913ic.A0D(r1)
            X.7qT r5 = X.C63913ic.A08(r1)
            java.util.Map r11 = java.util.Collections.emptyMap()
            r7 = r1
            r8 = r4
            r9 = r0
            r10 = r3
            X.M6q.A0D(r5, r6, r7, r8, r9, r10, r11)
            r9 = 0
            return r9
        L_0x44e4:
            java.lang.String r2 = "bk.action.bloks.OpenBottomSheetV4"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x44f1
            java.lang.Object r9 = X.AnonymousClass2G7.A00(r1, r0)
            return r9
        L_0x44f1:
            java.lang.String r2 = "bk.action.bloks.OpenFullScreen"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x450a
            java.lang.Object r2 = X.C63893iY.A07(r0)
            X.7h3 r2 = (X.C127397h3) r2
            java.lang.Object r0 = X.C63893iY.A08(r0)
            java.util.Map r0 = (java.util.Map) r0
            r9 = 0
            X.AnonymousClass3WA.A02(r1, r2, r9, r0)
            return r9
        L_0x450a:
            java.lang.String r2 = "bk.action.bloks.OpenFullScreenV2"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L_0x6bce
            java.lang.String r2 = "bk.action.bloks.OpenFullScreenV4"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L_0x6bce
            java.lang.String r2 = "bk.action.bloks.OpenScreen"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x4527
            java.lang.Object r9 = X.AnonymousClass2G8.A00(r1, r0)
            return r9
        L_0x4527:
            java.lang.String r2 = "bk.action.bloks.PushBottomSheet"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x4557
            r2 = 0
            boolean r3 = X.AnonymousClass0wJ.A1Z(r0, r1)
            X.7h3 r2 = X.C63893iY.A03(r0, r2)
            java.lang.Object r0 = X.C63893iY.A0B(r0, r3)
            boolean r8 = X.AnonymousClass3WF.A02(r0)
            X.7h3 r6 = X.M6q.A04(r2)
            r9 = 0
            X.3HX r4 = X.C63913ic.A0D(r1)
            X.7qT r3 = X.C63913ic.A08(r1)
            androidx.fragment.app.FragmentActivity r2 = X.C63913ic.A05(r1)
            r5 = r1
            r7 = r9
            X.M6q.A0B(r2, r3, r4, r5, r6, r7, r8)
            return r9
        L_0x4557:
            java.lang.String r2 = "bk.action.bloks.PushBottomSheetV2"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x4599
            r3 = 0
            boolean r2 = X.AnonymousClass0wJ.A1Z(r0, r1)
            java.lang.Object r3 = X.C63893iY.A0B(r0, r3)
            r3.getClass()
            X.7Jj r3 = (X.C121997Jj) r3
            java.lang.Object r0 = X.C63893iY.A0B(r0, r2)
            boolean r8 = X.AnonymousClass3WF.A02(r0)
            android.util.Pair r0 = X.C101016Po.A00(r3)
            java.lang.Object r2 = r0.first
            X.7h3 r2 = (X.C127397h3) r2
            r0 = 65
            java.util.Map r7 = X.C63763iI.A0B(r1, r2, r0)
            X.7h3 r6 = X.M6q.A03(r3)
            X.3HX r4 = X.C63913ic.A0D(r1)
            X.7qT r3 = X.C63913ic.A08(r1)
            androidx.fragment.app.FragmentActivity r2 = X.C63913ic.A05(r1)
            r5 = r1
            X.M6q.A0B(r2, r3, r4, r5, r6, r7, r8)
            r9 = 0
            return r9
        L_0x4599:
            java.lang.String r2 = "bk.action.BridgingFaceAndHandEffectsSettings"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x45c5
            boolean r2 = X.AnonymousClass0wJ.A1Y(r0, r1)
            boolean r0 = X.AnonymousClass3WF.A01(r0, r2)
            if (r0 == 0) goto L_0x45c2
            X.68o r2 = X.AnonymousClass68o.APPROVED
        L_0x45ad:
            X.0i6 r0 = X.C63913ic.A0F(r1)
            X.C18200wM.A1R(r0)
            X.KHq r1 = X.AnonymousClass3LY.A00(r0)
            X.7rd r0 = new X.7rd
            r0.<init>(r2)
            r1.CWx(r0)
            r9 = 0
            return r9
        L_0x45c2:
            X.68o r2 = X.AnonymousClass68o.DENIED
            goto L_0x45ad
        L_0x45c5:
            java.lang.String r2 = "bk.action.caa.AcceptOxygenPreloadTos"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x45df
            r2 = 1
            X.C04220Ms.A0B(r1, r2)
            X.3HX r0 = r1.A00
            r9 = 0
            if (r0 == 0) goto L_0x45da
            android.content.Context r0 = r0.A00
            if (r0 != 0) goto L_0x6b57
        L_0x45da:
            java.lang.Boolean r9 = X.C18180wK.A0X()
            return r9
        L_0x45df:
            java.lang.String r2 = "bk.action.caa.AuthAutoConf"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x45ec
            java.lang.Object r9 = X.AnonymousClass2G9.A00(r1, r0)
            return r9
        L_0x45ec:
            java.lang.String r2 = "bk.action.caa.FetchMachineID"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x4605
            r0 = 1
            X.C04220Ms.A0B(r1, r0)
            X.0i6 r0 = X.C63913ic.A0F(r1)
            X.3Vp r0 = X.C61793Vp.A00(r0)
            X.39M r0 = r0.A01
            java.lang.String r9 = r0.A00
            return r9
        L_0x4605:
            java.lang.String r2 = "bk.action.caa.FetchSMSCode"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x4612
            java.lang.Object r9 = X.AnonymousClass2GA.A00(r1, r0)
            return r9
        L_0x4612:
            java.lang.String r2 = "bk.action.caa.GetAppBuildType"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x462a
            X.0iE r0 = X.C10370iE.A00()
            java.lang.String r0 = r0.name()
            java.lang.String r9 = r0.toLowerCase()
            X.C04220Ms.A06(r9)
            return r9
        L_0x462a:
            java.lang.String r2 = "bk.action.caa.GetInstagramGuid"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x4647
            r0 = 1
            X.C04220Ms.A0B(r1, r0)
            androidx.fragment.app.Fragment r0 = X.C63913ic.A01(r1)
            android.content.Context r1 = r0.getContext()
            if (r1 == 0) goto L_0x41a4
            X.0ev r0 = X.C09140ev.A02
            java.lang.String r9 = r0.A04(r1)
            return r9
        L_0x4647:
            java.lang.String r2 = "bk.action.caa.GetOfflineExperiments"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x4654
            java.lang.Object r9 = X.AnonymousClass2GB.A00(r1, r0)
            return r9
        L_0x4654:
            java.lang.String r2 = "bk.action.caa.GetPasswordText"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x4687
            r1 = 0
            X.C04220Ms.A0B(r0, r1)
            java.util.List r0 = r0.A00
            java.lang.Object r1 = r0.get(r1)
            X.C04220Ms.A06(r1)
            X.7h3 r1 = (X.C127397h3) r1
            java.lang.Object r0 = X.C86134wK.A0k(r0)
            X.C04220Ms.A06(r0)
            X.3HX r0 = (X.AnonymousClass3HX) r0
            java.lang.Object r0 = X.AnonymousClass7K7.A04(r0, r1)
            X.6n9 r0 = (X.C111326n9) r0
            if (r0 == 0) goto L_0x4685
            android.text.Editable r0 = r0.A0L
        L_0x467e:
            java.lang.String r9 = java.lang.String.valueOf(r0)
            X.C551031t.A01 = r9
            return r9
        L_0x4685:
            r0 = 0
            goto L_0x467e
        L_0x4687:
            java.lang.String r2 = "bk.action.caa.GetSPIEligibility"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x4694
            java.lang.Object r9 = X.AnonymousClass2GC.A00(r1, r0)
            return r9
        L_0x4694:
            java.lang.String r2 = "bk.action.caa.GetWaterfallId"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x46bc
            X.0dH r1 = X.C09120et.A3D
            X.0et r0 = r1.A00()
            java.lang.String r9 = r0.A0D()
            boolean r0 = X.AnonymousClass0hA.A08(r9)
            if (r0 == 0) goto L_0x0012
            java.util.UUID r0 = X.C03480Iw.A00()
            java.lang.String r9 = X.C18190wL.A0n(r0)
            X.0et r0 = r1.A00()
            r0.A0F(r9)
            return r9
        L_0x46bc:
            java.lang.String r2 = "bk.action.caa.HandleLoginErrorResponse"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x46c9
            java.lang.Object r9 = X.AnonymousClass2GD.A00(r1, r0)
            return r9
        L_0x46c9:
            java.lang.String r2 = "bk.action.caa.HandleLoginResponse"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x46d8
            X.3To r2 = X.C61473To.A00
            java.lang.Object r9 = r2.A00(r1, r0)
            return r9
        L_0x46d8:
            java.lang.String r2 = "bk.action.caa.HandleLoginResponseForContextChange"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x46e5
            java.lang.Object r9 = X.AnonymousClass4K7.A00(r1, r0)
            return r9
        L_0x46e5:
            java.lang.String r2 = "bk.action.caa.login.DeleteSmartLockCredentials"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x4718
            r0 = 1
            X.C04220Ms.A0B(r1, r0)
            X.0TJ r0 = X.AnonymousClass0TJ.A05
            r2 = 18303905075040593(0x41074e00001151, double:1.8944872854361574E-307)
        L_0x46f8:
            boolean r0 = X.C63173fJ.A05(r0, r2)
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x395f
            X.0i6 r3 = X.C63913ic.A0F(r1)
            androidx.fragment.app.Fragment r2 = X.C63913ic.A01(r1)
            X.H8a r1 = X.C62783aj.getInstanceAsync()
            X.1lR r0 = new X.1lR
            r0.<init>(r2, r3)
            r1.A00 = r0
            X.C31155GhB.A03(r1)
            goto L_0x395f
        L_0x4718:
            java.lang.String r2 = "bk.action.caa.login.FetchClientDataAsync"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x4725
            java.lang.Object r9 = X.AnonymousClass2GE.A00(r1, r0)
            return r9
        L_0x4725:
            java.lang.String r2 = "bk.action.caa.login.FetchSmartLockCredentials"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x4734
            X.3Tp r2 = X.C61483Tp.A00
            java.lang.Object r9 = r2.A00(r1, r0)
            return r9
        L_0x4734:
            java.lang.String r2 = "bk.action.caa.login.GetDevicePhoneNumber"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x4741
            java.lang.Object r9 = X.AnonymousClass2GG.A00(r0)
            return r9
        L_0x4741:
            java.lang.String r2 = "bk.action.caa.login.GetLastLoggedInUsername"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x474e
            java.lang.String r9 = X.C63593hs.A01()
            return r9
        L_0x474e:
            java.lang.String r2 = "bk.action.caa.login.GetUniqueDeviceId"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x4767
            r0 = 1
            X.C04220Ms.A0B(r1, r0)
            androidx.fragment.app.Fragment r0 = X.C63913ic.A01(r1)
            android.content.Context r0 = r0.getContext()
            java.lang.String r9 = X.C09140ev.A00(r0)
            return r9
        L_0x4767:
            java.lang.String r2 = "bk.action.caa.login.HandleIGAccountRecovery"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x4774
            java.lang.Object r9 = X.AnonymousClass2GH.A00(r1, r0)
            return r9
        L_0x4774:
            java.lang.String r2 = "bk.action.caa.login.HandleIncorrectSmartLockPassword"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x4789
            r0 = 1
            X.C04220Ms.A0B(r1, r0)
            X.0TJ r0 = X.AnonymousClass0TJ.A05
            r2 = 18303892190138703(0x41074b0000114f, double:1.8944821926462583E-307)
            goto L_0x46f8
        L_0x4789:
            java.lang.String r2 = "bk.action.caa.login.PresentNativeLoginFlow"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x47af
            androidx.fragment.app.FragmentActivity r2 = A01(r1)
            android.content.Intent r1 = X.C18230wP.A0B()
            r0 = 338(0x152, float:4.74E-43)
            java.lang.String r0 = X.C18170wI.A00(r0)
            r1.setClassName(r2, r0)
            r0 = 67108864(0x4000000, float:1.5046328E-36)
            r1.setFlags(r0)
            X.C10650ih.A02(r2, r1)
            r2.finish()
            r9 = 0
            return r9
        L_0x47af:
            java.lang.String r2 = "bk.action.caa.login.PresentNativeRegistrationFlow"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x47e7
            r4 = 1
            X.C04220Ms.A0B(r1, r4)
            androidx.fragment.app.FragmentActivity r3 = X.C63913ic.A05(r1)
            android.content.Intent r2 = X.C18230wP.A0B()
            r0 = 338(0x152, float:4.74E-43)
            java.lang.String r0 = X.C18170wI.A00(r0)
            r2.setClassName(r3, r0)
            r0 = 872(0x368, float:1.222E-42)
            java.lang.String r0 = X.C18170wI.A00(r0)
            r2.putExtra(r0, r4)
            X.0i6 r0 = X.C63913ic.A0F(r1)
            java.lang.String r1 = r0.getToken()
            java.lang.String r0 = "IgSessionManager.SESSION_TOKEN_KEY"
            r2.putExtra(r0, r1)
            X.C10650ih.A02(r3, r2)
            r9 = 0
            return r9
        L_0x47e7:
            java.lang.String r2 = "bk.action.caa.login.RegExistingLoginSuccess"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x4803
            X.0dH r0 = X.C09120et.A3D
            X.0et r0 = r0.A00()
            r1 = 1
            X.0dK r0 = r0.A1z
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            X.0YY r0 = r0.A01
            r0.invoke(r1)
            r9 = 0
            return r9
        L_0x4803:
            java.lang.String r2 = "bk.action.caa.login.RemoveProfile"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x4810
            java.lang.Object r9 = X.AnonymousClass2GI.A00(r1, r0)
            return r9
        L_0x4810:
            java.lang.String r2 = "bk.action.caa.login.SaveCredential"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x481d
            java.lang.Object r9 = X.AnonymousClass2GJ.A00(r1, r0)
            return r9
        L_0x481d:
            java.lang.String r2 = "bk.action.caa.login.SetAppLocale"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x482a
            java.lang.Object r9 = X.AnonymousClass2GK.A00(r1, r0)
            return r9
        L_0x482a:
            java.lang.String r2 = "bk.action.caa.OverrideOfflineExperimentGroup"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x4837
            java.lang.Object r9 = X.AnonymousClass2GL.A00(r1, r0)
            return r9
        L_0x4837:
            java.lang.String r2 = "bk.action.caa.PresentCheckpointsFlow"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x4844
            java.lang.Object r9 = X.AnonymousClass2GM.A00(r1, r0)
            return r9
        L_0x4844:
            java.lang.String r2 = "bk.action.caa.PresentTwoFactorAuthFlow"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x4851
            java.lang.Object r9 = X.AnonymousClass2GN.A00(r1, r0)
            return r9
        L_0x4851:
            java.lang.String r2 = "bk.action.caa.reg.FetchNuxSteps"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x4889
            r4 = 0
            boolean r6 = X.AnonymousClass0wJ.A1Z(r0, r1)
            java.lang.Object r0 = X.C63893iY.A0B(r0, r6)
            r0.getClass()
            X.7h3 r0 = (X.C127397h3) r0
            X.0i6 r2 = X.C63913ic.A0F(r1)
            r9 = 0
            if (r0 == 0) goto L_0x4886
            java.lang.String r0 = X.C18230wP.A0o(r0)
            if (r0 == 0) goto L_0x4886
            X.25r r3 = X.C54052yp.A00(r0)
        L_0x4878:
            X.3hW r0 = X.C63463hW.A02()
            androidx.fragment.app.FragmentActivity r1 = X.C63913ic.A05(r1)
            r5 = r4
            r7 = r6
            r0.A07(r1, r2, r3, r4, r5, r6, r7)
            return r9
        L_0x4886:
            X.25r r3 = X.C313625r.NONE
            goto L_0x4878
        L_0x4889:
            java.lang.String r2 = "bk.action.caa.reg.FetchSmartLockNamePrefills"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x48be
            boolean r2 = X.AnonymousClass0wJ.A1Y(r0, r1)
            X.6jp r0 = X.C63893iY.A06(r0, r2)
            X.0i6 r5 = X.C63913ic.A0F(r1)
            X.0bf r5 = (X.C07530bf) r5
            androidx.fragment.app.FragmentActivity r3 = X.C63913ic.A05(r1)
            androidx.fragment.app.Fragment r2 = X.C63913ic.A01(r1)
            X.265 r6 = X.AnonymousClass265.A0J
            X.3Eo r4 = new X.3Eo
            r4.<init>(r1, r0)
            X.H8a r0 = X.C62783aj.getInstanceAsync()
            X.1lT r1 = new X.1lT
            r1.<init>(r2, r3, r4, r5, r6)
            r0.A00 = r1
            X.C31155GhB.A03(r0)
            r9 = 0
            return r9
        L_0x48be:
            java.lang.String r2 = "bk.action.caa.reg.GetAgeFromBirthdayTimestamp"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x48cb
            java.lang.Object r9 = X.AnonymousClass2GO.A00(r0)
            return r9
        L_0x48cb:
            java.lang.String r2 = "bk.action.caa.reg.GetGoogleSafetyNetToken"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x48ff
            r5 = 0
            boolean r2 = X.AnonymousClass0wJ.A1Z(r0, r1)
            X.6jp r4 = X.C63893iY.A06(r0, r5)
            java.lang.Object r3 = X.C63893iY.A0B(r0, r2)
            java.lang.String r3 = (java.lang.String) r3
            com.facebook.redex.IDxEListenerShape165S0200000_1_I2 r2 = new com.facebook.redex.IDxEListenerShape165S0200000_1_I2
            r2.<init>(r5, r4, r1)
            X.KHr r1 = X.C38040KHr.A01
            java.lang.Class<X.45Q> r0 = X.AnonymousClass45Q.class
            r1.A03(r2, r0)
            X.3Xu r1 = X.C62213Xu.getInstance()
            android.content.Context r0 = X.C18230wP.A08()
            if (r3 != 0) goto L_0x48fa
            java.lang.String r3 = "unknown"
        L_0x48fa:
            r1.startDeviceValidation(r0, r3)
            r9 = 0
            return r9
        L_0x48ff:
            java.lang.String r2 = "bk.action.caa.RegisterAutoConf"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x490c
            java.lang.Object r9 = X.AnonymousClass2GP.A00(r1, r0)
            return r9
        L_0x490c:
            java.lang.String r2 = "bk.action.caa.reg.IsUserBirthdayHardBlocked"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x4925
            X.3YV r0 = X.AnonymousClass3YV.A00()
            java.lang.Integer r1 = r0.A01()
            X.C04220Ms.A06(r1)
            java.lang.Integer r0 = X.AnonymousClass006.A0C
            if (r1 != r0) goto L_0x0117
            goto L_0x3f5b
        L_0x4925:
            java.lang.String r2 = "bk.action.caa.reg.LaunchTransitionScreen"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x4932
            java.lang.Object r9 = X.AnonymousClass2GQ.A00(r1, r0)
            return r9
        L_0x4932:
            java.lang.String r2 = "bk.action.caa.reg.MarkYoungUserCreationAttempt"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x4943
            X.3YV r0 = X.AnonymousClass3YV.A00()
            r0.A02()
            r9 = 0
            return r9
        L_0x4943:
            java.lang.String r2 = "bk.action.caa.reg.SaveMachineID"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x496f
            boolean r2 = X.AnonymousClass0wJ.A1Y(r0, r1)
            java.lang.String r2 = X.C63893iY.A0D(r0, r2)
            X.0i6 r1 = X.C63913ic.A0F(r1)
            r0 = 1258(0x4ea, float:1.763E-42)
            java.lang.String r0 = X.C18170wI.A00(r0)
            X.C04220Ms.A0C(r1, r0)
            int r0 = r2.length()
            if (r0 <= 0) goto L_0x395f
            X.3Vp r0 = X.C61793Vp.A00(r1)
            r0.A04(r2)
            goto L_0x395f
        L_0x496f:
            java.lang.String r2 = "bk.action.caa.reg.ShowNux"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x497c
            java.lang.Object r9 = X.AnonymousClass2GR.A00(r1, r0)
            return r9
        L_0x497c:
            java.lang.String r2 = "bk.action.caa.reg.UploadProfilePhoto"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x4989
            java.lang.Object r9 = X.AnonymousClass2GS.A00(r1, r0)
            return r9
        L_0x4989:
            java.lang.String r2 = "bk.action.caa.ReplaceSyncScreen"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x4996
            java.lang.Object r9 = X.AnonymousClass2GT.A00(r1, r0)
            return r9
        L_0x4996:
            java.lang.String r2 = "bk.action.caa.ShouldAcceptOxygenPreloadTos"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L_0x00c4
            java.lang.String r2 = "bk.action.caa.ShouldShowExplicitOxygenPreloadTos"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x49bb
            X.3HX r0 = A05(r1)
            if (r0 == 0) goto L_0x0117
            android.content.Context r0 = r0.A00
            if (r0 == 0) goto L_0x0117
            X.3FG r0 = X.AnonymousClass2CP.A00(r0)
            X.C04220Ms.A06(r0)
            boolean r2 = r0.A02
            goto L_0x3f5c
        L_0x49bb:
            java.lang.String r2 = "bk.action.caa.StartAutoConf"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x49c8
            java.lang.Object r9 = X.AnonymousClass2GU.A00(r1, r0)
            return r9
        L_0x49c8:
            java.lang.String r2 = "bk.action.caa.StopFetchSMSCode"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x49db
            X.3bV r1 = X.C63103bV.A03
            android.content.Context r0 = X.C18230wP.A08()
            r1.A05(r0)
            r9 = 0
            return r9
        L_0x49db:
            java.lang.String r2 = "bk.action.calendar.AddEvent"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x4a09
            r2 = 0
            X.C04220Ms.A0B(r1, r2)
            androidx.fragment.app.FragmentActivity r4 = X.C63913ic.A05(r1)
            java.lang.Object r0 = X.C63893iY.A07(r0)
            X.7h3 r0 = (X.C127397h3) r0
            androidx.fragment.app.FragmentActivity r3 = X.C63913ic.A05(r1)
            X.47v r2 = new X.47v
            r2.<init>(r4, r1, r0)
            r0 = 765(0x2fd, float:1.072E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            java.lang.String[] r0 = new java.lang.String[]{r0}
            X.AnonymousClass7K8.A02(r3, r2, r0)
            r9 = 0
            return r9
        L_0x4a09:
            java.lang.String r2 = "bk.action.catalog.variants.i18nstr.custom.option.value.GetString"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x4a21
            java.lang.Object r2 = X.C63893iY.A07(r0)
            android.content.Context r1 = X.C18230wP.A08()
            r0 = 2131823125(0x7f110a15, float:1.927904E38)
            java.lang.String r9 = X.AnonymousClass0wJ.A0l(r1, r2, r0)
            return r9
        L_0x4a21:
            java.lang.String r2 = "bk.action.cds.GetThemeName"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x4a2e
            java.lang.String r9 = X.AnonymousClass3QU.A00()
            return r9
        L_0x4a2e:
            java.lang.String r2 = "bk.action.cds.OpenDateTimePickerV2"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x4a3b
            java.lang.Object r9 = X.AnonymousClass2GV.A00(r1, r0)
            return r9
        L_0x4a3b:
            java.lang.String r2 = "bk.action.CheckAgeVerificationUpsellEligibility"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x4a48
            java.lang.Object r9 = X.AnonymousClass2GW.A00(r1, r0)
            return r9
        L_0x4a48:
            java.lang.String r2 = "bk.action.checkout.CheckoutFlowDismissed"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x4a73
            r2 = 0
            java.lang.Object r4 = X.C63893iY.A0B(r0, r2)
            java.util.List r4 = (java.util.List) r4
            r2 = 1
            boolean r3 = X.AnonymousClass3WF.A01(r0, r2)
            r2 = 2
            boolean r2 = X.AnonymousClass3WF.A01(r0, r2)
            com.instagram.service.session.UserSession r0 = X.C63913ic.A0J(r1)
            X.KHq r1 = X.AnonymousClass3LY.A00(r0)
            X.7rr r0 = new X.7rr
            r0.<init>(r4, r3, r2)
            r1.CWx(r0)
            r9 = 0
            return r9
        L_0x4a73:
            java.lang.String r2 = "bk.action.checkout.GetCreditCardToken"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x4aa7
            r7 = 0
            java.util.List r3 = r0.A00
            java.lang.String r6 = X.C18190wL.A0q(r3, r7)
            java.lang.Object r5 = X.C63893iY.A08(r0)
            java.lang.String r5 = (java.lang.String) r5
            r0 = 2
            java.lang.String r2 = X.C18190wL.A0q(r3, r0)
            r0 = 3
            X.6jp r4 = X.C18190wL.A0R(r3, r0)
            r0 = 4
            X.6jp r3 = X.C18190wL.A0R(r3, r0)
            X.H8c r2 = X.C128877kW.A01(r6, r5, r2)
            com.instagram.common.api.base.IDxACallbackShape16S0300000_2_I2 r0 = new com.instagram.common.api.base.IDxACallbackShape16S0300000_2_I2
            r0.<init>(r7, r1, r3, r4)
            r2.A00 = r0
            X.C31155GhB.A03(r2)
            r9 = 0
            return r9
        L_0x4aa7:
            java.lang.String r2 = "bk.action.checkout.LoadShopsLiteURL"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x4ad9
            r1 = 0
            X.C04220Ms.A0B(r0, r1)
            java.lang.String r3 = X.C63893iY.A0D(r0, r1)
            android.os.Bundle r2 = X.C18180wK.A06()
            java.lang.Integer r0 = X.AnonymousClass006.A00
            com.facebook.browser.lite.extensions.commercecheckout.constant.MetaCheckoutRequest r1 = new com.facebook.browser.lite.extensions.commercecheckout.constant.MetaCheckoutRequest
            r1.<init>(r0, r3)
            r0 = 383(0x17f, float:5.37E-43)
            java.lang.String r0 = X.I17.A00(r0)
            r2.putParcelable(r0, r1)
            X.7Ep r1 = X.AnonymousClass7Ep.A00()
            X.5EF r0 = new X.5EF
            r0.<init>(r2, r1)
            X.AnonymousClass7Ep.A01(r0, r1)
            r9 = 0
            return r9
        L_0x4ad9:
            java.lang.String r2 = "bk.action.checkout.OpenShopPayFlow"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x4ae6
            java.lang.Object r9 = X.AnonymousClass2GX.A00(r1, r0)
            return r9
        L_0x4ae6:
            java.lang.String r2 = "bk.action.checkout.OpenShopPayFlowV2"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x4af3
            java.lang.Object r9 = X.AnonymousClass2GY.A00(r1, r0)
            return r9
        L_0x4af3:
            java.lang.String r2 = "bk.action.checkout.OpenShopPayInterstitial"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x4b00
            java.lang.Object r9 = X.AnonymousClass6OJ.A00(r1, r0)
            return r9
        L_0x4b00:
            java.lang.String r2 = "bk.action.checkout.PlaceOrderSucceeded"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x4b57
            java.lang.Object r4 = X.C63893iY.A07(r0)
            java.util.List r4 = (java.util.List) r4
            r3 = 1
            boolean r2 = X.AnonymousClass3WF.A01(r0, r3)
            r0 = 0
            X.C04220Ms.A0B(r1, r0)
            X.0i6 r0 = X.C63913ic.A0F(r1)
            com.instagram.service.session.UserSession r6 = X.C05030Qo.A03(r0)
            if (r6 == 0) goto L_0x395f
            com.instagram.user.model.User r1 = X.AnonymousClass0wJ.A0Y(r6)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)
            r1.A26(r0)
            java.util.ArrayList r5 = X.AnonymousClass0wJ.A0v()
            if (r2 == 0) goto L_0x395f
            boolean r0 = r4.isEmpty()
            if (r0 != 0) goto L_0x395f
            java.util.Iterator r4 = r4.iterator()
        L_0x4b3c:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x395f
            java.lang.String r3 = X.C18180wK.A0k(r4)
            X.KHq r2 = X.AnonymousClass3LY.A00(r6)
            java.util.List r1 = java.util.Collections.unmodifiableList(r5)
            X.7rm r0 = new X.7rm
            r0.<init>(r3, r1)
            r2.CWx(r0)
            goto L_0x4b3c
        L_0x4b57:
            java.lang.String r2 = "bk.action.checkout.PlaceOrderSucceededV2"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x4b98
            java.lang.Object r5 = X.C63893iY.A07(r0)
            java.lang.String r5 = (java.lang.String) r5
            r4 = 1
            boolean r3 = X.AnonymousClass3WF.A01(r0, r4)
            r0 = 0
            X.C04220Ms.A0B(r1, r0)
            X.0i6 r0 = X.C63913ic.A0F(r1)
            com.instagram.service.session.UserSession r2 = X.C05030Qo.A03(r0)
            if (r2 == 0) goto L_0x395f
            com.instagram.user.model.User r1 = X.AnonymousClass0wJ.A0Y(r2)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r4)
            r1.A26(r0)
            java.util.ArrayList r0 = X.AnonymousClass0wJ.A0v()
            if (r3 == 0) goto L_0x395f
            X.KHq r2 = X.AnonymousClass3LY.A00(r2)
            java.util.List r1 = java.util.Collections.unmodifiableList(r0)
            X.7rm r0 = new X.7rm
            r0.<init>(r5, r1)
            goto L_0x0636
        L_0x4b98:
            java.lang.String r2 = "bk.action.CheckSystemPermissions"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x4ba5
            java.lang.Object r9 = X.AnonymousClass3RX.A00(r1, r0)
            return r9
        L_0x4ba5:
            java.lang.String r2 = "bk.action.commerce.cart.dc.ExposeExperiment"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x4bd0
            r0 = 1
            X.C04220Ms.A0B(r1, r0)
            X.0i6 r1 = X.C63913ic.A0F(r1)
            boolean r0 = r1 instanceof com.instagram.service.session.UserSession
            r9 = 0
            if (r0 == 0) goto L_0x6b5b
            com.instagram.service.session.UserSession r1 = (com.instagram.service.session.UserSession) r1
            if (r1 == 0) goto L_0x6b5b
            X.6e4 r0 = new X.6e4
            r0.<init>(r1)
            com.instagram.service.session.UserSession r3 = r0.A00
            X.0TJ r2 = X.AnonymousClass0TJ.A05
            r0 = 36318372304195936(0x81075e00031160, double:3.031223115295996E-306)
            X.C63803iN.A0E(r2, r3, r0)
            return r9
        L_0x4bd0:
            java.lang.String r2 = "bk.action.commerce.GetPigeonSessionId"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x4be5
            com.instagram.service.session.UserSession r0 = X.C63913ic.A0J(r1)
            X.0kZ r0 = X.C12090lI.A00(r0)
            java.lang.String r9 = r0.B1d()
            return r9
        L_0x4be5:
            java.lang.String r2 = "bk.action.commerce.GetRiskFeatures"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x4bff
            java.lang.Object r0 = X.C63893iY.A07(r0)
            X.3HX r0 = (X.AnonymousClass3HX) r0
            android.content.Context r1 = r0.A00
            X.JSy r0 = new X.JSy
            r0.<init>(r1)
            java.lang.String r9 = r0.A00()
            return r9
        L_0x4bff:
            java.lang.String r2 = "bk.action.commerce.GetUplSessionId"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x4c0c
            java.lang.String r9 = X.C122037Js.A00()
            return r9
        L_0x4c0c:
            java.lang.String r2 = "bk.action.commerce.IsIgOrdersHubEnabled"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x4c35
            X.3HX r2 = X.C86104wH.A0V(r0)
            r1 = 1
            boolean r0 = X.AnonymousClass3WF.A01(r0, r1)
            X.0i6 r3 = X.C63913ic.A0E(r2)
            X.C18200wM.A1R(r3)
            if (r0 == 0) goto L_0x4c32
            X.0TJ r2 = X.AnonymousClass0TJ.A05
        L_0x4c28:
            r0 = 36317560555179853(0x8106a100000f4d, double:3.030709761949574E-306)
            java.lang.Boolean r9 = X.C63803iN.A05(r2, r3, r0)
            return r9
        L_0x4c32:
            X.0TJ r2 = X.AnonymousClass0TJ.A06
            goto L_0x4c28
        L_0x4c35:
            java.lang.String r2 = "bk.action.creator_marketplace.BrandOnboardingResult"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x4c57
            boolean r2 = X.AnonymousClass0wJ.A1Y(r0, r1)
            boolean r2 = X.AnonymousClass3WF.A01(r0, r2)
            X.0i6 r0 = X.C63913ic.A0F(r1)
            X.KHq r1 = X.AnonymousClass3LY.A00(r0)
            X.7rt r0 = new X.7rt
            r0.<init>(r2)
            r1.CWx(r0)
            r9 = 0
            return r9
        L_0x4c57:
            java.lang.String r2 = "bk.action.currency.AppendPlusToCurrencyString"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x4c72
            java.lang.Object r2 = X.C86124wJ.A0m(r0)
            X.C18240wQ.A1I(r2)
            android.content.Context r1 = X.C18230wP.A08()
            r0 = 2131824691(0x7f111033, float:1.9282217E38)
            java.lang.String r9 = X.AnonymousClass0wJ.A0l(r1, r2, r0)
            return r9
        L_0x4c72:
            java.lang.String r2 = "bk.action.currency.CurrencyToString"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x4caf
            r1 = 0
            X.C04220Ms.A0B(r0, r1)
            java.lang.String r5 = X.C63893iY.A0D(r0, r1)
            java.lang.Object r1 = X.C63893iY.A08(r0)
            java.lang.String r4 = "null cannot be cast to non-null type kotlin.Number"
            X.C04220Ms.A0C(r1, r4)
            double r2 = X.C86124wJ.A00(r1)
            r1 = 2
            java.lang.Object r0 = X.C63893iY.A0C(r0, r4, r1)
            int r4 = X.AnonymousClass0wJ.A04(r0)
            java.util.Locale r0 = java.util.Locale.getDefault()
            java.text.NumberFormat r1 = java.text.NumberFormat.getCurrencyInstance(r0)
            java.util.Currency r0 = java.util.Currency.getInstance(r5)
            r1.setCurrency(r0)
            r1.setMinimumFractionDigits(r4)
            java.lang.String r9 = r1.format(r2)
            return r9
        L_0x4caf:
            java.lang.String r2 = "bk.action.currency.GetFormattedCurrency"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x4cbc
            java.lang.Object r9 = X.AnonymousClass6OK.A00(r0)
            return r9
        L_0x4cbc:
            java.lang.String r2 = "bk.action.cxf.cpdp.GetHasSeenIncentivesBanner"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x4cc9
            java.lang.Object r9 = X.AnonymousClass2GZ.A00(r1, r0)
            return r9
        L_0x4cc9:
            java.lang.String r2 = "bk.action.cxf.cpdp.SetSeenIncentivesBanner"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x4cd6
            java.lang.Object r9 = X.C33522Ga.A00(r0)
            return r9
        L_0x4cd6:
            java.lang.String r2 = "bk.action.cxf.cpdp.ShowAddToCartAnimation"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x4ce3
            java.lang.Object r9 = X.AnonymousClass6OL.A00(r1, r0)
            return r9
        L_0x4ce3:
            r2 = 310(0x136, float:4.34E-43)
            java.lang.String r2 = X.C18170wI.A00(r2)
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x4cf4
            java.lang.Object r9 = X.C33532Gb.A00(r1, r0)
            return r9
        L_0x4cf4:
            java.lang.String r2 = "bk.action.cxf.cpdp.ShowIncentivesBannerIfCriteriaMet"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x4d01
            java.lang.Object r9 = X.C33542Gc.A00(r1, r0)
            return r9
        L_0x4d01:
            java.lang.String r2 = "bk.action.cxf.cpdp.TryInARCTA"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x4d0e
            java.lang.Object r9 = X.A3X.A00(r1, r0)
            return r9
        L_0x4d0e:
            java.lang.String r2 = "bk.action.cxf.cpdp.TryInARCTAv3"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x4d1b
            java.lang.Object r9 = X.A3Y.A00(r1, r0)
            return r9
        L_0x4d1b:
            java.lang.String r2 = "bk.action.cxf.PrefetchImages"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x4d58
            r1 = 0
            X.C04220Ms.A0B(r0, r1)
            java.lang.Object r1 = X.C63893iY.A08(r0)
            r0 = 9
            java.lang.String r0 = X.C18170wI.A00(r0)
            X.C04220Ms.A0C(r1, r0)
            java.util.Iterator r3 = X.C86144wL.A0y(r1)
        L_0x4d38:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x395f
            java.lang.String r0 = X.C18180wK.A0k(r3)
            X.K2e r2 = X.C37744K2e.A01()
            com.instagram.common.typedurl.SimpleImageUrl r1 = X.C18250wR.A0K(r0)
            java.lang.String r0 = "cpdp_hero_carousel"
            X.Jj7 r0 = r2.A0A(r1, r0)
            X.L5E r0 = r0.A00()
            r0.CYj()
            goto L_0x4d38
        L_0x4d58:
            java.lang.String r2 = "bk.action.cxf.ShowMerchantInNavigationBar"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x4d8d
            java.lang.Object r4 = X.C63893iY.A07(r0)
            X.3HX r4 = (X.AnonymousClass3HX) r4
            java.lang.Object r1 = X.C63893iY.A08(r0)
            boolean r3 = X.AnonymousClass0wJ.A1X(r1)
            java.lang.Object r2 = X.C63893iY.A09(r0)
            X.7h3 r2 = (X.C127397h3) r2
            androidx.fragment.app.Fragment r0 = X.C63913ic.A00(r4)
            android.view.View r1 = r0.mView
            r9 = 0
            if (r1 == 0) goto L_0x0012
            androidx.fragment.app.FragmentActivity r0 = X.C63913ic.A04(r4)
            X.E2V r0 = X.C33502Fy.A00(r0, r4)
            if (r0 == 0) goto L_0x4d89
            r0.A09 = r3
        L_0x4d89:
            X.C33512Fz.A00(r1, r4, r2)
            return r9
        L_0x4d8d:
            java.lang.String r2 = "bk.action.DeeplinkToOtherAppOrDirectToAppStoreV2"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x4d9a
            java.lang.Object r9 = X.C60723Qg.A00(r1, r0)
            return r9
        L_0x4d9a:
            java.lang.String r2 = "bk.action.DeeplinkToOtherAppOrDirectToAppStoreV3"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x4dab
            r1 = 0
            X.C04220Ms.A0B(r0, r1)
            r0.A0H(r1)
            r9 = 0
            return r9
        L_0x4dab:
            java.lang.String r2 = "bk.action.DeletedAvatar"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x4dcc
            r0 = 1
            X.C04220Ms.A0B(r1, r0)
            X.0i6 r0 = X.C63913ic.A0F(r1)
            X.C18200wM.A1R(r0)
            X.KHq r1 = X.AnonymousClass3LY.A00(r0)
            X.7rG r0 = new X.7rG
            r0.<init>()
            r1.CWx(r0)
            r9 = 0
            return r9
        L_0x4dcc:
            java.lang.String r2 = "bk.action.dialog.OpenDialog"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x4de9
            boolean r2 = X.AnonymousClass0wJ.A1Y(r0, r1)
            X.7h3 r3 = X.C63893iY.A03(r0, r2)
            X.3HX r2 = r1.A00
            if (r2 == 0) goto L_0x395f
            androidx.fragment.app.FragmentActivity r0 = X.C63913ic.A05(r1)
            X.AnonymousClass3WA.A01(r0, r2, r1, r3)
            goto L_0x395f
        L_0x4de9:
            java.lang.String r2 = "bk.action.dialog.OpenDialogV2"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x4e17
            java.lang.Object r4 = X.C63893iY.A07(r0)
            X.7Jj r4 = (X.C121997Jj) r4
            r2 = 2
            java.lang.Object r3 = X.C63893iY.A0B(r0, r2)
            X.3HX r3 = (X.AnonymousClass3HX) r3
            if (r3 != 0) goto L_0x4e04
            X.3HX r3 = X.C63913ic.A0D(r1)
        L_0x4e04:
            r9 = 0
            X.7h3 r0 = r4.A02
            X.7h3 r2 = X.C101046Pr.A00(r3, r1, r0)
            r0 = 0
            X.C04220Ms.A0B(r1, r0)
            androidx.fragment.app.FragmentActivity r0 = X.C63913ic.A05(r1)
            X.AnonymousClass3WA.A01(r0, r3, r1, r2)
            return r9
        L_0x4e17:
            java.lang.String r2 = "bk.action.ecp.OpenPayPalMIBToCIBConsentFlow"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x4e24
            java.lang.Object r9 = X.AnonymousClass6OM.A00(r1, r0)
            return r9
        L_0x4e24:
            java.lang.String r2 = "bk.action.ExitPayoutOnboardingFlow"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x4e5e
            boolean r2 = X.AnonymousClass0wJ.A1Z(r0, r1)
            java.lang.Object r0 = X.C63893iY.A0B(r0, r2)
            r0.getClass()
            boolean r0 = X.AnonymousClass0wJ.A1X(r0)
            androidx.fragment.app.FragmentActivity r3 = X.C63913ic.A05(r1)
            if (r3 == 0) goto L_0x395f
            android.content.Intent r2 = X.C18230wP.A0B()
            r1 = r0 ^ 1
            r0 = 70
            java.lang.String r0 = X.C18170wI.A00(r0)
            r2.putExtra(r0, r1)
            X.C18200wM.A10(r3, r2)
            r1 = 2130772059(0x7f01005b, float:1.7147226E38)
            r0 = 2130772046(0x7f01004e, float:1.71472E38)
            r3.overridePendingTransition(r1, r0)
            goto L_0x395f
        L_0x4e5e:
            java.lang.String r2 = "bk.action.fbpay.navigation.OpenScreen"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x4e6b
            java.lang.Object r9 = X.AnonymousClass6ON.A00(r1, r0)
            return r9
        L_0x4e6b:
            java.lang.String r2 = "bk.action.flipper.SendData"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L_0x395f
            java.lang.String r2 = "bk.action.foa.media.OpenCamera"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x4e80
            java.lang.Object r9 = X.AnonymousClass6OO.A00(r1, r0)
            return r9
        L_0x4e80:
            java.lang.String r2 = "bk.action.foa.media.ResizeImage"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x4e8d
            java.lang.Object r9 = X.C30597GMk.A00(r1, r0)
            return r9
        L_0x4e8d:
            java.lang.String r2 = "bk.action.fx.identity.CreateNewAccount"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x4e9e
            r0 = 1
            X.C04220Ms.A0B(r1, r0)
            X.C35672Oj.A00(r1, r0)
            r9 = 0
            return r9
        L_0x4e9e:
            java.lang.String r2 = "bk.action.fx.identity.LogIntoExistingAccount"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x4eac
            r0 = 0
            X.C35672Oj.A00(r1, r0)
            r9 = 0
            return r9
        L_0x4eac:
            java.lang.String r2 = "bk.action.fx.identity.SyncAccountInfo"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x4ed8
            r3 = 0
            boolean r2 = X.AnonymousClass0wJ.A1Z(r0, r1)
            java.lang.Object r4 = X.C63893iY.A0B(r0, r3)
            X.3HX r4 = (X.AnonymousClass3HX) r4
            r9 = 0
            if (r4 == 0) goto L_0x0012
            X.6jp r3 = X.C63893iY.A06(r0, r2)
            com.instagram.service.session.UserSession r2 = X.C86104wH.A0Y(r1)
            android.content.Context r0 = r4.A00
            java.util.List r0 = X.C67313zL.A01(r0, r2)
            X.3iY r0 = X.C86114wI.A0V(r0)
            X.C61043Rr.A00(r1, r0, r3)
            return r9
        L_0x4ed8:
            java.lang.String r2 = "bk.action.fx.IdentitySyncCompletionHandler"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x4f0c
            r3 = 0
            boolean r2 = X.AnonymousClass0wJ.A1Z(r0, r1)
            boolean r0 = X.AnonymousClass3WF.A01(r0, r2)
            X.0i6 r2 = X.C63913ic.A0F(r1)
            X.C18200wM.A1R(r2)
            if (r0 == 0) goto L_0x395f
            X.C04220Ms.A0B(r2, r3)
            r0 = 47
            kotlin.jvm.internal.KtLambdaShape75S0100000_I2_55 r1 = new kotlin.jvm.internal.KtLambdaShape75S0100000_I2_55
            r1.<init>(r2, r0)
            java.lang.Class<X.48i> r0 = X.C693848i.class
            r2.A01(r0, r1)
            X.KHq r2 = X.AnonymousClass3LY.A00(r2)
            X.45p r0 = new X.45p
            r0.<init>()
            goto L_0x0636
        L_0x4f0c:
            java.lang.String r2 = "bk.action.fx.im.ChangeProfilePicture"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x4f19
            java.lang.Object r9 = X.C33552Gd.A00(r1, r0)
            return r9
        L_0x4f19:
            java.lang.String r2 = "bk.action.fx.im.ProfilePictureEditorCrop"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x4f26
            java.lang.Object r9 = X.C33562Ge.A00(r1, r0)
            return r9
        L_0x4f26:
            java.lang.String r2 = "bk.action.fx.im.ProfilePictureEditorOpenFramesPicker"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x4f33
            java.lang.Object r9 = X.C33572Gf.A00(r1, r0)
            return r9
        L_0x4f33:
            java.lang.String r2 = "bk.action.fx.im.ProfilePictureEditorSave"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x4f40
            java.lang.Object r9 = X.C33582Gg.A00(r1)
            return r9
        L_0x4f40:
            java.lang.String r2 = "bk.action.fx.im.ReadLocalPhotoData"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x4f80
            r1 = 0
            X.C04220Ms.A0B(r0, r1)
            java.lang.String r0 = X.C63893iY.A0D(r0, r1)
            r9 = 0
            android.net.Uri r0 = X.C15430rJ.A01(r0)
            java.lang.String r0 = r0.getPath()
            if (r0 == 0) goto L_0x0012
            android.graphics.Bitmap r1 = android.graphics.BitmapFactory.decodeFile(r0)
            if (r1 == 0) goto L_0x0012
            int r0 = r1.getHeight()
            int r2 = r1.getWidth()
            java.util.HashMap r9 = X.AnonymousClass0wJ.A0y()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "HEIGHT"
            r9.put(r0, r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
            java.lang.String r0 = "WIDTH"
            r9.put(r0, r1)
            return r9
        L_0x4f80:
            java.lang.String r2 = "bk.action.fx.im.RemoveProfilePicture"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x4fcf
            com.instagram.service.session.UserSession r6 = X.C63913ic.A0J(r1)
            r2 = 0
            X.C04220Ms.A0B(r1, r2)
            androidx.fragment.app.Fragment r2 = X.C63913ic.A01(r1)
            X.428 r5 = new X.428
            r5.<init>(r2, r1, r0, r6)
            X.0aP r0 = X.C04620Ok.A00(r6)
            com.instagram.user.model.User r7 = r0.A00
            X.0m7 r3 = X.C63913ic.A07(r1)
            androidx.fragment.app.FragmentActivity r0 = r2.requireActivity()
            r9 = 0
            X.3GB r4 = X.AnonymousClass2FZ.A00(r0, r6)
            X.1iX r1 = new X.1iX
            r1.<init>(r2, r3, r4, r5, r6, r7)
            X.29g r0 = X.C318629g.REMOVE_CURRENT_PHOTO
            X.AnonymousClass4Aj.A0B = r0
            X.29S r10 = X.AnonymousClass29S.PROFILE_PICTURE_BOTTOM_SHEET_ITEM_CLICKED
            X.296 r11 = X.AnonymousClass4Aj.A0A
            X.2A6 r13 = X.AnonymousClass2A6.A06
            java.lang.String r0 = r6.getUserId()
            java.lang.Long.parseLong(r0)
            X.29g r12 = X.AnonymousClass4Aj.A0B
            r14 = r6
            r15 = r9
            r16 = r9
            X.C35712On.A00(r10, r11, r12, r13, r14, r15, r16)
            X.AnonymousClass4Aj.A05(r2, r1, r6)
            return r9
        L_0x4fcf:
            java.lang.String r2 = "bk.action.fx.OpenSyncScreen"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x4fdc
            java.lang.Object r9 = X.C33592Gh.A00(r1, r0)
            return r9
        L_0x4fdc:
            java.lang.String r2 = "bk.action.fx.PushSyncScreen"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x4fe9
            java.lang.Object r9 = X.C33602Gi.A00(r1, r0)
            return r9
        L_0x4fe9:
            java.lang.String r2 = "bk.action.GetCameraRollImages"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x5008
            X.3HX r2 = X.C63913ic.A0D(r1)
            android.content.Context r4 = r2.A00
            java.lang.String r2 = "android.permission.READ_EXTERNAL_STORAGE"
            int r2 = r4.checkSelfPermission(r2)
            boolean r2 = X.C18180wK.A1W(r2)
            if (r2 == 0) goto L_0x6517
            X.AnonymousClass7GY.A00(r4, r1, r0)
            goto L_0x395f
        L_0x5008:
            java.lang.String r2 = "bk.action.GetPhotoAuthorizationStatus"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x5029
            r0 = 1
            X.C04220Ms.A0B(r1, r0)
            X.3HX r0 = X.C63913ic.A0D(r1)
            android.content.Context r1 = r0.A00
            java.lang.String r0 = "android.permission.READ_EXTERNAL_STORAGE"
            int r0 = r1.checkSelfPermission(r0)
            boolean r0 = X.C18180wK.A1W(r0)
            if (r0 == 0) goto L_0x6b63
            java.lang.String r9 = "authorized"
            return r9
        L_0x5029:
            java.lang.String r2 = "bk.action.HapticFeedback"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x5074
            java.lang.Object r2 = X.C63893iY.A07(r0)
            java.lang.String r2 = (java.lang.String) r2
            X.3HX r0 = X.C63913ic.A0D(r1)
            android.content.Context r1 = r0.A00
            java.lang.String r0 = "vibrator"
            java.lang.Object r3 = r1.getSystemService(r0)
            android.os.Vibrator r3 = (android.os.Vibrator) r3
            if (r3 == 0) goto L_0x395f
            boolean r0 = r3.hasVibrator()
            if (r0 == 0) goto L_0x395f
            java.lang.String r0 = "strong"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L_0x506f
            java.lang.String r0 = "weak"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L_0x506a
            r1 = 40
            r0 = 143(0x8f, float:2.0E-43)
        L_0x5061:
            android.os.VibrationEffect r0 = android.os.VibrationEffect.createOneShot(r1, r0)
            r3.vibrate(r0)
            goto L_0x395f
        L_0x506a:
            r1 = 10
            r0 = 47
            goto L_0x5061
        L_0x506f:
            r1 = 80
            r0 = 255(0xff, float:3.57E-43)
            goto L_0x5061
        L_0x5074:
            java.lang.String r2 = "bk.action.horizon.OpenHorizon"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x50b4
            X.3HX r2 = X.C86104wH.A0V(r0)
            r1 = 1
            java.lang.Object r4 = X.C63893iY.A0B(r0, r1)
            java.lang.String r4 = (java.lang.String) r4
            android.content.Context r3 = r2.A00
            X.C04220Ms.A06(r3)
            java.lang.Class<com.facebook.cloudstreaming.backends.ig.Horizon2DActivity> r0 = com.facebook.cloudstreaming.backends.ig.Horizon2DActivity.class
            android.content.Intent r2 = new android.content.Intent
            r2.<init>(r3, r0)
            r0 = 268435456(0x10000000, float:2.5243549E-29)
            r2.addFlags(r0)
            r0 = 67108864(0x4000000, float:1.5046328E-36)
            r2.addFlags(r0)
            java.lang.String r1 = "source"
            java.lang.String r0 = "plugin"
            r2.putExtra(r1, r0)
            if (r4 == 0) goto L_0x50ab
            java.lang.String r0 = "payload"
            r2.putExtra(r0, r4)
        L_0x50ab:
            X.05L r0 = X.C18230wP.A0O()
            r0.A09(r3, r2)
            r9 = 0
            return r9
        L_0x50b4:
            java.lang.String r2 = "bk.action.ig.affiliate.FinishPartnershipDiscoveryOnboarding"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L_0x395f
            java.lang.String r2 = "bk.action.ig.bullying.SafetyCheckOptionSelected"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x50c9
            java.lang.Object r9 = X.C33612Gj.A00(r1, r0)
            return r9
        L_0x50c9:
            java.lang.String r2 = "bk.action.ig.caa.LoginWithFB"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x50d6
            java.lang.Object r9 = X.C33622Gk.A00(r1, r0)
            return r9
        L_0x50d6:
            java.lang.String r2 = "bk.action.ig.coreformats.ShoppingTaggingFeedExit"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x50e3
            java.lang.Object r9 = X.A3Z.A00(r1, r0)
            return r9
        L_0x50e3:
            java.lang.String r2 = "bk.action.ig.equity.UserPronounsUpdated"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x5108
            r0 = 1
            X.C04220Ms.A0B(r1, r0)
            X.0i6 r0 = X.C63913ic.A0F(r1)
            com.instagram.service.session.UserSession r0 = X.C05030Qo.A02(r0)
            X.KHq r1 = X.AnonymousClass3LY.A00(r0)
            r0.getUserId()
            X.7rM r0 = new X.7rM
            r0.<init>()
            r1.CWx(r0)
            r9 = 0
            return r9
        L_0x5108:
            java.lang.String r2 = "bk.action.ig.family_sharing.ToggleCCPXARButton"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x5115
            java.lang.Object r9 = X.C33632Gl.A00(r1, r0)
            return r9
        L_0x5115:
            java.lang.String r2 = "bk.action.ig.feed.AddYoursAction"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x5122
            java.lang.Object r9 = X.C33642Gm.A00(r1, r0)
            return r9
        L_0x5122:
            java.lang.String r2 = "bk.action.ig.feed.DismissPost"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L_0x395f
            java.lang.String r2 = "bk.action.ig.feed.OpenMediaListFeed"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x51ad
            r5 = 0
            boolean r2 = X.AnonymousClass0wJ.A1Z(r0, r1)
            java.lang.Object r6 = X.C63893iY.A0B(r0, r5)
            r6.getClass()
            java.util.Collection r6 = (java.util.Collection) r6
            java.lang.Object r4 = X.C63893iY.A0B(r0, r2)
            r4.getClass()
            java.lang.String r3 = X.C86164wN.A0h(r4)
            java.lang.String r4 = (java.lang.String) r4
            r2 = 2
            java.lang.Object r3 = X.C63893iY.A0C(r0, r3, r2)
            java.lang.String r3 = (java.lang.String) r3
            r2 = 3
            java.lang.Object r15 = X.C63893iY.A0B(r0, r2)
            java.lang.String r15 = (java.lang.String) r15
            r2 = 4
            boolean r30 = X.AnonymousClass3WF.A01(r0, r2)
            androidx.fragment.app.FragmentActivity r2 = X.C63913ic.A05(r1)
            X.0i6 r0 = X.C63913ic.A0F(r1)
            com.instagram.service.session.UserSession r0 = X.C05030Qo.A02(r0)
            X.Drz r2 = X.C18180wK.A0Q(r2, r0)
            com.instagram.util.fragment.IgFragmentFactoryImpl.A00()
            r9 = 0
            java.lang.String r14 = "Static"
            java.util.ArrayList r23 = X.C18200wM.A0s(r6)
            com.instagram.feed.fragment.ContextualFeedFragment r1 = new com.instagram.feed.fragment.ContextualFeedFragment
            r1.<init>()
            r10 = r9
            r11 = r9
            r12 = r9
            r13 = r9
            r16 = r9
            r17 = r4
            r18 = r3
            r19 = r9
            r20 = r9
            r21 = r9
            r22 = r9
            r24 = r5
            r25 = r5
            r26 = r5
            r27 = r5
            r28 = r5
            r29 = r5
            android.os.Bundle r0 = X.C19233Asv.A00(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30)
            r1.setArguments(r0)
            r2.A03 = r1
            r2.A08()
            r2.A05()
            return r9
        L_0x51ad:
            java.lang.String r2 = "bk.action.ig.giving.AddExistingStandaloneFundraiserStickerToStory"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x51ba
            java.lang.Object r9 = X.AnonymousClass6OP.A00(r1, r0)
            return r9
        L_0x51ba:
            java.lang.String r2 = "bk.action.ig.giving.AddExistingStandaloneFundraiserToLive"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x5216
            r2 = 0
            boolean r4 = X.AnonymousClass0wJ.A1Z(r0, r1)
            java.lang.Object r3 = X.C63893iY.A0B(r0, r2)
            r3.getClass()
            java.lang.String r2 = X.C86164wN.A0h(r3)
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r2 = X.C63893iY.A0C(r0, r2, r4)
            java.lang.String r2 = (java.lang.String) r2
            r4 = 2
            X.7h3 r5 = X.C63893iY.A03(r0, r4)
            r0 = 36
            java.lang.String r4 = ""
            java.lang.String r6 = X.C127397h3.A0F(r5, r4, r0)
            java.lang.String r7 = X.C18220wO.A0o(r5)
            r0 = 38
            java.lang.String r8 = X.C127397h3.A0F(r5, r4, r0)
            java.lang.String r9 = X.C127397h3.A0C(r5)
            r0 = 41
            java.lang.String r10 = X.C127397h3.A0F(r5, r4, r0)
            com.instagram.model.fundraiser.FundraiserDisplayInfoModel r5 = new com.instagram.model.fundraiser.FundraiserDisplayInfoModel
            r5.<init>(r6, r7, r8, r9, r10)
            X.0i6 r0 = X.C63913ic.A0F(r1)
            com.instagram.service.session.UserSession r0 = X.C05030Qo.A02(r0)
            X.KHq r1 = X.AnonymousClass3LY.A00(r0)
            X.7rp r0 = new X.7rp
            r0.<init>(r5, r3, r2)
            r1.CWx(r0)
            r9 = 0
            return r9
        L_0x5216:
            java.lang.String r2 = "bk.action.ig.giving.AddStandaloneFundraiserCreationStickerToStory"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x5223
            java.lang.Object r9 = X.AnonymousClass6OQ.A00(r1, r0)
            return r9
        L_0x5223:
            java.lang.String r2 = "bk.action.ig.giving.AddStandaloneFundraiserCreationToLive"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x5230
            java.lang.Object r9 = X.AnonymousClass6OR.A00(r1, r0)
            return r9
        L_0x5230:
            java.lang.String r2 = "bk.action.ig.giving.AttachStandaloneFundraiserToFeedComposer"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x523d
            java.lang.Object r9 = X.AnonymousClass6OS.A00(r1, r0)
            return r9
        L_0x523d:
            java.lang.String r2 = "bk.action.ig.giving.LaunchFeedComposerWithStandaloneFundraiserAttached"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x524a
            java.lang.Object r9 = X.AnonymousClass6OT.A00(r1, r0)
            return r9
        L_0x524a:
            java.lang.String r2 = "bk.action.ig.giving.LaunchStandaloneFundraiserShareSheet"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x525c
            X.C33652Gn.A00(r1, r0)
            java.lang.String r0 = "Redex: Unreachable code after no-return invoke"
            java.lang.RuntimeException r2 = X.C18250wR.A0V(r0)
            throw r2
        L_0x525c:
            java.lang.String r2 = "bk.action.ig.giving.LaunchStoryWithStandaloneFundraiserSticker"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x5269
            java.lang.Object r9 = X.AnonymousClass6OU.A00(r1, r0)
            return r9
        L_0x5269:
            java.lang.String r2 = "bk.action.ig.giving.RefreshActiveStandaloneFundraisersForUser"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x5282
            boolean r2 = X.AnonymousClass0wJ.A1Y(r0, r1)
            java.lang.String r2 = X.C63893iY.A0D(r0, r2)
            com.instagram.service.session.UserSession r0 = X.C86104wH.A0Y(r1)
            X.C102416Vc.A00(r0, r2)
            r9 = 0
            return r9
        L_0x5282:
            java.lang.String r2 = "bk.action.ig.growth.RequestNotificationPermission"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x52a8
            r0 = 1
            X.C04220Ms.A0B(r1, r0)
            androidx.fragment.app.Fragment r0 = X.C63913ic.A01(r1)
            android.content.Context r1 = r0.requireContext()
            X.7EV r0 = new X.7EV
            r0.<init>(r1)
            android.app.NotificationManager r0 = r0.A00
            boolean r0 = r0.areNotificationsEnabled()
            if (r0 != 0) goto L_0x395f
            X.C09660ft.A00(r1)
            goto L_0x395f
        L_0x52a8:
            java.lang.String r2 = "bk.action.ig.identity.IGAccountOnClick"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x52b5
            java.lang.Object r9 = X.C33662Go.A00(r1, r0)
            return r9
        L_0x52b5:
            java.lang.String r2 = "bk.action.ig.identitysafety.livechat.GetStartChatParams"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x52c2
            java.lang.Object r9 = X.C33672Gp.A00(r1, r0)
            return r9
        L_0x52c2:
            java.lang.String r2 = "bk.action.ig.identitysafety.livechat.StoreStartChatParams"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x52cf
            java.lang.Object r9 = X.C33682Gq.A00(r1, r0)
            return r9
        L_0x52cf:
            java.lang.String r2 = "bk.action.ig.igds.dialog.OpenDialogV3"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x52dc
            java.lang.Object r9 = X.C33692Gr.A00(r1, r0)
            return r9
        L_0x52dc:
            java.lang.String r2 = "bk.action.ig.interactions.UpdateHideLikeAndViewCountsClientSetting"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x5308
            boolean r3 = X.AnonymousClass0wJ.A1Y(r0, r1)
            com.instagram.service.session.UserSession r2 = X.C86104wH.A0Y(r1)
            java.lang.Object r0 = X.C63893iY.A0A(r0, r3)
            boolean r1 = X.AnonymousClass3WF.A02(r0)
            X.6pH r0 = X.AnonymousClass2OP.A00(r2)
            r0.A00(r1)
            android.content.Context r1 = X.C18230wP.A08()
            X.BEu r0 = X.C19894BEu.A02(r1, r2)
            r0.A0E(r1)
            r9 = 0
            return r9
        L_0x5308:
            java.lang.String r2 = "bk.action.ig.ix.AutomatedLoggingEvent"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x534b
            r2 = 0
            boolean r5 = X.AnonymousClass0wJ.A1Z(r0, r1)
            java.util.List r4 = r0.A00
            X.7h3 r2 = X.C86164wN.A0S(r4, r2)
            r9 = 0
            if (r2 == 0) goto L_0x5349
            X.3HX r0 = r1.A00
            android.view.View r3 = r2.A0J(r0)
        L_0x5324:
            java.lang.String r2 = X.C18190wL.A0q(r4, r5)
            X.0i6 r0 = X.C63913ic.A0F(r1)
            X.C18200wM.A1R(r0)
            if (r3 == 0) goto L_0x0012
            X.Jn1 r1 = X.C37235Jn1.A00(r0)
            X.C04220Ms.A06(r1)
            X.C04220Ms.A04(r2)
            X.KDy r0 = new X.KDy
            r0.<init>(r2)
            r1.A0A(r3, r0)
            X.9zS r0 = X.C171469zS.TAP
            r1.A03(r3, r0)
            return r9
        L_0x5349:
            r3 = r9
            goto L_0x5324
        L_0x534b:
            java.lang.String r2 = "bk.action.ig.ix.AutomatedLoggingForElementTap"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x537e
            boolean r2 = X.AnonymousClass0wJ.A1Y(r0, r1)
            java.lang.Object r2 = X.C63893iY.A0B(r0, r2)
            X.7h3 r2 = (X.C127397h3) r2
            r9 = 0
            if (r2 == 0) goto L_0x537c
            X.3HX r0 = r1.A00
            android.view.View r2 = r2.A0J(r0)
        L_0x5366:
            X.0i6 r0 = X.C63913ic.A0F(r1)
            X.C18200wM.A1R(r0)
            if (r2 == 0) goto L_0x0012
            X.Jn1 r1 = X.C37235Jn1.A00(r0)
            X.C04220Ms.A06(r1)
            X.9zS r0 = X.C171469zS.TAP
            r1.A03(r2, r0)
            return r9
        L_0x537c:
            r2 = r9
            goto L_0x5366
        L_0x537e:
            java.lang.String r2 = "bk.action.ig.logging.NavigationChain"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x538d
            X.JlQ r0 = X.C103066Xr.A00
            X.Je6 r0 = r0.A02
            java.lang.String r9 = r0.A00
            return r9
        L_0x538d:
            java.lang.String r2 = "bk.action.ig.mwb.GetTimeReminderSetting"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x53b0
            r3 = 0
            boolean r2 = X.AnonymousClass0wJ.A1Z(r0, r1)
            java.lang.Object r0 = X.C63893iY.A0A(r0, r3)
            int r0 = X.AnonymousClass0wJ.A04(r0)
            X.0i6 r1 = X.C63913ic.A0F(r1)
            com.instagram.service.session.UserSession r1 = (com.instagram.service.session.UserSession) r1
            if (r0 == 0) goto L_0x64e3
            if (r0 == r2) goto L_0x64db
            r0 = 0
            goto L_0x39a8
        L_0x53b0:
            java.lang.String r2 = "bk.action.ig.mwb.SubmitFeedback"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x53bd
            java.lang.Object r9 = X.C33702Gs.A00(r1, r0)
            return r9
        L_0x53bd:
            java.lang.String r2 = "bk.action.ig.onboarding.GetBankInfoToken"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x5430
            r15 = 0
            java.lang.String r5 = X.C86154wM.A0l(r0, r15)
            r14 = 1
            java.util.List r0 = r0.A00
            java.lang.String r2 = X.C18190wL.A0q(r0, r14)
            r13 = 2
            X.6jp r4 = X.C18190wL.A0R(r0, r13)
            r7 = 3
            X.6jp r3 = X.C18190wL.A0R(r0, r7)
            X.GXN r6 = new X.GXN
            r6.<init>()
            java.lang.String r0 = "bank_account_number"
            r6.A05(r0, r5)
            if (r2 == 0) goto L_0x53ec
            java.lang.String r0 = "payment_dev_cycle"
            r6.A05(r0, r2)
        L_0x53ec:
            r5 = 658(0x292, float:9.22E-43)
            r2 = 50
            com.facebook.redex.IDxCallableShape274S0100000_5_I2 r0 = new com.facebook.redex.IDxCallableShape274S0100000_5_I2
            r0.<init>((java.lang.Object) r6, (int) r2)
            X.FTx r10 = X.C28601FTx.A00(r0, r5, r13)
            r9 = 0
            com.facebook.redex.IDxContinuationShape526S0100000_5_I2 r11 = new com.facebook.redex.IDxContinuationShape526S0100000_5_I2
            r11.<init>(r9, r7)
            r12 = 747(0x2eb, float:1.047E-42)
            X.FTx r16 = r10.A02(r11, r12, r13, r14, r15)
            com.facebook.redex.IDxContinuationShape149S0000000_2_I2 r0 = new com.facebook.redex.IDxContinuationShape149S0000000_2_I2
            r0.<init>(r14)
            r18 = 748(0x2ec, float:1.048E-42)
            r17 = r0
            r19 = r13
            r20 = r15
            r21 = r15
            X.FTx r6 = r16.A02(r17, r18, r19, r20, r21)
            java.lang.String r5 = "FetchPaymentToken"
            r0 = 21
            java.lang.String r0 = X.C28174Ezk.A00(r0)
            X.H8c r2 = new X.H8c
            r2.<init>(r6, r5, r0)
            com.instagram.common.api.base.IDxACallbackShape16S0300000_2_I2 r0 = new com.instagram.common.api.base.IDxACallbackShape16S0300000_2_I2
            r0.<init>(r14, r1, r3, r4)
            r2.A00 = r0
            X.C31155GhB.A03(r2)
            return r9
        L_0x5430:
            java.lang.String r2 = "bk.action.ig.onboarding.GetTaxIDToken"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x54a1
            r15 = 0
            java.lang.String r5 = X.C86154wM.A0l(r0, r15)
            r14 = 1
            java.util.List r0 = r0.A00
            java.lang.String r2 = X.C18190wL.A0q(r0, r14)
            r13 = 2
            X.6jp r4 = X.C18190wL.A0R(r0, r13)
            r6 = 3
            X.6jp r3 = X.C18190wL.A0R(r0, r6)
            X.GXN r7 = new X.GXN
            r7.<init>()
            r0 = 308(0x134, float:4.32E-43)
            java.lang.String r0 = X.I17.A00(r0)
            r7.A05(r0, r5)
            if (r2 == 0) goto L_0x5463
            java.lang.String r0 = "payment_dev_cycle"
            r7.A05(r0, r2)
        L_0x5463:
            r5 = 658(0x292, float:9.22E-43)
            r2 = 52
            com.facebook.redex.IDxCallableShape274S0100000_5_I2 r0 = new com.facebook.redex.IDxCallableShape274S0100000_5_I2
            r0.<init>((java.lang.Object) r7, (int) r2)
            X.FTx r10 = X.C28601FTx.A00(r0, r5, r13)
            r9 = 0
            com.facebook.redex.IDxContinuationShape526S0100000_5_I2 r11 = new com.facebook.redex.IDxContinuationShape526S0100000_5_I2
            r11.<init>(r9, r6)
            r12 = 747(0x2eb, float:1.047E-42)
            X.FTx r10 = r10.A02(r11, r12, r13, r14, r15)
            com.facebook.redex.IDxContinuationShape149S0000000_2_I2 r0 = new com.facebook.redex.IDxContinuationShape149S0000000_2_I2
            r0.<init>(r6)
            r12 = 748(0x2ec, float:1.048E-42)
            r11 = r0
            r14 = r15
            X.FTx r6 = r10.A02(r11, r12, r13, r14, r15)
            java.lang.String r5 = "FetchPaymentToken"
            r0 = 21
            java.lang.String r0 = X.C28174Ezk.A00(r0)
            X.H8c r2 = new X.H8c
            r2.<init>(r6, r5, r0)
            com.instagram.common.api.base.IDxACallbackShape16S0300000_2_I2 r0 = new com.instagram.common.api.base.IDxACallbackShape16S0300000_2_I2
            r0.<init>(r13, r1, r3, r4)
            r2.A00 = r0
            X.C31155GhB.A03(r2)
            return r9
        L_0x54a1:
            java.lang.String r2 = "bk.action.ig.OpenPayoutAccountInfo"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x54ae
            java.lang.Object r9 = X.AnonymousClass6OV.A00(r1, r0)
            return r9
        L_0x54ae:
            java.lang.String r2 = "bk.action.ig.recovery.FetchPrefillIdentifier"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L_0x395f
            java.lang.String r2 = "bk.action.ig.recovery.LaunchAssistedAccountRecovery"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L_0x395f
            java.lang.String r2 = "bk.action.ig.recovery.LoginWithFacebook"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L_0x395f
            java.lang.String r2 = "bk.action.ig.recovery.LookupUser"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L_0x395f
            java.lang.String r2 = "bk.action.ig.reels.OpenReelChainViewer"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x54db
            java.lang.Object r9 = X.C17258A3a.A00(r1, r0)
            return r9
        L_0x54db:
            java.lang.String r2 = "bk.action.ig.reg.BackToLogInWithInfo"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L_0x395f
            java.lang.String r2 = "bk.action.ig.reg.FetchExistingContactPoints"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L_0x6bc9
            java.lang.String r2 = "bk.action.ig.reg.OpenOnePageRegistrationScreen"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x552b
            r0 = 1
            X.C04220Ms.A0B(r1, r0)
            X.0i6 r5 = X.C63913ic.A0F(r1)
            X.4b4 r2 = X.AnonymousClass4b4.A00
            java.lang.Class<com.instagram.registration.model.RegFlowExtras> r0 = com.instagram.registration.model.RegFlowExtras.class
            java.lang.Object r4 = r5.A01(r0, r2)
            com.instagram.registration.model.RegFlowExtras r4 = (com.instagram.registration.model.RegFlowExtras) r4
            X.3hW r0 = X.C63463hW.A02()
            X.3Vf r3 = r0.A06()
            android.os.Bundle r2 = X.C18180wK.A06()
            r0 = 735(0x2df, float:1.03E-42)
            java.lang.String r0 = X.C18170wI.A00(r0)
            r2.putParcelable(r0, r4)
            java.lang.String r0 = r5.getToken()
            androidx.fragment.app.Fragment r2 = r3.A01(r2, r0)
            androidx.fragment.app.FragmentActivity r0 = X.C63913ic.A05(r1)
            X.AnonymousClass0wJ.A19(r2, r0, r5)
            r9 = 0
            return r9
        L_0x552b:
            java.lang.String r2 = "bk.action.ig.reg.ParsePhoneNumber"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x5538
            java.lang.Object r9 = X.C33712Gt.A00(r1, r0)
            return r9
        L_0x5538:
            java.lang.String r2 = "bk.action.ig.reg.ShowVettedPhoneLoginUpsell"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x5545
            java.lang.Object r9 = X.C33722Gu.A00(r1, r0)
            return r9
        L_0x5545:
            java.lang.String r2 = "bk.action.ig.reg.UpdateRegFlowExtras"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x5552
            java.lang.Object r9 = X.C33732Gv.A00(r1, r0)
            return r9
        L_0x5552:
            java.lang.String r2 = "bk.action.ig.settings.GetLocaleAndLanguage"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x5577
            java.util.Locale r3 = X.C31103Gfm.A03()
            java.lang.String r1 = r3.toString()
            java.lang.String r0 = "current_locale"
            kotlin.Pair r2 = X.C18180wK.A0p(r0, r1)
            java.lang.String r1 = r3.getDisplayLanguage()
            java.lang.String r0 = "current_language"
            kotlin.Pair r0 = X.C18180wK.A0p(r0, r1)
            java.util.Map r9 = X.AnonymousClass4WJ.A0G(r2, r0)
            return r9
        L_0x5577:
            java.lang.String r2 = "bk.action.ig.settings.ThirdPartyDownloadsAction"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x5594
            boolean r2 = X.AnonymousClass0wJ.A1Y(r0, r1)
            boolean r2 = X.AnonymousClass3WF.A01(r0, r2)
            com.instagram.service.session.UserSession r0 = X.C86104wH.A0Y(r1)
            com.instagram.user.model.User r0 = X.AnonymousClass0wJ.A0Y(r0)
            r0.A2f(r2)
            r9 = 0
            return r9
        L_0x5594:
            java.lang.String r2 = "bk.action.ig.shopping.OpenCoverMediaPicker"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x55a1
            java.lang.Object r9 = X.AnonymousClass6OW.A00(r1, r0)
            return r9
        L_0x55a1:
            java.lang.String r2 = "bk.action.ig.shopping.UpdateProductItem"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x55c2
            r0 = 1
            X.C04220Ms.A0B(r1, r0)
            X.0i6 r0 = X.C63913ic.A0F(r1)
            X.C18200wM.A1R(r0)
            X.KHq r1 = X.AnonymousClass3LY.A00(r0)
            X.7rT r0 = new X.7rT
            r0.<init>()
            r1.CWx(r0)
            r9 = 0
            return r9
        L_0x55c2:
            java.lang.String r2 = "bk.action.ig.smb.CloseBoostPost"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x55d3
            androidx.fragment.app.FragmentActivity r0 = A01(r1)
            r0.finish()
            r9 = 0
            return r9
        L_0x55d3:
            java.lang.String r2 = "bk.action.ig.smb.FetchFacebookAccessToken"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x55e0
            java.lang.Object r9 = X.C33742Gw.A00(r1, r0)
            return r9
        L_0x55e0:
            java.lang.String r2 = "bk.action.ig.smb.FetchFXAccessToken"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x55ed
            java.lang.Object r9 = X.C33752Gx.A00(r1, r0)
            return r9
        L_0x55ed:
            java.lang.String r2 = "bk.action.ig.smb.OnPro2ProClose"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x5662
            boolean r4 = X.AnonymousClass0wJ.A1Z(r0, r1)
            java.lang.Object r5 = X.C63893iY.A0B(r0, r4)
            r5.getClass()
            X.C18240wQ.A1I(r5)
            r0 = 1309(0x51d, float:1.834E-42)
            java.lang.String r0 = X.C18170wI.A00(r0)
            boolean r2 = r5.equals(r0)
            androidx.fragment.app.Fragment r0 = X.C63913ic.A01(r1)
            X.0m7 r3 = r0.getParentFragmentManager()
            if (r2 != 0) goto L_0x5655
            r0 = 1310(0x51e, float:1.836E-42)
            java.lang.String r0 = X.C18170wI.A00(r0)
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x6543
            r0 = 719(0x2cf, float:1.008E-42)
            java.lang.String r0 = X.C18170wI.A00(r0)
            java.lang.String[] r2 = new java.lang.String[]{r0}
        L_0x562d:
            int r0 = r3.A0I()
            if (r0 <= 0) goto L_0x395f
            int r1 = r3.A0I()
            int r1 = r1 - r4
            java.util.ArrayList r0 = r3.A0D
            java.lang.Object r0 = r0.get(r1)
            X.051 r0 = (X.AnonymousClass051) r0
            X.C04220Ms.A06(r0)
            X.05O r0 = (X.AnonymousClass05O) r0
            java.lang.String r0 = r0.A0A
            int r0 = X.AnonymousClass8AP.A01(r2, r0)
            boolean r0 = X.C86114wI.A1S(r0)
            if (r0 != 0) goto L_0x395f
            r3.A16()
            goto L_0x562d
        L_0x5655:
            r0 = 763(0x2fb, float:1.069E-42)
            java.lang.String r1 = X.C18170wI.A00(r0)
            java.lang.String r0 = "OrderAndPaymentsPromotionPayments.BACK_STACK_NAME"
            java.lang.String[] r2 = new java.lang.String[]{r1, r0}
            goto L_0x562d
        L_0x5662:
            java.lang.String r2 = "bk.action.ig.smb.OnPro2ProSuccess"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x566f
            java.lang.Object r9 = X.C33762Gy.A00(r1, r0)
            return r9
        L_0x566f:
            java.lang.String r2 = "bk.action.ig.smb.OpenBoostPost"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x567c
            java.lang.Object r9 = X.AnonymousClass6OX.A00(r1, r0)
            return r9
        L_0x567c:
            java.lang.String r2 = "bk.action.ig.smb.OpenPayBalance"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x56a7
            boolean r4 = X.AnonymousClass0wJ.A1Z(r0, r1)
            r2 = 2
            java.lang.String r3 = X.C63893iY.A0D(r0, r2)
            androidx.fragment.app.FragmentActivity r2 = X.C63913ic.A05(r1)
            boolean r0 = r2 instanceof com.instagram.base.activity.BaseFragmentActivity
            r9 = 0
            if (r0 == 0) goto L_0x0012
            com.instagram.base.activity.BaseFragmentActivity r2 = (com.instagram.base.activity.BaseFragmentActivity) r2
            if (r2 == 0) goto L_0x0012
            com.instagram.service.session.UserSession r1 = X.C86104wH.A0Y(r1)
            X.42h r0 = new X.42h
            r0.<init>(r2, r1, r3)
            X.C37740K2a.A04(r2, r0, r1, r4)
            return r9
        L_0x56a7:
            java.lang.String r2 = "bk.action.ig.smb.OpenPOSMWithCAL"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x56c0
            androidx.fragment.app.FragmentActivity r1 = A01(r1)
            boolean r0 = r1 instanceof X.C145918lK
            r9 = 0
            if (r0 == 0) goto L_0x0012
            X.8lK r1 = (X.C145918lK) r1
            if (r1 == 0) goto L_0x0012
            r1.AM2()
            return r9
        L_0x56c0:
            java.lang.String r2 = "bk.action.ig.smb.OpenPromote"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x56cd
            java.lang.Object r9 = X.AnonymousClass6OY.A00(r1, r0)
            return r9
        L_0x56cd:
            java.lang.String r2 = "bk.action.ig.smb.OpenPromotionPayments"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x56ee
            r0 = 1
            X.C04220Ms.A0B(r1, r0)
            X.0i6 r3 = X.C63913ic.A0F(r1)
            X.C18190wL.A10()
            X.Ipr r2 = new X.Ipr
            r2.<init>()
            androidx.fragment.app.FragmentActivity r0 = X.C63913ic.A05(r1)
            X.AnonymousClass0wJ.A19(r2, r0, r3)
            r9 = 0
            return r9
        L_0x56ee:
            java.lang.String r2 = "bk.action.ig.smb.RefreshPageInfo"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x571c
            r2 = 1
            X.C04220Ms.A0B(r1, r2)
            android.os.Bundle r3 = X.C18180wK.A06()
            r0 = 525(0x20d, float:7.36E-43)
            java.lang.String r0 = X.C18170wI.A00(r0)
            r3.putBoolean(r0, r2)
            java.lang.String r0 = "ux_flow_status_code"
            r3.putInt(r0, r2)
            android.content.Intent r2 = X.C18230wP.A0B()
            r2.putExtras(r3)
            androidx.fragment.app.FragmentActivity r0 = X.C63913ic.A05(r1)
            X.C18200wM.A10(r0, r2)
            r9 = 0
            return r9
        L_0x571c:
            java.lang.String r2 = "bk.action.ig.smb.SkipPageLinking"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x574b
            r2 = 1
            X.C04220Ms.A0B(r1, r2)
            android.os.Bundle r3 = X.C18180wK.A06()
            r0 = 525(0x20d, float:7.36E-43)
            java.lang.String r0 = X.C18170wI.A00(r0)
            r3.putBoolean(r0, r2)
            r2 = 2
            java.lang.String r0 = "ux_flow_status_code"
            r3.putInt(r0, r2)
            android.content.Intent r2 = X.C18230wP.A0B()
            r2.putExtras(r3)
            androidx.fragment.app.FragmentActivity r0 = X.C63913ic.A05(r1)
            X.C18200wM.A10(r0, r2)
            r9 = 0
            return r9
        L_0x574b:
            java.lang.String r2 = "bk.action.ig.subscriptions.FanClubFanOnboarding"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x5784
            r3 = 0
            boolean r2 = X.AnonymousClass0wJ.A1Z(r0, r1)
            androidx.fragment.app.FragmentActivity r4 = X.C63913ic.A05(r1)
            X.0i6 r5 = X.C63913ic.A0F(r1)
            X.C18200wM.A1R(r5)
            com.instagram.service.session.UserSession r5 = (com.instagram.service.session.UserSession) r5
            java.lang.Object r8 = X.C63893iY.A0B(r0, r3)
            r8.getClass()
            java.lang.String r1 = X.C86164wN.A0h(r8)
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r9 = X.C63893iY.A0C(r0, r1, r2)
            java.lang.String r9 = (java.lang.String) r9
            X.3Vl r3 = X.AnonymousClass3WJ.A01()
            r6 = 0
            r7 = r6
            r3.A04(r4, r5, r6, r7, r8, r9)
            kotlin.Unit r9 = kotlin.Unit.A00
            return r9
        L_0x5784:
            java.lang.String r2 = "bk.action.ig.subscriptions.OpenBroadcastChannel"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x5791
            java.lang.Object r9 = X.C33772Gz.A00(r1, r0)
            return r9
        L_0x5791:
            java.lang.String r2 = "bk.action.ig.subscriptions.OpenGiftingPriceSelectionBottomSheet"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x579e
            java.lang.Object r9 = X.AnonymousClass2H0.A00(r1, r0)
            return r9
        L_0x579e:
            java.lang.String r2 = "bk.action.ig.subscriptions.OpenUserDetailFromFanClub"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x57d4
            r2 = 0
            boolean r5 = X.AnonymousClass0wJ.A1Z(r0, r1)
            X.0i6 r4 = X.C63913ic.A0F(r1)
            X.C18200wM.A1R(r4)
            java.lang.Object r2 = X.C63893iY.A0B(r0, r2)
            r2.getClass()
            java.lang.String r3 = X.C86164wN.A0h(r2)
            java.lang.Object r2 = X.C63893iY.A0B(r0, r5)
            r2.getClass()
            java.lang.Object r0 = X.C63893iY.A09(r0)
            X.C04220Ms.A0C(r0, r3)
            androidx.fragment.app.FragmentActivity r0 = X.C63913ic.A05(r1)
            X.C60113Ns.A01(r0, r4)
            goto L_0x404b
        L_0x57d4:
            java.lang.String r2 = "bk.action.ig.userpay.OpenFanOnboardingMediaFeed"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x57e1
            java.lang.Object r9 = X.AnonymousClass6OZ.A00(r1, r0)
            return r9
        L_0x57e1:
            java.lang.String r2 = "bk.action.ig.userpay.OpenFanOnboardingMediaStory"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x583b
            r2 = 0
            java.lang.Object r7 = X.C63893iY.A0B(r0, r2)
            r7.getClass()
            java.util.List r7 = (java.util.List) r7
            com.instagram.service.session.UserSession r6 = X.C63913ic.A0J(r1)
            X.C04220Ms.A0B(r1, r2)
            androidx.fragment.app.FragmentActivity r5 = X.C63913ic.A05(r1)
            X.06E r0 = X.AnonymousClass06E.A00(r5)
            X.AxZ r4 = new X.AxZ
            r4.<init>(r5, r0, r6)
            X.C18200wM.A1S(r7, r6)
            r9 = 0
            r13 = 63
            r8 = r9
            r10 = r9
            r11 = r7
            r12 = r9
            java.lang.String r2 = X.AnonymousClass00J.A0H(r8, r9, r10, r11, r12, r13)
            X.H1T r3 = X.AnonymousClass0wJ.A0P(r6)
            java.lang.String r0 = "media/infos/"
            r3.A0J(r0)
            java.lang.String r0 = "media_ids"
            r3.A0O(r0, r2)
            java.lang.Class<X.9Me> r2 = X.C156169Me.class
            java.lang.Class<X.AtU> r0 = X.C19265AtU.class
            X.H8c r3 = X.AnonymousClass0wJ.A0T(r3, r2, r0)
            X.6kv r2 = new X.6kv
            r2.<init>(r5, r1, r6, r7)
            X.9wH r1 = X.C171229wH.A0H
            X.7v6 r0 = new X.7v6
            r0.<init>(r2, r1)
            r4.A06(r3, r0)
            return r9
        L_0x583b:
            java.lang.String r2 = "bk.action.ig.userpay.OpenInAppPurchase"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x5848
            java.lang.Object r9 = X.AnonymousClass2H1.A00(r1, r0)
            return r9
        L_0x5848:
            java.lang.String r2 = "bk.action.ig.userpay.OpenSubscriptionsSettings"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x585f
            androidx.fragment.app.FragmentActivity r1 = A01(r1)
            java.lang.String r0 = "https://play.google.com/store/account/subscriptions"
            r9 = 0
            android.content.Intent r0 = X.C18190wL.A0B(r0)
            X.C10650ih.A0B(r1, r0)
            return r9
        L_0x585f:
            java.lang.String r2 = "bk.action.ig.wellbeing.OpenAccountStatus"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x586c
            java.lang.Object r9 = X.AnonymousClass2H2.A00(r1, r0)
            return r9
        L_0x586c:
            java.lang.String r2 = "bk.action.ig.wellbeing.OpenAccountStatusDetail"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x5879
            java.lang.Object r9 = X.AnonymousClass2H3.A00(r1, r0)
            return r9
        L_0x5879:
            java.lang.String r2 = "bk.action.ig.wellbeing.OpenForgotPassword"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x5886
            java.lang.Object r9 = X.AnonymousClass2H4.A00(r1)
            return r9
        L_0x5886:
            java.lang.String r2 = "bk.action.ig.wellbeing.OpenSensitiveContentControl"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x5893
            java.lang.Object r9 = X.AnonymousClass2H5.A00(r1, r0)
            return r9
        L_0x5893:
            java.lang.String r2 = "bk.action.ig.wellbeing.ReturnToExploreWithRefresh"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x58c8
            androidx.fragment.app.FragmentActivity r3 = A01(r1)
            X.0i6 r0 = X.C63913ic.A0F(r1)
            com.instagram.service.session.UserSession r2 = X.C05030Qo.A03(r0)
            r9 = 0
            r0 = 665(0x299, float:9.32E-43)
            java.lang.String r1 = X.C18170wI.A00(r0)
            if (r2 != 0) goto L_0x58b6
            java.lang.String r0 = "bk.action.ig.wellbeing.ReturnToExploreWithRefresh: expecting user session to be non-null"
        L_0x58b2:
            X.C30967GcS.A02(r1, r0)
            return r9
        L_0x58b6:
            boolean r0 = r3 instanceof com.instagram.base.activity.BaseFragmentActivity
            if (r0 == 0) goto L_0x58c5
            X.8Hm r1 = X.C138438Hm.A00
            java.lang.Class<X.6S0> r0 = X.AnonymousClass6S0.class
            r2.A01(r0, r1)
            r3.onBackPressed()
            return r9
        L_0x58c5:
            java.lang.String r0 = "bk.action.ig.wellbeing.ReturnToExploreWithRefresh: expecting host activity to be IgFragmentActivity"
            goto L_0x58b2
        L_0x58c8:
            java.lang.String r2 = "bk.action.ig.xfac.OpenAppealFlow"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x58d5
            java.lang.Object r9 = X.AnonymousClass2H6.A00(r1, r0)
            return r9
        L_0x58d5:
            java.lang.String r2 = "bk.action.inapppurchase.FetchPriceAndBuy"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x58e2
            java.lang.Object r9 = X.C100626Oa.A00(r1, r0)
            return r9
        L_0x58e2:
            java.lang.String r2 = "bk.action.insights.GetCurrentSessionID"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x58fe
            r0 = 1
            X.C04220Ms.A0B(r1, r0)
            X.0i6 r0 = X.C63913ic.A0F(r1)
            X.C18200wM.A1R(r0)
            X.0kZ r0 = X.C12090lI.A00(r0)
            java.lang.String r9 = r0.B1d()
            return r9
        L_0x58fe:
            java.lang.String r2 = "bk.action.insights.SetTimeframeHeader"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x590b
            java.lang.Object r9 = X.AnonymousClass2H7.A00(r1, r0)
            return r9
        L_0x590b:
            java.lang.String r2 = "bk.action.instagram.remotepresence.OpenVerifiedCallerSettings"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x5918
            java.lang.Object r9 = X.AnonymousClass2H8.A00(r1, r0)
            return r9
        L_0x5918:
            java.lang.String r2 = "bk.action.io.clipboard.SetString"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x594b
            boolean r2 = X.AnonymousClass0wJ.A1Y(r0, r1)
            java.lang.String r0 = X.C63893iY.A0D(r0, r2)
            r9 = 0
            android.content.ClipData r2 = android.content.ClipData.newPlainText(r9, r0)
            X.3HX r0 = X.C63913ic.A0D(r1)
            android.content.Context r1 = r0.A00
            X.C04220Ms.A06(r1)
            java.lang.String r0 = "clipboard"
            java.lang.Object r1 = r1.getSystemService(r0)
            r0 = 43
            java.lang.String r0 = X.C18170wI.A00(r0)
            X.C04220Ms.A0C(r1, r0)
            android.content.ClipboardManager r1 = (android.content.ClipboardManager) r1
            r1.setPrimaryClip(r2)
            return r9
        L_0x594b:
            java.lang.String r2 = "bk.action.logging.AutomatedLoggingEvent"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x597e
            r1 = 0
            X.C04220Ms.A0B(r0, r1)
            r1 = 3
            java.lang.Object r0 = X.C63893iY.A0A(r0, r1)
            long r0 = X.C18190wL.A08(r0)
            X.JlQ r3 = X.C103066Xr.A00
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.util.List r0 = X.C18180wK.A0n(r0)
            java.util.Iterator r2 = r0.iterator()
        L_0x596e:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x395f
            java.lang.Object r1 = r2.next()
            java.util.Set r0 = r3.A05
            r0.add(r1)
            goto L_0x596e
        L_0x597e:
            java.lang.String r2 = "bk.action.logging.LogEvent"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L_0x6beb
            java.lang.String r2 = "bk.action.logging.LogEventImmediately"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x59d4
            java.lang.Object r3 = X.C63893iY.A07(r0)
            java.lang.String r3 = (java.lang.String) r3
            r2 = 1
            java.lang.Object r2 = X.C63893iY.A0B(r0, r2)
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r4 = X.C63893iY.A09(r0)
            java.util.Map r4 = (java.util.Map) r4
            if (r2 == 0) goto L_0x59cb
            X.7pw r0 = new X.7pw
            r0.<init>(r2)
        L_0x59a8:
            X.0rn r3 = X.C15730rn.A00(r0, r3)
            X.0kP r2 = X.C11560kP.IS_LOGGED_FROM_BLOKS
            java.util.EnumSet r0 = r3.A06
            r0.add(r2)
            X.0ri r0 = X.C118006zb.A00(r4)
            r3.A04(r0)
            r0 = 0
            X.C04220Ms.A0B(r1, r0)
            X.0i6 r0 = X.C63913ic.A0F(r1)
            X.0kZ r0 = X.C12090lI.A00(r0)
            r0.Ce1(r3)
            r9 = 0
            return r9
        L_0x59cb:
            r0 = 0
            X.C04220Ms.A0B(r1, r0)
            X.0kW r0 = X.C63913ic.A0A(r1)
            goto L_0x59a8
        L_0x59d4:
            java.lang.String r2 = "bk.action.media.OpenCamera"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x59e1
            java.lang.Object r9 = X.C35649IzP.A00(r1, r0)
            return r9
        L_0x59e1:
            java.lang.String r2 = "bk.action.mft.OpenWalletConnectDeepLink"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x5a29
            boolean r2 = X.AnonymousClass0wJ.A1Y(r0, r1)
            X.7h3 r0 = X.C63893iY.A03(r0, r2)
            java.lang.String r3 = X.C18230wP.A0o(r0)
            java.lang.String r5 = X.C18220wO.A0o(r0)
            if (r3 == 0) goto L_0x5a02
            int r2 = r3.length()
            r0 = 0
            if (r2 != 0) goto L_0x5a03
        L_0x5a02:
            r0 = 1
        L_0x5a03:
            r9 = 0
            if (r0 != 0) goto L_0x0012
            if (r5 == 0) goto L_0x0012
            int r0 = r5.length()
            if (r0 == 0) goto L_0x0012
            X.3HX r0 = X.C63913ic.A0D(r1)
            android.content.Context r4 = r0.A00
            X.C04220Ms.A06(r4)
            android.net.Uri r3 = X.C15430rJ.A01(r3)
            android.content.pm.PackageManager r0 = r4.getPackageManager()
            boolean r0 = X.C09650fs.A09(r0, r5)
            if (r0 != 0) goto L_0x6b66
            X.C09650fs.A01(r4, r5, r9)
            return r9
        L_0x5a29:
            java.lang.String r2 = "bk.action.navigation.AdsToggleWithParam"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x5a36
            java.lang.Object r9 = X.C17259A3b.A00(r1, r0)
            return r9
        L_0x5a36:
            java.lang.String r2 = "bk.action.navigation.CloseBookingFlowAndLaunchThreadWithMerchant"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x5a48
            X.AnonymousClass2H9.A00(r1, r0)
            java.lang.String r0 = "Redex: Unreachable code after no-return invoke"
            java.lang.RuntimeException r2 = X.C18250wR.A0V(r0)
            throw r2
        L_0x5a48:
            java.lang.String r2 = "bk.action.navigation.CloseScreen"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x5a61
            r0 = 1
            X.C04220Ms.A0B(r1, r0)
            X.0m7 r2 = X.C63913ic.A07(r1)
            androidx.fragment.app.FragmentActivity r0 = X.C63913ic.A05(r1)
            X.AnonymousClass3WA.A00(r0, r2)
            r9 = 0
            return r9
        L_0x5a61:
            r2 = 313(0x139, float:4.39E-43)
            java.lang.String r2 = X.C18170wI.A00(r2)
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x5a72
            java.lang.Object r9 = X.AnonymousClass2HA.A00(r1, r0)
            return r9
        L_0x5a72:
            java.lang.String r2 = "bk.action.navigation.OpenSendMessage"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x5a84
            X.AnonymousClass2HB.A00(r1, r0)
            java.lang.String r0 = "Redex: Unreachable code after no-return invoke"
            java.lang.RuntimeException r2 = X.C18250wR.A0V(r0)
            throw r2
        L_0x5a84:
            java.lang.String r2 = "bk.action.navigation.OpenUrl"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x5a97
            java.lang.Object r0 = X.C63893iY.A07(r0)
            java.lang.String r0 = (java.lang.String) r0
            r9 = 0
            X.AnonymousClass2HC.A00(r1, r0, r9, r9)
            return r9
        L_0x5a97:
            java.lang.String r2 = "bk.action.navigation.SetDividerLineHidden"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x5abe
            boolean r2 = X.AnonymousClass0wJ.A1Y(r0, r1)
            androidx.fragment.app.Fragment r1 = X.C63913ic.A01(r1)
            boolean r2 = X.AnonymousClass3WF.A01(r0, r2)
            boolean r0 = r1 instanceof X.AnonymousClass1c8
            if (r0 == 0) goto L_0x395f
            X.1c8 r1 = (X.AnonymousClass1c8) r1
            androidx.fragment.app.FragmentActivity r0 = r1.A03
            X.E2V.A03(r0)
            com.instagram.bloks.hosting.IgBloksScreenConfig r1 = r1.A0A
            r0 = r2 ^ 1
            r1.A0i = r0
            goto L_0x395f
        L_0x5abe:
            java.lang.String r2 = "bk.action.navigation.SetNavBar"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x5ae3
            r3 = 0
            java.lang.Object r0 = X.C63893iY.A0B(r0, r3)
            X.7h3 r0 = (X.C127397h3) r0
            X.3TP r2 = X.C62863b2.A01(r0)
            X.C04220Ms.A0B(r1, r3)
            androidx.fragment.app.Fragment r1 = X.C63913ic.A01(r1)
            boolean r0 = r1 instanceof X.AnonymousClass1c8
            if (r0 == 0) goto L_0x395f
            X.1c8 r1 = (X.AnonymousClass1c8) r1
            r1.A06(r2)
            goto L_0x395f
        L_0x5ae3:
            java.lang.String r2 = "bk.action.navigation.SetNavBarColor"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x5af0
            java.lang.Object r9 = X.AnonymousClass2HD.A00(r1, r0)
            return r9
        L_0x5af0:
            java.lang.String r2 = "bk.action.navigation.SetNavBarV2"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x5b19
            r3 = 0
            java.lang.Object r2 = X.C63893iY.A0B(r0, r3)
            X.7h3 r2 = (X.C127397h3) r2
            X.3HX r0 = X.C63913ic.A0D(r1)
            r9 = 0
            X.3TP r2 = X.C62863b2.A00(r9, r0, r2)
            X.C04220Ms.A0B(r1, r3)
            androidx.fragment.app.Fragment r1 = X.C63913ic.A01(r1)
            boolean r0 = r1 instanceof X.AnonymousClass1c8
            if (r0 == 0) goto L_0x0012
            X.1c8 r1 = (X.AnonymousClass1c8) r1
            r1.A06(r2)
            return r9
        L_0x5b19:
            java.lang.String r2 = "bk.action.OpenDatePicker"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x5b26
            java.lang.Object r9 = X.AnonymousClass2HE.A00(r1, r0)
            return r9
        L_0x5b26:
            java.lang.String r2 = "bk.action.OpenDateTimePicker"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x5b33
            java.lang.Object r9 = X.AnonymousClass2HF.A00(r1, r0)
            return r9
        L_0x5b33:
            java.lang.String r2 = "bk.action.OpenPastPromotions"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x5b5e
            androidx.fragment.app.FragmentActivity r3 = A01(r1)
            X.0i6 r2 = X.C63913ic.A0F(r1)
            X.C18200wM.A1R(r2)
            X.Dd0 r0 = X.C62883b4.A01()
            r0.A01()
            android.os.Bundle r1 = X.C18180wK.A06()
            X.Ibs r0 = new X.Ibs
            r0.<init>()
            r0.setArguments(r1)
            X.AnonymousClass0wJ.A19(r0, r3, r2)
            r9 = 0
            return r9
        L_0x5b5e:
            java.lang.String r2 = "bk.action.OpenProductLinks"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x5b6b
            java.lang.Object r9 = X.C17260A3c.A00(r1, r0)
            return r9
        L_0x5b6b:
            java.lang.String r2 = "bk.action.OpenTimePicker"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x5b78
            java.lang.Object r9 = X.AnonymousClass2HG.A00(r1, r0)
            return r9
        L_0x5b78:
            java.lang.String r2 = "bk.action.OpenUniversalLink"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x5b95
            java.lang.Object r2 = X.C63893iY.A07(r0)
            java.lang.String r2 = (java.lang.String) r2
            X.3HX r0 = X.C63913ic.A0D(r1)
            android.content.Context r1 = r0.A00
            r9 = 0
            android.content.Intent r0 = X.C18190wL.A0B(r2)
            X.C10650ih.A01(r1, r0)
            return r9
        L_0x5b95:
            java.lang.String r2 = "bk.action.payout.SaveFEIDForIGFOnboarding"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x5ba2
            java.lang.Object r9 = X.AnonymousClass2HH.A00(r1, r0)
            return r9
        L_0x5ba2:
            java.lang.String r2 = "bk.action.preload.InvalidatePreloadScreen"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x5bde
            java.lang.Object r2 = X.C63893iY.A07(r0)
            X.7h3 r2 = (X.C127397h3) r2
            java.lang.Object r0 = X.C63893iY.A08(r0)
            java.util.Map r0 = (java.util.Map) r0
            java.util.HashMap r4 = X.C63913ic.A0N(r0)
            boolean r0 = X.C63763iI.A0D(r2)
            r9 = 0
            if (r0 == 0) goto L_0x5bdc
            java.lang.String r3 = X.C63763iI.A07(r2)
        L_0x5bc5:
            android.content.Context r2 = X.C18230wP.A08()
            if (r3 == 0) goto L_0x0012
            r0 = 0
            X.C04220Ms.A0B(r1, r0)
            X.0i6 r1 = X.C63913ic.A0F(r1)
            X.18u r0 = new X.18u
            r0.<init>(r1)
            X.M4x.A01(r2, r0, r3, r9, r4)
            return r9
        L_0x5bdc:
            r3 = r9
            goto L_0x5bc5
        L_0x5bde:
            java.lang.String r2 = "bk.action.preload.InvalidatePreloadScreenV2"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x5c1e
            java.lang.Object r2 = X.C63893iY.A07(r0)
            X.7h3 r2 = (X.C127397h3) r2
            java.lang.Object r0 = X.C63893iY.A08(r0)
            java.util.HashMap r0 = (java.util.HashMap) r0
            java.util.HashMap r5 = X.C63913ic.A0N(r0)
            boolean r0 = X.C63763iI.A0D(r2)
            r9 = 0
            if (r0 == 0) goto L_0x5c1c
            java.lang.String r4 = X.C63763iI.A07(r2)
        L_0x5c01:
            android.content.Context r3 = X.C18230wP.A08()
            if (r4 == 0) goto L_0x0012
            java.lang.String r2 = X.C63763iI.A08(r2)
            r0 = 0
            X.C04220Ms.A0B(r1, r0)
            X.0i6 r1 = X.C63913ic.A0F(r1)
            X.18u r0 = new X.18u
            r0.<init>(r1)
            X.M4x.A01(r3, r0, r4, r2, r5)
            return r9
        L_0x5c1c:
            r4 = r9
            goto L_0x5c01
        L_0x5c1e:
            java.lang.String r2 = "bk.action.preload.RequestPreloadScreen"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x5c66
            r3 = 0
            boolean r2 = X.AnonymousClass0wJ.A1Z(r0, r1)
            X.7h3 r3 = X.C63893iY.A03(r0, r3)
            java.lang.Object r2 = X.C63893iY.A0B(r0, r2)
            r2.getClass()
            java.util.Map r2 = (java.util.Map) r2
            java.util.HashMap r6 = X.C63913ic.A0N(r2)
            r2 = 2
            java.lang.Object r0 = X.C63893iY.A0A(r0, r2)
            int r2 = X.AnonymousClass0wJ.A04(r0)
            boolean r0 = X.C63763iI.A0D(r3)
            r9 = 0
            if (r0 == 0) goto L_0x5c64
            java.lang.String r5 = X.C63763iI.A07(r3)
        L_0x5c50:
            android.content.Context r3 = X.C18230wP.A08()
            if (r5 == 0) goto L_0x0012
            long r7 = (long) r2
            X.0i6 r0 = X.C63913ic.A0F(r1)
            X.18u r4 = new X.18u
            r4.<init>(r0)
            X.M4x.A04(r3, r4, r5, r6, r7)
            return r9
        L_0x5c64:
            r5 = r9
            goto L_0x5c50
        L_0x5c66:
            java.lang.String r2 = "bk.action.preload.RequestPreloadScreenV2"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x5c73
            java.lang.Object r9 = X.AnonymousClass2HI.A00(r1, r0)
            return r9
        L_0x5c73:
            java.lang.String r2 = "bk.action.privacy.consent.CloseBottomSheet"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x5cc5
            boolean r2 = X.AnonymousClass0wJ.A1Y(r0, r1)
            java.lang.Object r0 = X.C63893iY.A0B(r0, r2)
            if (r0 != 0) goto L_0x5cc0
            r0 = 0
        L_0x5c86:
            if (r0 == 0) goto L_0x5cbe
            X.7gY r3 = new X.7gY
            r3.<init>(r1, r0)
        L_0x5c8d:
            X.77M r1 = X.AnonymousClass77M.A00
            X.8AL r0 = X.C121107Ed.A04
            java.lang.Object r0 = r0.A0T()
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L_0x6b88
            android.app.Activity r2 = r1.A00(r0)
            androidx.fragment.app.FragmentActivity r2 = (androidx.fragment.app.FragmentActivity) r2
            if (r2 == 0) goto L_0x6b88
            X.0m7 r1 = r2.getSupportFragmentManager()
            java.lang.String r0 = "consent_bottom_sheet"
            androidx.fragment.app.Fragment r1 = r1.A0O(r0)
            if (r1 == 0) goto L_0x6b81
            if (r3 == 0) goto L_0x5cb2
            r3.BqW()
        L_0x5cb2:
            X.01J r0 = X.C18220wO.A0L(r2)
            r0.A04(r1)
            r0.A00()
            r9 = 0
            return r9
        L_0x5cbe:
            r3 = 0
            goto L_0x5c8d
        L_0x5cc0:
            X.6eC r0 = (X.C105916eC) r0
            X.6jp r0 = r0.A00
            goto L_0x5c86
        L_0x5cc5:
            java.lang.String r2 = "bk.action.privacy.consent.CloseDialog"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x5d12
            boolean r2 = X.AnonymousClass0wJ.A1Y(r0, r1)
            java.lang.Object r0 = X.C63893iY.A0B(r0, r2)
            if (r0 != 0) goto L_0x5d0d
            r0 = 0
        L_0x5cd8:
            if (r0 == 0) goto L_0x5d0b
            X.7gZ r2 = new X.7gZ
            r2.<init>(r1, r0)
        L_0x5cdf:
            X.77M r1 = X.AnonymousClass77M.A00
            X.8AL r0 = X.C121107Ed.A04
            java.lang.Object r0 = r0.A0T()
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L_0x6b96
            android.app.Activity r0 = r1.A00(r0)
            androidx.fragment.app.FragmentActivity r0 = (androidx.fragment.app.FragmentActivity) r0
            if (r0 == 0) goto L_0x6b96
            X.0m7 r1 = r0.getSupportFragmentManager()
            java.lang.String r0 = "consent_dialog"
            androidx.fragment.app.Fragment r0 = r1.A0O(r0)
            X.099 r0 = (X.AnonymousClass099) r0
            if (r0 == 0) goto L_0x6b8f
            if (r2 == 0) goto L_0x5d06
            r2.BqW()
        L_0x5d06:
            r0.A06()
            r9 = 0
            return r9
        L_0x5d0b:
            r2 = 0
            goto L_0x5cdf
        L_0x5d0d:
            X.6eC r0 = (X.C105916eC) r0
            X.6jp r0 = r0.A00
            goto L_0x5cd8
        L_0x5d12:
            java.lang.String r2 = "bk.action.privacy.consent.CloseFlow"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x5d1f
            java.lang.Object r9 = X.C100636Ob.A00(r1, r0)
            return r9
        L_0x5d1f:
            java.lang.String r2 = "bk.action.privacy.consent.CloseScreen"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x5d75
            r2 = 0
            boolean r3 = X.AnonymousClass0wJ.A1Z(r0, r1)
            java.lang.Object r2 = X.C63893iY.A0B(r0, r2)
            if (r2 != 0) goto L_0x5d70
            r2 = 0
        L_0x5d33:
            r0.A0H(r3)
            if (r2 == 0) goto L_0x5d6e
            X.7ga r3 = new X.7ga
            r3.<init>(r1, r2)
        L_0x5d3d:
            X.77M r1 = X.AnonymousClass77M.A00
            X.8AL r0 = X.C121107Ed.A04
            java.lang.Object r0 = r0.A0T()
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L_0x6ba4
            android.app.Activity r2 = r1.A00(r0)
            androidx.fragment.app.FragmentActivity r2 = (androidx.fragment.app.FragmentActivity) r2
            if (r2 == 0) goto L_0x6ba4
            X.0m7 r1 = r2.getSupportFragmentManager()
            java.lang.String r0 = "consent_screen"
            androidx.fragment.app.Fragment r1 = r1.A0O(r0)
            if (r1 == 0) goto L_0x6b9d
            if (r3 == 0) goto L_0x5d62
            r3.BqW()
        L_0x5d62:
            X.01J r0 = X.C18220wO.A0L(r2)
            r0.A04(r1)
            r0.A00()
            r9 = 0
            return r9
        L_0x5d6e:
            r3 = 0
            goto L_0x5d3d
        L_0x5d70:
            X.6eC r2 = (X.C105916eC) r2
            X.6jp r2 = r2.A00
            goto L_0x5d33
        L_0x5d75:
            java.lang.String r2 = "bk.action.privacy.consent.FlowCompletionCallback"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x5db4
            boolean r2 = X.AnonymousClass0wJ.A1Z(r0, r1)
            java.lang.Object r4 = X.C63893iY.A0B(r0, r2)
            r4.getClass()
            java.lang.String r3 = X.C86164wN.A0h(r4)
            r2 = 2
            java.lang.Object r3 = X.C63893iY.A0C(r0, r3, r2)
            java.lang.String r3 = (java.lang.String) r3
            java.util.Map r0 = X.AnonymousClass68o.A01
            java.lang.Object r2 = r0.get(r4)
            X.68o r2 = (X.AnonymousClass68o) r2
            if (r2 != 0) goto L_0x5d9f
            X.68o r2 = X.AnonymousClass68o.UNKNOWN
        L_0x5d9f:
            X.0i6 r0 = X.C63913ic.A0F(r1)
            X.C18200wM.A1R(r0)
            X.KHq r1 = X.AnonymousClass3LY.A00(r0)
            X.7ro r0 = new X.7ro
            r0.<init>(r2, r3)
            r1.CWx(r0)
            r9 = 0
            return r9
        L_0x5db4:
            java.lang.String r2 = "bk.action.privacy.consent.LaunchConsent"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x5dc1
            java.lang.Object r9 = X.AnonymousClass2HJ.A00(r1, r0)
            return r9
        L_0x5dc1:
            java.lang.String r2 = "bk.action.privacy.consent.OpenBottomSheet"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x5dce
            java.lang.Object r9 = X.C100646Oc.A00(r1, r0)
            return r9
        L_0x5dce:
            java.lang.String r2 = "bk.action.privacy.consent.OpenDialog"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x5ddb
            java.lang.Object r9 = X.C100656Od.A00(r1, r0)
            return r9
        L_0x5ddb:
            java.lang.String r2 = "bk.action.privacy.consent.OpenFlow"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x5de8
            java.lang.Object r9 = X.AnonymousClass2HK.A00(r1, r0)
            return r9
        L_0x5de8:
            java.lang.String r2 = "bk.action.privacy.consent.OpenIAWLink"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x5df5
            java.lang.Object r9 = X.C100666Oe.A00(r1, r0)
            return r9
        L_0x5df5:
            java.lang.String r2 = "bk.action.privacy.consent.OpenScreen"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x5e02
            java.lang.Object r9 = X.C100676Of.A00(r1, r0)
            return r9
        L_0x5e02:
            java.lang.String r2 = "bk.action.privacy.consent.OpenSystemAppSettings"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x5e0f
            java.lang.Object r9 = X.AnonymousClass2HL.A00(r1, r0)
            return r9
        L_0x5e0f:
            java.lang.String r2 = "bk.action.privacy.consent.ShutdownExperience"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x5e1c
            java.lang.Object r9 = X.C100686Og.A00(r0)
            return r9
        L_0x5e1c:
            java.lang.String r2 = "bk.action.privacy.consent.ShutdownExperienceWithError"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x5e84
            r6 = 0
            X.C04220Ms.A0B(r0, r6)
            java.lang.Object r4 = X.C63893iY.A0B(r0, r6)
            r4.getClass()
            java.lang.String r2 = X.C86164wN.A0h(r4)
            java.lang.String r4 = (java.lang.String) r4
            r5 = 1
            java.lang.Object r3 = X.C63893iY.A0C(r0, r2, r5)
            java.lang.String r3 = (java.lang.String) r3
            r1 = 2
            java.lang.Object r2 = X.C63893iY.A0C(r0, r2, r1)
            java.lang.String r2 = (java.lang.String) r2
            X.C04220Ms.A0B(r4, r6)
            X.C04220Ms.A0B(r3, r5)
            X.C04220Ms.A0B(r2, r1)
            r1 = 0
        L_0x5e4d:
            int r0 = r3.length()
            if (r1 >= r0) goto L_0x5e7b
            char r0 = r3.charAt(r1)
            boolean r0 = java.lang.Character.isDigit(r0)
            if (r0 != 0) goto L_0x5e78
            java.lang.String r0 = "ERROR_OUTCOME"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x5e71
            X.6Bk r0 = new X.6Bk
            r0.<init>(r2)
        L_0x5e6a:
            X.7Ed r0 = X.C121107Ed.A00
            r0.A03(r4)
            r9 = 0
            return r9
        L_0x5e71:
            r1 = 0
            X.6Bl r0 = new X.6Bl
            r0.<init>(r2, r1)
            goto L_0x5e6a
        L_0x5e78:
            int r1 = r1 + 1
            goto L_0x5e4d
        L_0x5e7b:
            java.lang.Integer.parseInt(r3)
            X.6Bj r0 = new X.6Bj
            r0.<init>(r2)
            goto L_0x5e6a
        L_0x5e84:
            java.lang.String r2 = "bk.action.qpl.userflow.AnnotateV2"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x5e91
            java.lang.Object r9 = X.C100696Oh.A00(r1, r0)
            return r9
        L_0x5e91:
            java.lang.String r2 = "bk.action.qpl.userflow.EndFlowCancelV2"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x5ee0
            r2 = 0
            boolean r4 = X.AnonymousClass0wJ.A1Z(r0, r1)
            java.lang.Object r3 = X.C63893iY.A0B(r0, r2)
            r3.getClass()
            java.lang.String r2 = "null cannot be cast to non-null type kotlin.Number"
            int r5 = X.AnonymousClass0wJ.A04(r3)
            java.lang.Object r2 = X.C63893iY.A0C(r0, r2, r4)
            int r4 = X.AnonymousClass0wJ.A04(r2)
            r2 = 2
            java.lang.Object r3 = X.C63893iY.A0B(r0, r2)
            java.lang.String r3 = (java.lang.String) r3
            if (r3 != 0) goto L_0x5ec2
            r0 = 1475(0x5c3, float:2.067E-42)
            java.lang.String r3 = X.C18170wI.A00(r0)
        L_0x5ec2:
            X.0i6 r1 = X.C63913ic.A0F(r1)
            boolean r0 = r1 instanceof com.instagram.service.session.UserSession
            r9 = 0
            if (r0 == 0) goto L_0x5edb
            com.instagram.service.session.UserSession r1 = (com.instagram.service.session.UserSession) r1
            if (r1 == 0) goto L_0x5edb
            X.5dy r2 = X.AnonymousClass6JQ.A00(r1)
        L_0x5ed3:
            long r0 = r2.generateFlowId(r5, r4)
            r2.flowEndCancel(r0, r3)
            return r9
        L_0x5edb:
            X.5dx r2 = X.AnonymousClass6JR.A00()
            goto L_0x5ed3
        L_0x5ee0:
            java.lang.String r2 = "bk.action.qpl.userflow.EndFlowFailureV2"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x5f30
            r2 = 0
            boolean r4 = X.AnonymousClass0wJ.A1Z(r0, r1)
            java.lang.Object r3 = X.C63893iY.A0B(r0, r2)
            r3.getClass()
            java.lang.String r2 = "null cannot be cast to non-null type kotlin.Number"
            int r6 = X.AnonymousClass0wJ.A04(r3)
            java.lang.Object r2 = X.C63893iY.A0C(r0, r2, r4)
            int r5 = X.AnonymousClass0wJ.A04(r2)
            java.lang.Object r4 = X.C63893iY.A09(r0)
            X.C18240wQ.A1I(r4)
            java.lang.String r4 = (java.lang.String) r4
            r2 = 3
            java.lang.Object r3 = X.C63893iY.A0B(r0, r2)
            java.lang.String r3 = (java.lang.String) r3
            X.0i6 r1 = X.C63913ic.A0F(r1)
            boolean r0 = r1 instanceof com.instagram.service.session.UserSession
            r9 = 0
            if (r0 == 0) goto L_0x5f2b
            com.instagram.service.session.UserSession r1 = (com.instagram.service.session.UserSession) r1
            if (r1 == 0) goto L_0x5f2b
            X.5dy r2 = X.AnonymousClass6JQ.A00(r1)
        L_0x5f23:
            long r0 = r2.generateFlowId(r6, r5)
            r2.flowEndFail(r0, r4, r3)
            return r9
        L_0x5f2b:
            X.5dx r2 = X.AnonymousClass6JR.A00()
            goto L_0x5f23
        L_0x5f30:
            java.lang.String r2 = "bk.action.qpl.userflow.EndFlowSuccessV2"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x5f70
            r2 = 0
            boolean r5 = X.AnonymousClass0wJ.A1Z(r0, r1)
            java.lang.Object r3 = X.C63893iY.A0B(r0, r2)
            r3.getClass()
            java.lang.String r2 = "null cannot be cast to non-null type kotlin.Number"
            int r4 = X.AnonymousClass0wJ.A04(r3)
            java.lang.Object r0 = X.C63893iY.A0C(r0, r2, r5)
            int r3 = X.AnonymousClass0wJ.A04(r0)
            X.0i6 r1 = X.C63913ic.A0F(r1)
            boolean r0 = r1 instanceof com.instagram.service.session.UserSession
            r9 = 0
            if (r0 == 0) goto L_0x5f6b
            com.instagram.service.session.UserSession r1 = (com.instagram.service.session.UserSession) r1
            if (r1 == 0) goto L_0x5f6b
            X.5dy r2 = X.AnonymousClass6JQ.A00(r1)
        L_0x5f63:
            long r0 = r2.generateFlowId(r4, r3)
            r2.flowEndSuccess(r0)
            return r9
        L_0x5f6b:
            X.5dx r2 = X.AnonymousClass6JR.A00()
            goto L_0x5f63
        L_0x5f70:
            java.lang.String r2 = "bk.action.qpl.userflow.MarkErrorV2"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x5fc1
            r2 = 0
            boolean r4 = X.AnonymousClass0wJ.A1Z(r0, r1)
            java.lang.Object r3 = X.C63893iY.A0B(r0, r2)
            r3.getClass()
            java.lang.String r2 = "null cannot be cast to non-null type kotlin.Number"
            int r6 = X.AnonymousClass0wJ.A04(r3)
            java.lang.Object r2 = X.C63893iY.A0C(r0, r2, r4)
            int r5 = X.AnonymousClass0wJ.A04(r2)
            java.lang.Object r4 = X.C63893iY.A09(r0)
            java.lang.String r3 = X.C86164wN.A0h(r4)
            java.lang.String r4 = (java.lang.String) r4
            r2 = 3
            java.lang.Object r3 = X.C63893iY.A0C(r0, r3, r2)
            java.lang.String r3 = (java.lang.String) r3
            X.0i6 r1 = X.C63913ic.A0F(r1)
            boolean r0 = r1 instanceof com.instagram.service.session.UserSession
            r9 = 0
            if (r0 == 0) goto L_0x5fbc
            com.instagram.service.session.UserSession r1 = (com.instagram.service.session.UserSession) r1
            if (r1 == 0) goto L_0x5fbc
            X.5dy r2 = X.AnonymousClass6JQ.A00(r1)
        L_0x5fb4:
            long r0 = r2.generateFlowId(r6, r5)
            r2.flowMarkError(r0, r4, r3)
            return r9
        L_0x5fbc:
            X.5dx r2 = X.AnonymousClass6JR.A00()
            goto L_0x5fb4
        L_0x5fc1:
            java.lang.String r2 = "bk.action.qpl.userflow.MarkPointV2"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x5fce
            java.lang.Object r9 = X.C100706Oi.A00(r1, r0)
            return r9
        L_0x5fce:
            java.lang.String r2 = "bk.action.qpl.userflow.StartFlowV2"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x6034
            r2 = 0
            boolean r4 = X.AnonymousClass0wJ.A1Z(r0, r1)
            java.lang.Object r3 = X.C63893iY.A0B(r0, r2)
            r3.getClass()
            java.lang.String r2 = "null cannot be cast to non-null type kotlin.Number"
            int r7 = X.AnonymousClass0wJ.A04(r3)
            java.lang.Object r2 = X.C63893iY.A0C(r0, r2, r4)
            int r6 = X.AnonymousClass0wJ.A04(r2)
            r2 = 2
            X.7h3 r2 = X.C63893iY.A03(r0, r2)
            X.0i6 r1 = X.C63913ic.A0F(r1)
            boolean r0 = r1 instanceof com.instagram.service.session.UserSession
            r9 = 0
            if (r0 == 0) goto L_0x602f
            com.instagram.service.session.UserSession r1 = (com.instagram.service.session.UserSession) r1
            if (r1 == 0) goto L_0x602f
            X.5dy r5 = X.AnonymousClass6JQ.A00(r1)
        L_0x6006:
            java.lang.String r1 = X.C18220wO.A0o(r2)
            java.lang.String r0 = "cancel"
            boolean r4 = r0.equals(r1)
            java.lang.String r3 = X.C18230wP.A0o(r2)
            if (r3 != 0) goto L_0x6018
            java.lang.String r3 = "IgBloks"
        L_0x6018:
            r1 = 38
            r0 = -1
            int r0 = r2.A0H(r1, r0)
            long r0 = (long) r0
            com.facebook.quicklog.reliability.UserFlowConfig r2 = new com.facebook.quicklog.reliability.UserFlowConfig
            r2.<init>(r3, r4)
            r2.mTtlMs = r0
            long r0 = r5.generateFlowId(r7, r6)
            r5.flowStart(r0, r2)
            return r9
        L_0x602f:
            X.5dx r5 = X.AnonymousClass6JR.A00()
            goto L_0x6006
        L_0x6034:
            java.lang.String r2 = "bk.action.qpl.userflow.StartFlowV2IfNotOngoing"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x6041
            java.lang.Object r9 = X.AnonymousClass2HM.A00(r1, r0)
            return r9
        L_0x6041:
            java.lang.String r2 = "bk.action.rapid_feedback.TryShowRapidFeedbackSurvey"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x604e
            java.lang.Object r9 = X.AnonymousClass2HN.A00(r1, r0)
            return r9
        L_0x604e:
            java.lang.String r2 = "bk.action.rapid_feedback.TryShowSurveyForDebuggingOnly"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x6077
            boolean r4 = X.AnonymousClass0wJ.A1Y(r0, r1)
            X.3IR r2 = X.AnonymousClass3IR.A00
            boolean r2 = X.AnonymousClass0wJ.A1W(r2)
            if (r2 == 0) goto L_0x395f
            com.instagram.service.session.UserSession r3 = X.C86104wH.A0Y(r1)
            androidx.fragment.app.FragmentActivity r2 = X.C63913ic.A05(r1)
            java.lang.String r1 = X.C63893iY.A0D(r0, r4)
            X.3IR r0 = X.C50202sc.A00()
            r0.A03(r3, r2, r1)
            goto L_0x395f
        L_0x6077:
            java.lang.String r2 = "bk.action.rapid_feedback.TryToShowSurvey"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x60b7
            X.3IR r3 = X.AnonymousClass3IR.A00
            boolean r2 = X.AnonymousClass0wJ.A1W(r3)
            r9 = 0
            if (r2 == 0) goto L_0x0012
            if (r3 == 0) goto L_0x0012
            com.instagram.service.session.UserSession r5 = X.C63913ic.A0J(r1)
            r2 = 0
            X.C04220Ms.A0B(r1, r2)
            androidx.fragment.app.FragmentActivity r4 = X.C63913ic.A05(r1)
            java.lang.Object r3 = X.C63893iY.A07(r0)
            java.lang.String r3 = (java.lang.String) r3
            r2 = 1
            java.util.List r1 = r0.A00
            java.lang.Object r0 = r1.get(r2)
            if (r0 == 0) goto L_0x60b5
            java.lang.Object r0 = r1.get(r2)
            java.util.HashMap r0 = (java.util.HashMap) r0
            java.util.HashMap r1 = X.C63913ic.A0N(r0)
        L_0x60af:
            X.3IR r0 = X.AnonymousClass3IR.A00
            r0.A00(r4, r5, r3, r1)
            return r9
        L_0x60b5:
            r1 = r9
            goto L_0x60af
        L_0x60b7:
            java.lang.String r2 = "bk.action.rapid_feedback.TryToShowSurveyWithCallback"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x60c4
            java.lang.Object r9 = X.AnonymousClass2HO.A00(r1, r0)
            return r9
        L_0x60c4:
            java.lang.String r2 = "bk.action.rendering_logging.TrackRenderingLoggingForComponent"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x60d1
            java.lang.Object r9 = X.C100716Oj.A00(r1, r0)
            return r9
        L_0x60d1:
            java.lang.String r2 = "bk.action.RequestPermission"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x610c
            r3 = 0
            java.lang.Object r13 = X.C63893iY.A0B(r0, r3)
            r13.getClass()
            java.lang.Object r0 = X.C63893iY.A08(r0)
            X.7h3 r0 = (X.C127397h3) r0
            X.6jp r11 = X.C18230wP.A0V(r0)
            X.C04220Ms.A0B(r1, r3)
            androidx.fragment.app.FragmentActivity r2 = X.C63913ic.A05(r1)
            java.lang.String r0 = X.C18230wP.A0o(r0)
            java.lang.String r14 = X.AnonymousClass6G2.A00(r0)
            r9 = 0
            if (r14 == 0) goto L_0x0012
            com.facebook.redex.IDxPCallbackShape12S1300000_1_I2 r10 = new com.facebook.redex.IDxPCallbackShape12S1300000_1_I2
            r12 = r1
            r15 = r3
            r10.<init>(r11, r12, r13, r14, r15)
            java.lang.String[] r0 = new java.lang.String[]{r14}
            X.AnonymousClass7K8.A02(r2, r10, r0)
            return r9
        L_0x610c:
            java.lang.String r2 = "bk.action.ResumeAgeVerification"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x6119
            java.lang.Object r9 = X.AnonymousClass2HP.A00(r1, r0)
            return r9
        L_0x6119:
            java.lang.String r2 = "bk.action.rp.cocreation.OpenCollage"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x6134
            X.3HX r0 = X.C86104wH.A0V(r0)
            X.0i6 r0 = X.C63913ic.A0E(r0)
            X.KHq r1 = X.AnonymousClass3LY.A00(r0)
            X.62G r0 = X.AnonymousClass62G.A00
            r1.CWx(r0)
            r9 = 0
            return r9
        L_0x6134:
            java.lang.String r2 = "bk.action.rp.Navigate"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x61a2
            r5 = 0
            X.C04220Ms.A0B(r0, r5)
            java.lang.String r3 = X.C86154wM.A0l(r0, r5)
            r9 = 0
            if (r3 == 0) goto L_0x0012
            java.lang.Object r4 = X.C63893iY.A08(r0)
            X.7h3 r4 = (X.C127397h3) r4
            if (r4 == 0) goto L_0x0012
            r1 = 2
            X.3HX r0 = X.C63893iY.A01(r0, r1)
            X.0i6 r2 = X.C63913ic.A0E(r0)
            X.C18200wM.A1R(r2)
            r0 = 40
            java.lang.Object r0 = X.C127397h3.A0A(r4, r0)
            boolean r1 = X.AnonymousClass2LL.A00(r0, r5)
            X.KHq r2 = X.AnonymousClass3LY.A00(r2)
            java.lang.String r0 = "discover.screenshare"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x6177
            X.62I r0 = X.AnonymousClass62I.A00
        L_0x6173:
            r2.CWx(r0)
            return r9
        L_0x6177:
            java.lang.String r0 = "discover.photobooth"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x6182
            X.62J r0 = X.AnonymousClass62J.A00
            goto L_0x6173
        L_0x6182:
            java.lang.String r0 = "discover.reels_together"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x618d
            X.62H r0 = X.AnonymousClass62H.A00
            goto L_0x6173
        L_0x618d:
            if (r1 == 0) goto L_0x6195
            X.62D r0 = new X.62D
            r0.<init>(r3)
            goto L_0x6173
        L_0x6195:
            android.net.Uri r1 = X.C15430rJ.A01(r3)
            X.C04220Ms.A06(r1)
            X.62C r0 = new X.62C
            r0.<init>(r1)
            goto L_0x6173
        L_0x61a2:
            java.lang.String r2 = "bk.action.rp.NavigateBack"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x61c0
            X.3HX r0 = X.C86104wH.A0V(r0)
            X.0i6 r0 = X.C63913ic.A0E(r0)
            X.C18200wM.A1R(r0)
            X.KHq r1 = X.AnonymousClass3LY.A00(r0)
            X.62F r0 = X.AnonymousClass62F.A00
            r1.CWx(r0)
            r9 = 0
            return r9
        L_0x61c0:
            java.lang.String r2 = "bk.action.rppwb.PrecallInterstitialResponse"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x61cd
            java.lang.Object r9 = X.AnonymousClass2HQ.A00(r0)
            return r9
        L_0x61cd:
            java.lang.String r2 = "bk.action.search_bar.GetText"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x61da
            java.lang.Object r9 = X.AnonymousClass2HR.A00(r0)
            return r9
        L_0x61da:
            java.lang.String r2 = "bk.action.search_bar.ShowKeyboard"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x6200
            r2 = 0
            java.lang.Object r3 = X.C63893iY.A0B(r0, r2)
            X.7h3 r3 = (X.C127397h3) r3
            if (r3 == 0) goto L_0x395f
            int r2 = r3.A03
            r0 = 13616(0x3530, float:1.908E-41)
            if (r2 != r0) goto L_0x654c
            X.3HX r0 = r1.A00
            android.view.View r0 = r3.A0J(r0)
            com.instagram.igds.components.search.InlineSearchBox r0 = (com.instagram.igds.components.search.InlineSearchBox) r0
            if (r0 == 0) goto L_0x395f
            r0.A03()
            goto L_0x395f
        L_0x6200:
            java.lang.String r2 = "bk.action.search_bar.Unfocus"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x620d
            java.lang.Object r9 = X.AnonymousClass2HS.A00(r1, r0)
            return r9
        L_0x620d:
            java.lang.String r2 = "bk.action.search_bar_with_cancel.GetText"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x6220
            X.AnonymousClass0wJ.A1N(r0, r1)
            java.lang.Object r9 = X.AnonymousClass2HR.A00(r0)
            X.C04220Ms.A06(r9)
            return r9
        L_0x6220:
            java.lang.String r2 = "bk.action.SendLeadMessage"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x622d
            java.lang.Object r9 = X.C30598GMl.A00(r1, r0)
            return r9
        L_0x622d:
            java.lang.String r2 = "bk.action.sercom.CloseModalAndLaunchSurvey"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x625a
            r4 = 0
            java.lang.Object r0 = X.C63893iY.A0B(r0, r4)
            r0.getClass()
            X.7h3 r0 = (X.C127397h3) r0
            java.lang.String r3 = X.C18220wO.A0o(r0)
            com.instagram.service.session.UserSession r2 = X.C63913ic.A0J(r1)
            X.C04220Ms.A0B(r1, r4)
            androidx.fragment.app.FragmentActivity r1 = X.C63913ic.A05(r1)
            r1.finish()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r4)
            r9 = 0
            X.AnonymousClass3PC.A01(r1, r2, r0, r3, r9)
            return r9
        L_0x625a:
            java.lang.String r2 = "bk.action.services.LaunchGoogleAuth"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x6276
            r1 = 0
            X.C04220Ms.A0B(r0, r1)
            r0.A0H(r1)
            r2 = 1
            r0.A0H(r2)
            r1 = 2
            r0.A0H(r1)
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r2)
            return r9
        L_0x6276:
            java.lang.String r2 = "bk.action.session_store.Get"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x6293
            r0 = 0
            X.C04220Ms.A0B(r1, r0)
            X.0i6 r2 = X.C63913ic.A0F(r1)
            java.lang.Class<X.6dt> r1 = X.C105726dt.class
            X.86E r0 = X.AnonymousClass86E.A00
            java.lang.Object r0 = r2.A01(r1, r0)
            X.6dt r0 = (X.C105726dt) r0
            java.util.Map r9 = r0.A00
            return r9
        L_0x6293:
            java.lang.String r2 = "bk.action.settings.ads.UpdateBasicAdsSettingsCache"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x62a0
            java.lang.Object r9 = X.AnonymousClass2HT.A00(r1, r0)
            return r9
        L_0x62a0:
            java.lang.String r2 = "bk.action.ShareCollection"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x62d1
            r2 = 2
            java.lang.Object r3 = X.C63893iY.A0B(r0, r2)
            java.lang.String r3 = (java.lang.String) r3
            r2 = 0
            X.C04220Ms.A0B(r1, r2)
            X.0kW r4 = X.C63913ic.A0A(r1)
            if (r3 == 0) goto L_0x62c4
            boolean r2 = r3.isEmpty()
            if (r2 != 0) goto L_0x62c4
            X.7px r4 = new X.7px
            r4.<init>(r3)
        L_0x62c4:
            androidx.fragment.app.FragmentActivity r2 = X.C63913ic.A05(r1)
            com.instagram.service.session.UserSession r1 = X.C63913ic.A0J(r1)
            X.AnonymousClass3P7.A00(r2, r4, r0, r1)
            r9 = 0
            return r9
        L_0x62d1:
            java.lang.String r2 = "bk.action.ShareCollectionV2"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x62f6
            r2 = 2
            java.lang.Object r3 = X.C63893iY.A0B(r0, r2)
            java.lang.String r3 = (java.lang.String) r3
            r2 = 0
            X.C04220Ms.A0B(r1, r2)
            X.0kW r4 = X.C63913ic.A0A(r1)
            if (r3 == 0) goto L_0x62c4
            boolean r2 = r3.isEmpty()
            if (r2 != 0) goto L_0x62c4
            X.7py r4 = new X.7py
            r4.<init>(r3)
            goto L_0x62c4
        L_0x62f6:
            java.lang.String r2 = "bk.action.ShareFBPayReferral"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x6320
            r3 = 0
            java.util.List r2 = r0.A00
            r2.get(r3)
            r0 = 1
            r2.get(r0)
            r0 = 2
            r2.get(r0)
            X.C04220Ms.A0B(r1, r3)
            androidx.fragment.app.FragmentActivity r0 = X.C63913ic.A05(r1)
            X.DrH r0 = X.C18220wO.A0b(r0)
            if (r0 == 0) goto L_0x395f
            java.lang.String r0 = "getFragmentFactory"
            java.lang.NullPointerException r2 = X.C18210wN.A0W(r0)
            throw r2
        L_0x6320:
            java.lang.String r2 = "bk.action.ShareP2BOrder"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x632d
            java.lang.Object r9 = X.C29298Flp.A00(r1, r0)
            return r9
        L_0x632d:
            java.lang.String r2 = "bk.action.ShareProducts"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x633a
            java.lang.Object r9 = X.C17261A3d.A00(r1, r0)
            return r9
        L_0x633a:
            java.lang.String r2 = "bk.action.ShareShop"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x6366
            X.AnonymousClass0wJ.A1N(r0, r1)
            r2 = 2
            java.lang.Object r3 = X.C63893iY.A0B(r0, r2)
            java.lang.String r3 = (java.lang.String) r3
            if (r3 == 0) goto L_0x63a2
            int r2 = r3.length()
            if (r2 <= 0) goto L_0x63a2
            X.7pz r2 = new X.7pz
            r2.<init>(r3)
        L_0x6359:
            androidx.fragment.app.FragmentActivity r3 = X.C63913ic.A05(r1)
            com.instagram.service.session.UserSession r1 = X.C86104wH.A0Y(r1)
            X.AnonymousClass3P7.A01(r3, r2, r0, r1)
            r9 = 0
            return r9
        L_0x6366:
            java.lang.String r2 = "bk.action.ShareShopDeepLinkToast"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x6382
            android.content.Context r2 = X.C18230wP.A08()
            android.content.res.Resources r1 = r2.getResources()
            r0 = 2131829646(0x7f11238e, float:1.9292267E38)
            java.lang.String r0 = r1.getString(r0)
            X.C63813iO.A01(r2, r0)
            r9 = 0
            return r9
        L_0x6382:
            java.lang.String r2 = "bk.action.ShareShopV2"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x63a7
            X.AnonymousClass0wJ.A1N(r0, r1)
            r2 = 2
            java.lang.Object r3 = X.C63893iY.A0B(r0, r2)
            java.lang.String r3 = (java.lang.String) r3
            if (r3 == 0) goto L_0x63a2
            int r2 = r3.length()
            if (r2 <= 0) goto L_0x63a2
            X.7q0 r2 = new X.7q0
            r2.<init>(r3)
            goto L_0x6359
        L_0x63a2:
            X.0kW r2 = X.C63913ic.A0A(r1)
            goto L_0x6359
        L_0x63a7:
            java.lang.String r2 = "bk.action.share.Text"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x63d9
            java.lang.Object r2 = X.C63893iY.A07(r0)
            java.lang.String r2 = (java.lang.String) r2
            r0 = 0
            X.C04220Ms.A0B(r1, r0)
            androidx.fragment.app.FragmentActivity r3 = X.C63913ic.A05(r1)
            X.0kW r5 = X.C63913ic.A0A(r1)
            com.instagram.service.session.UserSession r6 = X.C63913ic.A0J(r1)
            android.os.Bundle r4 = X.C18180wK.A06()
            java.lang.String r0 = "android.intent.extra.TEXT"
            r4.putString(r0, r2)
            r9 = 0
            java.util.HashMap r8 = X.AnonymousClass0wJ.A0y()
            java.lang.String r7 = "bloks_action_share_text"
            X.AnonymousClass3iG.A03(r3, r4, r5, r6, r7, r8)
            return r9
        L_0x63d9:
            java.lang.String r2 = "bk.action.shop.OpenCart"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x641e
            r4 = 0
            java.lang.Object r3 = X.C63893iY.A0B(r0, r4)
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r2 = X.C63893iY.A08(r0)
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r0 = X.C63893iY.A09(r0)
            java.lang.String r0 = (java.lang.String) r0
            X.Axa r10 = X.C19513Axa.A00
            X.C04220Ms.A0B(r1, r4)
            androidx.fragment.app.FragmentActivity r11 = X.C63913ic.A05(r1)
            com.instagram.service.session.UserSession r16 = X.C63913ic.A0J(r1)
            X.A00 r12 = X.A00.A0N
            X.9zh r13 = X.C171619zh.UNKNOWN
            X.9zu r14 = X.C171749zu.A0K
            X.A01 r15 = X.A01.A0A
            r9 = 0
            r17 = r3
            r18 = r0
            r19 = r2
            r20 = r9
            r21 = r9
            r22 = r9
            r23 = r9
            r24 = r4
            r10.A0l(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            return r9
        L_0x641e:
            java.lang.String r2 = "bk.action.shop.OpenStorefront"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x642b
            java.lang.Object r9 = X.C17262A3e.A00(r1, r0)
            return r9
        L_0x642b:
            java.lang.String r2 = "bk.action.ShowAffiliateDiscoveryNux"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x6455
            X.3HX r3 = X.C86104wH.A0V(r0)
            java.lang.Object r1 = X.C63893iY.A08(r0)
            java.lang.String r2 = X.C86164wN.A0h(r1)
            java.lang.Object r1 = X.C63893iY.A09(r0)
            X.C04220Ms.A0C(r1, r2)
            r1 = 3
            java.util.List r0 = r0.A00
            r0.get(r1)
            X.0i6 r0 = X.C63913ic.A0E(r3)
            X.C18200wM.A1R(r0)
            r9 = 0
            return r9
        L_0x6455:
            java.lang.String r2 = "bk.action.ShowMockNotificationPermissionDialog"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x647b
            r0 = 1
            X.C04220Ms.A0B(r1, r0)
            X.0i6 r2 = X.C63913ic.A0F(r1)
            boolean r0 = r2 instanceof com.instagram.service.session.UserSession
            r9 = 0
            if (r0 == 0) goto L_0x0012
            com.instagram.service.session.UserSession r2 = (com.instagram.service.session.UserSession) r2
            if (r2 == 0) goto L_0x0012
            androidx.fragment.app.FragmentActivity r1 = X.C63913ic.A05(r1)
            X.0wg r0 = new X.0wg
            r0.<init>(r1, r2)
            X.C13950oZ.A00(r0)
            return r9
        L_0x647b:
            java.lang.String r2 = "bk.action.showreel.GetMentionList"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x6491
            X.3HX r1 = A05(r1)
            if (r1 == 0) goto L_0x6bab
            r0 = 2131307160(0x7f092a98, float:1.823254E38)
            java.lang.Object r9 = r1.A00(r0)
            return r9
        L_0x6491:
            java.lang.String r2 = "bk.action.showreel.InvokeInteractionWithArgs"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x649e
            java.lang.Object r9 = X.C35650IzQ.A00(r1, r0)
            return r9
        L_0x649e:
            java.lang.String r2 = "bk.action.showreel.IsDisplayAreaTallerThanNineSixteen"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x64be
            r0 = 1
            X.C04220Ms.A0B(r1, r0)
            androidx.fragment.app.Fragment r0 = X.C63913ic.A03(r1)
            if (r0 == 0) goto L_0x0117
            android.content.Context r0 = r0.getContext()
            if (r0 == 0) goto L_0x0117
            boolean r0 = X.C25829Dsn.A0B(r0)
        L_0x64ba:
            if (r0 == 0) goto L_0x0117
            goto L_0x3f5b
        L_0x64be:
            java.lang.String r2 = "bk.action.showreel.IsToolbarBelowMedia"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x6564
            r0 = 1
            X.C04220Ms.A0B(r1, r0)
            androidx.fragment.app.Fragment r0 = X.C63913ic.A03(r1)
            if (r0 == 0) goto L_0x0117
            android.content.Context r0 = r0.getContext()
            if (r0 == 0) goto L_0x0117
            boolean r0 = X.C25829Dsn.A0C(r0)
            goto L_0x64ba
        L_0x64db:
            X.3am r0 = X.C63043bN.A01
            long r0 = r0.A05(r1)
            goto L_0x39a8
        L_0x64e3:
            X.3am r0 = X.C63043bN.A01
            long r0 = r0.A04(r1)
            goto L_0x39a8
        L_0x64eb:
            java.lang.String r0 = "EXCEPTION"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x395f
            com.facebook.breakpad.BreakpadManager.crashThisProcess()
            goto L_0x395f
        L_0x64f8:
            java.lang.String r0 = "SIGKILL"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x395f
            int r1 = android.os.Process.myPid()
            r0 = 9
            android.os.Process.sendSignal(r1, r0)
            goto L_0x395f
        L_0x650b:
            X.AnonymousClass0MI.A05(r0)
            goto L_0x395f
        L_0x6510:
            java.lang.String r0 = "Signature called with invalid model."
            X.C30967GcS.A02(r6, r0)
            goto L_0x395f
        L_0x6517:
            r2 = 0
            X.C04220Ms.A0B(r1, r2)
            androidx.fragment.app.Fragment r2 = X.C63913ic.A01(r1)
            androidx.fragment.app.FragmentActivity r3 = r2.getActivity()
            if (r3 != 0) goto L_0x652e
            java.util.ArrayList r2 = X.AnonymousClass0wJ.A0v()
            X.AnonymousClass7GY.A03(r1, r0, r2)
            goto L_0x395f
        L_0x652e:
            r7 = 2
            com.facebook.redex.IDxPCallbackShape32S0400000_2_I2 r2 = new com.facebook.redex.IDxPCallbackShape32S0400000_2_I2
            r5 = r1
            r6 = r0
            r2.<init>(r3, r4, r5, r6, r7)
            java.lang.String r0 = X.AnonymousClass7CJ.A00(r4)
            java.lang.String[] r0 = new java.lang.String[]{r0}
            X.AnonymousClass7K8.A02(r3, r2, r0)
            goto L_0x395f
        L_0x6543:
            androidx.fragment.app.FragmentActivity r0 = X.C63913ic.A05(r1)
            X.AnonymousClass3WA.A00(r0, r3)
            goto L_0x395f
        L_0x654c:
            r0 = 13697(0x3581, float:1.9194E-41)
            if (r2 != r0) goto L_0x395f
            X.3HX r0 = r1.A00
            android.view.View r0 = r3.A0J(r0)
            X.0yB r0 = (X.C18930yB) r0
            if (r0 == 0) goto L_0x395f
            com.instagram.ui.widget.searchedittext.SearchEditText r0 = r0.A01
            r0.requestFocus()
            r0.A04()
            goto L_0x395f
        L_0x6564:
            java.lang.String r2 = "bk.action.showreel.LogEvent"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x6591
            boolean r2 = X.AnonymousClass0wJ.A1Y(r0, r1)
            java.lang.String r3 = X.C63893iY.A0D(r0, r2)
            r2 = 2
            java.lang.Object r2 = X.C63893iY.A0B(r0, r2)
            java.util.Map r2 = (java.util.Map) r2
            X.3HX r0 = r1.A00
            r9 = 0
            if (r0 == 0) goto L_0x0012
            r1 = 2131307159(0x7f092a97, float:1.8232537E38)
            android.util.SparseArray r0 = r0.A01
            java.lang.Object r0 = r0.get(r1)
            X.7AT r0 = (X.AnonymousClass7AT) r0
            if (r0 == 0) goto L_0x0012
            r0.A07(r3, r2)
            return r9
        L_0x6591:
            java.lang.String r2 = "bk.action.showreel.render.GetTextSize"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x65a5
            java.util.HashMap r9 = X.AnonymousClass0wJ.A0y()
            java.lang.String r1 = "text_size"
            java.lang.String r0 = "20sp"
            r9.put(r1, r0)
            return r9
        L_0x65a5:
            java.lang.String r2 = "bk.action.spring.CreateSpring"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x65ca
            r2 = 0
            X.C04220Ms.A0B(r0, r2)
            X.6jp r3 = X.C63893iY.A06(r0, r2)
            X.COK r0 = X.COK.A00()
            X.DsR r9 = r0.A02()
            X.3iY r2 = X.C86114wI.A0V(r9)
            X.5f8 r0 = new X.5f8
            r0.<init>(r1, r2, r3)
            r9.A0E(r0)
            return r9
        L_0x65ca:
            java.lang.String r2 = "bk.action.spring.GetCurrentValue"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x65e1
            java.lang.Object r0 = X.C63893iY.A07(r0)
            X.DsR r0 = (X.C25812DsR) r0
            X.DON r0 = r0.A09
            double r0 = r0.A00
            java.lang.Number r9 = X.AnonymousClass3WF.A00(r0)
            return r9
        L_0x65e1:
            java.lang.String r2 = "bk.action.spring.SetEndValue"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x6603
            java.lang.Object r2 = X.C86124wJ.A0m(r0)
            java.lang.String r1 = "null cannot be cast to non-null type com.facebook.rebound.Spring"
            X.C04220Ms.A0C(r2, r1)
            X.DsR r2 = (X.C25812DsR) r2
            r1 = 1
            java.lang.Object r0 = X.C63893iY.A0A(r0, r1)
            float r0 = X.C18240wQ.A00(r0)
            double r0 = (double) r0
            r2.A0A(r0)
            r9 = 0
            return r9
        L_0x6603:
            java.lang.String r2 = "bk.action.StartAgeVerification"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x6610
            java.lang.Object r9 = X.AnonymousClass2HU.A00(r1, r0)
            return r9
        L_0x6610:
            java.lang.String r2 = "ig.action.string.EncryptPassword"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x6630
            java.lang.Object r2 = X.C63893iY.A07(r0)
            java.lang.String r2 = (java.lang.String) r2
            r0 = 0
            X.C04220Ms.A0B(r1, r0)
            X.0i6 r1 = X.C63913ic.A0F(r1)
            X.3aU r0 = new X.3aU
            r0.<init>(r1)
            java.lang.String r9 = r0.A02(r2)
            return r9
        L_0x6630:
            java.lang.String r2 = "bk.action.string.EncryptPassword"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x664e
            boolean r2 = X.AnonymousClass0wJ.A1Y(r0, r1)
            java.lang.String r2 = X.C86154wM.A0l(r0, r2)
            X.0i6 r1 = X.C63913ic.A0F(r1)
            X.3aU r0 = new X.3aU
            r0.<init>(r1)
            java.lang.String r9 = r0.A02(r2)
            return r9
        L_0x664e:
            java.lang.String r2 = "bk.action.string.GetURLLastPathComponent"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x6667
            r1 = 0
            X.C04220Ms.A0B(r0, r1)
            java.lang.String r0 = X.C63893iY.A0D(r0, r1)
            android.net.Uri r0 = X.C15430rJ.A01(r0)
            java.lang.String r9 = r0.getLastPathSegment()
            return r9
        L_0x6667:
            java.lang.String r2 = "bk.action.string.ParseUrl"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x66b1
            r1 = 0
            X.C04220Ms.A0B(r0, r1)
            java.lang.String r0 = X.C63893iY.A0D(r0, r1)
            android.net.Uri r6 = X.C15430rJ.A01(r0)
            java.lang.String r5 = r6.getHost()
            java.lang.String r4 = r6.getPath()
            java.util.Set r1 = r6.getQueryParameterNames()
            X.C04220Ms.A06(r1)
            r0 = 10
            int r0 = X.C02260Al.A0z(r1, r0)
            int r0 = X.AnonymousClass4WK.A0L(r0)
            java.util.LinkedHashMap r3 = X.C18190wL.A0v(r0)
            java.util.Iterator r2 = r1.iterator()
        L_0x669c:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x6bae
            java.lang.Object r1 = r2.next()
            r0 = r1
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r0 = r6.getQueryParameter(r0)
            r3.put(r1, r0)
            goto L_0x669c
        L_0x66b1:
            java.lang.String r2 = "bk.action.UpdatedAvatar"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x675c
            boolean r4 = X.AnonymousClass0wJ.A1Z(r0, r1)
            java.util.List r3 = r0.A00
            int r2 = r3.size()
            r0 = 2
            if (r2 < r0) goto L_0x66e7
            java.lang.Object r2 = r3.get(r4)
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.Boolean"
            X.C04220Ms.A0C(r2, r0)
            boolean r0 = X.AnonymousClass0wJ.A1X(r2)
            if (r0 == 0) goto L_0x66e7
            X.0i6 r0 = X.C63913ic.A0F(r1)
            X.C18200wM.A1R(r0)
            X.KHq r2 = X.AnonymousClass3LY.A00(r0)
            X.7rF r0 = new X.7rF
            r0.<init>()
            goto L_0x0636
        L_0x66e7:
            X.0i6 r0 = X.C63913ic.A0F(r1)
            X.C18200wM.A1R(r0)
            X.KHq r1 = X.AnonymousClass3LY.A00(r0)
            X.7rH r0 = new X.7rH
            r0.<init>()
            r1.CWx(r0)
            goto L_0x395f
        L_0x66fc:
            r3 = 0
            boolean r2 = X.AnonymousClass0wJ.A1Z(r0, r1)
            X.7h3 r3 = X.C63893iY.A03(r0, r3)
            java.lang.Object r4 = X.C63893iY.A0B(r0, r2)
            r4.getClass()
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            r2 = 2
            X.3HX r0 = X.C131677sb.A01(r1, r0, r2)
            java.lang.Object r3 = X.AnonymousClass7K7.A04(r0, r3)
            X.6n9 r3 = (X.C111326n9) r3
            if (r3 == 0) goto L_0x395f
            android.text.Editable r0 = r3.A0L
            android.text.SpannableStringBuilder r0 = X.C18200wM.A0E(r0)
            r3.A0L = r0
            android.widget.EditText r0 = r3.A0N
            if (r0 == 0) goto L_0x395f
            android.text.Editable r0 = r0.getText()
            int r2 = r0.length()
            android.widget.EditText r0 = r3.A0N
            int r0 = r0.getSelectionEnd()
            int r2 = r2 - r0
            android.widget.EditText r0 = r3.A0N
            int r0 = r0.getSelectionEnd()
            boolean r1 = X.C18180wK.A1W(r0)
            android.widget.EditText r0 = r3.A0N
            r0.setText(r4)
            if (r1 != 0) goto L_0x395f
            int r0 = r4.length()
            int r1 = r4.length()
            if (r0 < r2) goto L_0x6752
            int r1 = r1 - r2
        L_0x6752:
            android.widget.EditText r0 = r3.A0N
            r0.setSelection(r1)
            goto L_0x395f
        L_0x6759:
            r0 = -1
            goto L_0x019e
        L_0x675c:
            java.lang.String r2 = "bk.action.SyncedAvatar"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x677d
            r0 = 0
            X.C04220Ms.A0B(r1, r0)
            X.0i6 r0 = X.C63913ic.A0F(r1)
            X.C18200wM.A1R(r0)
            X.KHq r1 = X.AnonymousClass3LY.A00(r0)
            X.7rH r0 = new X.7rH
            r0.<init>()
            r1.CWx(r0)
            r9 = 0
            return r9
        L_0x677d:
            java.lang.String r2 = "bk.action.TakeAndSaveScreenshot"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x00d9
            X.3Xs r2 = X.C62193Xs.A00
            java.lang.Object r9 = r2.A01(r1, r0)
            return r9
        L_0x678c:
            X.51W r0 = r0.A00
            if (r0 == 0) goto L_0x0012
            r0.A04()
            return r9
        L_0x6794:
            java.net.URL r0 = new java.net.URL     // Catch:{ Exception -> 0x67cc }
            r0.<init>(r3)     // Catch:{ Exception -> 0x67cc }
            java.lang.String r5 = r0.getPath()     // Catch:{ Exception -> 0x67cc }
            java.lang.String r3 = java.net.URLConnection.guessContentTypeFromName(r5)     // Catch:{ Exception -> 0x67cc }
            X.C04220Ms.A06(r3)     // Catch:{ Exception -> 0x67cc }
            java.lang.String r2 = "image/"
            r0 = 1
            boolean r0 = X.C18220wO.A1V(r2, r0, r3)     // Catch:{ Exception -> 0x67cc }
            if (r0 == 0) goto L_0x67c5
            java.io.File r0 = X.C86144wL.A0Z(r5)     // Catch:{ Exception -> 0x67cc }
            byte[] r0 = X.AnonymousClass8DI.A02(r0)     // Catch:{ Exception -> 0x67cc }
            java.lang.String r0 = android.util.Base64.encodeToString(r0, r7)     // Catch:{ Exception -> 0x67cc }
            X.C04220Ms.A06(r0)     // Catch:{ Exception -> 0x67cc }
            X.3iY r0 = X.C86104wH.A0W(r0)     // Catch:{ Exception -> 0x67cc }
            X.C61043Rr.A00(r1, r0, r6)     // Catch:{ Exception -> 0x67cc }
            goto L_0x6866
        L_0x67c5:
            java.lang.String r0 = "File is not an image."
            java.lang.IllegalArgumentException r0 = X.C18190wL.A0a(r0)     // Catch:{ Exception -> 0x67cc }
            throw r0     // Catch:{ Exception -> 0x67cc }
        L_0x67cc:
            r0 = move-exception
            java.lang.String r0 = r0.getMessage()
            if (r0 == 0) goto L_0x0012
            X.3iY r0 = X.C86104wH.A0W(r0)
            X.C61043Rr.A00(r1, r0, r4)
            return r9
        L_0x67db:
            com.facebook.redex.IDxICallbackShape297S0200000_1_I2 r0 = new com.facebook.redex.IDxICallbackShape297S0200000_1_I2
            r0.<init>(r1, r3, r4)
            X.C63123bZ.A03(r2, r0)
            return r9
        L_0x67e4:
            java.lang.IllegalStateException r2 = X.AnonymousClass0wJ.A0b()
            throw r2
        L_0x67e9:
            java.lang.IllegalStateException r2 = X.AnonymousClass0wJ.A0b()
            throw r2
        L_0x67ee:
            java.lang.IllegalStateException r2 = X.AnonymousClass0wJ.A0b()
            throw r2
        L_0x67f3:
            java.lang.IllegalStateException r2 = X.AnonymousClass0wJ.A0b()
            throw r2
        L_0x67f8:
            java.lang.IllegalStateException r2 = X.AnonymousClass0wJ.A0b()
            throw r2
        L_0x67fd:
            java.lang.IllegalStateException r2 = X.AnonymousClass0wJ.A0b()
            throw r2
        L_0x6802:
            java.lang.IllegalStateException r2 = X.AnonymousClass0wJ.A0b()
            throw r2
        L_0x6807:
            java.lang.Object r5 = X.C63893iY.A0B(r0, r3)
            r5.getClass()
        L_0x680e:
            r2 = 2
            X.6jp r4 = X.C63893iY.A06(r0, r2)
            r0 = 47
            kotlin.jvm.internal.KtLambdaShape10S0300000_I2 r3 = X.C86154wM.A0y(r5, r1, r4, r0)
            r2 = 12
            kotlin.jvm.internal.KtLambdaShape6S0300000_I2_1 r0 = new kotlin.jvm.internal.KtLambdaShape6S0300000_I2_1
            r0.<init>(r2, r5, r4, r1)
            java.lang.Object r9 = X.AnonymousClass6P5.A00(r1, r6, r0, r3)
            return r9
        L_0x6825:
            java.lang.String r1 = "CXF_CPDP"
            java.lang.String r0 = "Attempt to reportMediaMetricForView with a null view, view must be not null."
            X.C30967GcS.A02(r1, r0)
            return r9
        L_0x682d:
            X.C103566Zr.A00 = r3
            return r9
        L_0x6830:
            java.lang.String r0 = "User session must not be null to announce the refresh event"
            java.lang.IllegalArgumentException r2 = X.C18190wL.A0a(r0)
            throw r2
        L_0x6837:
            X.Iu1 r9 = X.C35393Iu1.A0r
            return r9
        L_0x683a:
            r0 = 34
            java.lang.String r0 = X.C18170wI.A00(r0)
            java.lang.IllegalArgumentException r2 = X.C18190wL.A0a(r0)
            throw r2
        L_0x6845:
            r0 = 34
            java.lang.String r0 = X.C18170wI.A00(r0)
            java.lang.IllegalArgumentException r2 = X.C18190wL.A0a(r0)
            throw r2
        L_0x6850:
            r0 = 34
            java.lang.String r0 = X.C18170wI.A00(r0)
            java.lang.IllegalArgumentException r2 = X.C18190wL.A0a(r0)
            throw r2
        L_0x685b:
            r0 = 34
            java.lang.String r0 = X.C18170wI.A00(r0)
            java.lang.IllegalArgumentException r2 = X.C18190wL.A0a(r0)
            throw r2
        L_0x6866:
            return r9
        L_0x6867:
            java.net.URL r0 = new java.net.URL     // Catch:{ MalformedURLException -> 0x689e }
            r0.<init>(r2)     // Catch:{ MalformedURLException -> 0x689e }
            java.lang.String r5 = r0.getPath()     // Catch:{ MalformedURLException -> 0x689e }
            com.instagram.service.session.UserSession r4 = X.C63913ic.A0J(r1)
            r0 = 0
            X.C04220Ms.A0B(r1, r0)
            androidx.fragment.app.FragmentActivity r2 = X.C63913ic.A05(r1)
            X.6jV r0 = new X.6jV
            r0.<init>(r1, r6, r3)
            X.6kC r3 = new X.6kC
            r3.<init>(r2, r0, r4)
            com.facebook.redex.IDxCallableShape27S1100000_5_I2 r1 = new com.facebook.redex.IDxCallableShape27S1100000_5_I2
            r1.<init>(r5, r3, r7)
            r0 = 654(0x28e, float:9.16E-43)
            X.H8a r2 = new X.H8a
            r2.<init>(r1, r0)
            r1 = 6
            com.instagram.common.task.IDxCallbackShape129S0100000_2_I2 r0 = new com.instagram.common.task.IDxCallbackShape129S0100000_2_I2
            r0.<init>(r3, r1)
            r2.A00 = r0
            X.C31155GhB.A03(r2)
            return r9
        L_0x689e:
            r0 = move-exception
            java.lang.String r0 = r0.getMessage()
            X.C86124wJ.A1Q(r1, r3, r0)
            return r9
        L_0x68a7:
            java.net.URL r0 = new java.net.URL     // Catch:{ MalformedURLException -> 0x68d4 }
            r0.<init>(r6)     // Catch:{ MalformedURLException -> 0x68d4 }
            java.lang.String r16 = r0.getPath()     // Catch:{ MalformedURLException -> 0x68d4 }
            java.lang.Object[] r0 = new java.lang.Object[r5]
            X.C63913ic.A0K(r1, r2, r0)
            X.C04220Ms.A0B(r1, r5)
            androidx.fragment.app.FragmentActivity r3 = X.C63913ic.A05(r1)
            com.instagram.service.session.UserSession r2 = X.C63913ic.A0J(r1)
            X.06E r0 = X.AnonymousClass06E.A00(r3)
            X.7pd r10 = new X.7pd
            r11 = r3
            r12 = r1
            r14 = r4
            r15 = r2
            r10.<init>(r11, r12, r13, r14, r15, r16, r17)
            X.AnonymousClass0wJ.A1M(r3, r5, r2)
            X.C37367JqP.A01(r3, r0, r10, r2, r5)
            return r9
        L_0x68d4:
            r0 = move-exception
            java.lang.String r0 = r0.getMessage()
            X.C86124wJ.A1Q(r1, r4, r0)
            return r9
        L_0x68dd:
            java.net.URL r0 = new java.net.URL     // Catch:{ MalformedURLException -> 0x6904 }
            r0.<init>(r5)     // Catch:{ MalformedURLException -> 0x6904 }
            java.lang.String r5 = r0.getPath()     // Catch:{ MalformedURLException -> 0x6904 }
            java.lang.Object[] r0 = new java.lang.Object[r4]
            X.C63913ic.A0K(r1, r2, r0)
            X.C04220Ms.A0B(r1, r4)
            androidx.fragment.app.FragmentActivity r4 = X.C63913ic.A05(r1)
            com.instagram.service.session.UserSession r3 = X.C63913ic.A0J(r1)
            X.7wW r2 = new X.7wW
            r2.<init>(r1, r7, r6)
            X.6pl r0 = new X.6pl
            r0.<init>(r4, r2, r3)
            r0.A00(r5, r8, r9)
            return r9
        L_0x6904:
            r0 = move-exception
            java.lang.String r0 = r0.getMessage()
            X.C86124wJ.A1Q(r1, r6, r0)
            return r9
        L_0x690d:
            java.lang.IllegalStateException r2 = X.AnonymousClass0wJ.A0b()
            throw r2
        L_0x6912:
            androidx.fragment.app.FragmentActivity r0 = X.C63913ic.A05(r1)
            X.AnonymousClass3WA.A00(r0, r2)
            return r9
        L_0x691a:
            java.lang.IllegalStateException r2 = X.C18180wK.A0a(r2)
            throw r2
        L_0x691f:
            X.0i6 r0 = X.C63913ic.A0F(r1)
            X.KHq r1 = X.AnonymousClass3LY.A00(r0)
            X.7ri r0 = new X.7ri
            r0.<init>(r4, r3)
            r1.CWx(r0)
            return r9
        L_0x6930:
            androidx.fragment.app.FragmentActivity r3 = X.C63913ic.A05(r1)
            X.0kW r2 = X.C63913ic.A0A(r1)
            X.0i6 r0 = X.C63913ic.A0F(r1)
            X.0bf r12 = X.C05030Qo.A00(r0)
            r10 = r3
            r11 = r2
            r13 = r4
            r14 = r9
            r15 = r5
            com.instagram.service.session.UserSession r0 = X.C67323zM.A03(r10, r11, r12, r13, r14, r15)
            X.C67323zM.A08(r3, r2, r0)
            return r9
        L_0x694d:
            java.lang.IllegalStateException r2 = X.AnonymousClass0wJ.A0b()
            throw r2
        L_0x6952:
            java.lang.IllegalStateException r2 = X.AnonymousClass0wJ.A0b()
            throw r2
        L_0x6957:
            java.lang.IllegalStateException r2 = X.AnonymousClass0wJ.A0b()
            throw r2
        L_0x695c:
            r0.A07()
            return r9
        L_0x6960:
            double r2 = r0.A00     // Catch:{ all -> 0x6b43 }
            monitor-exit(r0)
            long r0 = (long) r2
            java.lang.Long r9 = java.lang.Long.valueOf(r0)
            return r9
        L_0x6969:
            org.json.JSONObject r2 = X.C18250wR.A0j(r0)     // Catch:{ JSONException -> 0x6990 }
            java.lang.String r0 = "pk"
            java.lang.String r5 = r2.getString(r0)     // Catch:{ JSONException -> 0x6990 }
            X.0i6 r4 = X.C63913ic.A0F(r1)     // Catch:{ JSONException -> 0x6990 }
            com.instagram.service.session.UserSession r4 = (com.instagram.service.session.UserSession) r4     // Catch:{ JSONException -> 0x6990 }
            androidx.fragment.app.FragmentActivity r3 = X.C63913ic.A05(r1)     // Catch:{ JSONException -> 0x6990 }
            X.0kW r0 = X.C63913ic.A0A(r1)     // Catch:{ JSONException -> 0x6990 }
            X.Djx r2 = new X.Djx     // Catch:{ JSONException -> 0x6990 }
            r2.<init>(r0, r4)     // Catch:{ JSONException -> 0x6990 }
            X.3Y8 r1 = X.AnonymousClass3Y8.A02     // Catch:{ JSONException -> 0x6990 }
            com.facebook.redex.IDxFListenerShape235S0200000_1_I2 r0 = new com.facebook.redex.IDxFListenerShape235S0200000_1_I2     // Catch:{ JSONException -> 0x6990 }
            r0.<init>(r6, r3, r2)     // Catch:{ JSONException -> 0x6990 }
            r1.A00(r4, r0, r5)     // Catch:{ JSONException -> 0x6990 }
        L_0x6990:
            r9 = 0
            return r9
        L_0x6992:
            android.os.Bundle r4 = X.C18180wK.A06()
            java.lang.String r0 = "LimitedSettingsFragment.REMINDER_DATE"
            r4.putLong(r0, r2)
            X.5wv r3 = new X.5wv
            r3.<init>()
            r3.setArguments(r4)
            android.content.Context r2 = r7.A00
            X.C04220Ms.A06(r2)
            X.6jW r0 = new X.6jW
            r0.<init>(r2, r1, r6)
            r3.A05 = r0
            X.Jj9 r0 = new X.Jj9
            r0.<init>(r5)
            X.C18200wM.A16(r2, r3, r0)
            return r9
        L_0x69b8:
            r0 = 34
            java.lang.String r0 = X.C18170wI.A00(r0)
            java.lang.IllegalArgumentException r2 = X.C18190wL.A0a(r0)
            throw r2
        L_0x69c3:
            r0 = 34
            java.lang.String r0 = X.C18170wI.A00(r0)
            java.lang.IllegalArgumentException r2 = X.C18190wL.A0a(r0)
            throw r2
        L_0x69ce:
            r1 = 1
            java.lang.Object r0 = X.C63893iY.A0B(r0, r1)     // Catch:{ ClassCastException -> 0x69eb }
            r0.getClass()     // Catch:{ ClassCastException -> 0x69eb }
            java.util.List r0 = (java.util.List) r0     // Catch:{ ClassCastException -> 0x69eb }
            r2.addAll(r0)     // Catch:{ ClassCastException -> 0x69eb }
            java.lang.Object[] r0 = r2.toArray()     // Catch:{ IllegalFormatException -> 0x69e4 }
            java.lang.String r9 = java.lang.String.format(r9, r0)     // Catch:{ IllegalFormatException -> 0x69e4 }
            return r9
        L_0x69e4:
            r1 = move-exception
            java.lang.String r0 = "ig-action-string-printf-error"
            X.C10450iM.A07(r0, r1)
            return r9
        L_0x69eb:
            java.lang.String r1 = "bloks-print-invalid-args"
            java.lang.String r0 = "ig.action.string.Printf only supports string args"
            X.C10450iM.A03(r1, r0)
            return r9
        L_0x69f3:
            r0 = 762(0x2fa, float:1.068E-42)
            java.lang.String r0 = X.C18170wI.A00(r0)
            java.lang.IllegalArgumentException r2 = X.C18190wL.A0a(r0)
            throw r2
        L_0x69fe:
            java.lang.String r0 = "Cannot dismiss without an existing bottom sheet."
            java.lang.IllegalStateException r2 = X.C18180wK.A0a(r0)
            throw r2
        L_0x6a05:
            java.lang.String r0 = "Cannot dismiss without an existing bottom sheet."
            java.lang.IllegalStateException r2 = X.C18180wK.A0a(r0)
            throw r2
        L_0x6a0c:
            java.lang.String r9 = "not_set"
            return r9
        L_0x6a0f:
            java.lang.String r9 = "set"
            return r9
        L_0x6a12:
            java.lang.String r9 = "saved"
            return r9
        L_0x6a15:
            java.lang.String r9 = "not_saved"
            return r9
        L_0x6a18:
            X.4VZ r2 = X.AnonymousClass4VZ.A00()
            throw r2
        L_0x6a1d:
            java.lang.Integer r9 = X.C86144wL.A0b()
            return r9
        L_0x6a22:
            X.BKH r0 = r0.A08(r2)     // Catch:{ all -> 0x6a2f }
            if (r0 == 0) goto L_0x6a2c
            java.lang.String r9 = r0.A0U     // Catch:{ all -> 0x6a2f }
        L_0x6a2a:
            monitor-exit(r1)     // Catch:{ all -> 0x6a2f }
            goto L_0x6a2e
        L_0x6a2c:
            r9 = 0
            goto L_0x6a2a
        L_0x6a2e:
            return r9
        L_0x6a2f:
            r2 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x6a2f }
            throw r2
        L_0x6a32:
            java.lang.String r2 = "ig.action.negative_action.MuteUser"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x6a3f
            java.lang.Object r9 = X.AnonymousClass2JL.A00(r1, r0)
            return r9
        L_0x6a3f:
            java.lang.String r2 = "ig.action.negative_action.RestrictUser"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x6a4c
            java.lang.Object r9 = X.AnonymousClass2JM.A00(r1, r0)
            return r9
        L_0x6a4c:
            java.lang.String r2 = "ig.action.negative_action.UnfollowUser"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x6a59
            java.lang.Object r9 = X.AnonymousClass2JN.A00(r1, r0)
            return r9
        L_0x6a59:
            java.lang.String r1 = "bk.action.visibility_context.GetLastImpressionTimeInMs"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x6a6f
            java.lang.Object r1 = X.C86124wJ.A0m(r0)
            java.lang.String r0 = "null cannot be cast to non-null type com.bloks.foa.visibility.ViewpointSnapshotWithData"
            X.C04220Ms.A0C(r1, r0)
            X.6kO r1 = (X.C109676kO) r1
            java.lang.Long r9 = r1.A02
            return r9
        L_0x6a6f:
            java.lang.String r1 = "bk.action.visibility_context.HasSeenBefore"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x6a84
            java.lang.Object r0 = X.C63893iY.A07(r0)
            X.6kO r0 = (X.C109676kO) r0
            boolean r0 = r0.A03
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r0)
            return r9
        L_0x6a84:
            java.lang.String r1 = "bk.action.visibility_context.PercentVisible"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x6a9a
            java.lang.Object r0 = X.C63893iY.A07(r0)
            X.6kO r0 = (X.C109676kO) r0
            float r0 = r0.A00
            double r0 = (double) r0
            java.lang.Number r9 = X.AnonymousClass3WF.A00(r0)
            return r9
        L_0x6a9a:
            java.lang.String r1 = "bk.action.visibility_context.GetTimeSinceLastImpressionInMS"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x6ab8
            java.lang.Object r0 = X.C63893iY.A07(r0)
            X.6kO r0 = (X.C109676kO) r0
            long r2 = java.lang.System.currentTimeMillis()
            java.lang.Long r0 = r0.A02
            long r0 = r0.longValue()
            long r2 = r2 - r0
            java.lang.Long r9 = java.lang.Long.valueOf(r2)
            return r9
        L_0x6ab8:
            java.lang.String r1 = "ig.action.viewpoint_extension_context.GetElapsedScreenTimeInMs"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x6acd
            java.lang.Object r0 = X.C63893iY.A07(r0)
            X.6kO r0 = (X.C109676kO) r0
            long r0 = r0.A01
            java.lang.Long r9 = java.lang.Long.valueOf(r0)
            return r9
        L_0x6acd:
            java.lang.String r1 = "ig.action.viewpoint_extension_context.GetPercentVisible"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x6ae8
            java.lang.Object r1 = X.C86124wJ.A0m(r0)
            java.lang.String r0 = "null cannot be cast to non-null type com.bloks.foa.visibility.ViewpointSnapshotWithData"
            X.C04220Ms.A0C(r1, r0)
            X.6kO r1 = (X.C109676kO) r1
            float r0 = r1.A00
            double r0 = (double) r0
            java.lang.Number r9 = X.AnonymousClass3WF.A00(r0)
            return r9
        L_0x6ae8:
            java.lang.Object[] r1 = new java.lang.Object[]{r3}
            java.lang.String r0 = "No implementation bound to key: %s"
            java.lang.String r0 = java.lang.String.format(r0, r1)
            java.lang.IllegalArgumentException r2 = X.C18190wL.A0a(r0)
            throw r2
        L_0x6af7:
            r1.clearFlags(r0)
            return r9
        L_0x6afb:
            float r3 = (float) r4
            long r1 = X.AnonymousClass7Jm.A00
            float r0 = (float) r1
            float r3 = r3 / r0
            java.lang.Float r9 = java.lang.Float.valueOf(r3)
            return r9
        L_0x6b05:
            java.lang.String r0 = X.C63893iY.A0D(r0, r3)
            android.animation.Animator r0 = X.AnonymousClass7Jm.A01(r2, r0)
            if (r0 == 0) goto L_0x6b10
            r1 = 1
        L_0x6b10:
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r1)
            return r9
        L_0x6b15:
            java.lang.Integer r0 = X.AnonymousClass006.A01
            X.4wP r9 = new X.4wP
            r9.<init>(r0, r7)
            return r9
        L_0x6b1d:
            java.lang.Integer r0 = X.AnonymousClass006.A0C
            X.4wP r9 = new X.4wP
            r9.<init>(r0, r7)
            return r9
        L_0x6b25:
            java.lang.Object r9 = X.AnonymousClass00J.A0C(r7)
            return r9
        L_0x6b2a:
            java.lang.String r0 = "Failed to load albums: MediaStore data module is not found."
            X.C30967GcS.A02(r6, r0)
            return r9
        L_0x6b30:
            java.lang.String r0 = "Failed to load media: MediaStore data module is not found."
            X.C30967GcS.A02(r4, r0)
            return r9
        L_0x6b36:
            java.lang.String r0 = "Required value was null."
            java.lang.IllegalArgumentException r2 = X.C18190wL.A0a(r0)
            throw r2
        L_0x6b3d:
            r0.remove(r1)     // Catch:{ all -> 0x6b43 }
            monitor-exit(r0)
            r9 = 0
            return r9
        L_0x6b43:
            r2 = move-exception
            monitor-exit(r0)
            throw r2
        L_0x6b46:
            X.0m7 r2 = X.C63913ic.A07(r1)
            androidx.fragment.app.FragmentActivity r0 = X.C63913ic.A05(r1)
            X.AnonymousClass3WA.A00(r0, r2)
            return r9
        L_0x6b52:
            java.lang.IllegalStateException r2 = X.AnonymousClass0wJ.A0b()
            throw r2
        L_0x6b57:
            X.AnonymousClass2CO.A00(r0, r2)
            return r9
        L_0x6b5b:
            java.lang.String r1 = "BKBloksActionCommerceCartDcExposeExperimentImpl"
            java.lang.String r0 = "Got a null user session while exposing the experiment."
            X.C30967GcS.A02(r1, r0)
            return r9
        L_0x6b63:
            java.lang.String r9 = "denied"
            return r9
        L_0x6b66:
            X.0t2 r0 = X.C10650ih.A00
            X.05P r2 = r0.A05()
            java.lang.String r1 = "android.intent.action.VIEW"
            android.content.Intent r0 = new android.content.Intent
            r0.<init>(r1, r3)
            android.content.Intent r1 = r0.setPackage(r5)
            r0 = 402653184(0x18000000, float:1.6543612E-24)
            android.content.Intent r0 = r1.setFlags(r0)
            r2.A09(r4, r0)
            return r9
        L_0x6b81:
            java.lang.String r0 = "No active bottom sheet is opened!"
            java.lang.IllegalStateException r2 = X.C18180wK.A0a(r0)
            throw r2
        L_0x6b88:
            java.lang.String r0 = "No active consent flow is opened!"
            java.lang.IllegalStateException r2 = X.C18180wK.A0a(r0)
            throw r2
        L_0x6b8f:
            java.lang.String r0 = "No active dialog is opened!"
            java.lang.IllegalStateException r2 = X.C18180wK.A0a(r0)
            throw r2
        L_0x6b96:
            java.lang.String r0 = "No active consent flow is opened!"
            java.lang.IllegalStateException r2 = X.C18180wK.A0a(r0)
            throw r2
        L_0x6b9d:
            java.lang.String r0 = "No active screen is opened!"
            java.lang.IllegalStateException r2 = X.C18180wK.A0a(r0)
            throw r2
        L_0x6ba4:
            java.lang.String r0 = "No active consent flow is opened!"
            java.lang.IllegalStateException r2 = X.C18180wK.A0a(r0)
            throw r2
        L_0x6bab:
            X.84Y r9 = X.AnonymousClass84Y.A00
            return r9
        L_0x6bae:
            java.lang.String r0 = "host"
            kotlin.Pair r2 = X.C18180wK.A0p(r0, r5)
            java.lang.String r0 = "path"
            kotlin.Pair r1 = X.C18180wK.A0p(r0, r4)
            java.lang.String r0 = "url_params"
            kotlin.Pair r0 = X.C18180wK.A0p(r0, r3)
            kotlin.Pair[] r0 = new kotlin.Pair[]{r2, r1, r0}
            java.util.Map r9 = X.AnonymousClass4WJ.A0H(r0)
            return r9
        L_0x6bc9:
            java.lang.Boolean r9 = X.C18180wK.A0X()
            return r9
        L_0x6bce:
            java.lang.Object r4 = X.C63893iY.A07(r0)
            X.7h3 r4 = (X.C127397h3) r4
            java.lang.Object r3 = X.C63893iY.A08(r0)
            java.util.Map r3 = (java.util.Map) r3
            r2 = 2
            java.lang.Object r0 = X.C63893iY.A0B(r0, r2)
            X.7h3 r0 = (X.C127397h3) r0
            X.AnonymousClass3WA.A02(r1, r4, r0, r3)
            r9 = 0
            return r9
        L_0x6be6:
            java.lang.Object r9 = X.AnonymousClass2G5.A00(r1, r0)
            return r9
        L_0x6beb:
            java.lang.Object r3 = X.C63893iY.A07(r0)
            java.lang.String r3 = (java.lang.String) r3
            r2 = 1
            java.lang.Object r2 = X.C63893iY.A0B(r0, r2)
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r4 = X.C63893iY.A09(r0)
            java.util.Map r4 = (java.util.Map) r4
            if (r2 == 0) goto L_0x6c2f
            X.7pv r0 = new X.7pv
            r0.<init>(r2)
        L_0x6c05:
            X.0rn r3 = X.C15730rn.A00(r0, r3)
            X.0kP r2 = X.C11560kP.IS_LOGGED_FROM_BLOKS
            java.util.EnumSet r0 = r3.A06
            r0.add(r2)
            X.0ri r0 = X.C118006zb.A00(r4)
            r3.A04(r0)
            X.JlQ r0 = X.C103066Xr.A00
            X.Je6 r0 = r0.A02
            java.lang.String r2 = r0.A00
            java.lang.String r0 = "nav_chain"
            r3.A0D(r0, r2)
            r0 = 0
            X.C04220Ms.A0B(r1, r0)
            X.0i6 r0 = X.C63913ic.A0F(r1)
            X.C18180wK.A1K(r3, r0)
            r9 = 0
            return r9
        L_0x6c2f:
            r0 = 0
            X.C04220Ms.A0B(r1, r0)
            X.0kW r0 = X.C63913ic.A0A(r1)
            goto L_0x6c05
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C122117Ki.A08(X.601, X.3iY, java.lang.String):java.lang.Object");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: X.H5P} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v50, resolved type: X.1lP} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v73, resolved type: X.H5P} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v79, resolved type: X.E7m} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v80, resolved type: X.H5P} */
    /* JADX WARNING: Code restructure failed: missing block: B:473:0x0c1c, code lost:
        if (r1 != false) goto L_0x0c1e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:537:0x0d43, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:538:0x0d44, code lost:
        X.AnonymousClass0LU.A0E("FBPayInstagramConfig", "FBPay config object is already initialized.", r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:539:0x0d4b, code lost:
        return;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:164:0x03e5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A0A(android.content.Context r31, com.instagram.service.session.UserSession r32, int r33, boolean r34) {
        /*
            r3 = r32
            r2 = r33
            if (r33 != 0) goto L_0x000a
            X.AnonymousClass3Zs.A03(r3)
        L_0x0009:
            return
        L_0x000a:
            r0 = 1
            if (r2 != r0) goto L_0x0012
            X.75C r0 = X.AnonymousClass75C.A01
            r0.A00 = r3
            return
        L_0x0012:
            r1 = 2
            r7 = r31
            if (r2 != r1) goto L_0x002d
            android.content.Context r4 = X.C18230wP.A09(r7)
            java.lang.Class<X.Iae> r2 = X.C34567Iae.class
            r1 = 16
            kotlin.jvm.internal.KtLambdaShape18S0200000_I2_2 r0 = new kotlin.jvm.internal.KtLambdaShape18S0200000_I2_2
            r0.<init>(r1, r4, r3)
            java.lang.Object r0 = r3.A01(r2, r0)
            X.Iae r0 = (X.C34567Iae) r0
            X.C34567Iae.A03 = r0
            return
        L_0x002d:
            r1 = 3
            if (r2 != r1) goto L_0x0038
            android.content.Context r0 = X.C18230wP.A09(r7)
            X.C117596yw.A01(r0, r3)
            return
        L_0x0038:
            r1 = 4
            if (r2 != r1) goto L_0x0063
            r10 = 0
            java.lang.Class<X.6kl> r4 = X.C109876kl.class
            r2 = 22
            kotlin.jvm.internal.KtLambdaShape27S0100000_I2_7 r1 = new kotlin.jvm.internal.KtLambdaShape27S0100000_I2_7
            r1.<init>(r3, r2)
            java.lang.Object r9 = r3.A01(r4, r1)
            X.6kl r9 = (X.C109876kl) r9
            boolean r8 = r9.A03
            if (r8 == 0) goto L_0x0009
            X.01V r7 = r9.A01
            r6 = 485(0x1e5, float:6.8E-43)
            r7.A0V(r6)
            r5 = 525(0x20d, float:7.36E-43)
            r7.A0V(r5)
            r1 = 1060769838(0x3f3a102e, float:0.7268094)
            X.03R r4 = r7.A0G
            monitor-enter(r4)
            goto L_0x0baa
        L_0x0063:
            r1 = 5
            if (r2 != r1) goto L_0x0077
            java.lang.Class<X.KJu> r2 = X.C38075KJu.class
            r1 = 6
            com.facebook.redex.IDxObjectShape241S0100000_6_I2 r0 = new com.facebook.redex.IDxObjectShape241S0100000_6_I2
            r0.<init>(r3, r1)
            java.lang.Object r0 = r3.A01(r2, r0)
            X.KJu r0 = (X.C38075KJu) r0
            X.C38075KJu.A04 = r0
            return
        L_0x0077:
            r1 = 6
            if (r2 != r1) goto L_0x0084
            X.6rR r0 = X.C101936Te.A00(r3)
            java.util.Map r0 = r0.A00
            r0.clear()
            return
        L_0x0084:
            r1 = 7
            r5 = r34
            if (r2 != r1) goto L_0x009f
            X.AnonymousClass3LM.A01()
            r0 = 22
            kotlin.jvm.internal.KtLambdaShape22S0200000_I2_6 r1 = new kotlin.jvm.internal.KtLambdaShape22S0200000_I2_6
            r1.<init>(r0, r7, r3)
            java.lang.Class<com.instagram.clips.drafts.migrators.ClipsDraftMigrator> r0 = com.instagram.clips.drafts.migrators.ClipsDraftMigrator.class
            java.lang.Object r0 = r3.A01(r0, r1)
            com.instagram.clips.drafts.migrators.ClipsDraftMigrator r0 = (com.instagram.clips.drafts.migrators.ClipsDraftMigrator) r0
            r0.CSb(r5)
            return
        L_0x009f:
            r1 = 8
            if (r2 != r1) goto L_0x00bd
            X.0TJ r2 = X.AnonymousClass0TJ.A05
            r0 = 36320850500131104(0x81099f00001920, double:3.03279033638429E-306)
            boolean r0 = X.C63803iN.A0E(r2, r3, r0)
            if (r0 != 0) goto L_0x0009
            X.KK8 r1 = X.KK8.A02(r3)
            X.80J r0 = new X.80J
            r0.<init>(r1)
            X.C63643hy.A04(r0)
            return
        L_0x00bd:
            r1 = 9
            if (r2 != r1) goto L_0x00d6
            X.KKM r1 = X.KKM.A00(r3)
            X.JNY r1 = r1.A05
            X.C04220Ms.A0B(r1, r0)
            r0 = 36
            kotlin.jvm.internal.KtLambdaShape17S0200000_I2_1 r1 = X.C86154wM.A11(r1, r3, r0)
            java.lang.Class<X.KHN> r0 = X.KHN.class
        L_0x00d2:
            r3.A01(r0, r1)
            return
        L_0x00d6:
            r1 = 10
            if (r2 != r1) goto L_0x00e4
            X.7q7 r2 = new X.7q7
            r2.<init>(r3)
            java.lang.Class<X.Jpq> r1 = X.C37343Jpq.class
            monitor-enter(r1)
            goto L_0x0bda
        L_0x00e4:
            r1 = 11
            if (r2 != r1) goto L_0x00fa
            X.C19554AyF.A02()
            X.7wx r8 = com.instagram.creation.persistence.CreationDatabase.A00
            java.lang.Class<com.instagram.creation.persistence.CreationDatabase> r6 = com.instagram.creation.persistence.CreationDatabase.class
            java.lang.Object r1 = r3.A00(r6)
            com.instagram.roomdb.IgRoomDatabase r1 = (com.instagram.roomdb.IgRoomDatabase) r1
            if (r1 != 0) goto L_0x096b
            monitor-enter(r8)
            goto L_0x0949
        L_0x00fa:
            r1 = 12
            if (r2 != r1) goto L_0x010c
            if (r34 != 0) goto L_0x0009
            X.LJs r2 = X.AnonymousClass6D3.A00
            if (r2 == 0) goto L_0x0009
            android.content.Context r1 = r2.A04
            X.01V r0 = X.AnonymousClass01V.A0p
            r2.A03(r1, r0, r3)
            return
        L_0x010c:
            r1 = 13
            if (r2 != r1) goto L_0x0118
            X.7tz r0 = X.AnonymousClass6HV.A00(r7, r3)
            r0.A01()
            return
        L_0x0118:
            r1 = 14
            if (r2 != r1) goto L_0x0128
            java.lang.Class<X.KJB> r2 = X.KJB.class
            r0 = 3
            com.facebook.redex.IDxObjectShape237S0100000_2_I2 r1 = new com.facebook.redex.IDxObjectShape237S0100000_2_I2
            r1.<init>(r3, r0)
        L_0x0124:
            r3.A01(r2, r1)
            return
        L_0x0128:
            r1 = 15
            if (r2 != r1) goto L_0x0138
            X.0kZ r1 = X.C12090lI.A00(r3)
            X.0qN r0 = new X.0qN
            r0.<init>(r1)
            X.C10850j3.A00 = r0
            return
        L_0x0138:
            r1 = 16
            if (r2 != r1) goto L_0x014e
            java.lang.Class<X.0ek> r2 = X.C09030ek.class
            r1 = 2
            com.facebook.redex.IDxObjectShape235S0100000_I2 r0 = new com.facebook.redex.IDxObjectShape235S0100000_I2
            r0.<init>(r3, r1)
            java.lang.Object r0 = r3.A01(r2, r0)
            X.0ek r0 = (X.C09030ek) r0
            X.C09030ek.A00(r0, r5)
            return
        L_0x014e:
            r1 = 17
            if (r2 != r1) goto L_0x0221
            java.lang.Class<X.7tB> r2 = X.C132017tB.class
            r1 = 4
            java.lang.Object r5 = X.C86144wL.A0i(r3, r2, r7, r1)
            X.7tB r5 = (X.C132017tB) r5
            com.instagram.service.session.UserSession r11 = r5.A01
            X.0TJ r2 = X.AnonymousClass0TJ.A05
            r3 = 36317212662828567(0x81065000000e17, double:3.030489753425771E-306)
            boolean r6 = X.C63803iN.A0E(r2, r11, r3)
            X.H44.A04 = r6
            r3 = 36322078860778667(0x810abd00001cab, double:3.0335671566040204E-306)
            boolean r8 = X.C63803iN.A0E(r2, r11, r3)
            r3 = 36322078860909741(0x810abd00021cad, double:3.033567156686912E-306)
            boolean r7 = X.C63803iN.A0E(r2, r11, r3)
            r3 = 36322078860844204(0x810abd00011cac, double:3.033567156645466E-306)
            boolean r1 = X.C63803iN.A0E(r2, r11, r3)
            X.C38016KGo.A0O = r8
            X.C38016KGo.A0P = r1
            X.J65.A00 = r7
            boolean r1 = r5.A02
            if (r1 != 0) goto L_0x0212
            r0 = 1724(0x6bc, float:2.416E-42)
            X.6d1 r7 = new X.6d1
            r7.<init>(r0)
            r0 = 36593112772313924(0x82013e00050344, double:3.2049700936248793E-306)
            java.lang.Long r0 = X.C63803iN.A07(r2, r11, r0)
            int r4 = r0.intValue()
            r0 = 36877220564304002(0x8303a3000a0082, double:3.384641005289658E-306)
            java.lang.String r0 = X.C63803iN.A0C(r2, r11, r0)
            java.util.Map r3 = X.AnonymousClass0hA.A05(r0)
            r0 = 36317212662894104(0x81065000010e18, double:3.0304897534672167E-306)
            boolean r0 = X.C63803iN.A0E(r2, r11, r0)
            X.6km r8 = new X.6km
            r8.<init>(r3, r4, r6, r0)
        L_0x01be:
            X.KGf r9 = new X.KGf
            r9.<init>(r8, r11)
            android.content.Context r6 = r5.A00
            X.KKM r10 = X.KKM.A00(r11)
            X.KKd r5 = new X.KKd
            r5.<init>(r6, r7, r8, r9, r10, r11)
            r0 = 36324174804820298(0x810ca50000214a, double:3.034892640055637E-306)
            boolean r0 = X.C18210wN.A1S(r0)
            if (r0 == 0) goto L_0x020b
            X.KGe r0 = X.AnonymousClass6JO.A00(r11)
            r0.A02 = r9
        L_0x01df:
            com.instagram.common.ui.widget.imageview.IgImageView.A0d = r5
            r0 = 36319261362295827(0x81082d00011413, double:3.0317853592183166E-306)
            boolean r0 = X.C63803iN.A0E(r2, r11, r0)
            if (r0 == 0) goto L_0x0bf1
            X.K2e r4 = X.C37744K2e.A01()
            if (r4 == 0) goto L_0x0bf1
            r0 = 35
            kotlin.jvm.internal.KtLambdaShape132S0100000_I2_112 r1 = new kotlin.jvm.internal.KtLambdaShape132S0100000_I2_112
            r1.<init>(r11, r0)
            java.lang.Class<X.9Yw> r0 = X.C158929Yw.class
            java.lang.Object r0 = r11.A01(r0, r1)
            com.instagram.common.uigraph.UiGraph r0 = (com.instagram.common.uigraph.UiGraph) r0
            X.KHh r3 = new X.KHh
            r3.<init>(r0)
            java.lang.Object r1 = r4.A0O
            monitor-enter(r1)
            goto L_0x0be5
        L_0x020b:
            X.KGd r0 = X.AnonymousClass6JN.A00(r11)
            r0.A02 = r9
            goto L_0x01df
        L_0x0212:
            X.6d1 r7 = new X.6d1
            r7.<init>(r0)
            r3 = 500(0x1f4, float:7.0E-43)
            r1 = 0
            r0 = 0
            X.6km r8 = new X.6km
            r8.<init>(r1, r3, r0, r0)
            goto L_0x01be
        L_0x0221:
            r1 = 18
            if (r2 != r1) goto L_0x0229
            com.instagram.realtime.requeststream.PulsarScheduler.onUserSessionStart(r3, r7, r5)
            return
        L_0x0229:
            r1 = 19
            if (r2 != r1) goto L_0x0255
            java.lang.Class<X.KJv> r2 = X.C38076KJv.class
            r1 = 0
            com.facebook.redex.IDxObjectShape122S0200000_5_I2 r0 = new com.facebook.redex.IDxObjectShape122S0200000_5_I2
            r0.<init>(r1, r3, r7)
            java.lang.Object r4 = r3.A01(r2, r0)
            X.KJv r4 = (X.C38076KJv) r4
            com.instagram.service.session.UserSession r3 = r4.A04
            X.0TJ r2 = X.AnonymousClass0TJ.A05
            r0 = 36312535445079136(0x81020f00190460, double:3.0275318620873865E-306)
            boolean r0 = X.C63803iN.A0E(r2, r3, r0)
            if (r0 == 0) goto L_0x0c22
            X.4rS r1 = r4.A01
            X.61S r0 = new X.61S
            r0.<init>(r4)
            r1.CwT(r0)
            return
        L_0x0255:
            r1 = 20
            if (r2 != r1) goto L_0x0284
            X.KJ7 r4 = X.AnonymousClass6LH.A00(r7, r3)
            X.C691847d.A02(r4)
            android.os.Handler r3 = r4.A07
            X.Kb4 r2 = r4.A08
            long r0 = r4.A01
            r3.postDelayed(r2, r0)
            android.content.Context r3 = r4.A06
            android.content.BroadcastReceiver r2 = r4.A05
            android.content.IntentFilter r1 = new android.content.IntentFilter
            r1.<init>()
            r0 = 194(0xc2, float:2.72E-43)
            java.lang.String r0 = X.I17.A00(r0)
            r1.addAction(r0)
            java.lang.String r0 = "package"
            r1.addDataScheme(r0)
            r3.registerReceiver(r2, r1)
            return
        L_0x0284:
            r1 = 21
            if (r2 != r1) goto L_0x02c0
            X.6uP r0 = X.AnonymousClass2FT.A00()
            r0.A02()
            X.0TJ r2 = X.AnonymousClass0TJ.A06
            r0 = 36325854137099550(0x810e2c0001251e, double:3.0359546565511644E-306)
            boolean r0 = X.C63803iN.A0E(r2, r3, r0)
            if (r0 == 0) goto L_0x0009
            X.Grx r1 = X.AnonymousClass3WK.A01(r3)
            java.lang.String r0 = X.C122037Js.A00()
            X.6pc r4 = new X.6pc
            r4.<init>(r1, r3, r0)
            r3 = 3
            r2 = 0
            X.E5N r1 = X.C18250wR.A0J(r2, r3)
            r0 = 909209444(0x36316f64, float:2.6439893E-6)
            X.4qz r1 = X.C84874u0.A00(r1, r0, r3)
            r0 = 33
            kotlin.coroutines.jvm.internal.KtSLambdaShape3S0101000_I2 r0 = X.C86164wN.A0o(r4, r2, r0)
            X.C25237DiI.A00(r2, r2, r0, r1, r3)
            return
        L_0x02c0:
            r1 = 22
            if (r2 != r1) goto L_0x02cc
            X.5vU r0 = X.AnonymousClass5vU.A00(r3)
            r0.A03()
            return
        L_0x02cc:
            r1 = 23
            if (r2 != r1) goto L_0x02e1
            X.5vV r2 = X.AnonymousClass5vV.A00(r3)
            X.0gW r1 = X.AnonymousClass0gN.A00()
            X.60z r0 = new X.60z
            r0.<init>(r2)
            r1.AKp(r0)
            return
        L_0x02e1:
            r1 = 24
            if (r2 != r1) goto L_0x02ec
            X.79a r1 = X.C1201579a.A00(r7, r3)
            r1.A00 = r0
            return
        L_0x02ec:
            r1 = 25
            if (r2 != r1) goto L_0x030c
            X.EA4 r3 = X.C100026Lr.A00(r3)
            X.KHq r2 = r3.A03
            java.lang.Class<X.7rH> r1 = X.C131017rH.class
            X.4pY r0 = r3.A06
            r2.A01(r0, r1)
            java.lang.Class<X.7rG> r1 = X.C131007rG.class
            X.4pY r0 = r3.A05
            r2.A01(r0, r1)
            java.lang.Class<X.7rF> r1 = X.C130997rF.class
            X.4pY r0 = r3.A04
        L_0x0308:
            r2.A01(r0, r1)
            return
        L_0x030c:
            r1 = 26
            if (r2 != r1) goto L_0x0318
            X.1z7 r0 = X.C35702Om.A00(r3)
            r0.A09()
            return
        L_0x0318:
            r1 = 27
            if (r2 != r1) goto L_0x0402
            java.lang.Class<X.77T> r0 = X.AnonymousClass77T.class
            java.lang.Object r5 = r3.A00(r0)
            X.77T r5 = (X.AnonymousClass77T) r5
            if (r5 != 0) goto L_0x032b
            X.77T r5 = new X.77T
            r5.<init>(r3)
        L_0x032b:
            X.0Ok r6 = X.C06810aP.A01
            com.instagram.service.session.UserSession r4 = r5.A00
            com.instagram.user.model.User r0 = r6.A01(r4)
            boolean r0 = r0.A3a()
            if (r0 == 0) goto L_0x0009
            java.util.ArrayList r1 = X.AnonymousClass0wJ.A0v()
            com.instagram.api.schemas.UserMonetizationProductType r0 = com.instagram.api.schemas.UserMonetizationProductType.BRANDED_CONTENT
            java.lang.String r0 = r0.A00
            r1.add(r0)
            com.instagram.api.schemas.UserMonetizationProductType r0 = com.instagram.api.schemas.UserMonetizationProductType.USER_PAY
            java.lang.String r0 = r0.A00
            r1.add(r0)
            java.util.List r1 = X.AnonymousClass00J.A0N(r1)
            X.4kD r0 = X.C79524kD.A00
            X.H8c r0 = X.AnonymousClass77T.A00(r5, r1, r0)
            X.C31155GhB.A03(r0)
            java.util.ArrayList r3 = X.AnonymousClass0wJ.A0v()
            X.0TJ r2 = X.AnonymousClass0TJ.A05
            r0 = 36314386574477201(0x8103be00020791, double:3.0287025237726226E-306)
            boolean r0 = X.C63803iN.A0E(r2, r4, r0)
            if (r0 == 0) goto L_0x0370
            com.instagram.api.schemas.UserMonetizationProductType r0 = com.instagram.api.schemas.UserMonetizationProductType.INCENTIVE_PLATFORM
            java.lang.String r0 = r0.A00
            r3.add(r0)
        L_0x0370:
            r0 = 36314837546109116(0x810427000308bc, double:3.0289877200485626E-306)
            boolean r0 = X.C63803iN.A0E(r2, r4, r0)
            if (r0 == 0) goto L_0x0382
            com.instagram.api.schemas.UserMonetizationProductType r0 = com.instagram.api.schemas.UserMonetizationProductType.FAN_CLUB_CREATOR
            java.lang.String r0 = r0.A00
            r3.add(r0)
        L_0x0382:
            r0 = 36322108925680827(0x810ac400021cbb, double:3.033586169769208E-306)
            boolean r0 = X.C25771Drk.A05(r4, r0)
            if (r0 != 0) goto L_0x03ff
            r0 = 36322108925811901(0x810ac400041cbd, double:3.0335861698521E-306)
            boolean r0 = X.C25771Drk.A05(r4, r0)
            if (r0 != 0) goto L_0x03ff
            r0 = 36322108925549753(0x810ac400001cb9, double:3.0335861696863163E-306)
            boolean r0 = X.C25771Drk.A05(r4, r0)
            if (r0 != 0) goto L_0x03ff
            r0 = 36314901970421972(0x810436000008d4, double:3.0290284622434286E-306)
            boolean r0 = X.C25771Drk.A05(r4, r0)
            if (r0 == 0) goto L_0x03b5
            com.instagram.api.schemas.UserMonetizationProductType r0 = com.instagram.api.schemas.UserMonetizationProductType.BRANDED_CONTENT_DEAL_CREATOR
        L_0x03b0:
            java.lang.String r0 = r0.A00
            r3.add(r0)
        L_0x03b5:
            com.instagram.user.model.User r0 = r6.A01(r4)
            boolean r0 = r0.A3Z()
            if (r0 == 0) goto L_0x03d1
            r0 = 36312157486318435(0x8101b700000363, double:3.0272928394452014E-306)
            boolean r0 = X.C63803iN.A0E(r2, r4, r0)
            if (r0 == 0) goto L_0x03d1
            com.instagram.api.schemas.UserMonetizationProductType r0 = com.instagram.api.schemas.UserMonetizationProductType.REVSHARE
            java.lang.String r0 = r0.A00
            r3.add(r0)
        L_0x03d1:
            X.6uP r0 = X.AnonymousClass2FT.A00()
            r0.A02()
            X.0TJ r2 = X.AnonymousClass0TJ.A06
            r0 = 36321434615946008(0x810a2700041b18, double:3.033159733577681E-306)
            boolean r0 = X.C63803iN.A0E(r2, r4, r0)
            if (r0 == 0) goto L_0x03ec
            com.instagram.api.schemas.UserMonetizationProductType r0 = com.instagram.api.schemas.UserMonetizationProductType.CONTENT_APPRECIATION
            java.lang.String r0 = r0.A00
            r3.add(r0)
        L_0x03ec:
            X.4kE r6 = X.C79534kE.A00
            X.H8c r2 = com.instagram.monetization.api.MonetizationApi.A00(r4, r3)
            r0 = 10
            com.instagram.common.api.base.IDxACallbackShape36S0200000_2_I2 r1 = new com.instagram.common.api.base.IDxACallbackShape36S0200000_2_I2
            r1.<init>(r0, r6, r5)
        L_0x03f9:
            r2.A00 = r1
            X.C31155GhB.A03(r2)
            return
        L_0x03ff:
            com.instagram.api.schemas.UserMonetizationProductType r0 = com.instagram.api.schemas.UserMonetizationProductType.BRANDED_CONTENT_DEAL_BRAND
            goto L_0x03b0
        L_0x0402:
            r1 = 28
            if (r2 != r1) goto L_0x0431
            java.lang.Class<X.7Cz> r1 = X.C120887Cz.class
            java.lang.Object r0 = r3.A00(r1)
            if (r0 != 0) goto L_0x0419
            X.7Cz r0 = new X.7Cz
            r0.<init>(r3)
            r3.A04(r1, r0)
            r0 = 0
            X.C120887Cz.A00 = r0
        L_0x0419:
            android.content.SharedPreferences r0 = X.C120887Cz.A00
            if (r0 != 0) goto L_0x0009
            com.instagram.service.session.UserSession r0 = X.C120887Cz.A01
            if (r0 == 0) goto L_0x0009
            X.49q r1 = X.AnonymousClass3Zs.A03(r0)
            X.D2R r0 = X.D2R.A1P
            android.content.SharedPreferences r0 = r1.A01(r0)
            X.C120887Cz.A00 = r0
            X.C120887Cz.A01()
            return
        L_0x0431:
            r1 = 29
            if (r2 != r1) goto L_0x0462
            X.49j r3 = X.C696349j.A03(r3)
            X.C696349j.A08(r3)
            boolean r0 = X.C696349j.A0D(r3)
            if (r0 == 0) goto L_0x0446
            r0 = 2
            X.C696349j.A09(r3, r0)
        L_0x0446:
            X.C696349j.A05(r3)
            X.L5D r2 = r3.A0D
            if (r2 == 0) goto L_0x0458
            com.instagram.service.session.UserSession r0 = r3.A02
            X.KHq r1 = X.AnonymousClass3LY.A00(r0)
            java.lang.Class<X.46R> r0 = X.AnonymousClass46R.class
            r1.A01(r2, r0)
        L_0x0458:
            boolean r0 = X.C696349j.A0C(r3)
            if (r0 == 0) goto L_0x0009
            r3.A0J()
            return
        L_0x0462:
            r1 = 30
            if (r2 != r1) goto L_0x048f
            r0 = 2
            kotlin.jvm.internal.KtLambdaShape94S0100000_I2_74 r1 = new kotlin.jvm.internal.KtLambdaShape94S0100000_I2_74
            r1.<init>(r3, r0)
            java.lang.Class<X.6l6> r0 = X.C110086l6.class
            java.lang.Object r4 = r3.A01(r0, r1)
            X.6l6 r4 = (X.C110086l6) r4
            boolean r0 = r4.A02
            if (r0 == 0) goto L_0x0009
            X.01V r3 = r4.A00
            r2 = 6096(0x17d0, float:8.542E-42)
            r3.A0V(r2)
            r1 = 7614(0x1dbe, float:1.067E-41)
            r3.A0V(r1)
            boolean r0 = r4.A01
            if (r0 == 0) goto L_0x0009
            r3.A0W(r2)
            r3.A0W(r1)
            return
        L_0x048f:
            r1 = 31
            if (r2 != r1) goto L_0x04c1
            java.lang.Class<X.6mo> r2 = X.C111116mo.class
            r1 = 6
            java.lang.Object r6 = X.C86144wL.A0i(r3, r2, r7, r1)
            X.6mo r6 = (X.C111116mo) r6
            X.6pf r3 = r6.A04
            com.instagram.service.session.UserSession r2 = r6.A07
            X.42L r1 = new X.42L
            r1.<init>(r2)
            r3.A00(r1)
            X.DcK r1 = X.C24926DcK.A00
            if (r1 == 0) goto L_0x04bc
            java.lang.Class<X.42M> r4 = X.AnonymousClass42M.class
            X.4UX r1 = X.AnonymousClass4UX.A00
            java.lang.Object r1 = r2.A01(r4, r1)
            X.42M r1 = (X.AnonymousClass42M) r1
            X.C04220Ms.A06(r1)
            r3.A00(r1)
        L_0x04bc:
            java.lang.Class<X.H1h> r4 = X.H1h.class
            monitor-enter(r4)
            goto L_0x0c26
        L_0x04c1:
            r1 = 32
            if (r2 != r1) goto L_0x04e0
            r0 = 723(0x2d3, float:1.013E-42)
            java.lang.String r1 = X.C18170wI.A00(r0)
            java.lang.String r0 = "onUserSessionStart start"
            X.AnonymousClass0LU.A0C(r1, r0)
            java.lang.Class<X.1lP> r1 = X.AnonymousClass1lP.class
            java.lang.Object r0 = r3.A00(r1)
            if (r0 == 0) goto L_0x07f9
            java.lang.String r1 = "RageShakeSensorHelper2_duplicateAccountSwitch"
            java.lang.String r0 = "Should only call initInstance once per session"
            X.C10450iM.A03(r1, r0)
            return
        L_0x04e0:
            r1 = 33
            if (r2 != r1) goto L_0x0528
            java.lang.Class<X.7tL> r1 = X.C132107tL.class
            r0 = 7
            java.lang.Object r4 = X.C86134wK.A0f(r3, r1, r0)
            X.7tL r4 = (X.C132107tL) r4
            com.instagram.service.session.UserSession r3 = r4.A00
            java.lang.Class<X.E4m> r2 = X.C26222E4m.class
            java.lang.Object r0 = r3.A00(r2)
            if (r0 == 0) goto L_0x0506
            java.lang.String r0 = "ARPlatformLogger object already exist"
            java.lang.IllegalArgumentException r1 = X.C18190wL.A0a(r0)
            r0 = 585(0x249, float:8.2E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            X.C10450iM.A07(r0, r1)
        L_0x0506:
            X.E4m r0 = new X.E4m
            r0.<init>(r3)
            r3.A04(r2, r0)
            X.0TJ r2 = X.AnonymousClass0TJ.A05
            r0 = 36321503335160705(0x810a3700001b81, double:3.0332031918857656E-306)
            boolean r0 = X.C63803iN.A0E(r2, r3, r0)
            if (r0 == 0) goto L_0x0d14
            X.611 r1 = new X.611
            r1.<init>(r4)
            X.0gW r0 = X.AnonymousClass0gN.A00()
            r0.AKp(r1)
            return
        L_0x0528:
            r1 = 34
            if (r2 != r1) goto L_0x0530
            X.C34622Kg.A00(r7, r3)
            return
        L_0x0530:
            r1 = 35
            if (r2 != r1) goto L_0x054b
            r0 = 21
            kotlin.jvm.internal.KtLambdaShape22S0200000_I2_6 r1 = new kotlin.jvm.internal.KtLambdaShape22S0200000_I2_6
            r1.<init>(r0, r7, r3)
            java.lang.Class<X.7s4> r0 = X.C131477s4.class
            java.lang.Object r2 = r3.A01(r0, r1)
            X.7s4 r2 = (X.C131477s4) r2
            X.KHq r1 = r2.A01
            java.lang.Class<X.7rg> r0 = X.C131267rg.class
            r1.A01(r2, r0)
            return
        L_0x054b:
            r1 = 36
            if (r2 != r1) goto L_0x056d
            X.0TJ r2 = X.AnonymousClass0TJ.A05
            r0 = 36325897086707002(0x810e360000253a, double:3.035981818055861E-306)
            boolean r0 = X.C63803iN.A0E(r2, r3, r0)
            if (r0 == 0) goto L_0x0009
            X.7rx r0 = new X.7rx
            r0.<init>(r3)
            X.AnonymousClass6YY.A00 = r0
            X.KHq r2 = X.AnonymousClass3LY.A00(r3)
            java.lang.Class<X.7rX> r1 = X.C131177rX.class
            X.4pY r0 = X.AnonymousClass6YY.A00
            goto L_0x0308
        L_0x056d:
            r1 = 37
            if (r2 != r1) goto L_0x0586
            com.instagram.pendingmedia.store.PendingMediaStoreSerializer r1 = com.instagram.pendingmedia.store.PendingMediaStoreSerializer.A00(r3)
            r0 = 0
            r1.A05(r0)
            com.instagram.pendingmedia.store.PendingMediaStoreSerializer r1 = com.instagram.pendingmedia.store.PendingMediaStoreSerializer.A00(r3)
            X.81r r0 = new X.81r
            r0.<init>(r7, r3)
        L_0x0582:
            r1.A04(r0)
            return
        L_0x0586:
            r1 = 38
            if (r2 != r1) goto L_0x058e
            X.EA2.A00(r7, r3)
            return
        L_0x058e:
            r4 = 39
            if (r2 != r4) goto L_0x05a3
            kotlin.jvm.internal.KtLambdaShape60S0100000_I2_40 r1 = new kotlin.jvm.internal.KtLambdaShape60S0100000_I2_40
            r1.<init>(r3, r4)
            java.lang.Class<X.3aV> r0 = X.C62673aV.class
            java.lang.Object r0 = r3.A01(r0, r1)
            X.3aV r0 = (X.C62673aV) r0
            r0.onUserSessionStart()
            return
        L_0x05a3:
            r1 = 40
            if (r2 != r1) goto L_0x05b8
            java.lang.Class<X.0j1> r2 = X.C10830j1.class
            com.facebook.redex.IDxObjectShape118S0200000_I2 r1 = new com.facebook.redex.IDxObjectShape118S0200000_I2
            r1.<init>(r0, r7, r3)
            java.lang.Object r0 = r3.A01(r2, r1)
            X.0j1 r0 = (X.C10830j1) r0
            X.C10830j1.A01(r0)
            return
        L_0x05b8:
            r1 = 41
            if (r2 != r1) goto L_0x05c0
            com.instagram.debug.image.sessionhelper.ImageDebugSessionHelper.updateModules(r3)
            return
        L_0x05c0:
            r1 = 42
            if (r2 != r1) goto L_0x05cf
            java.lang.Class<X.4tv> r2 = X.C84824tv.class
            r0 = 22
            kotlin.jvm.internal.KtLambdaShape63S0100000_I2_43 r1 = new kotlin.jvm.internal.KtLambdaShape63S0100000_I2_43
            r1.<init>(r3, r0)
            goto L_0x0124
        L_0x05cf:
            r1 = 43
            if (r2 != r1) goto L_0x05e6
            r4 = 0
            r1 = 37
            kotlin.jvm.internal.KtLambdaShape70S0100000_I2_50 r2 = new kotlin.jvm.internal.KtLambdaShape70S0100000_I2_50
            r2.<init>(r3, r1)
            java.lang.Class<X.37w> r1 = X.C566137w.class
            java.lang.Object r2 = r3.A01(r1, r2)
            X.37w r2 = (X.C566137w) r2
            monitor-enter(r2)
            goto L_0x09a0
        L_0x05e6:
            r1 = 44
            if (r2 != r1) goto L_0x05ef
            X.6S5 r8 = X.AnonymousClass75L.A01
            monitor-enter(r8)
            goto L_0x0d4f
        L_0x05ef:
            r1 = 45
            if (r2 != r1) goto L_0x060f
            java.lang.Class<X.7rB> r2 = X.C130957rB.class
            r1 = 18
            com.facebook.redex.IDxObjectShape236S0100000_1_I2 r0 = new com.facebook.redex.IDxObjectShape236S0100000_1_I2
            r0.<init>(r3, r1)
            java.lang.Object r1 = r3.A01(r2, r0)
            X.7rB r1 = (X.C130957rB) r1
            X.6lm r0 = r1.A00
            boolean r0 = r0.A03
            if (r0 != 0) goto L_0x060a
            X.L34 r1 = X.L34.A00
        L_0x060a:
            X.C37744K2e.A0m = r1
            com.instagram.common.ui.widget.imageview.IgImageView.A0a = r1
            return
        L_0x060f:
            r1 = 46
            if (r2 != r1) goto L_0x0625
            java.lang.Class<X.7tO> r2 = X.C132137tO.class
            r1 = 19
            com.facebook.redex.IDxObjectShape236S0100000_1_I2 r0 = new com.facebook.redex.IDxObjectShape236S0100000_1_I2
            r0.<init>(r3, r1)
            java.lang.Object r0 = r3.A01(r2, r0)
            X.7tO r0 = (X.C132137tO) r0
            X.C132137tO.A04 = r0
            return
        L_0x0625:
            r1 = 47
            if (r2 != r1) goto L_0x0631
            X.GWm r0 = new X.GWm
            r0.<init>(r3)
            X.AnonymousClass6DE.A00 = r0
            return
        L_0x0631:
            r1 = 48
            if (r2 != r1) goto L_0x065c
            X.0TJ r2 = X.AnonymousClass0TJ.A05
            r0 = 36325081042920347(0x810d780000239b, double:3.035465748679236E-306)
            boolean r0 = X.C63803iN.A0E(r2, r3, r0)
            if (r0 == 0) goto L_0x0009
            java.lang.Class<X.KJ5> r2 = X.KJ5.class
            r1 = 16
            kotlin.jvm.internal.KtLambdaShape28S0200000_I2_12 r0 = new kotlin.jvm.internal.KtLambdaShape28S0200000_I2_12
            r0.<init>((int) r1, (java.lang.Object) r7, (java.lang.Object) r3)
            java.lang.Object r2 = r3.A01(r2, r0)
            X.KJ5 r2 = (X.KJ5) r2
            X.0gL r1 = r2.A06
            X.Kg3 r0 = new X.Kg3
            r0.<init>(r2, r5)
            r1.execute(r0)
            return
        L_0x065c:
            r1 = 49
            if (r2 != r1) goto L_0x06b8
            X.0TJ r6 = X.AnonymousClass0TJ.A05
            r1 = 36322147580255432(0x810acd00001cc8, double:3.033610615077838E-306)
            boolean r0 = X.C63803iN.A0E(r6, r3, r1)
            if (r0 == 0) goto L_0x0009
            r0 = 35
            kotlin.jvm.internal.KtLambdaShape75S0100000_I2_55 r4 = new kotlin.jvm.internal.KtLambdaShape75S0100000_I2_55
            r4.<init>(r3, r0)
            java.lang.Class<X.48o> r0 = X.C694448o.class
            java.lang.Object r5 = r3.A01(r0, r4)
            X.48o r5 = (X.C694448o) r5
            android.content.Context r4 = X.C10600ic.A00
            X.C04220Ms.A06(r4)
            com.instagram.service.session.UserSession r3 = r5.A01
            boolean r0 = X.C63803iN.A0E(r6, r3, r1)
            if (r0 == 0) goto L_0x0009
            java.util.ArrayList r0 = X.AnonymousClass0wJ.A0v()
            r5.A00 = r0
            boolean r0 = X.C63803iN.A0E(r6, r3, r1)
            if (r0 == 0) goto L_0x0009
            com.instagram.fx.access.constants.FxcalAccountType r2 = com.instagram.fx.access.constants.FxcalAccountType.INSTAGRAM
            X.3Vp r0 = X.C61793Vp.A00(r3)
            java.lang.String r1 = r0.A04
            java.lang.String r0 = r3.getUserId()
            X.3TD r0 = X.C63883iV.A0G(r2, r1, r0)
            java.util.List r1 = X.C18180wK.A0n(r0)
            java.lang.String r0 = "login"
            X.H8c r2 = X.C63883iV.A00(r4, r3, r0, r1)
            r0 = 54
            com.instagram.common.api.base.IDxACallbackShape111S0100000_1_I2 r1 = new com.instagram.common.api.base.IDxACallbackShape111S0100000_1_I2
            r1.<init>((java.lang.Object) r5, (int) r0)
            goto L_0x03f9
        L_0x06b8:
            r1 = 50
            if (r2 != r1) goto L_0x06dc
            r0 = 14
            kotlin.jvm.internal.KtLambdaShape78S0100000_I2_58 r1 = new kotlin.jvm.internal.KtLambdaShape78S0100000_I2_58
            r1.<init>(r3, r0)
            java.lang.Class<com.instagram.igsignalsproducts.clips.tab.IgSignalsClipsOpenTabTracker> r0 = com.instagram.igsignalsproducts.clips.tab.IgSignalsClipsOpenTabTracker.class
            java.lang.Object r4 = r3.A01(r0, r1)
            com.instagram.igsignalsproducts.clips.tab.IgSignalsClipsOpenTabTracker r4 = (com.instagram.igsignalsproducts.clips.tab.IgSignalsClipsOpenTabTracker) r4
            if (r34 == 0) goto L_0x0009
            X.4qz r3 = r4.A0C
            r2 = 0
            r0 = 16
            kotlin.coroutines.jvm.internal.KtSLambdaShape11S0101000_I2_8 r1 = new kotlin.coroutines.jvm.internal.KtSLambdaShape11S0101000_I2_8
            r1.<init>((java.lang.Object) r4, (X.C146958n9) r2, (int) r0)
            r0 = 3
            X.C25237DiI.A00(r2, r2, r1, r3, r0)
            return
        L_0x06dc:
            r1 = 51
            if (r2 != r1) goto L_0x071a
            r0 = 8
            kotlin.jvm.internal.KtLambdaShape81S0100000_I2_61 r1 = new kotlin.jvm.internal.KtLambdaShape81S0100000_I2_61
            r1.<init>(r3, r0)
            java.lang.Class<X.7tE> r0 = X.C132047tE.class
            java.lang.Object r5 = r3.A01(r0, r1)
            X.7tE r5 = (X.C132047tE) r5
            X.0ZU r0 = r5.A03
            r0.invoke()
            com.instagram.service.session.UserSession r3 = r5.A01
            X.0TJ r2 = X.AnonymousClass0TJ.A05
            r0 = 36316336489499724(0x81058400000c4c, double:3.0299356578845437E-306)
            boolean r0 = X.C63803iN.A0E(r2, r3, r0)
            if (r0 == 0) goto L_0x0dab
            X.E7m r4 = r5.A00
            if (r4 != 0) goto L_0x0716
            X.0ZU r0 = r5.A02
            java.lang.Object r0 = r0.invoke()
            X.DVU r0 = (X.DVU) r0
            X.E7m r4 = new X.E7m
            r4.<init>(r0)
            r5.A00 = r4
        L_0x0716:
            X.C691847d.A02(r4)
            return
        L_0x071a:
            r1 = 52
            if (r2 != r1) goto L_0x072b
            java.lang.Class<X.KKI> r1 = X.KKI.class
            r0 = 8
            java.lang.Object r0 = X.C86144wL.A0i(r3, r1, r7, r0)
            X.KKI r0 = (X.KKI) r0
            X.0iG r4 = r0.A01
            goto L_0x0716
        L_0x072b:
            r1 = 53
            if (r2 != r1) goto L_0x0757
            X.0TJ r2 = X.AnonymousClass0TJ.A05
            r0 = 36323337286262550(0x810be200011f16, double:3.034362989947301E-306)
            boolean r0 = X.C63803iN.A0E(r2, r3, r0)
            if (r0 != 0) goto L_0x0747
            r0 = 36323337286393624(0x810be200031f18, double:3.0343629900301924E-306)
            boolean r0 = X.C63803iN.A0E(r2, r3, r0)
            if (r0 == 0) goto L_0x0009
        L_0x0747:
            java.lang.Class<X.47j> r2 = X.C692247j.class
            r1 = 47
            kotlin.jvm.internal.KtLambdaShape31S0200000_I2_15 r0 = new kotlin.jvm.internal.KtLambdaShape31S0200000_I2_15
            r0.<init>(r1, r7, r3)
            java.lang.Object r4 = r3.A01(r2, r0)
            X.47j r4 = (X.C692247j) r4
            goto L_0x0716
        L_0x0757:
            r1 = 54
            if (r2 != r1) goto L_0x0766
            com.instagram.pendingmedia.store.PendingMediaStoreSerializer r1 = com.instagram.pendingmedia.store.PendingMediaStoreSerializer.A00(r3)
            X.81q r0 = new X.81q
            r0.<init>(r3, r7)
            goto L_0x0582
        L_0x0766:
            r1 = 55
            if (r2 != r1) goto L_0x07ae
            kotlin.jvm.internal.KtLambdaShape94S0100000_I2_74 r1 = new kotlin.jvm.internal.KtLambdaShape94S0100000_I2_74
            r1.<init>(r3, r0)
            java.lang.Class<X.6eu> r0 = X.C106356eu.class
            java.lang.Object r0 = r3.A01(r0, r1)
            X.6eu r0 = (X.C106356eu) r0
            com.instagram.service.session.UserSession r4 = r0.A00
            X.0TJ r2 = X.AnonymousClass0TJ.A05
            r0 = 36327907131533532(0x81100a000228dc, double:3.0372529784979597E-306)
            boolean r0 = X.C63803iN.A0E(r2, r4, r0)
            if (r0 == 0) goto L_0x0009
            r0 = 36327907131402458(0x81100a000028da, double:3.037252978415068E-306)
            boolean r0 = X.C63803iN.A0E(r2, r4, r0)
            if (r0 == 0) goto L_0x07ab
            X.0il r3 = X.C10690il.A06
        L_0x0793:
            X.01V r1 = X.AnonymousClass01V.A0p
            X.0IE r2 = r1.A0A
            if (r2 == 0) goto L_0x0009
            X.0op r0 = new X.0op
            r0.<init>(r1, r3, r4)
            X.0X0 r1 = new X.0X0
            r1.<init>(r0)
            X.0jG r0 = new X.0jG
            r0.<init>(r1, r2)
            r2.A00 = r0
            return
        L_0x07ab:
            X.0il r3 = X.C10690il.A03
            goto L_0x0793
        L_0x07ae:
            r1 = 56
            if (r2 != r1) goto L_0x07e9
            java.lang.Class<X.7sS> r1 = X.C131597sS.class
            r0 = 9
            java.lang.Object r4 = X.C86144wL.A0i(r3, r1, r7, r0)
            X.7sS r4 = (X.C131597sS) r4
            X.0TJ r2 = X.AnonymousClass0TJ.A05
            r0 = 18299610107741969(0x41036600000711, double:1.892789688802348E-307)
            boolean r0 = X.C63173fJ.A05(r2, r0)
            android.content.Context r3 = r4.A01
            com.instagram.service.session.UserSession r2 = r4.A00
            X.KOu r1 = new X.KOu
            if (r0 == 0) goto L_0x07e3
            r1.<init>(r3, r2)
            java.util.List r0 = r4.A03
        L_0x07d4:
            r0.add(r1)
            X.KOt r1 = new X.KOt
            r1.<init>(r3, r2)
            java.util.List r0 = r4.A02
            r0.add(r1)
            goto L_0x0716
        L_0x07e3:
            r1.<init>(r3, r2)
            java.util.List r0 = r4.A02
            goto L_0x07d4
        L_0x07e9:
            r1 = 57
            if (r2 != r1) goto L_0x082a
            java.lang.Class<X.7sR> r1 = X.C131587sR.class
            r0 = 10
            java.lang.Object r4 = X.C86144wL.A0i(r3, r1, r7, r0)
            X.7sR r4 = (X.C131587sR) r4
            goto L_0x0716
        L_0x07f9:
            r2 = 1099978687(0x419057bf, float:18.042845)
            X.1lP r4 = new X.1lP
            r4.<init>(r7, r3)
            r3.A04(r1, r4)
            boolean r0 = X.C34442Jo.A00()
            java.lang.Boolean r1 = X.C18240wQ.A0X(r0)
            java.lang.Float r0 = java.lang.Float.valueOf(r2)
            java.lang.Object[] r2 = new java.lang.Object[]{r1, r0}
            r0 = 724(0x2d4, float:1.015E-42)
            java.lang.String r1 = X.C18170wI.A00(r0)
            java.lang.String r0 = "initInstance Initialized | rageShakeEnabled=%b | shakeForceThreshold=%f"
            X.AnonymousClass0LU.A0O(r1, r0, r2)
            X.KHq r2 = r4.A04
            java.lang.Class<X.45n> r1 = X.C688045n.class
            X.4pY r0 = r4.A05
            r2.A01(r0, r1)
            goto L_0x0918
        L_0x082a:
            r1 = 58
            if (r2 != r1) goto L_0x0846
            java.lang.Class<X.KJC> r2 = X.KJC.class
            r1 = 11
            java.lang.Object r6 = X.C86144wL.A0i(r3, r2, r7, r1)
            X.KJC r6 = (X.KJC) r6
            X.C691847d.A02(r6)
            if (r34 == 0) goto L_0x0b71
            boolean r1 = X.KJ8.A02()
            if (r1 != 0) goto L_0x0b71
            r6.A07 = r0
            return
        L_0x0846:
            r1 = 59
            if (r2 != r1) goto L_0x0855
            java.lang.Class<X.H81> r2 = X.H81.class
            r1 = 12
            java.lang.Object r7 = X.C86144wL.A0i(r3, r2, r7, r1)
            monitor-enter(r7)
            goto L_0x0daf
        L_0x0855:
            r1 = 60
            if (r2 != r1) goto L_0x085d
            com.instagram.realtimeclient.fleetbeacon.FleetBeaconSubscribeExecutorTrigger.onUserSessionStart(r3, r7, r5)
            return
        L_0x085d:
            r1 = 61
            if (r2 != r1) goto L_0x08b4
            X.AW8 r0 = X.AnonymousClass7G0.A00(r3)
            com.instagram.service.session.UserSession r4 = r0.A01
            X.0TJ r2 = X.AnonymousClass0TJ.A05
            r0 = 36327237116503983(0x810f6e000027af, double:3.036829258295339E-306)
            boolean r0 = X.C63803iN.A0E(r2, r4, r0)
            if (r0 == 0) goto L_0x0009
            java.lang.Class<X.7tD> r2 = X.C132037tD.class
            r1 = 18
            kotlin.jvm.internal.KtLambdaShape97S0100000_I2_77 r0 = new kotlin.jvm.internal.KtLambdaShape97S0100000_I2_77
            r0.<init>(r3, r1)
            java.lang.Object r4 = r3.A01(r2, r0)
            X.7tD r4 = (X.C132037tD) r4
            com.instagram.service.session.UserSession r0 = r4.A01
            com.instagram.realtimeclient.requeststream.IGRealtimeGraphQLObserverHolder r3 = com.instagram.realtimeclient.requeststream.IGRealtimeGraphQLObserverHolder.getInstanceDistillery(r0)
            X.C04220Ms.A06(r3)
            java.lang.String r2 = "story_tray_event"
            java.lang.String r0 = "18220052389172762"
            com.instagram.realtimeclient.requeststream.IGGraphQLSubscriptionRequestStringStub r1 = new com.instagram.realtimeclient.requeststream.IGGraphQLSubscriptionRequestStringStub
            r1.<init>(r2, r0)
            java.lang.Class<X.71X> r0 = X.AnonymousClass71X.class
            com.instagram.realtimeclient.requeststream.GraphQLSubscriptionRequestStub r2 = new com.instagram.realtimeclient.requeststream.GraphQLSubscriptionRequestStub
            r2.<init>(r1, r0)
            java.lang.String r1 = r4.A02
            if (r1 == 0) goto L_0x08a5
            java.lang.String r0 = "user_id"
            r2.addQueryParameter(r0, r1)
        L_0x08a5:
            r0 = 10
            com.facebook.redex.IDxFCallbackShape314S0100000_2_I2 r1 = new com.facebook.redex.IDxFCallbackShape314S0100000_2_I2
            r1.<init>(r4, r0)
            r0 = 0
            X.8gb r0 = r3.subscribe(r2, r1, r0)
            r4.A00 = r0
            return
        L_0x08b4:
            r1 = 62
            if (r2 != r1) goto L_0x08d9
            X.7uN r2 = new X.7uN
            r2.<init>()
            X.0TJ r4 = X.AnonymousClass0TJ.A05
            r5 = 36316345079434318(0x81058600000c4e, double:3.02994109019377E-306)
            boolean r1 = X.C63803iN.A0E(r4, r3, r5)
            r2.A01 = r1
            java.lang.Class<X.6iG> r5 = X.C108376iG.class
            X.86G r1 = X.AnonymousClass86G.A00
            java.lang.Object r7 = r3.A01(r5, r1)
            X.6iG r7 = (X.C108376iG) r7
            X.20T r6 = X.AnonymousClass20T.CRASH_INLINE_SCHEDULE_ON_MAIN
            monitor-enter(r7)
            goto L_0x0e7b
        L_0x08d9:
            r0 = 63
            if (r2 != r0) goto L_0x08f6
            r0 = 3
            kotlin.jvm.internal.KtLambdaShape100S0100000_I2_80 r1 = new kotlin.jvm.internal.KtLambdaShape100S0100000_I2_80
            r1.<init>(r3, r0)
            java.lang.Class<X.H85> r0 = X.H85.class
            java.lang.Object r2 = r3.A01(r0, r1)
            X.H85 r2 = (X.H85) r2
            r1 = 26
            kotlin.jvm.internal.KtLambdaShape4S0110000_I2 r0 = new kotlin.jvm.internal.KtLambdaShape4S0110000_I2
            r0.<init>(r1, r2, r5)
            X.H85.A00(r2, r0)
            return
        L_0x08f6:
            r0 = 64
            if (r2 != r0) goto L_0x091e
            r0 = 16
            kotlin.jvm.internal.KtLambdaShape100S0100000_I2_80 r1 = new kotlin.jvm.internal.KtLambdaShape100S0100000_I2_80
            r1.<init>(r3, r0)
            java.lang.Class<X.H5P> r0 = X.H5P.class
            java.lang.Object r4 = r3.A01(r0, r1)
            X.H5P r4 = (X.H5P) r4
            com.instagram.service.session.UserSession r3 = r4.A00
            X.0TJ r2 = X.AnonymousClass0TJ.A05
            r0 = 36318170440601772(0x81072f000110ac, double:3.031095455946207E-306)
            boolean r0 = X.C63803iN.A0E(r2, r3, r0)
            if (r0 == 0) goto L_0x0009
        L_0x0918:
            X.0iH r0 = X.C10410iI.A00
            r0.A00(r4)
            return
        L_0x091e:
            r0 = 65
            if (r2 != r0) goto L_0x093a
            X.0TJ r2 = X.AnonymousClass0TJ.A05
            r0 = 36322929264369188(0x810b8300011e24, double:3.034104955258966E-306)
            boolean r0 = X.C63803iN.A0E(r2, r3, r0)
            if (r0 == 0) goto L_0x0009
            r0 = 8
            kotlin.jvm.internal.KtLambdaShape132S0100000_I2_112 r1 = new kotlin.jvm.internal.KtLambdaShape132S0100000_I2_112
            r1.<init>(r3, r0)
            java.lang.Class<X.KW1> r0 = X.KW1.class
            goto L_0x00d2
        L_0x093a:
            r0 = 66
            if (r2 != r0) goto L_0x0eeb
            java.lang.Class<X.Jc6> r2 = X.C36642Jc6.class
            r0 = 24
            com.facebook.redex.IDxObjectShape241S0100000_6_I2 r1 = new com.facebook.redex.IDxObjectShape241S0100000_6_I2
            r1.<init>(r3, r0)
            goto L_0x0124
        L_0x0949:
            java.lang.Object r1 = r3.A00(r6)     // Catch:{ all -> 0x0da8 }
            com.instagram.roomdb.IgRoomDatabase r1 = (com.instagram.roomdb.IgRoomDatabase) r1     // Catch:{ all -> 0x0da8 }
            if (r1 != 0) goto L_0x096a
            X.LuB r4 = X.C120627Bu.A00(r8, r3, r6)     // Catch:{ all -> 0x0da8 }
            r2 = 1702658258(0x657c80d2, float:7.452579E22)
            r1 = 1401021912(0x5381e5d8, float:1.11581384E12)
            X.AnonymousClass6UW.A00(r4, r2, r1, r0)     // Catch:{ all -> 0x0da8 }
            r8.A00(r4)     // Catch:{ all -> 0x0da8 }
            X.M6w r1 = r4.A00()     // Catch:{ all -> 0x0da8 }
            com.instagram.roomdb.IgRoomDatabase r1 = (com.instagram.roomdb.IgRoomDatabase) r1     // Catch:{ all -> 0x0da8 }
            r3.A04(r6, r1)     // Catch:{ all -> 0x0da8 }
        L_0x096a:
            monitor-exit(r8)
        L_0x096b:
            com.instagram.creation.persistence.CreationDatabase r1 = (com.instagram.creation.persistence.CreationDatabase) r1
            X.Dkf r2 = r1.A01()
            X.DZK r0 = com.instagram.creation.capture.quickcapture.storydrafts.model.StoryDraftsStore.A08
            com.instagram.creation.capture.quickcapture.storydrafts.model.StoryDraftsStore r1 = r0.A00(r3)
            com.instagram.reels.draft.model.migrations.StoryDraftMigration r0 = new com.instagram.reels.draft.model.migrations.StoryDraftMigration
            r0.<init>(r7, r1, r2, r3)
            java.util.List r1 = X.C18180wK.A0n(r0)
            com.instagram.reels.draft.migrators.StoryDraftMigrator r0 = new com.instagram.reels.draft.migrators.StoryDraftMigrator
            r0.<init>(r3, r1)
            r0.CSb(r5)
            X.0TJ r2 = X.AnonymousClass0TJ.A05
            r0 = 36320850500262178(0x81099f00021922, double:3.032790336467182E-306)
            boolean r0 = X.C63803iN.A0E(r2, r3, r0)
            if (r0 != 0) goto L_0x0009
            X.C19554AyF.A02()
            com.instagram.reels.store.ReelStore r0 = com.instagram.reels.store.ReelStore.A02(r3)
            r0.A0Q()
            return
        L_0x09a0:
            java.util.concurrent.atomic.AtomicReference r10 = r2.A01     // Catch:{ all -> 0x0d4c }
            java.lang.Object r1 = r10.get()     // Catch:{ all -> 0x0d4c }
            if (r1 == 0) goto L_0x09b8
            java.lang.Object r3 = r10.get()     // Catch:{ all -> 0x0d4c }
            X.7Kz r1 = X.AnonymousClass7Kz.A0B()     // Catch:{ all -> 0x0d4c }
            X.6sa r1 = r1.A00     // Catch:{ all -> 0x0d4c }
            boolean r1 = X.C04220Ms.A0I(r3, r1)     // Catch:{ all -> 0x0d4c }
            if (r1 != 0) goto L_0x09f3
        L_0x09b8:
            X.0gW r12 = X.AnonymousClass0gN.A00()     // Catch:{ all -> 0x0d4c }
            r13 = 570(0x23a, float:7.99E-43)
            r14 = 3
            X.0gV r6 = new X.0gV     // Catch:{ all -> 0x0d4c }
            r11 = r6
            r15 = r4
            r16 = r0
            r11.<init>(r12, r13, r14, r15, r16)     // Catch:{ all -> 0x0d4c }
            java.lang.Class<X.7Kz> r7 = X.AnonymousClass7Kz.class
            monitor-enter(r7)     // Catch:{ all -> 0x0d4c }
            X.7Kz r1 = X.AnonymousClass7Kz.A0B()     // Catch:{ all -> 0x0d18 }
            boolean r1 = r1.A01     // Catch:{ all -> 0x0d18 }
            if (r1 == 0) goto L_0x09ee
            X.7Kz r1 = X.AnonymousClass7Kz.A0B()     // Catch:{ all -> 0x0d18 }
            X.6sa r1 = r1.A00     // Catch:{ all -> 0x0d18 }
            X.7zO r5 = new X.7zO     // Catch:{ all -> 0x0d18 }
            r5.<init>(r1)     // Catch:{ all -> 0x0d18 }
            X.7Kz r3 = X.AnonymousClass7Kz.A0B()     // Catch:{ all -> 0x0d18 }
            r1 = 0
            r3.A00 = r1     // Catch:{ all -> 0x0d18 }
            X.7Kz r1 = X.AnonymousClass7Kz.A0B()     // Catch:{ all -> 0x0d18 }
            r1.A01 = r4     // Catch:{ all -> 0x0d18 }
            r6.execute(r5)     // Catch:{ all -> 0x0d18 }
        L_0x09ee:
            monitor-exit(r7)     // Catch:{ all -> 0x0d4c }
            r1 = 0
            r10.set(r1)     // Catch:{ all -> 0x0d4c }
        L_0x09f3:
            monitor-exit(r2)
            java.lang.Object r1 = r10.get()     // Catch:{ 6Bp -> 0x0d43 }
            if (r1 != 0) goto L_0x0b64
            monitor-enter(r2)     // Catch:{ 6Bp -> 0x0d43 }
            java.lang.Object r1 = r10.get()     // Catch:{ all -> 0x0d40 }
            if (r1 != 0) goto L_0x0b63
            com.instagram.service.session.UserSession r1 = r2.A00     // Catch:{ all -> 0x0d40 }
            X.Grx r3 = X.AnonymousClass3WK.A01(r1)     // Catch:{ all -> 0x0d40 }
            com.instagram.fbpay.graphql.FBPayIGGraphQLQueryExecutor r7 = new com.instagram.fbpay.graphql.FBPayIGGraphQLQueryExecutor     // Catch:{ all -> 0x0d40 }
            r7.<init>(r3)     // Catch:{ all -> 0x0d40 }
            android.content.Context r3 = X.C10600ic.A00     // Catch:{ all -> 0x0d40 }
            java.util.concurrent.Executor r6 = r3.getMainExecutor()     // Catch:{ all -> 0x0d40 }
            X.0gW r12 = X.AnonymousClass0gN.A00()     // Catch:{ all -> 0x0d40 }
            r13 = 568(0x238, float:7.96E-43)
            r9 = 3
            X.0gV r5 = new X.0gV     // Catch:{ all -> 0x0d40 }
            r11 = r5
            r14 = r9
            r15 = r4
            r16 = r0
            r11.<init>(r12, r13, r14, r15, r16)     // Catch:{ all -> 0x0d40 }
            X.85p r3 = new X.85p     // Catch:{ all -> 0x0d40 }
            r3.<init>(r7, r7, r6, r5)     // Catch:{ all -> 0x0d40 }
            X.0Oe r3 = X.AnonymousClass4UJ.A00(r3)     // Catch:{ all -> 0x0d40 }
            android.content.Context r5 = X.C10600ic.A00     // Catch:{ all -> 0x0d40 }
            r5.getClass()     // Catch:{ all -> 0x0d40 }
            android.content.Context r12 = r5.getApplicationContext()     // Catch:{ all -> 0x0d40 }
            r8 = 0
            android.content.Context r14 = X.C10600ic.A00     // Catch:{ all -> 0x0d40 }
            r6 = 7
            com.facebook.redex.IDxProviderShape105S0000000_2_I2 r5 = new com.facebook.redex.IDxProviderShape105S0000000_2_I2     // Catch:{ all -> 0x0d40 }
            r5.<init>(r6)     // Catch:{ all -> 0x0d40 }
            com.facebook.redex.IDxProviderShape245S0100000_2_I2 r6 = new com.facebook.redex.IDxProviderShape245S0100000_2_I2     // Catch:{ all -> 0x0d40 }
            r6.<init>((java.lang.Object) r5, (int) r4)     // Catch:{ all -> 0x0d40 }
            r4 = 6
            com.facebook.redex.IDxProviderShape105S0000000_2_I2 r5 = new com.facebook.redex.IDxProviderShape105S0000000_2_I2     // Catch:{ all -> 0x0d40 }
            r5.<init>(r4)     // Catch:{ all -> 0x0d40 }
            com.facebook.redex.IDxProviderShape245S0100000_2_I2 r4 = new com.facebook.redex.IDxProviderShape245S0100000_2_I2     // Catch:{ all -> 0x0d40 }
            r4.<init>((java.lang.Object) r5, (int) r0)     // Catch:{ all -> 0x0d40 }
            X.85c r13 = new X.85c     // Catch:{ all -> 0x0d40 }
            r15 = r1
            r16 = r3
            r17 = r6
            r18 = r4
            r13.<init>(r14, r15, r16, r17, r18)     // Catch:{ all -> 0x0d40 }
            X.0Oe r13 = X.AnonymousClass4UJ.A00(r13)     // Catch:{ all -> 0x0d40 }
            android.content.Context r5 = X.C10600ic.A00     // Catch:{ all -> 0x0d40 }
            X.85Z r4 = new X.85Z     // Catch:{ all -> 0x0d40 }
            r4.<init>(r5, r1, r3)     // Catch:{ all -> 0x0d40 }
            X.0Oe r14 = X.AnonymousClass4UJ.A00(r4)     // Catch:{ all -> 0x0d40 }
            android.content.Context r5 = X.C10600ic.A00     // Catch:{ all -> 0x0d40 }
            X.C04220Ms.A06(r5)     // Catch:{ all -> 0x0d40 }
            X.85V r4 = new X.85V     // Catch:{ all -> 0x0d40 }
            r4.<init>(r1, r5)     // Catch:{ all -> 0x0d40 }
            X.0Oe r17 = X.AnonymousClass4UJ.A00(r4)     // Catch:{ all -> 0x0d40 }
            android.content.Context r5 = X.C10600ic.A00     // Catch:{ all -> 0x0d40 }
            X.85Y r4 = new X.85Y     // Catch:{ all -> 0x0d40 }
            r4.<init>(r5, r1, r3)     // Catch:{ all -> 0x0d40 }
            X.0Oe r15 = X.AnonymousClass4UJ.A00(r4)     // Catch:{ all -> 0x0d40 }
            android.content.Context r5 = X.C10600ic.A00     // Catch:{ all -> 0x0d40 }
            X.C04220Ms.A06(r5)     // Catch:{ all -> 0x0d40 }
            X.85W r4 = new X.85W     // Catch:{ all -> 0x0d40 }
            r4.<init>(r5, r1)     // Catch:{ all -> 0x0d40 }
            X.0Oe r16 = X.AnonymousClass4UJ.A00(r4)     // Catch:{ all -> 0x0d40 }
            r5 = 16
            com.facebook.redex.IDxProviderShape245S0100000_2_I2 r4 = new com.facebook.redex.IDxProviderShape245S0100000_2_I2     // Catch:{ all -> 0x0d40 }
            r4.<init>((java.lang.Object) r1, (int) r5)     // Catch:{ all -> 0x0d40 }
            X.0Oe r18 = X.AnonymousClass4UJ.A00(r4)     // Catch:{ all -> 0x0d40 }
            X.9wF r5 = X.C171209wF.A16     // Catch:{ all -> 0x0d40 }
            r6 = 2
            com.facebook.redex.IDxProviderShape104S0200000_1_I2 r4 = new com.facebook.redex.IDxProviderShape104S0200000_1_I2     // Catch:{ all -> 0x0d40 }
            r4.<init>(r6, r1, r5)     // Catch:{ all -> 0x0d40 }
            X.0Oe r19 = X.AnonymousClass4UJ.A00(r4)     // Catch:{ all -> 0x0d40 }
            android.content.Context r7 = X.C10600ic.A00     // Catch:{ all -> 0x0d40 }
            X.C04220Ms.A06(r7)     // Catch:{ all -> 0x0d40 }
            r5 = 10
            com.facebook.redex.IDxProviderShape245S0100000_2_I2 r4 = new com.facebook.redex.IDxProviderShape245S0100000_2_I2     // Catch:{ all -> 0x0d40 }
            r4.<init>((android.content.Context) r7, (int) r5)     // Catch:{ all -> 0x0d40 }
            X.0Oe r20 = X.AnonymousClass4UJ.A00(r4)     // Catch:{ all -> 0x0d40 }
            android.content.Context r7 = X.C10600ic.A00     // Catch:{ all -> 0x0d40 }
            r5 = 15
            com.facebook.redex.IDxProviderShape245S0100000_2_I2 r4 = new com.facebook.redex.IDxProviderShape245S0100000_2_I2     // Catch:{ all -> 0x0d40 }
            r4.<init>((android.content.Context) r7, (int) r5)     // Catch:{ all -> 0x0d40 }
            X.0Oe r21 = X.AnonymousClass4UJ.A00(r4)     // Catch:{ all -> 0x0d40 }
            X.85k r4 = X.C1370085k.A00     // Catch:{ all -> 0x0d40 }
            X.0Oe r22 = X.AnonymousClass4UJ.A00(r4)     // Catch:{ all -> 0x0d40 }
            android.content.Context r7 = X.C10600ic.A00     // Catch:{ all -> 0x0d40 }
            X.0ik r4 = new X.0ik     // Catch:{ all -> 0x0d40 }
            r4.<init>(r1)     // Catch:{ all -> 0x0d40 }
            java.lang.String r5 = "payflows"
            r4.A02 = r5     // Catch:{ all -> 0x0d40 }
            X.0nS r5 = r4.A00()     // Catch:{ all -> 0x0d40 }
            X.7kd r4 = new X.7kd     // Catch:{ all -> 0x0d40 }
            r4.<init>(r5)     // Catch:{ all -> 0x0d40 }
            X.7kX r5 = new X.7kX     // Catch:{ all -> 0x0d40 }
            r5.<init>(r4)     // Catch:{ all -> 0x0d40 }
            X.7kZ r4 = new X.7kZ     // Catch:{ all -> 0x0d40 }
            r4.<init>(r5)     // Catch:{ all -> 0x0d40 }
            X.85b r5 = new X.85b     // Catch:{ all -> 0x0d40 }
            r5.<init>(r7, r4, r1, r3)     // Catch:{ all -> 0x0d40 }
            X.0Oe r23 = X.AnonymousClass4UJ.A00(r5)     // Catch:{ all -> 0x0d40 }
            android.content.Context r5 = X.C10600ic.A00     // Catch:{ all -> 0x0d40 }
            com.facebook.redex.IDxProviderShape105S0200000_2_I2 r4 = new com.facebook.redex.IDxProviderShape105S0200000_2_I2     // Catch:{ all -> 0x0d40 }
            r4.<init>(r9, r5, r1)     // Catch:{ all -> 0x0d40 }
            X.0Oe r24 = X.AnonymousClass4UJ.A00(r4)     // Catch:{ all -> 0x0d40 }
            X.0Oe r25 = X.AnonymousClass4UJ.A00(r3)     // Catch:{ all -> 0x0d40 }
            android.content.Context r4 = X.C10600ic.A00     // Catch:{ all -> 0x0d40 }
            X.C04220Ms.A06(r4)     // Catch:{ all -> 0x0d40 }
            com.facebook.redex.IDxProviderShape105S0200000_2_I2 r3 = new com.facebook.redex.IDxProviderShape105S0200000_2_I2     // Catch:{ all -> 0x0d40 }
            r3.<init>(r6, r4, r1)     // Catch:{ all -> 0x0d40 }
            X.0Oe r26 = X.AnonymousClass4UJ.A00(r3)     // Catch:{ all -> 0x0d40 }
            r4 = 12
            com.facebook.redex.IDxProviderShape245S0100000_2_I2 r3 = new com.facebook.redex.IDxProviderShape245S0100000_2_I2     // Catch:{ all -> 0x0d40 }
            r3.<init>((java.lang.Object) r1, (int) r4)     // Catch:{ all -> 0x0d40 }
            X.0Oe r27 = X.AnonymousClass4UJ.A00(r3)     // Catch:{ all -> 0x0d40 }
            X.85j r28 = X.C1369985j.A00     // Catch:{ all -> 0x0d40 }
            X.85l r29 = X.AnonymousClass85l.A00     // Catch:{ all -> 0x0d40 }
            com.facebook.redex.IDxProviderShape244S0100000_1_I2 r7 = new com.facebook.redex.IDxProviderShape244S0100000_1_I2     // Catch:{ all -> 0x0d40 }
            r7.<init>(r1, r6)     // Catch:{ all -> 0x0d40 }
            android.content.Context r4 = X.C10600ic.A00     // Catch:{ all -> 0x0d40 }
            X.C04220Ms.A06(r4)     // Catch:{ all -> 0x0d40 }
            r3 = 14
            com.facebook.redex.IDxProviderShape245S0100000_2_I2 r1 = new com.facebook.redex.IDxProviderShape245S0100000_2_I2     // Catch:{ all -> 0x0d40 }
            r1.<init>((android.content.Context) r4, (int) r3)     // Catch:{ all -> 0x0d40 }
            X.0Oe r31 = X.AnonymousClass4UJ.A00(r1)     // Catch:{ all -> 0x0d40 }
            X.7Gd r1 = new X.7Gd     // Catch:{ all -> 0x0d40 }
            r1.<init>(r8, r8, r0)     // Catch:{ all -> 0x0d40 }
            r3 = 11
            com.facebook.redex.IDxProviderShape245S0100000_2_I2 r5 = new com.facebook.redex.IDxProviderShape245S0100000_2_I2     // Catch:{ all -> 0x0d40 }
            r5.<init>((java.lang.Object) r1, (int) r3)     // Catch:{ all -> 0x0d40 }
            android.content.Context r1 = X.C10600ic.A00     // Catch:{ all -> 0x0d40 }
            X.C04220Ms.A06(r1)     // Catch:{ all -> 0x0d40 }
            X.85i r1 = X.C1369885i.A00     // Catch:{ all -> 0x0d40 }
            X.0Oe r33 = X.AnonymousClass4UJ.A00(r1)     // Catch:{ all -> 0x0d40 }
            android.content.Context r3 = X.C10600ic.A00     // Catch:{ all -> 0x0d40 }
            X.C04220Ms.A06(r3)     // Catch:{ all -> 0x0d40 }
            r1 = 13
            com.facebook.redex.IDxProviderShape245S0100000_2_I2 r4 = new com.facebook.redex.IDxProviderShape245S0100000_2_I2     // Catch:{ all -> 0x0d40 }
            r4.<init>((android.content.Context) r3, (int) r1)     // Catch:{ all -> 0x0d40 }
            X.6sa r11 = new X.6sa     // Catch:{ all -> 0x0d40 }
            r30 = r7
            r32 = r5
            r34 = r4
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34)     // Catch:{ all -> 0x0d40 }
            r10.set(r11)     // Catch:{ all -> 0x0d40 }
        L_0x0b63:
            monitor-exit(r2)     // Catch:{ 6Bp -> 0x0d43 }
        L_0x0b64:
            java.lang.Object r3 = r10.get()     // Catch:{ 6Bp -> 0x0d43 }
            X.6sa r3 = (X.C114036sa) r3     // Catch:{ 6Bp -> 0x0d43 }
            if (r3 == 0) goto L_0x0009
            java.lang.Class<X.7Kz> r2 = X.AnonymousClass7Kz.class
            monitor-enter(r2)     // Catch:{ 6Bp -> 0x0d43 }
            goto L_0x0d1b
        L_0x0b71:
            com.instagram.service.session.UserSession r4 = r6.A0B
            X.0TJ r3 = X.AnonymousClass0TJ.A05
            r1 = 36311032208359771(0x8100b10035015b, double:3.0265812091330116E-306)
            boolean r1 = X.C63803iN.A0E(r3, r4, r1)
            if (r1 == 0) goto L_0x0b99
            r1 = 36311032208884061(0x8100b1003d015d, double:3.026581209464575E-306)
            boolean r1 = X.C63803iN.A0E(r3, r4, r1)
            r6.A08 = r1
            r1 = 36311032209146206(0x8100b10041015e, double:3.026581209630356E-306)
            boolean r1 = X.C63803iN.A0E(r3, r4, r1)
            r6.A09 = r1
            X.KJC.A00(r6)
        L_0x0b99:
            java.util.concurrent.atomic.AtomicReference r1 = r6.A06
            java.lang.Object r1 = r1.get()
            X.JmR r1 = (X.C37204JmR) r1
            if (r1 == 0) goto L_0x0009
            r1.A02(r0)
            r1.A01(r0)
            return
        L_0x0baa:
            java.util.HashMap r3 = r4.A05     // Catch:{ all -> 0x0d11 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x0d11 }
            r3.remove(r2)     // Catch:{ all -> 0x0d11 }
            monitor-exit(r4)
            X.C26287E7o.A0B = r10
            X.C26287E7o.A08 = r10
            X.C26287E7o.A0C = r10
            X.C106676fQ.A01 = r10
            boolean r1 = r9.A02
            if (r1 == 0) goto L_0x0bcf
            r7.A0W(r6)
            r7.A0W(r5)
            monitor-enter(r4)
            X.C86134wK.A1P(r2, r3, r0)     // Catch:{ all -> 0x0d11 }
            monitor-exit(r4)
            int r0 = r9.A00
            X.C106676fQ.A01 = r0
        L_0x0bcf:
            X.C26287E7o.A0B = r1
            X.C103646Zz.A00 = r1
            int r0 = r9.A00
            X.C26287E7o.A08 = r0
            X.C26287E7o.A0C = r8
            return
        L_0x0bda:
            X.7q7 r0 = X.C37343Jpq.A07     // Catch:{ all -> 0x0be2 }
            if (r0 == r2) goto L_0x0be0
            X.C37343Jpq.A07 = r2     // Catch:{ all -> 0x0be2 }
        L_0x0be0:
            monitor-exit(r1)
            return
        L_0x0be2:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        L_0x0be5:
            X.L1H r0 = r4.A01     // Catch:{ all -> 0x0bee }
            r0.D7W(r3)     // Catch:{ all -> 0x0bee }
            r4.A01 = r3     // Catch:{ all -> 0x0bee }
            monitor-exit(r1)     // Catch:{ all -> 0x0bee }
            goto L_0x0bf1
        L_0x0bee:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0bee }
            throw r0
        L_0x0bf1:
            r0 = 36321623594245062(0x810a5300001bc6, double:3.0332792442149574E-306)
            boolean r0 = X.C63803iN.A0E(r2, r11, r0)
            com.instagram.common.ui.widget.imageview.IgImageView.A0g = r0
            r0 = 36323805437698130(0x810c4f00012052, double:3.034659050800256E-306)
            boolean r0 = X.C63803iN.A0E(r2, r11, r0)
            com.instagram.common.ui.widget.imageview.IgImageView.A0f = r0
            r0 = 36318617117201046(0x81079700011296, double:3.0313779360262104E-306)
            boolean r3 = X.C63803iN.A0E(r2, r11, r0)
            r0 = 36318617117266583(0x81079700021297, double:3.031377936067656E-306)
            boolean r1 = X.C63803iN.A0E(r2, r11, r0)
            if (r3 != 0) goto L_0x0c1e
            r0 = 0
            if (r1 == 0) goto L_0x0c1f
        L_0x0c1e:
            r0 = 1
        L_0x0c1f:
            com.instagram.common.ui.widget.imageview.IgImageView.A0i = r0
            return
        L_0x0c22:
            X.C38076KJv.A00(r4)
            return
        L_0x0c26:
            X.H1h r1 = X.H1h.A02     // Catch:{ all -> 0x0d11 }
            monitor-exit(r4)
            r3.A00(r1)
            java.lang.Class<X.42F> r4 = X.AnonymousClass42F.class
            X.4Uc r1 = X.C73784Uc.A00
            java.lang.Object r1 = r2.A01(r4, r1)
            X.42F r1 = (X.AnonymousClass42F) r1
            r3.A00(r1)
            r5 = 0
            r1 = 35
            kotlin.jvm.internal.KtLambdaShape68S0100000_I2_48 r4 = new kotlin.jvm.internal.KtLambdaShape68S0100000_I2_48
            r4.<init>(r2, r1)
            java.lang.Class<X.42G> r1 = X.AnonymousClass42G.class
            java.lang.Object r1 = r2.A01(r1, r4)
            X.42G r1 = (X.AnonymousClass42G) r1
            r3.A00(r1)
            X.AhJ r1 = X.C18543AhJ.A00
            if (r1 == 0) goto L_0x0c60
            X.AnonymousClass3LM.A01()
            X.4bV r4 = X.C74994bV.A00
            java.lang.Class<X.42K> r1 = X.AnonymousClass42K.class
            java.lang.Object r1 = r2.A01(r1, r4)
            X.42K r1 = (X.AnonymousClass42K) r1
            r3.A00(r1)
        L_0x0c60:
            X.HuV r1 = r6.A03
            r3.A00(r1)
            r1 = 4
            kotlin.jvm.internal.KtLambdaShape74S0100000_I2_54 r4 = new kotlin.jvm.internal.KtLambdaShape74S0100000_I2_54
            r4.<init>(r2, r1)
            java.lang.Class<X.42I> r1 = X.AnonymousClass42I.class
            java.lang.Object r1 = r2.A01(r1, r4)
            X.42I r1 = (X.AnonymousClass42I) r1
            r3.A00(r1)
            X.HuV r1 = r6.A00
            if (r1 == 0) goto L_0x0c7d
            r3.A00(r1)
        L_0x0c7d:
            X.HuV r1 = r6.A02
            if (r1 == 0) goto L_0x0c84
            r3.A00(r1)
        L_0x0c84:
            X.HuV r1 = r6.A01
            if (r1 == 0) goto L_0x0c8b
            r3.A00(r1)
        L_0x0c8b:
            com.instagram.realtimeclient.bugreport.RealtimeLogsProvider$Companion r1 = com.instagram.realtimeclient.bugreport.RealtimeLogsProvider.Companion
            com.instagram.realtimeclient.bugreport.RealtimeLogsProvider r1 = r1.create(r2)
            r3.A00(r1)
            X.7pN r1 = r6.A05
            if (r1 == 0) goto L_0x0c9b
            r3.A00(r1)
        L_0x0c9b:
            X.7pQ r1 = r6.A08
            if (r1 == 0) goto L_0x0ca2
            r3.A00(r1)
        L_0x0ca2:
            X.GbF r1 = X.C30925GbF.A0A
            if (r1 == 0) goto L_0x0cb4
            X.GbF r1 = X.C36982Tk.A00()
            X.GPs r4 = r1.A02
            X.C04220Ms.A0B(r4, r5)
            java.util.ArrayList r1 = r3.A01
            r1.add(r4)
        L_0x0cb4:
            X.0d2 r1 = r6.A06
            if (r1 == 0) goto L_0x0cbb
            r3.A00(r1)
        L_0x0cbb:
            java.lang.Class<X.H1f> r4 = X.C32019H1f.class
            kotlin.jvm.internal.KtLambdaShape25S0100000_I2_5 r1 = new kotlin.jvm.internal.KtLambdaShape25S0100000_I2_5
            r1.<init>(r2, r0)
            java.lang.Object r1 = r2.A01(r4, r1)
            X.C04220Ms.A0B(r1, r5)
            java.util.ArrayList r0 = r3.A00
            r0.add(r1)
            X.0TJ r4 = X.AnonymousClass0TJ.A05
            r0 = 36318844750402321(0x8107cc00001311, double:3.031521892179302E-306)
            boolean r0 = X.C63803iN.A0E(r4, r2, r0)
            if (r0 == 0) goto L_0x0ce8
            X.8I5 r1 = X.AnonymousClass8I5.A00
            java.lang.Class<X.7pK> r0 = X.AnonymousClass7pK.class
            java.lang.Object r0 = r2.A01(r0, r1)
            X.7pK r0 = (X.AnonymousClass7pK) r0
            r3.A00(r0)
        L_0x0ce8:
            r0 = 36327052433172333(0x810f430004276d, double:3.0367124638127433E-306)
            boolean r0 = X.C63803iN.A0E(r4, r2, r0)
            if (r0 == 0) goto L_0x0d05
            r0 = 28
            kotlin.jvm.internal.KtLambdaShape143S0100000_I2_123 r1 = new kotlin.jvm.internal.KtLambdaShape143S0100000_I2_123
            r1.<init>(r2, r0)
            java.lang.Class<X.42H> r0 = X.AnonymousClass42H.class
            java.lang.Object r0 = r2.A01(r0, r1)
            X.42H r0 = (X.AnonymousClass42H) r0
            r3.A00(r0)
        L_0x0d05:
            X.6uP r0 = X.AnonymousClass2FT.A00()
            X.7pP r0 = r0.A00(r2)
            r3.A00(r0)
            return
        L_0x0d11:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        L_0x0d14:
            X.C132107tL.A00(r4)
            return
        L_0x0d18:
            r0 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x0d4c }
            throw r0     // Catch:{ all -> 0x0d4c }
        L_0x0d1b:
            X.7Kz r1 = X.AnonymousClass7Kz.A0B()     // Catch:{ all -> 0x0d40 }
            boolean r1 = r1.A01     // Catch:{ all -> 0x0d40 }
            if (r1 != 0) goto L_0x0d2c
            X.7Kz r1 = X.AnonymousClass7Kz.A0B()     // Catch:{ all -> 0x0d40 }
            r1.A01 = r0     // Catch:{ all -> 0x0d40 }
            r1.A00 = r3     // Catch:{ all -> 0x0d40 }
            goto L_0x0d3e
        L_0x0d2c:
            X.7Kz r0 = X.AnonymousClass7Kz.A0B()     // Catch:{ all -> 0x0d40 }
            X.6sa r0 = r0.A00     // Catch:{ all -> 0x0d40 }
            boolean r0 = r0.equals(r3)     // Catch:{ all -> 0x0d40 }
            if (r0 != 0) goto L_0x0d3e
            X.6Bp r0 = new X.6Bp     // Catch:{ all -> 0x0d40 }
            r0.<init>()     // Catch:{ all -> 0x0d40 }
            throw r0     // Catch:{ all -> 0x0d40 }
        L_0x0d3e:
            monitor-exit(r2)     // Catch:{ 6Bp -> 0x0d43 }
            return
        L_0x0d40:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ 6Bp -> 0x0d43 }
            throw r0     // Catch:{ 6Bp -> 0x0d43 }
        L_0x0d43:
            r2 = move-exception
            java.lang.String r1 = "FBPayInstagramConfig"
            java.lang.String r0 = "FBPay config object is already initialized."
            X.AnonymousClass0LU.A0E(r1, r0, r2)
            return
        L_0x0d4c:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L_0x0d4f:
            X.0TJ r4 = X.AnonymousClass0TJ.A06     // Catch:{ RuntimeException -> 0x0d92 }
            r1 = 36310512514433127(0x81003800090067, double:3.0262525526011625E-306)
            boolean r1 = X.C63803iN.A0E(r4, r3, r1)     // Catch:{ RuntimeException -> 0x0d92 }
            int r6 = X.C86164wN.A04(r1)
            java.util.concurrent.atomic.AtomicInteger r1 = X.AnonymousClass75L.A03     // Catch:{ RuntimeException -> 0x0d92 }
            int r1 = r1.getAndSet(r6)     // Catch:{ RuntimeException -> 0x0d92 }
            if (r1 == r6) goto L_0x0d85
            android.content.pm.PackageManager r5 = r7.getPackageManager()     // Catch:{ RuntimeException -> 0x0d92 }
            java.util.List r1 = X.AnonymousClass75L.A02     // Catch:{ RuntimeException -> 0x0d92 }
            java.util.Iterator r4 = r1.iterator()     // Catch:{ RuntimeException -> 0x0d92 }
        L_0x0d70:
            boolean r1 = r4.hasNext()     // Catch:{ RuntimeException -> 0x0d92 }
            if (r1 == 0) goto L_0x0d85
            java.lang.Object r2 = r4.next()     // Catch:{ RuntimeException -> 0x0d92 }
            java.lang.Class r2 = (java.lang.Class) r2     // Catch:{ RuntimeException -> 0x0d92 }
            android.content.ComponentName r1 = new android.content.ComponentName     // Catch:{ RuntimeException -> 0x0d92 }
            r1.<init>(r7, r2)     // Catch:{ RuntimeException -> 0x0d92 }
            r5.setComponentEnabledSetting(r1, r6, r0)     // Catch:{ RuntimeException -> 0x0d92 }
            goto L_0x0d70
        L_0x0d85:
            r0 = 43
            kotlin.jvm.internal.KtLambdaShape70S0100000_I2_50 r1 = new kotlin.jvm.internal.KtLambdaShape70S0100000_I2_50     // Catch:{ RuntimeException -> 0x0d92 }
            r1.<init>(r3, r0)     // Catch:{ RuntimeException -> 0x0d92 }
            java.lang.Class<X.75L> r0 = X.AnonymousClass75L.class
            r3.A01(r0, r1)     // Catch:{ RuntimeException -> 0x0d92 }
            goto L_0x0da1
        L_0x0d92:
            r2 = move-exception
            java.lang.String r1 = "W3CSessionInit"
            java.lang.String r0 = "Unable to set status for W3C Payment Components"
            X.AnonymousClass0LU.A0E(r1, r0, r2)     // Catch:{ all -> 0x0da8 }
            X.4d1 r1 = X.C75914d1.A00     // Catch:{ all -> 0x0da8 }
            java.lang.Class<X.75L> r0 = X.AnonymousClass75L.class
            r3.A01(r0, r1)     // Catch:{ all -> 0x0da8 }
        L_0x0da1:
            monitor-exit(r8)
            X.3Dk r0 = X.AnonymousClass3TB.A06
            r0.A00(r3)
            return
        L_0x0da8:
            r0 = move-exception
            monitor-exit(r8)
            throw r0
        L_0x0dab:
            r0 = 0
            r5.A00 = r0
            return
        L_0x0daf:
            X.HGt r4 = X.C32337HGt.A01()     // Catch:{ all -> 0x0ee8 }
            monitor-enter(r4)     // Catch:{ all -> 0x0ee8 }
            boolean r1 = r4.A04     // Catch:{ all -> 0x0e78 }
            monitor-exit(r4)     // Catch:{ all -> 0x0ee8 }
            if (r1 != 0) goto L_0x0e76
            X.HGm r2 = new X.HGm     // Catch:{ all -> 0x0ee8 }
            r2.<init>()     // Catch:{ all -> 0x0ee8 }
            X.HGl r1 = new X.HGl     // Catch:{ all -> 0x0ee8 }
            r1.<init>()     // Catch:{ all -> 0x0ee8 }
            X.8jS[] r1 = new X.C144888jS[]{r2, r1}     // Catch:{ all -> 0x0ee8 }
            java.util.List r3 = java.util.Arrays.asList(r1)     // Catch:{ all -> 0x0ee8 }
            monitor-enter(r4)     // Catch:{ all -> 0x0ee8 }
            boolean r1 = r4.A04     // Catch:{ all -> 0x0e78 }
            boolean r2 = X.C18180wK.A1W(r1)
            java.lang.String r1 = "Publisher.initialize() has already been invoked once. That it has been invoked a second time is probably a sign of evil."
            X.AnonymousClass7Ko.A0E(r2, r1)     // Catch:{ all -> 0x0e78 }
            r4.A04 = r0     // Catch:{ all -> 0x0e78 }
            java.lang.Class<X.HGt> r6 = X.C32337HGt.class
            monitor-enter(r6)     // Catch:{ all -> 0x0e78 }
            boolean r1 = X.C32337HGt.A0N     // Catch:{ all -> 0x0e70 }
            if (r1 != 0) goto L_0x0e10
            java.util.ArrayList r2 = X.C18200wM.A0s(r3)     // Catch:{ all -> 0x0e70 }
            X.HGn r1 = new X.HGn     // Catch:{ all -> 0x0e70 }
            r1.<init>()     // Catch:{ all -> 0x0e70 }
            r2.add(r1)     // Catch:{ all -> 0x0e70 }
            java.util.Iterator r5 = r2.iterator()     // Catch:{ all -> 0x0e70 }
        L_0x0df0:
            boolean r1 = r5.hasNext()     // Catch:{ all -> 0x0e70 }
            if (r1 == 0) goto L_0x0e04
            java.lang.Object r3 = r5.next()     // Catch:{ all -> 0x0e70 }
            X.8jS r3 = (X.C144888jS) r3     // Catch:{ all -> 0x0e70 }
            X.GW9 r2 = com.instagram.publisher.OperationHelper.A00     // Catch:{ all -> 0x0e70 }
            X.GW9 r1 = com.instagram.publisher.model.AttachmentHelper.A00     // Catch:{ all -> 0x0e70 }
            r3.CaV(r2, r1)     // Catch:{ all -> 0x0e70 }
            goto L_0x0df0
        L_0x0e04:
            X.7wH r2 = new X.7wH     // Catch:{ all -> 0x0e70 }
            r2.<init>()     // Catch:{ all -> 0x0e70 }
            java.util.ArrayList r1 = X.AnonymousClass3X5.A00     // Catch:{ all -> 0x0e70 }
            r1.add(r2)     // Catch:{ all -> 0x0e70 }
            X.C32337HGt.A0N = r0     // Catch:{ all -> 0x0e70 }
        L_0x0e10:
            monitor-exit(r6)     // Catch:{ all -> 0x0e78 }
            X.Gcl r3 = r4.A08     // Catch:{ all -> 0x0e78 }
            monitor-enter(r3)     // Catch:{ all -> 0x0e78 }
            boolean r1 = r3.A00     // Catch:{ all -> 0x0e6d }
            if (r1 != 0) goto L_0x0e24
            r3.A00 = r0     // Catch:{ all -> 0x0e6d }
            X.0gW r2 = r3.A01     // Catch:{ all -> 0x0e6d }
            X.FSS r1 = new X.FSS     // Catch:{ all -> 0x0e6d }
            r1.<init>(r3)     // Catch:{ all -> 0x0e6d }
            r2.AKp(r1)     // Catch:{ all -> 0x0e6d }
        L_0x0e24:
            monitor-exit(r3)     // Catch:{ all -> 0x0e78 }
            X.I0b r3 = r4.A0D     // Catch:{ all -> 0x0e78 }
            X.HGp r3 = (X.C32334HGp) r3     // Catch:{ all -> 0x0e78 }
            monitor-enter(r3)     // Catch:{ all -> 0x0e78 }
            boolean r1 = r3.A00     // Catch:{ all -> 0x0e6d }
            if (r1 != 0) goto L_0x0e3a
            r3.A00 = r0     // Catch:{ all -> 0x0e6d }
            X.0gW r2 = r3.A01     // Catch:{ all -> 0x0e6d }
            X.FST r1 = new X.FST     // Catch:{ all -> 0x0e6d }
            r1.<init>(r3)     // Catch:{ all -> 0x0e6d }
            r2.AKp(r1)     // Catch:{ all -> 0x0e6d }
        L_0x0e3a:
            monitor-exit(r3)     // Catch:{ all -> 0x0e78 }
            X.HvK r2 = r4.A0E     // Catch:{ all -> 0x0e78 }
            X.HGv r2 = (X.C32339HGv) r2     // Catch:{ all -> 0x0e78 }
            monitor-enter(r2)     // Catch:{ all -> 0x0e78 }
            boolean r1 = r2.A00     // Catch:{ all -> 0x0e73 }
            if (r1 != 0) goto L_0x0e50
            r2.A00 = r0     // Catch:{ all -> 0x0e73 }
            X.0gW r1 = r2.A02     // Catch:{ all -> 0x0e73 }
            X.FSU r0 = new X.FSU     // Catch:{ all -> 0x0e73 }
            r0.<init>(r2)     // Catch:{ all -> 0x0e73 }
            r1.AKp(r0)     // Catch:{ all -> 0x0e73 }
        L_0x0e50:
            monitor-exit(r2)     // Catch:{ all -> 0x0e78 }
            X.61K r2 = new X.61K     // Catch:{ all -> 0x0e78 }
            r2.<init>()     // Catch:{ all -> 0x0e78 }
            X.616 r1 = new X.616     // Catch:{ all -> 0x0e78 }
            r1.<init>(r4)     // Catch:{ all -> 0x0e78 }
            monitor-enter(r2)     // Catch:{ all -> 0x0e78 }
            r2.A00 = r1     // Catch:{ all -> 0x0e73 }
            boolean r0 = r2.A01     // Catch:{ all -> 0x0e73 }
            if (r0 == 0) goto L_0x0e65
            r1.run()     // Catch:{ all -> 0x0e73 }
        L_0x0e65:
            monitor-exit(r2)     // Catch:{ all -> 0x0e78 }
            X.0kz r0 = r4.A07     // Catch:{ all -> 0x0e78 }
            r0.AKp(r2)     // Catch:{ all -> 0x0e78 }
            monitor-exit(r4)     // Catch:{ all -> 0x0ee8 }
            goto L_0x0e76
        L_0x0e6d:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0e78 }
            goto L_0x0e75
        L_0x0e70:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x0e78 }
            goto L_0x0e75
        L_0x0e73:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0e78 }
        L_0x0e75:
            throw r0     // Catch:{ all -> 0x0e78 }
        L_0x0e76:
            monitor-exit(r7)
            return
        L_0x0e78:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0ee8 }
            throw r0     // Catch:{ all -> 0x0ee8 }
        L_0x0e7b:
            java.util.HashMap r5 = r7.A00     // Catch:{ all -> 0x0ee8 }
            java.lang.Object r1 = r5.get(r6)     // Catch:{ all -> 0x0ee8 }
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch:{ all -> 0x0ee8 }
            if (r1 == 0) goto L_0x0e8a
            boolean r0 = r1.booleanValue()     // Catch:{ all -> 0x0ee8 }
            goto L_0x0e92
        L_0x0e8a:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x0ee8 }
            r5.put(r6, r0)     // Catch:{ all -> 0x0ee8 }
            r0 = 1
        L_0x0e92:
            monitor-exit(r7)
            r2.A00 = r0
            r0 = 36318118900928656(0x81072300001090, double:3.031062862049395E-306)
            boolean r0 = X.C63803iN.A0E(r4, r3, r0)
            r2.A02 = r0
            r0 = 36316890540346784(0x81060500010da0, double:3.030286041871208E-306)
            boolean r0 = X.C63803iN.A0E(r4, r3, r0)
            r2.A04 = r0
            r0 = 36316890540412321(0x81060500020da1, double:3.030286041912654E-306)
            boolean r0 = X.C63803iN.A0E(r4, r3, r0)
            r2.A03 = r0
            r0 = 36312303515927466(0x8101d9000b03aa, double:3.0273851891579666E-306)
            boolean r0 = X.C63803iN.A0E(r4, r3, r0)
            r2.A07 = r0
            r0 = 36312303515993003(0x8101d9000c03ab, double:3.0273851891994125E-306)
            boolean r0 = X.C63803iN.A0E(r4, r3, r0)
            r2.A06 = r0
            r0 = 36323272861818623(0x810bd300021eff, double:3.034322247669545E-306)
            boolean r0 = X.C63803iN.A0E(r4, r3, r0)
            r2.A05 = r0
            X.C09370fJ.A00 = r2
            java.util.concurrent.atomic.AtomicBoolean r2 = X.C61663Ut.A07
            r0 = 36318166145568936(0x81072e000010a8, double:3.031092739750147E-306)
            boolean r0 = X.C63803iN.A0E(r4, r3, r0)
            r2.set(r0)
            return
        L_0x0ee8:
            r0 = move-exception
            monitor-exit(r7)
            throw r0
        L_0x0eeb:
            r0 = 67
            if (r2 != r0) goto L_0x0f54
            com.instagram.wellbeing.timeinapp.instrumentation.IgTimeInAppActivityListener r3 = com.instagram.wellbeing.timeinapp.instrumentation.IgTimeInAppActivityListener.A00(r7, r3)
            monitor-enter(r3)
            com.instagram.service.session.UserSession r5 = r3.A01     // Catch:{ all -> 0x0f51 }
            X.0TJ r4 = X.AnonymousClass0TJ.A05     // Catch:{ all -> 0x0f51 }
            r0 = 2342156974881376007(0x2081035c00020707, double:4.06046927830981E-152)
            boolean r0 = X.C63803iN.A0E(r4, r5, r0)     // Catch:{ all -> 0x0f51 }
            if (r0 != 0) goto L_0x0f0c
            X.3VQ r0 = r3.A03     // Catch:{ all -> 0x0f51 }
            java.util.concurrent.atomic.AtomicReference r1 = r0.A00     // Catch:{ all -> 0x0f51 }
            r0 = 0
            r1.set(r0)     // Catch:{ all -> 0x0f51 }
            goto L_0x0f4f
        L_0x0f0c:
            r8 = 0
            r0 = 2342156974881310470(0x2081035c00010706, double:4.0604692782542405E-152)
            boolean r0 = X.C63803iN.A0E(r4, r5, r0)     // Catch:{ all -> 0x0f51 }
            if (r0 == 0) goto L_0x0f22
            X.5yW r0 = new X.5yW     // Catch:{ all -> 0x0f51 }
            r0.<init>(r5)     // Catch:{ all -> 0x0f51 }
            com.facebook.xanalytics.XAnalyticsAdapterHolder r8 = new com.facebook.xanalytics.XAnalyticsAdapterHolder     // Catch:{ all -> 0x0f51 }
            r8.<init>(r0)     // Catch:{ all -> 0x0f51 }
        L_0x0f22:
            java.util.concurrent.ScheduledExecutorService r10 = java.util.concurrent.Executors.newSingleThreadScheduledExecutor()     // Catch:{ all -> 0x0f51 }
            r3.A02 = r10     // Catch:{ all -> 0x0f51 }
            X.3VQ r2 = r3.A03     // Catch:{ all -> 0x0f51 }
            android.content.Context r6 = r3.A00     // Catch:{ all -> 0x0f51 }
            java.lang.String r9 = r5.getUserId()     // Catch:{ all -> 0x0f51 }
            r0 = 36595440644524037(0x82035c00040805, double:3.206442249384144E-306)
            java.lang.Long r0 = X.C63803iN.A07(r4, r5, r0)     // Catch:{ all -> 0x0f51 }
            int r11 = r0.intValue()     // Catch:{ all -> 0x0f51 }
            java.util.concurrent.atomic.AtomicReference r0 = r2.A00     // Catch:{ all -> 0x0f51 }
            java.lang.Object r7 = r0.get()     // Catch:{ all -> 0x0f51 }
            X.376 r7 = (X.AnonymousClass376) r7     // Catch:{ all -> 0x0f51 }
            if (r7 == 0) goto L_0x0f4f
            X.4T8 r5 = new X.4T8     // Catch:{ all -> 0x0f51 }
            r5.<init>(r6, r7, r8, r9, r10, r11)     // Catch:{ all -> 0x0f51 }
            r10.execute(r5)     // Catch:{ all -> 0x0f51 }
        L_0x0f4f:
            monitor-exit(r3)
            return
        L_0x0f51:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        L_0x0f54:
            java.lang.Object[] r1 = X.C18210wN.A1X(r2)
            java.lang.String r0 = "No implementation bound to key: %s"
            java.lang.String r0 = java.lang.String.format(r0, r1)
            java.lang.IllegalArgumentException r0 = X.C18190wL.A0a(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C122117Ki.A0A(android.content.Context, com.instagram.service.session.UserSession, int, boolean):void");
    }
}

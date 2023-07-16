package X;

import android.content.Context;
import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import com.facebook.proxygen.TraceFieldType;
import com.facebook.redex.IDxConsumerShape141S0200000_1_I2;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.model.direct.threadkey.impl.MsysThreadId;
import com.instagram.pendingmedia.model.recipients.PendingRecipient;
import com.instagram.service.session.UserSession;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: X.3TN  reason: invalid class name */
public final class AnonymousClass3TN {
    public final Context A00;
    public final C34640IcN A01;
    public final C37010Jil A02 = C37010Jil.A00();
    public final C85834vq A03;
    public final UserSession A04;
    public final Integer A05;
    public final boolean A06;
    public final C84754to A07;
    public final AnonymousClass49O A08;
    public final ArrayList A09;

    public AnonymousClass3TN(C34640IcN icN, C84754to r3, AnonymousClass49O r4, C85834vq r5, UserSession userSession, Integer num, ArrayList arrayList, boolean z) {
        C04220Ms.A0B(r3, 6);
        this.A04 = userSession;
        this.A01 = icN;
        this.A03 = r5;
        this.A09 = arrayList;
        this.A07 = r3;
        this.A06 = z;
        this.A05 = num;
        this.A08 = r4;
        this.A00 = icN.requireContext();
    }

    public static final void A00(AnonymousClass3TN r21, ArrayList arrayList) {
        D1S d1s;
        CMN cmn;
        String str;
        AnonymousClass29M r0;
        AnonymousClass29O r11;
        CMN cmn2;
        String str2;
        ArrayList A0v = AnonymousClass0wJ.A0v();
        ArrayList<DirectShareTarget> arrayList2 = arrayList;
        for (DirectShareTarget directShareTarget : arrayList2) {
            if (directShareTarget.A0D()) {
                String A032 = directShareTarget.A03();
                C04220Ms.A06(A032);
                A0v.add(A032);
            }
        }
        AnonymousClass3TN r10 = r21;
        Context context = r10.A00;
        C18330wh r9 = new C18330wh(context);
        C18330wh.A02(r9.getContext(), r9, 2131825713);
        C37010Jil jil = r10.A02;
        C84754to r6 = r10.A07;
        C85834vq r2 = r10.A03;
        ArrayList<PendingRecipient> arrayList3 = r10.A09;
        ArrayList A0x = AnonymousClass0wJ.A0x(arrayList3, 10);
        Iterator it = arrayList3.iterator();
        while (it.hasNext()) {
            A0x.add(((PendingRecipient) it.next()).A0S);
        }
        List A0K = AnonymousClass00J.A0K(A0x);
        UserSession userSession = r10.A04;
        jil.A02(new IDxConsumerShape141S0200000_1_I2(1, r9, r10), r6.A7A(context, r2, r10.A05, A0K, C25256Did.A00(userSession, arrayList2), 28));
        C13950oZ.A00(r9);
        AnonymousClass49O r92 = r10.A08;
        C34640IcN icN = r10.A01;
        ArrayList A0v2 = AnonymousClass0wJ.A0v();
        for (PendingRecipient pendingRecipient : arrayList3) {
            A0v2.add(pendingRecipient.A0V);
        }
        boolean z = r2 instanceof CMN;
        if (z) {
            d1s = D1S.DJANGO;
        } else if (r2 instanceof MsysThreadId) {
            d1s = ((MsysThreadId) r2).A01;
        } else {
            throw C18180wK.A0a(AnonymousClass0wJ.A0t("Expected DirectThreadId or MsysThreadId: ", r2));
        }
        Iterator it2 = arrayList2.iterator();
        boolean z2 = true;
        boolean z3 = false;
        while (it2.hasNext()) {
            if (((DirectShareTarget) it2.next()).A06()) {
                z3 = true;
            }
        }
        if (!r10.A06 && !z3) {
            z2 = false;
        }
        if (r92.A02 != null && r92.A05) {
            USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(C13330nS.A01(icN, userSession), "direct_omnipicker_search_add_group_member"), 539);
            if (AnonymousClass0wJ.A1U(A0I)) {
                A0I.A0Q("is_interop_thread", C18190wL.A0Z(A0I, C62443a0.A00(9, 10, 0), r92.A02, false));
                if (z) {
                    cmn2 = (CMN) r2;
                } else if (r2 instanceof MsysThreadId) {
                    str2 = null;
                    A0I.A0T("thread_id", str2);
                    A0I.Bb4();
                } else if (r2 instanceof C23168CnC) {
                    cmn2 = ((C23168CnC) r2).A00;
                } else {
                    throw C18180wK.A0a(AnonymousClass0wJ.A0t("Expected DirectThreadId or MsysThreadId: ", r2));
                }
                str2 = cmn2.A00;
                A0I.A0T("thread_id", str2);
                A0I.Bb4();
            }
        }
        C694948t r02 = r92.A00;
        if (r02 != null) {
            AnonymousClass3TO r102 = r02.A02;
            Long A0c = C18200wM.A0c();
            AnonymousClass7Ko.A07(r102.A09, "Must init with a valid delegate first!");
            AnonymousClass7Ko.A07(A0c, "Timestamp is null!");
            if (r102.A0A != null) {
                C013306f r22 = r102.A05;
                Iterator it3 = r22.keySet().iterator();
                while (it3.hasNext()) {
                    String A0k = C18180wK.A0k(it3);
                    Object obj = r22.get(A0k);
                    AnonymousClass3TO.A00(r102, A0c, obj, A0k);
                    ((Number) r102.A01.get(A0k)).intValue();
                    ((Number) r102.A06.get(A0k)).longValue();
                    long A082 = C18190wL.A08(r102.A07.get(A0k));
                    ((Number) r102.A02.get(A0k)).longValue();
                    ((Number) r102.A03.get(A0k)).longValue();
                    if (A082 >= 0) {
                        r102.A0A.getClass();
                        obj.getClass();
                        AnonymousClass3SG r15 = new AnonymousClass3SG(obj, r102.A08.contains(A0k));
                        r102.A09.A00.Bcu(r15, r15.A01);
                    }
                }
                r102.A0A = null;
                r22.clear();
                r102.A01.clear();
                r102.A04.clear();
                r102.A07.clear();
                r102.A06.clear();
                r102.A02.clear();
                r102.A03.clear();
                r102.A08.clear();
            }
        }
        if (r92.A01 != null && !r92.A03) {
            r92.A03 = true;
            HashSet hashSet = new HashSet(A0v2);
            hashSet.addAll(A0v);
            C32163H7y h7y = r92.A01;
            Integer num = AnonymousClass006.A0u;
            boolean z4 = true;
            if (!C18190wL.A1Z(Boolean.valueOf(z2), true) && !h7y.A05) {
                z4 = false;
            }
            if (!z4 || h7y.A06) {
                String str3 = h7y.A02;
                if (str3 != null) {
                    USLEBaseShape0S0000000 A0I2 = C18180wK.A0I(AnonymousClass0wJ.A0M(h7y.A03, "omnipicker_search_end"), 2447);
                    if (AnonymousClass0wJ.A1U(A0I2)) {
                        A0I2.A0T(C62443a0.A00(9, 10, 0), str3);
                        if (z4) {
                            r0 = AnonymousClass29M.SUCCESS;
                        } else {
                            r0 = AnonymousClass29M.ADD_GROUP_MEMBER;
                        }
                        A0I2.A0O(r0, "end_action");
                        A0I2.A0O(C32163H7y.A02(num, (String) null), "result_type");
                        A0I2.A0Q("is_interop_thread", C18240wQ.A0X(AnonymousClass8bP.A0j(AnonymousClass2R4.A00(num), "ig", false)));
                        if (d1s != null && (h7y.A0B || !z4)) {
                            int ordinal = d1s.ordinal();
                            if (ordinal == 2) {
                                r11 = AnonymousClass29O.IG_ADVANCED_CRYPTO_TRANSPORT;
                            } else if (ordinal != 1) {
                                r11 = AnonymousClass29O.IG_DJANGO;
                            } else {
                                r11 = AnonymousClass29O.IG_MESSENGER_INFRA;
                            }
                            A0I2.A0O(r11, TraceFieldType.TransportType);
                        }
                        Set A033 = AnonymousClass4WL.A03(h7y.A04, hashSet);
                        ArrayList A0x2 = AnonymousClass0wJ.A0x(A033, 10);
                        Iterator it4 = A033.iterator();
                        while (it4.hasNext()) {
                            A0x2.add(Long.valueOf(C32163H7y.A00(C18180wK.A0k(it4))));
                        }
                        A0I2.A0U(C28174Ezk.A00(108), A0x2);
                        if (h7y.A09) {
                            A0I2.A0O(AnonymousClass2Mm.A00(h7y.A00), "search_mode");
                        }
                        if (h7y.A07) {
                            A0I2.A0Q("is_epd", Boolean.valueOf(z4));
                        }
                        A0I2.Bb4();
                    }
                }
                h7y.A02 = null;
            }
        }
        USLEBaseShape0S0000000 A0I3 = C18180wK.A0I(AnonymousClass0wJ.A0M(C13330nS.A01(icN, userSession), "direct_thread_add_user"), 553);
        A0I3.A0Q("is_invite", false);
        A0I3.A0U("target_userids", A0v);
        if (z) {
            cmn = (CMN) r2;
        } else if (r2 instanceof MsysThreadId) {
            str = "-1";
            A0I3.A0T("thread_id", str);
            A0I3.Bb4();
            C18180wK.A11(icN);
        } else if (r2 instanceof C23168CnC) {
            cmn = ((C23168CnC) r2).A00;
        } else {
            throw C18180wK.A0a(AnonymousClass0wJ.A0t("Expected DirectThreadId or MsysThreadId: ", r2));
        }
        str = cmn.A00;
        A0I3.A0T("thread_id", str);
        A0I3.Bb4();
        C18180wK.A11(icN);
    }
}

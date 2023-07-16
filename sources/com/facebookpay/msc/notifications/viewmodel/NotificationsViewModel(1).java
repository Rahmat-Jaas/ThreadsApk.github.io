package com.facebookpay.msc.notifications.viewmodel;

import X.AnonymousClass00J;
import X.AnonymousClass066;
import X.AnonymousClass0OY;
import X.AnonymousClass0ZV;
import X.AnonymousClass5k7;
import X.AnonymousClass6IH;
import X.AnonymousClass7BK;
import X.AnonymousClass7Kz;
import X.AnonymousClass7SP;
import X.C04220Ms;
import X.C04530Oa;
import X.C121277Fh;
import X.C123937Zz;
import X.C128277jJ;
import X.C138268Gv;
import X.C143688h9;
import X.C147858q2;
import X.C18180wK;
import X.C18190wL;
import X.C30821GXg;
import X.C62793ak;
import X.C78194i2;
import X.C86114wI;
import X.C86134wK;
import X.C86164wN;
import X.C880756q;
import X.C880856r;
import X.M5J;
import android.os.Bundle;
import com.facebook.quicklog.MarkerEditor;
import com.facebookpay.msc.logging.LoggingData;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class NotificationsViewModel extends C62793ak implements C147858q2 {
    public M5J A00;
    public LoggingData A01;
    public Boolean A02;
    public String A03;
    public List A04;
    public List A05;
    public final M5J A06;
    public final C880756q A07;
    public final C880856r A08 = C880856r.A03();
    public final C04530Oa A09 = AnonymousClass0OY.A02(C138268Gv.A00);

    public final void A03(Bundle bundle) {
        String string;
        List list;
        LoggingData loggingData = null;
        if (bundle != null) {
            loggingData = (LoggingData) bundle.getParcelable("logging_data");
        }
        if (loggingData != null) {
            this.A01 = loggingData;
            if (bundle == null || (string = bundle.getString("parent_view_name")) == null) {
                throw C18180wK.A0a("Required value was null.");
            }
            this.A03 = string;
            ArrayList<String> stringArrayList = bundle.getStringArrayList("payout_subtypes_to_filter");
            if (stringArrayList != null) {
                list = AnonymousClass00J.A0N(stringArrayList);
            } else {
                list = AnonymousClass0ZV.A00;
            }
            this.A05 = list;
            return;
        }
        throw C18180wK.A0a("Required value was null.");
    }

    public final /* synthetic */ void BsJ(AnonymousClass066 r1) {
    }

    public final /* synthetic */ void Btb(AnonymousClass066 r1) {
    }

    public final /* synthetic */ void CAO(AnonymousClass066 r1) {
    }

    public final void CHK(AnonymousClass066 r3) {
        String str;
        C04220Ms.A0B(r3, 0);
        if (this.A04 != null) {
            M5J m5j = this.A00;
            if (m5j != null) {
                str = (String) m5j.A08();
            } else {
                str = null;
            }
            A01(this, str, true);
        }
    }

    public static /* synthetic */ void A00(NotificationsViewModel notificationsViewModel, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, List list, List list2, int i) {
        Object A082;
        String str12;
        String str13 = str2;
        String str14 = str3;
        String str15 = str4;
        String str16 = str5;
        String str17 = str6;
        String str18 = str7;
        String str19 = str8;
        String str20 = str9;
        String str21 = str10;
        int i2 = i;
        List list3 = list2;
        List list4 = list;
        String str22 = null;
        if ((i & 2) != 0) {
            str13 = null;
        }
        if ((i & 4) != 0) {
            str14 = null;
        }
        if ((i & 8) != 0) {
            str15 = null;
        }
        if ((i & 16) != 0) {
            str16 = null;
        }
        if ((i & 32) != 0) {
            str17 = null;
        }
        if ((i & 64) != 0) {
            list4 = null;
        }
        if ((i2 & 128) != 0) {
            list3 = null;
        }
        if ((i2 & 256) != 0) {
            str18 = null;
        }
        if ((i2 & 512) != 0) {
            str19 = null;
        }
        if ((i2 & 1024) != 0) {
            str20 = null;
        }
        if ((i2 & 2048) != 0) {
            str21 = null;
        }
        if ((i2 & 4096) == 0) {
            str22 = str11;
        }
        C143688h9 A083 = AnonymousClass7Kz.A08();
        LoggingData loggingData = notificationsViewModel.A01;
        if (loggingData == null) {
            str12 = "loggingData";
        } else {
            HashMap A002 = AnonymousClass6IH.A00(loggingData);
            String str23 = notificationsViewModel.A03;
            if (str23 == null) {
                str12 = "parentViewName";
            } else {
                C86134wK.A1M(str23, str13, A002);
                M5J m5j = notificationsViewModel.A00;
                if (!(m5j == null || (A082 = m5j.A08()) == null)) {
                    C86164wN.A1I(A082, A002);
                }
                if (str14 != null) {
                    A002.put("notification_identifier", str14);
                }
                if (str15 != null) {
                    A002.put("notification_source", str15);
                }
                if (str16 != null) {
                    A002.put("cta_text", str16);
                }
                if (str17 != null) {
                    A002.put("cta_uri", str17);
                }
                if (list3 != null) {
                    A002.put("holds_list", list3);
                }
                if (list4 != null) {
                    A002.put("notification_id_list", list4);
                }
                if (str18 != null) {
                    A002.put("error_message", str18);
                }
                if (str19 != null) {
                    A002.put("error_stacktrace", str19);
                }
                if (str20 != null) {
                    A002.put("exception_class", str20);
                }
                if (str21 != null) {
                    A002.put("endpoint", str21);
                }
                if (str22 != null) {
                    A002.put("cta_title", str22);
                }
                A083.Bb8(str, A002);
                return;
            }
        }
        C04220Ms.A0E(str12);
        throw null;
    }

    public static final void A01(NotificationsViewModel notificationsViewModel, String str, boolean z) {
        NotificationsViewModel notificationsViewModel2 = notificationsViewModel;
        String str2 = str;
        if (str == null) {
            List list = notificationsViewModel2.A05;
            if (list == null) {
                C04220Ms.A0E("subtypesToFilter");
                throw null;
            } else if (list.isEmpty()) {
                return;
            }
        }
        notificationsViewModel2.A02 = null;
        String str3 = null;
        A00(notificationsViewModel2, "client_fetch_payouthub_init", (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, "BSC_CLIENT_FETCH_NOTIFICATIONS", (String) null, (List) null, (List) null, 6142);
        String str4 = notificationsViewModel2.A03;
        String str5 = "parentViewName";
        if (str4 != null) {
            AnonymousClass7Kz.A06();
            MarkerEditor A022 = AnonymousClass7Kz.A02(667758647, 0);
            if (str2 != null) {
                A022.annotate("financial_entity_id", str2);
            }
            A022.annotate("view_name", str4);
            A022.markerEditingCompleted();
            AnonymousClass7Kz.A06();
            AnonymousClass7BK.A01("fetch_init", (Map) null, 667758647, 0, 10);
            C880756q r3 = notificationsViewModel2.A07;
            C128277jJ r5 = (C128277jJ) notificationsViewModel2.A09.getValue();
            LoggingData loggingData = notificationsViewModel2.A01;
            if (loggingData == null) {
                str5 = "loggingData";
            } else {
                String str6 = loggingData.A00;
                String str7 = notificationsViewModel2.A03;
                if (str7 != null) {
                    String A0o = C86114wI.A0o(str7);
                    switch (A0o.hashCode()) {
                        case -1749375484:
                            if (A0o.equals("ig_product_settings_subpage")) {
                                str3 = "IG_PRODUCT_SETTINGS_SUBPAGE";
                                break;
                            }
                            break;
                        case -349205283:
                            if (A0o.equals("payouthub_payouts")) {
                                str3 = "PAYOUTS";
                                break;
                            }
                            break;
                        case -133197479:
                            if (A0o.equals("payouthub_earnings")) {
                                str3 = "EARNINGS";
                                break;
                            }
                            break;
                        case 530115961:
                            if (A0o.equals("overview")) {
                                str3 = "OVERVIEW";
                                break;
                            }
                            break;
                        case 550105257:
                            if (A0o.equals("payout_details")) {
                                str3 = "PAYOUT_DETAILS";
                                break;
                            }
                            break;
                        case 664105997:
                            if (A0o.equals("earning_details")) {
                                str3 = "EARNING_DETAILS";
                                break;
                            }
                            break;
                        case 1434631203:
                            if (A0o.equals("settings")) {
                                str3 = "SETTINGS";
                                break;
                            }
                            break;
                        case 1954122069:
                            if (A0o.equals("transactions")) {
                                str3 = "TRANSACTIONS";
                                break;
                            }
                            break;
                    }
                    List list2 = notificationsViewModel2.A05;
                    if (list2 == null) {
                        C04220Ms.A0E("subtypesToFilter");
                        throw null;
                    }
                    M5J A002 = AnonymousClass5k7.A00(new AnonymousClass7SP(r5, str2, str6, str3, list2), AnonymousClass7Kz.A0C());
                    C04220Ms.A06(A002);
                    C121277Fh.A02(A002, r3, new C123937Zz(notificationsViewModel2, z));
                    return;
                }
            }
        }
        C04220Ms.A0E(str5);
        throw null;
    }

    public final void A02() {
        short s;
        if (C18190wL.A1Z(this.A02, true)) {
            this.A02 = null;
            s = 2;
        } else if (C18190wL.A1Z(this.A02, false)) {
            this.A02 = null;
            s = 3;
        } else {
            return;
        }
        AnonymousClass7Kz.A06();
        AnonymousClass7BK.A00(667758647, 0, s);
    }

    public final void A04(M5J m5j) {
        M5J m5j2 = this.A00;
        if (m5j2 != null) {
            this.A07.A0J(m5j2);
        }
        this.A00 = m5j;
        C880856r.A05(m5j, this.A07, this, 98);
    }

    public NotificationsViewModel() {
        C880756q A012 = C880756q.A01();
        this.A07 = A012;
        this.A06 = C30821GXg.A01(A012, C78194i2.A00);
    }
}

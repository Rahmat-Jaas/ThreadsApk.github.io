package X;

import com.facebook.proxygen.TraceFieldType;
import java.io.StringWriter;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.7rC  reason: invalid class name and case insensitive filesystem */
public final class C130967rC implements C39678Kxx {
    public final /* bridge */ /* synthetic */ String ChJ(Object obj) {
        C106566fF r8 = (C106566fF) obj;
        StringWriter A0d = C18230wP.A0d();
        MMp A0K = C18180wK.A0K(A0d);
        if (r8.A00 != null) {
            A0K.A0U("pending_reel_seen_states");
            A0K.A0J();
            Iterator A0u = C18190wL.A0u(r8.A00);
            while (A0u.hasNext()) {
                Map.Entry A0o = C18180wK.A0o(A0u);
                if (C86104wH.A0c(A0K, A0o) == null) {
                    A0K.A0H();
                } else {
                    C121797Ie r5 = (C121797Ie) A0o.getValue();
                    A0K.A0J();
                    String str = r5.A02;
                    if (str != null) {
                        A0K.A0d(TraceFieldType.RequestID, str);
                    }
                    if (r5.A03 != null) {
                        A0K.A0U("seen_media_info");
                        A0K.A0J();
                        Iterator A0u2 = C18190wL.A0u(r5.A03);
                        while (A0u2.hasNext()) {
                            Map.Entry A0o2 = C18180wK.A0o(A0u2);
                            if (C86104wH.A0c(A0K, A0o2) == null) {
                                A0K.A0H();
                            } else {
                                C1186371r.A00(A0K, (C106556fE) A0o2.getValue());
                            }
                        }
                        A0K.A0G();
                    }
                    if (r5.A06 != null) {
                        A0K.A0U("skipped_media_info");
                        A0K.A0J();
                        Iterator A0u3 = C18190wL.A0u(r5.A06);
                        while (A0u3.hasNext()) {
                            Map.Entry A0o3 = C18180wK.A0o(A0u3);
                            if (C86104wH.A0c(A0K, A0o3) == null) {
                                A0K.A0H();
                            } else {
                                C1186371r.A00(A0K, (C106556fE) A0o3.getValue());
                            }
                        }
                        A0K.A0G();
                    }
                    if (r5.A04 != null) {
                        A0K.A0U("seen_nuxes");
                        A0K.A0J();
                        Iterator A0u4 = C18190wL.A0u(r5.A04);
                        while (A0u4.hasNext()) {
                            Map.Entry A0o4 = C18180wK.A0o(A0u4);
                            if (C86104wH.A0c(A0K, A0o4) == null) {
                                A0K.A0H();
                            } else {
                                A0K.A0Y(C18230wP.A0u(A0o4));
                            }
                        }
                        A0K.A0G();
                    }
                    if (r5.A07 != null) {
                        A0K.A0U("skipped_nuxes");
                        A0K.A0J();
                        Iterator A0u5 = C18190wL.A0u(r5.A07);
                        while (A0u5.hasNext()) {
                            Map.Entry A0o5 = C18180wK.A0o(A0u5);
                            if (C86104wH.A0c(A0K, A0o5) == null) {
                                A0K.A0H();
                            } else {
                                A0K.A0Y(C18230wP.A0u(A0o5));
                            }
                        }
                        A0K.A0G();
                    }
                    if (r5.A05 != null) {
                        A0K.A0U("seen_replay_info");
                        A0K.A0J();
                        Iterator A0u6 = C18190wL.A0u(r5.A05);
                        while (A0u6.hasNext()) {
                            Map.Entry A0o6 = C18180wK.A0o(A0u6);
                            if (C86104wH.A0c(A0K, A0o6) == null) {
                                A0K.A0H();
                            } else {
                                C1186471s.A00(A0K, (C110806mJ) A0o6.getValue());
                            }
                        }
                        A0K.A0G();
                    }
                    if (r5.A08 != null) {
                        A0K.A0U("skipped_replay_info");
                        A0K.A0J();
                        Iterator A0u7 = C18190wL.A0u(r5.A08);
                        while (A0u7.hasNext()) {
                            Map.Entry A0o7 = C18180wK.A0o(A0u7);
                            if (C86104wH.A0c(A0K, A0o7) == null) {
                                A0K.A0H();
                            } else {
                                C1186471s.A00(A0K, (C110806mJ) A0o7.getValue());
                            }
                        }
                        A0K.A0G();
                    }
                    String str2 = r5.A01;
                    if (str2 != null) {
                        A0K.A0d("container_module", str2);
                    }
                    String str3 = r5.A00;
                    if (str3 != null) {
                        A0K.A0d("notification_type", str3);
                    }
                    A0K.A0G();
                }
            }
            A0K.A0G();
        }
        return C18180wK.A0h(A0K, A0d);
    }

    public final /* bridge */ /* synthetic */ Object CW1(String str) {
        return AnonymousClass6VK.parseFromJson(C18180wK.A0L(str));
    }
}

package X;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import com.facebook.common.stringformat.StringFormatUtil;
import com.instagram.service.session.UserSession;
import com.instagram.unifiedfeedback.api.graphql.FBCommentImpl;
import kotlin.jvm.internal.KtLambdaShape4S0110000_I2;

/* renamed from: X.3IU  reason: invalid class name */
public final class AnonymousClass3IU {
    public final /* synthetic */ AnonymousClass1dM A00;

    public final void A00(View view, C61723Vc r17) {
        long j;
        C566237x r0;
        String stringValue;
        FBCommentImpl.Feedback A002;
        String stringValue2;
        FBCommentImpl fBCommentImpl;
        String stringValue3;
        String str;
        String A0L;
        String formatStrLocaleSafe;
        C566237x r02;
        String A0m;
        String A33;
        Long A02;
        AnonymousClass1dM r7 = this.A00;
        C13330nS r1 = r7.A02;
        if (r1 == null) {
            C18240wQ.A0p();
            throw null;
        }
        USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(r1, "comments_from_facebook_exit_flow"), 426);
        BKU bku = r7.A05;
        if (bku == null || (A33 = bku.A33()) == null || (A02 = AnonymousClass4n2.A02(A33)) == null) {
            j = -1;
        } else {
            j = A02.longValue();
        }
        C18210wN.A18(A0I, j);
        A0I.A0Q("is_exit_to_fb", true);
        A0I.Bb4();
        C61723Vc r5 = r17;
        C61723Vc r12 = r5.A06;
        Context context = view.getContext();
        UserSession A0X = AnonymousClass0wJ.A0X(r7.A0I);
        BKU bku2 = r7.A05;
        if (r12 == null) {
            if (bku2 != null && (r02 = bku2.A0e.A06) != null) {
                String str2 = r02.A01;
                FBCommentImpl fBCommentImpl2 = r5.A05;
                if (fBCommentImpl2 != null && (A0m = C18220wO.A0m(fBCommentImpl2)) != null) {
                    str = "fb_comments_thread";
                    A0L = AnonymousClass00U.A0L("https://www.facebook.com/story/graphql_permalink/?graphql_id=", str2);
                    formatStrLocaleSafe = StringFormatUtil.formatStrLocaleSafe(AnonymousClass320.A01, str2, A0m);
                } else {
                    return;
                }
            } else {
                return;
            }
        } else if (bku2 != null && (r0 = bku2.A0e.A06) != null) {
            String str3 = r0.A01;
            FBCommentImpl fBCommentImpl3 = r12.A05;
            if (fBCommentImpl3 != null && (stringValue = fBCommentImpl3.getStringValue("strong_id__")) != null && (A002 = fBCommentImpl3.A00()) != null && (stringValue2 = A002.getStringValue("strong_id__")) != null && (fBCommentImpl = r5.A05) != null && (stringValue3 = fBCommentImpl.getStringValue("strong_id__")) != null) {
                str = "fb_comments_thread";
                A0L = AnonymousClass00U.A0L("https://www.facebook.com/story/graphql_permalink/?graphql_id=", str3);
                formatStrLocaleSafe = StringFormatUtil.formatStrLocaleSafe(AnonymousClass320.A02, stringValue, stringValue2, str3, stringValue3);
            } else {
                return;
            }
        } else {
            return;
        }
        C60903Qz.A00(context, r7, A0X, str, A0L, formatStrLocaleSafe, (String) null, (String) null, true);
    }

    public AnonymousClass3IU(AnonymousClass1dM r1) {
        this.A00 = r1;
    }

    public final void A01(C61723Vc r5, boolean z) {
        FBCommentImpl.Feedback A002;
        String A0m;
        FBCommentImpl fBCommentImpl = r5.A05;
        if (fBCommentImpl != null && (A002 = fBCommentImpl.A00()) != null && (A0m = C18220wO.A0m(A002)) != null) {
            AnonymousClass1dM.A03(this.A00, A0m, new KtLambdaShape4S0110000_I2(35, r5, z), z);
        }
    }

    public final void A02(String str, int i) {
        long j;
        String str2;
        String str3;
        String A33;
        Long A02;
        AnonymousClass1dM r3 = this.A00;
        if (C63803iN.A0E(AnonymousClass0TJ.A05, AnonymousClass0wJ.A0U(r3.A0I), 2342159620581166307L)) {
            C13330nS r1 = r3.A02;
            if (r1 == null) {
                str3 = "logger";
            } else {
                USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(r1, "comments_from_facebook_reaction_list"), 428);
                BKU bku = r3.A05;
                if (bku == null || (A33 = bku.A33()) == null || (A02 = AnonymousClass4n2.A02(A33)) == null) {
                    j = -1;
                } else {
                    j = A02.longValue();
                }
                C18210wN.A18(A0I, j);
                A0I.A0S("reaction_count", C18230wP.A0f(i));
                A0I.Bb4();
                C684743y r6 = r3.A07;
                if (r6 == null) {
                    str3 = "navigationController";
                } else {
                    r3.requireContext();
                    BKU bku2 = r3.A05;
                    if (bku2 != null && (str2 = bku2.A0f.A4Y) != null) {
                        UserSession userSession = r6.A02;
                        C04220Ms.A0B(userSession, 0);
                        AnonymousClass1dK r2 = new AnonymousClass1dK();
                        Bundle A0E = AnonymousClass0wJ.A0E(userSession);
                        A0E.putString("FbReactionsFragment.ARG_FEEDBACK_ID", str);
                        A0E.putString("FbReactionsFragment.ARG_MEDIA_ID", str2);
                        r2.setArguments(A0E);
                        C37032Jj9 A0L = C18210wN.A0L(userSession);
                        A0L.A0f = true;
                        C18250wR.A1B(A0L, true);
                        A0L.A0I = r2;
                        A0L.A0Z = true;
                        r6.A00.A09(r2, A0L);
                        return;
                    }
                    return;
                }
            }
            C04220Ms.A0E(str3);
            throw null;
        }
    }

    public final void A03(String str, String str2, String str3) {
        AnonymousClass1dM r2 = this.A00;
        C684743y r0 = r2.A07;
        if (r0 == null) {
            C04220Ms.A0E("navigationController");
            throw null;
        }
        BKU bku = r2.A05;
        if (bku != null) {
            r0.A00(r2.requireActivity(), r2, bku, str, str2, str3);
        }
    }
}

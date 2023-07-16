package X;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.redex.IDxCListenerShape208S0100000_6_I2;
import com.instagram.barcelona.R;
import com.instagram.business.promote.model.PromoteData;
import com.instagram.service.session.UserSession;
import kotlin.jvm.internal.KtLambdaShape44S0100000_I2_24;

/* renamed from: X.1Yt  reason: invalid class name and case insensitive filesystem */
public final class C22611Yt extends C34640IcN {
    public static final String __redex_internal_original_name = "PromoteSaveDraftBottomSheetFragment";
    public C37741K2b A00;
    public C37352Jq1 A01;
    public PromoteData A02;
    public UserSession A03;
    public View A04;
    public View A05;
    public View A06;
    public final C04530Oa A07 = AnonymousClass0OY.A02(new KtLambdaShape44S0100000_I2_24(this, 25));

    public final String getModuleName() {
        return "promote_save_draft_bottom_sheet";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        View view2;
        int i;
        C04220Ms.A0B(view, 0);
        super.onViewCreated(view, bundle);
        TextView textView = (TextView) AnonymousClass0wJ.A0J(view, R.id.save_draft_bottom_sheet_title);
        TextView textView2 = (TextView) AnonymousClass0wJ.A0J(view, R.id.save_draft_bottom_sheet_body);
        this.A06 = AnonymousClass0wJ.A0K(view, R.id.save_button_row);
        this.A05 = AnonymousClass0wJ.A0K(view, R.id.discard_button_row);
        this.A04 = AnonymousClass0wJ.A0K(view, R.id.cancel_button_row);
        PromoteData promoteData = this.A02;
        if (promoteData == null) {
            str = "promoteData";
        } else {
            boolean z = promoteData.A21;
            str = "discardButtonRow";
            Resources A0B = AnonymousClass0wJ.A0B(this);
            if (z) {
                C18200wM.A17(A0B, textView, 2131833668);
                C18200wM.A17(AnonymousClass0wJ.A0B(this), textView2, 2131833667);
                View view3 = this.A06;
                if (view3 != null) {
                    C18200wM.A17(AnonymousClass0wJ.A0B(this), (TextView) AnonymousClass0wJ.A0J(view3, R.id.promote_bottom_sheet_button_text), 2131833666);
                    View view4 = this.A06;
                    if (view4 != null) {
                        view4.setOnClickListener(new IDxCListenerShape208S0100000_6_I2((Object) this, 85));
                        View view5 = this.A06;
                        if (view5 != null) {
                            view5.setClickable(true);
                            View view6 = this.A05;
                            if (view6 != null) {
                                TextView textView3 = (TextView) AnonymousClass0wJ.A0J(view6, R.id.promote_bottom_sheet_button_text);
                                C18200wM.A17(AnonymousClass0wJ.A0B(this), textView3, 2131833663);
                                C18180wK.A0s(requireContext(), textView3, R.color.igds_error_or_destructive);
                                view2 = this.A05;
                                if (view2 != null) {
                                    i = 208;
                                }
                            }
                        }
                    }
                }
                C04220Ms.A0E("saveButtonRow");
                throw null;
            }
            C18200wM.A17(A0B, textView, 2131833665);
            C18200wM.A17(AnonymousClass0wJ.A0B(this), textView2, 2131833664);
            View view7 = this.A06;
            if (view7 != null) {
                view7.setVisibility(8);
                View view8 = this.A05;
                if (view8 != null) {
                    TextView textView4 = (TextView) AnonymousClass0wJ.A0J(view8, R.id.promote_bottom_sheet_button_text);
                    C18200wM.A17(AnonymousClass0wJ.A0B(this), textView4, 2131833663);
                    C18180wK.A0s(requireContext(), textView4, R.color.igds_error_or_destructive);
                    view2 = this.A05;
                    if (view2 != null) {
                        i = 209;
                    }
                }
            }
            C04220Ms.A0E("saveButtonRow");
            throw null;
            AnonymousClass0wJ.A16(view2, i, this);
            View view9 = this.A05;
            if (view9 != null) {
                view9.setClickable(true);
                View view10 = this.A04;
                str = "cancelButtonRow";
                if (view10 != null) {
                    C18200wM.A17(AnonymousClass0wJ.A0B(this), (TextView) AnonymousClass0wJ.A0J(view10, R.id.promote_bottom_sheet_button_text), 2131833385);
                    View view11 = this.A04;
                    if (view11 != null) {
                        AnonymousClass0wJ.A16(view11, 210, this);
                        View view12 = this.A04;
                        if (view12 != null) {
                            view12.setClickable(true);
                            return;
                        }
                    }
                }
            }
        }
        C04220Ms.A0E(str);
        throw null;
    }

    public static final String A00(C22611Yt r1) {
        C35394Iu2 iu2;
        PromoteData promoteData = r1.A02;
        if (promoteData == null) {
            C04220Ms.A0E("promoteData");
            throw null;
        }
        if (promoteData.A21) {
            iu2 = C35394Iu2.A19;
        } else if (promoteData.A20) {
            iu2 = C35394Iu2.A0K;
        } else if (promoteData.A1z) {
            iu2 = C35394Iu2.A0E;
        } else {
            iu2 = C35394Iu2.A0U;
        }
        return iu2.toString();
    }

    public static final void A01(C22611Yt r1, boolean z) {
        String str;
        View view = r1.A06;
        if (view == null) {
            str = "saveButtonRow";
        } else {
            view.setClickable(z);
            View view2 = r1.A05;
            if (view2 == null) {
                str = "discardButtonRow";
            } else {
                view2.setClickable(z);
                View view3 = r1.A04;
                if (view3 == null) {
                    str = "cancelButtonRow";
                } else {
                    view3.setClickable(z);
                    return;
                }
            }
        }
        C04220Ms.A0E(str);
        throw null;
    }

    public final C10300i6 getSession() {
        UserSession userSession = this.A03;
        if (userSession != null) {
            return userSession;
        }
        C18210wN.A0m();
        throw null;
    }

    public final void onCreate(Bundle bundle) {
        int A022 = C14030oh.A02(-1513602894);
        super.onCreate(bundle);
        PromoteData A0P = C18190wL.A0P(this);
        this.A02 = A0P;
        String str = "promoteData";
        UserSession userSession = A0P.A0v;
        C04220Ms.A05(userSession);
        this.A03 = userSession;
        PromoteData promoteData = this.A02;
        if (promoteData != null) {
            this.A01 = new C37352Jq1(requireActivity(), this, promoteData.A0v);
            UserSession userSession2 = this.A03;
            if (userSession2 == null) {
                str = "userSession";
            } else {
                C37741K2b A012 = C37741K2b.A01(userSession2);
                C04220Ms.A06(A012);
                this.A00 = A012;
                C14030oh.A09(647245184, A022);
                return;
            }
        }
        C04220Ms.A0E(str);
        throw null;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = C14030oh.A02(1605742993);
        C04220Ms.A0B(layoutInflater, 0);
        View A0D = C18180wK.A0D(layoutInflater, viewGroup, R.layout.promote_save_draft_bottom_sheet_view, false);
        C14030oh.A09(-468981724, A022);
        return A0D;
    }
}

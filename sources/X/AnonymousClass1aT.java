package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import com.google.common.collect.ImmutableList;
import com.instagram.barcelona.R;
import com.instagram.igds.components.button.IgdsButton;
import java.util.Iterator;

/* renamed from: X.1aT  reason: invalid class name */
public final class AnonymousClass1aT extends C34640IcN implements C82034oy {
    public static final String __redex_internal_original_name = "CrosspostingDestinationPickerFragment";
    public C67233zC A00;
    public C67273zH A01;
    public String A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public C83794s0 A08;
    public final C84504tF A09 = new AnonymousClass4L0(this);
    public final C04530Oa A0A = C80644m9.A00(this);
    public final C58143Ed A0B = new C58143Ed(this);

    public final void configureActionBar(AnonymousClass4u2 r2) {
        C04220Ms.A0B(r2, 0);
        AnonymousClass4u2.A08(r2, getString(2131836218));
    }

    public final String getModuleName() {
        return "crossposting_destination_picker_fragment";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        USLEBaseShape0S0000000 A0I;
        String str2;
        C04220Ms.A0B(view, 0);
        super.onViewCreated(view, bundle);
        View A0J = AnonymousClass0wJ.A0J(view, R.id.container);
        View A0J2 = AnonymousClass0wJ.A0J(view, R.id.title);
        TextView textView = (TextView) AnonymousClass0wJ.A0J(view, R.id.subtitle);
        View A0J3 = AnonymousClass0wJ.A0J(view, R.id.divider_line);
        View A0J4 = AnonymousClass0wJ.A0J(view, R.id.share_button);
        IgdsButton igdsButton = (IgdsButton) AnonymousClass0wJ.A0J(view, R.id.turn_off_button);
        if (!this.A06) {
            A0J2.setVisibility(8);
            A0J3.setVisibility(8);
            ViewGroup.LayoutParams layoutParams = A0J.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.height = -1;
            }
        }
        if (!this.A07) {
            int i = 2131836219;
            if (this.A03) {
                i = 2131827392;
            }
            igdsButton.setText(i);
        }
        if (this.A03) {
            textView.setText(2131827391);
        }
        AnonymousClass0wJ.A17(igdsButton, 282, this);
        AnonymousClass0wJ.A17(A0J4, 283, this);
        C04530Oa r3 = this.A0A;
        C696049g A002 = C62173Xp.A00(AnonymousClass0wJ.A0X(r3));
        C696049g.A00(A002);
        ImmutableList A0S = C18220wO.A0S(A002.A01);
        if (A0S.isEmpty()) {
            C10300i6 A0U = AnonymousClass0wJ.A0U(r3);
            str = this.A02;
            C04220Ms.A0B(A0U, 0);
            A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(C13330nS.A02(A0U), "ig_xposting_to_fb_destination_picker"), 1531);
            A0I.A0T("action_name", "should_show_picker_but_no_destinations");
            str2 = "surface";
        } else {
            C696049g A003 = C62173Xp.A00(AnonymousClass0wJ.A0X(r3));
            C696049g.A00(A003);
            Iterator it = A003.A01.iterator();
            int i2 = 0;
            int i3 = 0;
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (!C04220Ms.A0I(((AnonymousClass3CV) it.next()).A00, "FB_USER")) {
                    i3++;
                } else if (i3 != -1) {
                    i2 = i3;
                }
            }
            if (i2 >= A0S.size()) {
                i2 = 0;
            }
            RecyclerView recyclerView = (RecyclerView) AnonymousClass0wJ.A0J(view, R.id.crossposting_destination_list);
            recyclerView.setAdapter(new AnonymousClass11J(this.A0B, A0S, i2));
            requireContext();
            C18200wM.A1H(recyclerView, 1);
            C10300i6 A0U2 = AnonymousClass0wJ.A0U(r3);
            String str3 = this.A02;
            long size = (long) A0S.size();
            str = ((AnonymousClass3CV) A0S.get(i2)).A01;
            C04220Ms.A0B(A0U2, 0);
            A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(C13330nS.A02(A0U2), "ig_xposting_to_fb_destination_picker"), 1531);
            A0I.A0T("action_name", "impression");
            A0I.A0T("surface", str3);
            A0I.A0S("number_of_destinations", Long.valueOf(size));
            str2 = "destination_id";
        }
        A0I.A0T(str2, str);
        A0I.Bb4();
    }

    public static final void A01(AnonymousClass1aT r3, boolean z) {
        C83794s0 r0 = r3.A08;
        if (r0 != null) {
            r0.Bye(z);
        }
        C60373Ot.A00(AnonymousClass0wJ.A0X(r3.A0A), "dismiss_button_tapped", r3.A02);
        r3.A04 = true;
        if (r3.A06) {
            C18180wK.A13(r3);
        } else {
            C18190wL.A1A(r3);
        }
    }

    public static final void A02(AnonymousClass1aT r3, boolean z) {
        C83794s0 r0 = r3.A08;
        if (r0 != null) {
            r0.CMm(z);
        }
        C60373Ot.A00(AnonymousClass0wJ.A0X(r3.A0A), "dismiss_button_tapped", r3.A02);
        r3.A04 = true;
        if (r3.A06) {
            C18180wK.A13(r3);
        } else {
            C18190wL.A1A(r3);
        }
    }

    public final /* bridge */ /* synthetic */ C10300i6 getSession() {
        return AnonymousClass0wJ.A0U(this.A0A);
    }

    public static final void A00(AnonymousClass1aT r3, Integer num, boolean z) {
        int i;
        String str;
        if (r3.getContext() != null) {
            int intValue = num.intValue();
            if (intValue != 0) {
                i = 2131836225;
                if (intValue != 2) {
                    i = 2131836224;
                }
            } else {
                i = 2131836215;
                if (z) {
                    i = 2131836216;
                }
            }
            C63733iD A012 = C63733iD.A01();
            Context context = r3.getContext();
            if (context != null) {
                str = context.getString(i);
            } else {
                str = null;
            }
            A012.A0A = str;
            A012.A0C();
            C63733iD.A09(C38040KHr.A01, A012);
        }
    }

    public final void onCreate(Bundle bundle) {
        String str;
        int A022 = C14030oh.A02(853838764);
        super.onCreate(bundle);
        C04530Oa r5 = this.A0A;
        this.A08 = C62173Xp.A00(AnonymousClass0wJ.A0X(r5)).A03;
        this.A07 = false;
        this.A03 = false;
        Bundle bundle2 = this.mArguments;
        if (bundle2 != null) {
            str = bundle2.getString("trigger_location");
        } else {
            str = null;
        }
        this.A02 = str;
        if (C04220Ms.A0I(str, "share_sheet_your_story")) {
            this.A06 = false;
        } else {
            if (!C04220Ms.A0I(str, "share_sheet_facebook_button")) {
                if (C04220Ms.A0I(str, "ueg_dual_shortcut")) {
                    this.A06 = true;
                } else {
                    if (C04220Ms.A0I(str, "self_story_viewer")) {
                        this.A06 = true;
                    } else if (C04220Ms.A0I(str, "feed_composer")) {
                        this.A06 = true;
                        this.A03 = true;
                    }
                    C14030oh.A09(-1037071149, A022);
                }
            }
            this.A06 = false;
            C14030oh.A09(-1037071149, A022);
        }
        this.A07 = C61453Tm.A00(AnonymousClass0wJ.A0X(r5));
        C14030oh.A09(-1037071149, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = C14030oh.A02(-1294495177);
        C04220Ms.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.story_crossposting_to_facebook_destination_picker_layout, viewGroup, false);
        C14030oh.A09(-464257856, A022);
        return inflate;
    }

    public final void onDestroyView() {
        int A022 = C14030oh.A02(-1998751796);
        super.onDestroyView();
        C04530Oa r2 = this.A0A;
        C62173Xp.A00(AnonymousClass0wJ.A0X(r2)).A03 = null;
        if (!this.A05) {
            C62173Xp.A00(AnonymousClass0wJ.A0X(r2)).A02 = null;
        }
        if (!this.A04) {
            C60373Ot.A00(AnonymousClass0wJ.A0X(r2), "dismiss_by_other_actions", this.A02);
        }
        C14030oh.A09(370271558, A022);
    }
}

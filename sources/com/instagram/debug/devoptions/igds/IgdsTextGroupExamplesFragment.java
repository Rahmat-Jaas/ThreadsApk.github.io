package com.instagram.debug.devoptions.igds;

import X.AnonymousClass0wJ;
import X.AnonymousClass21H;
import X.AnonymousClass4UR;
import X.AnonymousClass4u2;
import X.C04220Ms;
import X.C04530Oa;
import X.C14030oh;
import X.C18190wL;
import X.C18210wN;
import X.C25131lr;
import X.C306122d;
import X.C34640IcN;
import X.C62263Ya;
import X.C82034oy;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.barcelona.R;
import com.instagram.igds.components.textcell.IgdsImageCell;
import com.instagram.service.session.UserSession;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class IgdsTextGroupExamplesFragment extends C34640IcN implements C82034oy {
    public static final String ACTION_CLICKED_TEXT = "Clicked!";
    public static final String ACTION_TEXT = "Action";
    public static final Companion Companion = new Companion();
    public static final String FOOTER_TEXT = "Here is some footer text, just to be used as an example";
    public static final String HEADER_TEXT = "Header Text";
    public static final String IMAGE_CELL_TITLE_TEXT = "Image Cell Title Example";
    public static final String LONG_BODY_TEXT = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Etiam eu nisi lacus. Praesent luctus est sed mauris aliquam, in volutpat justo tincidunt. Cras porta tristique scelerisque. Ut pulvinar sollicitudin ligula, ut suscipit purus vehicula non. Aenean condimentum libero quam, in aliquam nunc tincidunt vel. Nullam rutrum ut tellus eget porta. Cras facilisis viverra nisl, nec elementum est porta mattis. In vel scelerisque mauris. Aenean a auctor arcu.\n\nMorbi auctor arcu ac dictum pretium. Donec vitae faucibus erat. Nulla facilisi. Proin pulvinar lacus vitae nisi volutpat iaculis. Vivamus ut dictum lacus. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia curae; Aliquam erat volutpat. Nulla pulvinar ultrices posuere.";
    public static final String MEDIUM_BODY_TEXT = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Etiam eu nisi lacus. Praesent luctus est sed mauris aliquam, in volutpat justo tincidunt. Cras porta tristique scelerisque. Ut pulvinar sollicitudin ligula, ut suscipit purus vehicula non. Aenean condimentum libero quam, in aliquam nunc tincidunt vel. Nullam rutrum ut tellus eget porta. Cras facilisis viverra nisl, nec elementum est porta mattis. In vel scelerisque mauris. Aenean a auctor arcu.";
    public static final String SHORT_BODY_TEXT = "Lorem ipsum dolor sit amet, consectetur adipiscing elit.";
    public static final String SUBTITLE_TEXT = "Here is a subtitle for example usage";
    public final View.OnClickListener actionOnClickListener = new IgdsTextGroupExamplesFragment$actionOnClickListener$1(this);
    public final C04530Oa userSession$delegate = new AnonymousClass4UR(new IgdsTextGroupExamplesFragment$userSession$2(this));

    public void configureActionBar(AnonymousClass4u2 r2) {
        C04220Ms.A0B(r2, 0);
        AnonymousClass4u2.A07(r2, 2131825260);
    }

    public String getModuleName() {
        return "igds_textgroup_examples";
    }

    private final UserSession getUserSession() {
        return AnonymousClass0wJ.A0X(this.userSession$delegate);
    }

    public final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public Companion() {
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C14030oh.A02(-1207643681);
        C04220Ms.A0B(layoutInflater, 0);
        ViewGroup viewGroup2 = viewGroup;
        super.onCreateView(layoutInflater, viewGroup2, bundle);
        View inflate = layoutInflater.inflate(R.layout.igds_showcase_scrollview, viewGroup2, false);
        C04220Ms.A0C(inflate, "null cannot be cast to non-null type android.widget.ScrollView");
        ViewGroup viewGroup3 = (ViewGroup) AnonymousClass0wJ.A0J(inflate, R.id.igds_component_examples_container);
        C25131lr r5 = new C25131lr(requireContext());
        r5.A02((String) null, (View.OnClickListener) null);
        r5.A01(MEDIUM_BODY_TEXT);
        C18210wN.A0r(requireContext(), r5, viewGroup3, "Header with Body Text");
        C25131lr r8 = new C25131lr(requireContext());
        r8.A02("Action", this.actionOnClickListener);
        r8.A01(LONG_BODY_TEXT);
        r8.A00();
        C18210wN.A0r(requireContext(), r8, viewGroup3, "Header with Action, Body Text, & Footer");
        C25131lr r82 = new C25131lr(requireContext());
        r82.A02("Action", this.actionOnClickListener);
        r82.A01(LONG_BODY_TEXT);
        C306122d r10 = C306122d.TYPE_SWITCH;
        AnonymousClass21H r11 = AnonymousClass21H.LARGE;
        IgdsImageCell igdsImageCell = new IgdsImageCell(C18190wL.A0A(r82), (AttributeSet) null);
        igdsImageCell.A01(IMAGE_CELL_TITLE_TEXT);
        if (SUBTITLE_TEXT.length() == 0) {
            igdsImageCell.A01.setVisibility(8);
        } else {
            TextView textView = igdsImageCell.A01;
            textView.setText(SUBTITLE_TEXT);
            textView.setVisibility(0);
        }
        igdsImageCell.A02.setVisibility(8);
        C04220Ms.A0B(r11, 2);
        igdsImageCell.A06.setImageResource(R.drawable.fb_news_image_gallery_photo1163724590);
        IgdsImageCell.A00(r10, igdsImageCell, (Integer) null);
        r82.addView(igdsImageCell);
        r82.A00();
        C18210wN.A0r(requireContext(), r82, viewGroup3, "Header, Body Text, Image Cell & Footer");
        C25131lr r52 = new C25131lr(requireContext());
        r52.A01(MEDIUM_BODY_TEXT);
        C62263Ya r1 = new C62263Ya(requireContext(), false, false);
        r1.A03("Bullet 1", SHORT_BODY_TEXT, R.drawable.instagram_sparkles_pano_outline_24);
        r1.A03("Bullet 2", SHORT_BODY_TEXT, R.drawable.instagram_direct_pano_outline_24);
        r1.A03("Bullet 3", SHORT_BODY_TEXT, R.drawable.instagram_wishlist_pano_outline_24);
        r52.A03(C62263Ya.A01(r1, "Bullet 4", SHORT_BODY_TEXT, R.drawable.instagram_ads_pano_outline_24));
        r52.A00();
        C18210wN.A0r(requireContext(), r52, viewGroup3, "Body Text, Bullet List & Footer");
        C25131lr r53 = new C25131lr(requireContext());
        r53.A02((String) null, (View.OnClickListener) null);
        C62263Ya r12 = new C62263Ya(requireContext(), false, false);
        r12.A03("Bullet 1", SHORT_BODY_TEXT, R.drawable.instagram_sparkles_pano_outline_24);
        r53.A03(C62263Ya.A01(r12, "Bullet 2", SHORT_BODY_TEXT, R.drawable.instagram_direct_pano_outline_24));
        r53.A01(SHORT_BODY_TEXT);
        C62263Ya r13 = new C62263Ya(requireContext(), false, false);
        r13.A03("Bullet 3", SHORT_BODY_TEXT, R.drawable.instagram_wishlist_pano_outline_24);
        r53.A03(C62263Ya.A01(r13, "Bullet 4", SHORT_BODY_TEXT, R.drawable.instagram_ads_pano_outline_24));
        C18210wN.A0r(requireContext(), r53, viewGroup3, "Header, Bullet List, Body Text & More Bullets");
        C14030oh.A09(-1720761777, A02);
        return inflate;
    }

    public UserSession getSession() {
        return AnonymousClass0wJ.A0X(this.userSession$delegate);
    }
}

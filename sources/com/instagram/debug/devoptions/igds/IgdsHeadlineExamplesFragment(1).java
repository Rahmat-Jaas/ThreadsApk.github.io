package com.instagram.debug.devoptions.igds;

import X.AnonymousClass0wJ;
import X.AnonymousClass4u2;
import X.C04220Ms;
import X.C04530Oa;
import X.C06810aP;
import X.C11630kW;
import X.C14030oh;
import X.C18180wK;
import X.C34640IcN;
import X.C62263Ya;
import X.C80644m9;
import X.C82034oy;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.barcelona.R;
import com.instagram.igds.components.headline.IgdsHeadline;
import com.instagram.service.session.UserSession;
import com.instagram.user.model.User;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class IgdsHeadlineExamplesFragment extends C34640IcN implements C82034oy {
    public static final String BODY_TEXT = "This is an example of body text for an IGDS Headline that should span at least a few lines.";
    public static final Companion Companion = new Companion();

    /* renamed from: ICON */
    public static final int instagram_hashtag_outline_96 = 2131232653;
    public static final String LINK_TEXT = "Click me, please";
    public static final String SUPPORTING_TEXT = "This is supporting text for a headline component in Instagram on Android.";
    public Drawable illustration;
    public final C04530Oa userSession$delegate = C80644m9.A00(this);

    public void configureActionBar(AnonymousClass4u2 r2) {
        C04220Ms.A0B(r2, 0);
        AnonymousClass4u2.A07(r2, 2131825242);
    }

    public String getModuleName() {
        return "igds_headline_examples";
    }

    private final UserSession getUserSession() {
        return AnonymousClass0wJ.A0X(this.userSession$delegate);
    }

    public static /* synthetic */ void setHeadline$default(IgdsHeadlineExamplesFragment igdsHeadlineExamplesFragment, IgdsHeadline igdsHeadline, String str, String str2, String str3, String str4, Integer num, Drawable drawable, List list, User user, int i, Object obj) {
        if ((i & 4) != 0) {
            str2 = null;
        }
        if ((i & 8) != 0) {
            str3 = null;
        }
        if ((i & 16) != 0) {
            str4 = null;
        }
        if ((i & 32) != 0) {
            num = null;
        }
        if ((i & 64) != 0) {
            drawable = null;
        }
        if ((i & 128) != 0) {
            list = null;
        }
        if ((i & 256) != 0) {
            user = null;
        }
        igdsHeadlineExamplesFragment.setHeadline(igdsHeadline, str, str2, str3, str4, num, drawable, list, user);
    }

    public void onViewCreated(View view, Bundle bundle) {
        View view2 = view;
        C04220Ms.A0B(view2, 0);
        super.onViewCreated(view2, bundle);
        IgdsHeadline igdsHeadline = (IgdsHeadline) AnonymousClass0wJ.A0K(view2, R.id.igds_headline_with_body);
        IgdsHeadline igdsHeadline2 = (IgdsHeadline) AnonymousClass0wJ.A0K(view2, R.id.igds_headline_body_support);
        IgdsHeadline igdsHeadline3 = (IgdsHeadline) AnonymousClass0wJ.A0K(view2, R.id.igds_headline_body_support_link);
        IgdsHeadline igdsHeadline4 = (IgdsHeadline) AnonymousClass0wJ.A0K(view2, R.id.igds_headline_icon);
        IgdsHeadline igdsHeadline5 = (IgdsHeadline) AnonymousClass0wJ.A0K(view2, R.id.igds_headline_icon_with_more);
        IgdsHeadline igdsHeadline6 = (IgdsHeadline) AnonymousClass0wJ.A0K(view2, R.id.igds_headline_illustration);
        IgdsHeadline igdsHeadline7 = (IgdsHeadline) AnonymousClass0wJ.A0K(view2, R.id.igds_headline_illustration_with_more);
        IgdsHeadline igdsHeadline8 = (IgdsHeadline) AnonymousClass0wJ.A0K(view2, R.id.igds_headline_emphasized);
        IgdsHeadline igdsHeadline9 = (IgdsHeadline) AnonymousClass0wJ.A0K(view2, R.id.igds_headline_emphasized_with_more);
        IgdsHeadline igdsHeadline10 = (IgdsHeadline) AnonymousClass0wJ.A0K(view2, R.id.igds_headline_emphasized_icon_body);
        IgdsHeadline igdsHeadline11 = (IgdsHeadline) AnonymousClass0wJ.A0K(view2, R.id.igds_headline_emphasized_illustration_body);
        IgdsHeadline igdsHeadline12 = (IgdsHeadline) AnonymousClass0wJ.A0K(view2, R.id.igds_headline_on_media);
        IgdsHeadline igdsHeadline13 = (IgdsHeadline) AnonymousClass0wJ.A0K(view2, R.id.igds_headline_on_media_icon);
        IgdsHeadline igdsHeadline14 = (IgdsHeadline) AnonymousClass0wJ.A0K(view2, R.id.igds_headline_with_bullet_list);
        IgdsHeadline igdsHeadline15 = (IgdsHeadline) AnonymousClass0wJ.A0K(view2, R.id.igds_headline_on_media_with_bullet_list);
        IgdsHeadline igdsHeadline16 = (IgdsHeadline) AnonymousClass0wJ.A0K(view2, R.id.igds_headline_with_profile_pic);
        ((IgdsHeadline) AnonymousClass0wJ.A0J(view2, R.id.igds_headline)).setHeadline((CharSequence) "Headline");
        igdsHeadline.setHeadline((CharSequence) "Headline and Body");
        igdsHeadline.setBody(BODY_TEXT, (View.OnClickListener) null);
        igdsHeadline2.setHeadline((CharSequence) "Headline, Body, and Supporting Text");
        igdsHeadline2.setBody(BODY_TEXT, (View.OnClickListener) null);
        igdsHeadline2.setSupportingText((CharSequence) SUPPORTING_TEXT);
        igdsHeadline3.setHeadline((CharSequence) "Headline, Body, Supporting Text and Link");
        igdsHeadline3.setBody(BODY_TEXT, (View.OnClickListener) null);
        igdsHeadline3.setSupportingText((CharSequence) SUPPORTING_TEXT);
        IgdsHeadlineExamplesFragment$setHeadline$1 igdsHeadlineExamplesFragment$setHeadline$1 = IgdsHeadlineExamplesFragment$setHeadline$1.INSTANCE;
        igdsHeadline3.setLink(LINK_TEXT, igdsHeadlineExamplesFragment$setHeadline$1);
        int i = instagram_hashtag_outline_96;
        Integer valueOf = Integer.valueOf(i);
        igdsHeadline4.setHeadline((CharSequence) "Icon and Headline");
        if (valueOf != null) {
            igdsHeadline4.A08(valueOf.intValue(), false);
        }
        Integer valueOf2 = Integer.valueOf(i);
        String str = BODY_TEXT;
        String str2 = SUPPORTING_TEXT;
        String str3 = LINK_TEXT;
        setHeadline(igdsHeadline5, "Icon, Headline, Body, Supporting Text and Link", str, str2, str3, valueOf2, (Drawable) null, (List) null, (User) null);
        Drawable drawable = this.illustration;
        igdsHeadline6.setHeadline((CharSequence) "Illustration and Emphasized Headline");
        if (drawable != null) {
            igdsHeadline6.setImageDrawable(drawable);
        }
        Drawable drawable2 = this.illustration;
        igdsHeadline7.setHeadline((CharSequence) "Illustration, Emphasized Headline, Body, Supporting Text and Link");
        igdsHeadline7.setBody(BODY_TEXT, (View.OnClickListener) null);
        igdsHeadline7.setSupportingText((CharSequence) SUPPORTING_TEXT);
        igdsHeadline7.setLink(LINK_TEXT, igdsHeadlineExamplesFragment$setHeadline$1);
        if (drawable2 != null) {
            igdsHeadline7.setImageDrawable(drawable2);
        }
        igdsHeadline8.setHeadline((CharSequence) "Emphasized Headline");
        igdsHeadline9.setHeadline((CharSequence) "Emphasized Headline, Body, Supporting Text and Link");
        igdsHeadline9.setBody(BODY_TEXT, (View.OnClickListener) null);
        igdsHeadline9.setSupportingText((CharSequence) SUPPORTING_TEXT);
        igdsHeadline9.setLink(LINK_TEXT, igdsHeadlineExamplesFragment$setHeadline$1);
        igdsHeadline10.setHeadline((CharSequence) "Icon, Emphasized Headline and Body");
        igdsHeadline10.setBody(BODY_TEXT, (View.OnClickListener) null);
        if (valueOf2 != null) {
            igdsHeadline10.A08(valueOf2.intValue(), false);
        }
        Drawable drawable3 = this.illustration;
        igdsHeadline11.setHeadline((CharSequence) "Illustration, Emphasized Headline and Body");
        igdsHeadline11.setBody(BODY_TEXT, (View.OnClickListener) null);
        if (drawable3 != null) {
            igdsHeadline11.setImageDrawable(drawable3);
        }
        igdsHeadline12.setHeadline((CharSequence) "On Media - Headline and Body");
        igdsHeadline12.setBody(BODY_TEXT, (View.OnClickListener) null);
        setHeadline(igdsHeadline13, "On Media - Icon, Headline, Body, Supporting Text and Link", str, str2, str3, valueOf2, (Drawable) null, (List) null, (User) null);
        Context requireContext = requireContext();
        Boolean A0Y = C18180wK.A0Y();
        C62263Ya r1 = new C62263Ya(requireContext, A0Y, false);
        r1.A03("Title 1", "Body Text 1", R.drawable.instagram_sparkles_pano_outline_24);
        r1.A03("Title 2", "Body Text 2", R.drawable.instagram_direct_pano_outline_24);
        List A01 = C62263Ya.A01(r1, "Title 3", "Body Text 3", R.drawable.instagram_wishlist_pano_outline_24);
        igdsHeadline14.setHeadline((CharSequence) "Emphasized Headline, Body and Bullet List");
        igdsHeadline14.setBody(BODY_TEXT, (View.OnClickListener) null);
        if (A01 != null) {
            igdsHeadline14.setBulletList(A01);
        }
        C62263Ya r12 = new C62263Ya(requireContext(), A0Y, A0Y);
        r12.A03("Title 1", "Body Text 1", R.drawable.instagram_sparkles_pano_outline_24);
        r12.A03("Title 2", "Body Text 2", R.drawable.instagram_direct_pano_outline_24);
        List A012 = C62263Ya.A01(r12, "Title 3", "Body Text 3", R.drawable.instagram_wishlist_pano_outline_24);
        igdsHeadline15.setHeadline((CharSequence) "On Media - Headline, Body and Bullet List");
        igdsHeadline15.setBody(BODY_TEXT, (View.OnClickListener) null);
        if (A012 != null) {
            igdsHeadline15.setBulletList(A012);
        }
        User A013 = C06810aP.A01.A01(AnonymousClass0wJ.A0X(this.userSession$delegate));
        igdsHeadline16.setHeadline((CharSequence) "Headline, Body, Profile Picture");
        igdsHeadline16.setBody(BODY_TEXT, (View.OnClickListener) null);
        igdsHeadline16.setCircularImageUrl(A013.B4M(), A013.BK7(), (C11630kW) null);
    }

    public final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public Companion() {
        }
    }

    private final void setHeadline(IgdsHeadline igdsHeadline, String str, String str2, String str3, String str4, Integer num, Drawable drawable, List list, User user) {
        igdsHeadline.setHeadline((CharSequence) str);
        if (str2 != null) {
            igdsHeadline.setBody(str2, (View.OnClickListener) null);
        }
        if (str3 != null) {
            igdsHeadline.setSupportingText((CharSequence) str3);
        }
        if (str4 != null) {
            igdsHeadline.setLink(str4, IgdsHeadlineExamplesFragment$setHeadline$1.INSTANCE);
        }
        if (num != null) {
            igdsHeadline.A08(num.intValue(), false);
        } else if (drawable != null) {
            igdsHeadline.setImageDrawable(drawable);
        } else if (user != null) {
            igdsHeadline.setCircularImageUrl(user.B4M(), user.BK7(), (C11630kW) null);
        }
        if (list != null) {
            igdsHeadline.setBulletList(list);
        }
    }

    public void onCreate(Bundle bundle) {
        int A02 = C14030oh.A02(1288524646);
        super.onCreate(bundle);
        this.illustration = requireContext().getDrawable(R.drawable.lockout);
        C14030oh.A09(709975846, A02);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C14030oh.A02(-694050530);
        C04220Ms.A0B(layoutInflater, 0);
        super.onCreateView(layoutInflater, viewGroup, bundle);
        View A0D = C18180wK.A0D(layoutInflater, viewGroup, R.layout.igds_headline_examples, false);
        C14030oh.A09(1745115652, A02);
        return A0D;
    }

    public UserSession getSession() {
        return AnonymousClass0wJ.A0X(this.userSession$delegate);
    }
}

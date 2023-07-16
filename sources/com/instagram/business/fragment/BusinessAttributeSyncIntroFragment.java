package com.instagram.business.fragment;

import X.AnonymousClass0wJ;
import X.AnonymousClass24J;
import X.AnonymousClass3S4;
import X.AnonymousClass4u2;
import X.C04220Ms;
import X.C10300i6;
import X.C14030oh;
import X.C18180wK;
import X.C18190wL;
import X.C18220wO;
import X.C18240wQ;
import X.C19587Ayn;
import X.C24711ju;
import X.C25703DqR;
import X.C34640IcN;
import X.C62393Zl;
import X.C82034oy;
import X.C82424pb;
import X.C84114sZ;
import X.C84264sr;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.LinearGradient;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import com.instagram.barcelona.R;
import com.instagram.business.activity.BusinessAttributeSyncActivity;
import com.instagram.business.ui.BusinessNavBar;
import com.instagram.igds.components.facepile.IgFacepile;
import com.instagram.service.session.UserSession;
import java.util.Arrays;

public class BusinessAttributeSyncIntroFragment extends C34640IcN implements C82424pb, C82034oy, C84264sr {
    public C84114sZ A00;
    public UserSession A01;
    public BusinessNavBar mBusinessNavBar;
    public C24711ju mBusinessNavBarHelper;

    public final void AHz() {
    }

    public final void AJV() {
    }

    public final void CJ9() {
    }

    public final String getModuleName() {
        return "business_attribute_splash_fragment";
    }

    public final void CCX() {
        C84114sZ r0 = this.A00;
        if (r0 != null) {
            r0.Bek();
            BusinessAttributeSyncActivity businessAttributeSyncActivity = (BusinessAttributeSyncActivity) this.A00;
            AnonymousClass24J Abi = businessAttributeSyncActivity.Abi();
            if (Abi != null && Abi.A00 != null) {
                synchronized (((AnonymousClass3S4) C18180wK.A0c(AnonymousClass0wJ.A0U(businessAttributeSyncActivity.A00), AnonymousClass3S4.class, 7)).A00) {
                }
            }
        }
    }

    public final C10300i6 getSession() {
        return this.A01;
    }

    public final void configureActionBar(AnonymousClass4u2 r3) {
        AnonymousClass4u2.A04(C18190wL.A0K(), r3, this, 118);
    }

    public final void onAttach(Context context) {
        C84114sZ r1;
        super.onAttach(context);
        FragmentActivity activity = getActivity();
        if (activity instanceof C84114sZ) {
            r1 = (C84114sZ) activity;
        } else {
            r1 = null;
        }
        r1.getClass();
        this.A00 = r1;
    }

    public final boolean onBackPressed() {
        C18220wO.A18(this);
        return true;
    }

    public final void onCreate(Bundle bundle) {
        int A02 = C14030oh.A02(568576409);
        super.onCreate(bundle);
        this.A01 = C18180wK.A0V(this.mArguments);
        C14030oh.A09(1651683553, A02);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C14030oh.A02(-324760599);
        View inflate = layoutInflater.inflate(R.layout.business_attribute_sync_intro, viewGroup, false);
        AnonymousClass0wJ.A0L(inflate, R.id.title).setText(2131821566);
        AnonymousClass0wJ.A0L(inflate, R.id.subtitle).setText(2131821565);
        BusinessNavBar A0N = C18240wQ.A0N(inflate);
        this.mBusinessNavBar = A0N;
        this.mBusinessNavBarHelper = new C24711ju(A0N, (C84264sr) this, 2131827967, -1);
        BusinessNavBar businessNavBar = this.mBusinessNavBar;
        businessNavBar.A00.setVisibility(8);
        businessNavBar.A02.setVisibility(0);
        businessNavBar.A03.setPadding(0, 0, 0, 0);
        businessNavBar.A00();
        this.mBusinessNavBar.setFooterTerms(getString(2131821567));
        registerLifecycleListener(this.mBusinessNavBarHelper);
        UserSession userSession = this.A01;
        Context context = inflate.getContext();
        int round = Math.round(inflate.getResources().getDimension(R.dimen._self_serve_linking_artist_avatar_search_size));
        Drawable A022 = C62393Zl.A02(context, AnonymousClass0wJ.A0Y(userSession).B4M(), "business_attribute_splash_fragment");
        Drawable drawable = context.getDrawable(R.drawable.facebook_facepile_icon);
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        Bitmap.Config config = Bitmap.Config.ARGB_8888;
        Bitmap createBitmap = Bitmap.createBitmap(intrinsicWidth, intrinsicHeight, config);
        C18220wO.A15(createBitmap, drawable, 0);
        Drawable A002 = C62393Zl.A00(context, createBitmap, "business_attribute_splash_fragment");
        LinearGradient A012 = C25703DqR.A01(context, round, round);
        Drawable drawable2 = context.getDrawable(R.drawable.instagram_app_instagram_outline_24);
        C04220Ms.A0A(drawable2);
        Drawable mutate = drawable2.mutate();
        C04220Ms.A06(mutate);
        mutate.setTint(-1);
        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
        shapeDrawable.setBounds(new Rect(0, 0, round, round));
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{C19587Ayn.A03(context, A012, shapeDrawable), mutate});
        int round2 = Math.round(((float) (round - mutate.getIntrinsicWidth())) / 2.0f);
        layerDrawable.setLayerInset(1, round2, round2, round2, round2);
        Bitmap createBitmap2 = Bitmap.createBitmap(layerDrawable.getIntrinsicWidth(), layerDrawable.getIntrinsicHeight(), config);
        C18220wO.A15(createBitmap2, layerDrawable, 0);
        C04220Ms.A06(createBitmap2);
        ((IgFacepile) inflate.requireViewById(R.id.social_context_facepile)).setImageDrawables(Arrays.asList(new Drawable[]{C62393Zl.A00(context, createBitmap2, "business_attribute_splash_fragment"), A022, A002}));
        C14030oh.A09(651356188, A02);
        return inflate;
    }

    public final void onDestroyView() {
        int A02 = C14030oh.A02(1789281484);
        super.onDestroyView();
        unregisterLifecycleListener(this.mBusinessNavBarHelper);
        this.mBusinessNavBarHelper = null;
        this.mBusinessNavBar = null;
        C14030oh.A09(1802361108, A02);
    }
}

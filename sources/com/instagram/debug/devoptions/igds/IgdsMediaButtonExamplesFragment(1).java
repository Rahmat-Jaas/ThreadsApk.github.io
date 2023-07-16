package com.instagram.debug.devoptions.igds;

import X.AnonymousClass00U;
import X.AnonymousClass0OY;
import X.AnonymousClass0wJ;
import X.AnonymousClass21G;
import X.AnonymousClass257;
import X.AnonymousClass25V;
import X.AnonymousClass3SM;
import X.AnonymousClass4u2;
import X.C04220Ms;
import X.C04530Oa;
import X.C09860go;
import X.C14030oh;
import X.C18180wK;
import X.C18190wL;
import X.C18220wO;
import X.C18230wP;
import X.C18240wQ;
import X.C18250wR;
import X.C308423e;
import X.C308523f;
import X.C34640IcN;
import X.C82034oy;
import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.LinearLayout;
import com.instagram.barcelona.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.igds.components.mediabutton.IgdsMediaButton;
import com.instagram.igds.components.mediabutton.IgdsMediaToggleButton;
import com.instagram.service.session.UserSession;
import java.util.Locale;

public final class IgdsMediaButtonExamplesFragment extends C34640IcN implements C82034oy {
    public final C04530Oa session$delegate = AnonymousClass0OY.A02(new IgdsMediaButtonExamplesFragment$session$2(this));

    public void configureActionBar(AnonymousClass4u2 r2) {
        C04220Ms.A0B(r2, 0);
        AnonymousClass4u2.A07(r2, 2131825244);
    }

    public String getModuleName() {
        return "igds_media_button_examples";
    }

    public void onViewCreated(View view, Bundle bundle) {
        LinearLayout linearLayout;
        LinearLayout linearLayout2;
        ViewGroup viewGroup;
        View view2 = view;
        C04220Ms.A0B(view2, 0);
        super.onViewCreated(view2, bundle);
        ViewGroup viewGroup2 = (ViewGroup) AnonymousClass0wJ.A0J(view2, 16908298);
        for (C308423e r18 : C308423e.values()) {
            for (AnonymousClass21G r0 : AnonymousClass21G.values()) {
                for (AnonymousClass25V r17 : AnonymousClass25V.values()) {
                    boolean A0I = C04220Ms.A0I(r17.toString(), AnonymousClass25V.DEFAULT_ON_BLACK.toString());
                    if (A0I) {
                        linearLayout = createLinearLayoutForDefaultOnBlackStyle();
                        linearLayout2 = linearLayout;
                    } else {
                        linearLayout = null;
                        linearLayout2 = viewGroup2;
                    }
                    if (linearLayout2 != null) {
                        AnonymousClass21G r19 = r0;
                        addButton(linearLayout2, r17, r18, r19, A0I, false, false, false, (AnonymousClass257) null);
                        addButton(linearLayout2, r17, r18, r19, A0I, true, false, false, (AnonymousClass257) null);
                        addButton(linearLayout2, r17, r18, r0, A0I, false, true, false, (AnonymousClass257) null);
                        addButton(linearLayout2, r17, r18, r19, A0I, true, true, false, (AnonymousClass257) null);
                        if (r0 == AnonymousClass21G.CONSTRAINED) {
                            addButton(linearLayout2, r17, r18, r19, A0I, true, false, false, (AnonymousClass257) null);
                        }
                    }
                    if (A0I && linearLayout != null) {
                        ViewParent parent = linearLayout.getParent();
                        if ((parent instanceof ViewGroup) && (viewGroup = (ViewGroup) parent) != null) {
                            viewGroup.removeView(linearLayout);
                        }
                        viewGroup2.addView(linearLayout);
                    }
                }
                for (AnonymousClass257 r24 : AnonymousClass257.values()) {
                    AnonymousClass25V r172 = AnonymousClass25V.PRIMARY;
                    ViewGroup viewGroup3 = viewGroup2;
                    AnonymousClass21G r192 = r0;
                    addButton(viewGroup3, r172, r18, r192, false, true, false, false, r24);
                    if (r0 == AnonymousClass21G.CONSTRAINED) {
                        addButton(viewGroup3, r172, r18, r192, false, true, false, true, r24);
                    }
                }
            }
        }
    }

    public static /* synthetic */ void addButton$default(IgdsMediaButtonExamplesFragment igdsMediaButtonExamplesFragment, ViewGroup viewGroup, AnonymousClass25V r3, C308423e r4, AnonymousClass21G r5, boolean z, boolean z2, boolean z3, boolean z4, AnonymousClass257 r10, int i, Object obj) {
        boolean A1R = C18240wQ.A1R(i & 128, z4);
        if ((i & 256) != 0) {
            r10 = null;
        }
        igdsMediaButtonExamplesFragment.addButton(viewGroup, r3, r4, r5, z, z2, z3, A1R, r10);
    }

    private final void addButton(ViewGroup viewGroup, AnonymousClass25V r10, C308423e r11, AnonymousClass21G r12, boolean z, boolean z2, boolean z3, boolean z4, AnonymousClass257 r17) {
        IgdsMediaButton igdsMediaButton;
        Context requireContext = requireContext();
        String str = null;
        IgTextView igTextView = new IgTextView(requireContext, (AttributeSet) null, 0, R.style.igds_emphasized_title);
        String styleName = getStyleName(r10);
        String obj = r11.toString();
        Locale locale = Locale.ROOT;
        String A0Y = AnonymousClass00U.A0Y(styleName, C18190wL.A0r(locale, obj), C18190wL.A0r(locale, r12.toString()), ' ', ' ');
        if (z2) {
            A0Y = AnonymousClass00U.A0L(A0Y, ", Start icon");
        }
        if (z3) {
            A0Y = AnonymousClass00U.A0L(A0Y, ", End icon");
        }
        AnonymousClass257 r1 = r17;
        if (r17 != null) {
            A0Y = AnonymousClass00U.A0L(A0Y, ", Toggled");
        }
        igTextView.setText(A0Y);
        C09860go.A0M(igTextView, C18240wQ.A01(requireContext, 8));
        if (z) {
            C18180wK.A0s(requireContext, igTextView, R.color.canvas_bottom_sheet_description_text_color);
        }
        viewGroup.addView(igTextView);
        if (r17 != null) {
            igdsMediaButton = new IgdsMediaToggleButton(requireContext, r1, r11, r12);
            igdsMediaButton.setSelected(true);
        } else {
            igdsMediaButton = new IgdsMediaButton(requireContext, r10, r11, r12);
        }
        if (!z4) {
            igdsMediaButton.setLabel(styleName);
        }
        igdsMediaButton.setOnClickListener(new IgdsMediaButtonExamplesFragment$addButton$1(requireContext));
        C09860go.A0M(igdsMediaButton, C18240wQ.A01(requireContext, 16));
        if (z2) {
            C308423e r3 = C308423e.SMALL;
            int i = R.drawable.instagram_user_following_pano_filled_24;
            if (r11 == r3) {
                i = R.drawable.instagram_sparkles_outline_16;
            }
            AnonymousClass3SM r13 = new AnonymousClass3SM(i);
            if (z4) {
                if (r11 == r3) {
                    str = "Sparkles";
                } else {
                    str = "Following";
                }
            }
            igdsMediaButton.setStartAddOn(r13, str);
        }
        if (z3) {
            igdsMediaButton.setEndAddOn(C308523f.CHEVRON);
        }
        viewGroup.addView(igdsMediaButton);
    }

    private final LinearLayout createLinearLayoutForDefaultOnBlackStyle() {
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        C18190wL.A17(linearLayout);
        linearLayout.setGravity(17);
        C18230wP.A0z(linearLayout.getContext(), linearLayout, R.color.clips_remix_camera_outer_container_default_background);
        return linearLayout;
    }

    private final String getStyleName(AnonymousClass25V r6) {
        String obj = r6.toString();
        String A0s = C18230wP.A0s(obj, 0, 1);
        Locale locale = Locale.ROOT;
        String A0u = C18220wO.A0u(locale, A0s);
        String substring = obj.substring(1);
        C04220Ms.A06(substring);
        return AnonymousClass00U.A0L(A0u, C18250wR.A0h("_").A01(C18190wL.A0r(locale, substring), " "));
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C14030oh.A02(847911766);
        C04220Ms.A0B(layoutInflater, 0);
        super.onCreateView(layoutInflater, viewGroup, bundle);
        View A0E = C18240wQ.A0E(layoutInflater, R.layout.igds_media_button_examples);
        C14030oh.A09(-1795037012, A02);
        return A0E;
    }

    public UserSession getSession() {
        return AnonymousClass0wJ.A0X(this.session$delegate);
    }
}

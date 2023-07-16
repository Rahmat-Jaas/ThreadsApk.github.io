package com.instagram.debug.devoptions.igds;

import X.AnonymousClass0wJ;
import X.AnonymousClass21H;
import X.AnonymousClass223;
import X.AnonymousClass22e;
import X.AnonymousClass24V;
import X.AnonymousClass4u2;
import X.C04220Ms;
import X.C04530Oa;
import X.C14030oh;
import X.C18210wN;
import X.C18230wP;
import X.C18240wQ;
import X.C19010yT;
import X.C19020yV;
import X.C19030yW;
import X.C306122d;
import X.C34640IcN;
import X.C80644m9;
import X.C82034oy;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.instagram.barcelona.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.igds.components.textcell.IgdsActionCell;
import com.instagram.igds.components.textcell.IgdsFooterCell;
import com.instagram.igds.components.textcell.IgdsImageCell;
import com.instagram.igds.components.textcell.IgdsListCell;
import com.instagram.service.session.UserSession;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class IgdsTextCellExamplesFragment extends C34640IcN implements C82034oy {
    public static final String ACTION_CLICKED_TEXT = "Clicked!";
    public static final String ACTION_TEXT = "Action";
    public static final Companion Companion = new Companion();
    public static final String DETAIL_TEXT = "1 new message";
    public static final String GROUP_HEADER_TEXT = "Group Header Text";
    public static final String HEADER_TEXT = "Header Text";
    public static final String LONG_SUPPORTING_TEXT = "This is supportive text that could also span 1 line before truncating";
    public static final String LONG_TEXT = "This is very long placeholder text that should span at least a few lines. This is very long placeholder text that should span at least a few lines.";
    public static final String LONG_TITLE = "This is the title of the item and if you have a lot to say it can wrap to the next line";
    public static final String SUBTITLE = "Subtitle";
    public static final String TITLE = "Title";
    public static final String TOGGLE_OFF = "Toggled off";
    public static final String TOGGLE_ON = "Toggled on";
    public View.OnClickListener actionOnClickListener;
    public Drawable iconDrawable;
    public LinearLayout linearLayout;
    public final C04530Oa userSession$delegate = C80644m9.A00(this);

    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AnonymousClass24V.values().length];
            try {
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[3] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[4] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[5] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public void configureActionBar(AnonymousClass4u2 r2) {
        C04220Ms.A0B(r2, 0);
        AnonymousClass4u2.A07(r2, 2131825259);
    }

    public String getModuleName() {
        return "igds_textcell_examples";
    }

    public void onViewCreated(View view, Bundle bundle) {
        View view2 = view;
        C04220Ms.A0B(view2, 0);
        super.onViewCreated(view2, bundle);
        AnonymousClass24V r4 = AnonymousClass24V.TYPE_UNKNOWN;
        configureTextCell("1 Line - Default", r4, false, (String) null, false, false, false);
        configureTextCell("2 Line - Default", r4, false, SUBTITLE, false, false, false);
        configureTextCell("2 Line with long text - Default", r4, false, LONG_TEXT, false, false, false);
        AnonymousClass24V r18 = AnonymousClass24V.TYPE_SWITCH;
        configureTextCell("1 Line - Switch", r18, false, (String) null, false, false, false);
        String str = SUBTITLE;
        configureTextCell("2 Line - Switch", r18, false, str, false, false, false);
        configureTextCell("2 Line - Switch - Disabled", r18, true, str, false, false, false);
        configureTextCell("2 Line with long text - Switch", r18, false, LONG_TEXT, false, false, false);
        AnonymousClass24V r182 = AnonymousClass24V.TYPE_RADIO;
        configureTextCell("1 Line - Radio", r182, false, (String) null, false, false, false);
        String str2 = SUBTITLE;
        configureTextCell("2 Line - Radio", r182, false, str2, false, false, false);
        configureTextCell("2 Line - Radio - Disabled", r182, true, str2, false, false, false);
        AnonymousClass24V r183 = AnonymousClass24V.TYPE_CHECKBOX;
        configureTextCell("1 Line - Checkbox", r183, false, (String) null, false, false, false);
        String str3 = SUBTITLE;
        configureTextCell("2 Line - Checkbox", r183, false, str3, false, false, false);
        configureTextCell("2 Line - Checkbox - Disabled", r183, true, str3, false, false, false);
        AnonymousClass24V r184 = AnonymousClass24V.TYPE_CHEVRON;
        configureTextCell("1 Line - Chevron", r184, false, (String) null, false, false, false);
        configureTextCell("2 Line - Chevron", r184, false, SUBTITLE, false, false, false);
        AnonymousClass24V r185 = AnonymousClass24V.TYPE_PROGRESS;
        configureTextCell("1 Line - Progress", r185, false, (String) null, false, false, false);
        configureTextCell("2 Line - Progress", r185, false, SUBTITLE, false, false, false);
        configureTextCell("1 Line - Detail", r4, false, (String) null, false, true, false);
        AnonymousClass24V r13 = r4;
        configureTextCell("2 Line - Detail", r13, false, SUBTITLE, false, true, false);
        configureTextCell("1 Line - Badge + Detail", r4, false, (String) null, false, true, true);
        configureTextCell("2 Line - Badge + Detail", r13, false, SUBTITLE, false, true, true);
        configureTextCell("1 Line - Icon", r4, false, (String) null, true, false, false);
        configureTextCell("2 Line - Icon", r13, false, SUBTITLE, true, false, false);
        configureStatusCell("Status Cell - Success", AnonymousClass22e.SUCCESS, R.drawable.instagram_visual_search_pano_outline_24);
        configureStatusCell("Status Cell - Warning", AnonymousClass22e.WARNING, R.drawable.instagram_avatar_outline_24);
        configureStatusCell("Status Cell - Error", AnonymousClass22e.ERROR, R.drawable.instagram_lux_pano_outline_24);
        configureBodyTextCell("Body Text");
        AnonymousClass223 r6 = AnonymousClass223.DEFAULT;
        configureActionCell("Action - Default", r6, true);
        configureActionCell("Action - Emphasized", AnonymousClass223.EMPHASIZED, true);
        configureActionCell("Action - Destructive", AnonymousClass223.DESTRUCTIVE, true);
        configureActionCell("Action - Default - Disabled", r6, false);
        C306122d r132 = C306122d.TYPE_RADIO;
        AnonymousClass21H r17 = AnonymousClass21H.LARGE;
        configureImageCell("Image Cell - Primary, Secondary, & Supporting Text", r132, TITLE, SUBTITLE, DETAIL_TEXT, r17, (Integer) null, true);
        C306122d r20 = C306122d.TYPE_CHEVRON;
        String str4 = TITLE;
        String str5 = SUBTITLE;
        configureImageCell("Image Cell - Primary & Secondary Text", r20, str4, str5, "", r17, (Integer) null, true);
        AnonymousClass21H r30 = r17;
        configureImageCell("Image Cell - Primary Text Only", r132, TITLE, "", "", r30, (Integer) null, true);
        configureImageCell("Image Cell - Wrapped Text", r20, LONG_TITLE, LONG_TEXT, LONG_SUPPORTING_TEXT, r30, (Integer) null, true);
        C306122d r133 = r20;
        String str6 = "";
        configureImageCell("Image Cell - Chevron", r133, TITLE, SUBTITLE, str6, r17, (Integer) null, true);
        configureImageCell("Image Cell - Chevron (Disabled)", r133, TITLE, SUBTITLE, str6, r17, (Integer) null, false);
        C306122d r134 = C306122d.TYPE_SWITCH;
        configureImageCell("Image Cell - Switch", r134, TITLE, SUBTITLE, str6, r17, (Integer) null, true);
        configureImageCell("Image Cell - Switch (Disabled)", r134, TITLE, SUBTITLE, str6, r17, (Integer) null, false);
        AnonymousClass21H r24 = AnonymousClass21H.SMALL;
        configureImageCell("Image Cell - Small Image, Primary, Secondary", r20, str4, str5, "", r24, (Integer) null, true);
        String str7 = "";
        configureImageCell("Image Cell - 3 Dot Menu", C306122d.TYPE_ICON, TITLE, SUBTITLE, str7, r17, Integer.valueOf(R.drawable.instagram_more_horizontal_pano_outline_24), true);
        configureImageCell("Image Cell - Small Image, Primary, Secondary & Supporting Text", r134, str4, str5, LONG_SUPPORTING_TEXT, r24, (Integer) null, true);
        LinearLayout linearLayout2 = this.linearLayout;
        if (linearLayout2 == null) {
            C04220Ms.A0E("linearLayout");
            throw null;
        }
        Context requireContext = requireContext();
        C19030yW r42 = new C19030yW(requireContext());
        r42.A01("Header Text");
        C18210wN.A0r(requireContext, r42, linearLayout2, "Header Cell");
        LinearLayout linearLayout3 = this.linearLayout;
        if (linearLayout3 == null) {
            C04220Ms.A0E("linearLayout");
            throw null;
        }
        Context requireContext2 = requireContext();
        C19030yW r43 = new C19030yW(requireContext());
        r43.A01("Header Text");
        View.OnClickListener onClickListener = this.actionOnClickListener;
        if (onClickListener == null) {
            C04220Ms.A0E("actionOnClickListener");
            throw null;
        }
        r43.A03("Action", onClickListener);
        C18210wN.A0r(requireContext2, r43, linearLayout3, "Header Cell - With Action");
        LinearLayout linearLayout4 = this.linearLayout;
        if (linearLayout4 == null) {
            C04220Ms.A0E("linearLayout");
            throw null;
        }
        Context requireContext3 = requireContext();
        C19020yV r44 = new C19020yV(requireContext());
        r44.A00(GROUP_HEADER_TEXT);
        C18210wN.A0r(requireContext3, r44, linearLayout4, "Group Header Cell");
        LinearLayout linearLayout5 = this.linearLayout;
        if (linearLayout5 == null) {
            C04220Ms.A0E("linearLayout");
            throw null;
        }
        Context requireContext4 = requireContext();
        C19020yV r45 = new C19020yV(requireContext());
        r45.A00(GROUP_HEADER_TEXT);
        View.OnClickListener onClickListener2 = this.actionOnClickListener;
        if (onClickListener2 == null) {
            C04220Ms.A0E("actionOnClickListener");
            throw null;
        }
        r45.A01("Action", onClickListener2);
        C18210wN.A0r(requireContext4, r45, linearLayout5, "Group Header Cell - With Action");
        LinearLayout linearLayout6 = this.linearLayout;
        if (linearLayout6 == null) {
            C04220Ms.A0E("linearLayout");
            throw null;
        }
        Context requireContext5 = requireContext();
        C19020yV r46 = new C19020yV(requireContext());
        r46.A00("When header is really super long have it wrap to a second line");
        View.OnClickListener onClickListener3 = this.actionOnClickListener;
        if (onClickListener3 == null) {
            C04220Ms.A0E("actionOnClickListener");
            throw null;
        }
        r46.A01("Actions can wrap too", onClickListener3);
        C18210wN.A0r(requireContext5, r46, linearLayout6, "Group Header Cell - With Wrapped Text");
        LinearLayout linearLayout7 = this.linearLayout;
        if (linearLayout7 == null) {
            C04220Ms.A0E("linearLayout");
            throw null;
        }
        Context requireContext6 = requireContext();
        C19020yV r47 = new C19020yV(requireContext());
        r47.A00("When header is too long for even just 2 lines, then it should truncate at the end too. This is a good example of how it will look");
        View.OnClickListener onClickListener4 = this.actionOnClickListener;
        if (onClickListener4 == null) {
            C04220Ms.A0E("actionOnClickListener");
            throw null;
        }
        r47.A01("Actions can wrap too", onClickListener4);
        C18210wN.A0r(requireContext6, r47, linearLayout7, "Group Header Cell - With Truncated Text");
        LinearLayout linearLayout8 = this.linearLayout;
        if (linearLayout8 == null) {
            C04220Ms.A0E("linearLayout");
            throw null;
        }
        Context requireContext7 = requireContext();
        IgdsFooterCell igdsFooterCell = new IgdsFooterCell(requireContext(), (AttributeSet) null);
        igdsFooterCell.A00(LONG_TEXT);
        C18210wN.A0r(requireContext7, igdsFooterCell, linearLayout8, "Footer Cell");
        LinearLayout linearLayout9 = this.linearLayout;
        if (linearLayout9 == null) {
            C04220Ms.A0E("linearLayout");
            throw null;
        }
        Context requireContext8 = requireContext();
        IgdsFooterCell igdsFooterCell2 = new IgdsFooterCell(requireContext(), (AttributeSet) null);
        igdsFooterCell2.A00(LONG_TEXT);
        igdsFooterCell2.A00.setVisibility(0);
        igdsFooterCell2.A01.setVisibility(0);
        C18210wN.A0r(requireContext8, igdsFooterCell2, linearLayout9, "Footer Cell - With Extra Space & Separator");
    }

    public static /* synthetic */ void configureImageCell$default(IgdsTextCellExamplesFragment igdsTextCellExamplesFragment, String str, C306122d r4, String str2, String str3, String str4, AnonymousClass21H r8, Integer num, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            str2 = TITLE;
        }
        if ((i & 8) != 0) {
            str3 = "";
        }
        if ((i & 16) != 0) {
            str4 = "";
        }
        if ((i & 32) != 0) {
            r8 = AnonymousClass21H.LARGE;
        }
        if ((i & 64) != 0) {
            num = null;
        }
        if ((i & 128) != 0) {
            z = true;
        }
        igdsTextCellExamplesFragment.configureImageCell(str, r4, str2, str3, str4, r8, num, z);
    }

    public static /* synthetic */ void configureTextCell$default(IgdsTextCellExamplesFragment igdsTextCellExamplesFragment, String str, AnonymousClass24V r3, boolean z, String str2, boolean z2, boolean z3, boolean z4, int i, Object obj) {
        boolean A1R = C18240wQ.A1R(i & 4, z);
        if ((i & 8) != 0) {
            str2 = null;
        }
        igdsTextCellExamplesFragment.configureTextCell(str, r3, A1R, str2, C18240wQ.A1R(i & 16, z2), C18240wQ.A1R(i & 32, z3), C18240wQ.A1R(i & 64, z4));
    }

    private final UserSession getUserSession() {
        return AnonymousClass0wJ.A0X(this.userSession$delegate);
    }

    private final void setOnCheckedChangeListener(IgdsListCell igdsListCell) {
        igdsListCell.A0C(new IgdsTextCellExamplesFragment$setOnCheckedChangeListener$1(this));
    }

    private final void setSwitchToggleListener(IgdsListCell igdsListCell) {
        igdsListCell.A0D(new IgdsTextCellExamplesFragment$setSwitchToggleListener$1(this));
    }

    public final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public Companion() {
        }
    }

    private final void configureActionCell(String str, AnonymousClass223 r7, boolean z) {
        IgdsActionCell igdsActionCell = new IgdsActionCell(requireContext(), (AttributeSet) null, 0);
        View.OnClickListener onClickListener = this.actionOnClickListener;
        if (onClickListener == null) {
            C04220Ms.A0E("actionOnClickListener");
            throw null;
        }
        igdsActionCell.A00(onClickListener, r7, "Action");
        igdsActionCell.setEnabled(z);
        IgTextView igTextView = igdsActionCell.A00;
        C04220Ms.A0B(igTextView, 0);
        igTextView.setAlpha(C18230wP.A00(z ? 1 : 0));
        IgdsComponentDemoRow igdsComponentDemoRow = new IgdsComponentDemoRow(requireContext(), str, igdsActionCell);
        LinearLayout linearLayout2 = this.linearLayout;
        if (linearLayout2 == null) {
            C04220Ms.A0E("linearLayout");
            throw null;
        } else {
            linearLayout2.addView(igdsComponentDemoRow);
        }
    }

    private final void configureBodyTextCell(String str) {
        C19010yT r2 = new C19010yT(requireContext());
        r2.A00.setText("This is another body text that you should read because you might learn something awesome important this app that you didn’t know before. Like something life changing about safety, privacy, monetization, and then you can tell your friends about it.");
        IgdsComponentDemoRow igdsComponentDemoRow = new IgdsComponentDemoRow(requireContext(), str, r2);
        LinearLayout linearLayout2 = this.linearLayout;
        if (linearLayout2 == null) {
            C04220Ms.A0E("linearLayout");
            throw null;
        } else {
            linearLayout2.addView(igdsComponentDemoRow);
        }
    }

    private final void configureImageCell(String str, C306122d r8, String str2, String str3, String str4, AnonymousClass21H r12, Integer num, boolean z) {
        IgdsImageCell igdsImageCell = new IgdsImageCell(requireContext(), (AttributeSet) null);
        igdsImageCell.A01(str2);
        if (str3 == null || str3.length() == 0) {
            igdsImageCell.A01.setVisibility(8);
        } else {
            TextView textView = igdsImageCell.A01;
            textView.setText(str3);
            textView.setVisibility(0);
        }
        if (str4 == null || str4.length() == 0) {
            igdsImageCell.A02.setVisibility(8);
        } else {
            TextView textView2 = igdsImageCell.A02;
            textView2.setText(str4);
            textView2.setVisibility(0);
        }
        C04220Ms.A0B(r12, 2);
        if (r12 == AnonymousClass21H.SMALL) {
            float dimension = igdsImageCell.getResources().getDimension(R.dimen._self_serve_linking_artist_avatar_search_size);
            IgImageView igImageView = igdsImageCell.A06;
            int i = (int) dimension;
            igImageView.getLayoutParams().height = i;
            igImageView.getLayoutParams().width = i;
            igImageView.requestLayout();
        }
        igdsImageCell.A06.setImageResource(R.drawable.fb_news_image_gallery_photo1163724590);
        IgdsImageCell.A00(r8, igdsImageCell, num);
        igdsImageCell.setEnabled(z);
        IgdsComponentDemoRow igdsComponentDemoRow = new IgdsComponentDemoRow(requireContext(), str, igdsImageCell);
        LinearLayout linearLayout2 = this.linearLayout;
        if (linearLayout2 == null) {
            C04220Ms.A0E("linearLayout");
            throw null;
        } else {
            linearLayout2.addView(igdsComponentDemoRow);
        }
    }

    private final void configureStatusCell(String str, AnonymousClass22e r6, int i) {
        IgdsListCell igdsListCell = new IgdsListCell(requireContext(), (AttributeSet) null);
        igdsListCell.A0H(TITLE);
        igdsListCell.A0G(SUBTITLE);
        igdsListCell.setTextCellType(AnonymousClass24V.TYPE_CHEVRON);
        igdsListCell.A0E(r6);
        Drawable drawable = requireContext().getDrawable(i);
        if (drawable != null) {
            igdsListCell.A08(drawable);
        }
        IgdsComponentDemoRow igdsComponentDemoRow = new IgdsComponentDemoRow(requireContext(), str, igdsListCell);
        LinearLayout linearLayout2 = this.linearLayout;
        if (linearLayout2 == null) {
            C04220Ms.A0E("linearLayout");
            throw null;
        } else {
            linearLayout2.addView(igdsComponentDemoRow);
        }
    }

    private final void configureTextCell(String str, AnonymousClass24V r7, boolean z, String str2, boolean z2, boolean z3, boolean z4) {
        Drawable drawable;
        IgdsListCell igdsListCell = new IgdsListCell(requireContext(), (AttributeSet) null);
        igdsListCell.A0H(TITLE);
        if (str2 != null) {
            igdsListCell.A0G(str2);
        }
        if (z2 && (drawable = this.iconDrawable) != null) {
            igdsListCell.A08(drawable);
        }
        if (z3) {
            igdsListCell.A0I(DETAIL_TEXT, "You have 1 new message", z4);
        } else {
            int ordinal = r7.ordinal();
            if (ordinal == 1) {
                igdsListCell.setTextCellType(AnonymousClass24V.TYPE_SWITCH);
                setSwitchToggleListener(igdsListCell);
            } else if (ordinal == 2) {
                igdsListCell.setTextCellType(AnonymousClass24V.TYPE_RADIO);
                setOnCheckedChangeListener(igdsListCell);
            } else if (ordinal == 3) {
                igdsListCell.setTextCellType(AnonymousClass24V.TYPE_CHECKBOX);
                setOnCheckedChangeListener(igdsListCell);
            } else if (ordinal == 4) {
                igdsListCell.setTextCellType(AnonymousClass24V.TYPE_CHEVRON);
            } else if (ordinal == 5) {
                igdsListCell.setTextCellType(AnonymousClass24V.TYPE_PROGRESS);
            }
        }
        if (z) {
            igdsListCell.setEnabled(false);
        }
        IgdsComponentDemoRow igdsComponentDemoRow = new IgdsComponentDemoRow(requireContext(), str, igdsListCell);
        LinearLayout linearLayout2 = this.linearLayout;
        if (linearLayout2 == null) {
            C04220Ms.A0E("linearLayout");
            throw null;
        } else {
            linearLayout2.addView(igdsComponentDemoRow);
        }
    }

    public void onCreate(Bundle bundle) {
        int A02 = C14030oh.A02(-1170330207);
        super.onCreate(bundle);
        Drawable drawable = requireContext().getDrawable(R.drawable.instagram_circle_add_pano_filled_24);
        if (drawable != null) {
            this.iconDrawable = drawable;
        }
        this.actionOnClickListener = new IgdsTextCellExamplesFragment$onCreate$2(this);
        C14030oh.A09(143664330, A02);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C14030oh.A02(-505238531);
        C04220Ms.A0B(layoutInflater, 0);
        super.onCreateView(layoutInflater, viewGroup, bundle);
        View inflate = layoutInflater.inflate(R.layout.igds_showcase_scrollview, viewGroup, false);
        C04220Ms.A0C(inflate, "null cannot be cast to non-null type android.widget.ScrollView");
        this.linearLayout = (LinearLayout) AnonymousClass0wJ.A0J(inflate, R.id.igds_component_examples_container);
        C14030oh.A09(387827294, A02);
        return inflate;
    }

    public UserSession getSession() {
        return AnonymousClass0wJ.A0X(this.userSession$delegate);
    }
}

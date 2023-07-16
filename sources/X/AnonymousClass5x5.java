package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import com.facebook.redex.IDxCListenerShape3S0301000_2_I2;
import com.instagram.api.schemas.StoryPollColorType;
import com.instagram.barcelona.R;
import com.instagram.common.ui.base.IgLinearLayout;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.KtLambdaShape23S0200000_I2_7;
import kotlin.jvm.internal.KtLambdaShape50S0100000_I2_30;

/* renamed from: X.5x5  reason: invalid class name */
public final class AnonymousClass5x5 extends C34640IcN implements C82034oy {
    public static final String __redex_internal_original_name = "CommentPollCreationFragment";
    public int A00;
    public ViewGroup A01;
    public EditText A02;
    public ArrayList A03;
    public final List A04;
    public final List A05;
    public final C04530Oa A06;
    public final C04530Oa A07 = AnonymousClass3W9.A00(this);

    public static final IgLinearLayout A00(AnonymousClass5x5 r7, String str, int i, boolean z) {
        int i2;
        C64493mQ r2;
        AnonymousClass5x5 r6 = r7;
        View inflate = LayoutInflater.from(r7.requireContext()).inflate(R.layout.comment_poll_creation_option_row, r7.A01, false);
        C04220Ms.A0C(inflate, C18170wI.A00(199));
        IgLinearLayout igLinearLayout = (IgLinearLayout) inflate;
        EditText editText = (EditText) igLinearLayout.findViewById(R.id.option_row_edit_text);
        int i3 = i;
        if (str != null) {
            editText.setText(str);
        } else {
            Context requireContext = r6.requireContext();
            C04220Ms.A04(editText);
            AnonymousClass7IM.A00(requireContext, editText, i, z);
        }
        AnonymousClass7IM.A00.A03(igLinearLayout, i, !AnonymousClass7IM.A02(editText));
        Context requireContext2 = r6.requireContext();
        if (!z) {
            i2 = R.drawable.comment_poll_option_row_hint_background;
        } else {
            i2 = R.drawable.comment_poll_option_row_background;
        }
        Drawable drawable = requireContext2.getDrawable(i2);
        if (drawable != null) {
            igLinearLayout.setBackground(drawable);
            C86104wH.A1C(igLinearLayout.findViewById(R.id.poll_row_add_icon), 115, editText);
            igLinearLayout.findViewById(R.id.poll_row_delete_icon).setOnClickListener(new IDxCListenerShape3S0301000_2_I2(i3, 1, editText, r6, igLinearLayout));
            if (z) {
                r2 = new AnonymousClass65S(editText, 1);
            } else {
                AnonymousClass65V r22 = new AnonymousClass65V();
                AnonymousClass65S r0 = new AnonymousClass65S(editText, 1);
                List list = r22.A00;
                list.add(r0);
                list.add(new AnonymousClass65T(editText, r6, igLinearLayout, i));
                r2 = r22;
            }
            editText.addTextChangedListener(r2);
            return igLinearLayout;
        }
        throw AnonymousClass0wJ.A0b();
    }

    public final void configureActionBar(AnonymousClass4u2 r5) {
        C04220Ms.A0B(r5, 0);
        r5.Crr(new C25348Dk8(C86134wK.A0P(this, 114), AnonymousClass0wJ.A0B(this).getString(2131821093), 0));
        C25764Drc drc = new C25764Drc();
        drc.A00 = R.drawable.instagram_x_pano_outline_24;
        drc.A0C = C18190wL.A0H(this, 262);
        AnonymousClass4u2.A03(drc, r5);
    }

    public final String getModuleName() {
        return "comment_poll_creation";
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0058, code lost:
        if (r4 < r11.A03.size()) goto L_0x005a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onViewCreated(android.view.View r12, android.os.Bundle r13) {
        /*
            r11 = this;
            r3 = 0
            X.C04220Ms.A0B(r12, r3)
            super.onViewCreated(r12, r13)
            r0 = 2131305125(0x7f0922a5, float:1.8228412E38)
            android.view.View r2 = r12.findViewById(r0)
            android.widget.EditText r2 = (android.widget.EditText) r2
            r1 = 1
            X.65S r0 = new X.65S
            r0.<init>(r2, r1)
            r2.addTextChangedListener(r0)
            android.os.Bundle r1 = r11.requireArguments()
            r0 = 783(0x30f, float:1.097E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            java.lang.String r0 = r1.getString(r0)
            r2.setText(r0)
            r11.A02 = r2
            r0 = 2131303934(0x7f091dfe, float:1.8225996E38)
            android.view.View r0 = r12.findViewById(r0)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r11.A01 = r0
            java.util.ArrayList r2 = r11.A03
            int r0 = r2.size()
            r5 = 3
            if (r0 < r5) goto L_0x004b
            r1 = 4
            int r0 = r2.size()
            int r0 = r0 + 1
            int r5 = java.lang.Math.min(r1, r0)
        L_0x004b:
            r4 = 0
        L_0x004c:
            if (r4 >= r5) goto L_0x0071
            r0 = 2
            if (r4 < r0) goto L_0x005a
            java.util.ArrayList r0 = r11.A03
            int r0 = r0.size()
            r2 = 0
            if (r4 >= r0) goto L_0x005b
        L_0x005a:
            r2 = 1
        L_0x005b:
            android.view.ViewGroup r1 = r11.A01
            if (r1 == 0) goto L_0x006e
            java.util.ArrayList r0 = r11.A03
            java.lang.Object r0 = X.AnonymousClass00J.A0G(r0, r4)
            java.lang.String r0 = (java.lang.String) r0
            com.instagram.common.ui.base.IgLinearLayout r0 = A00(r11, r0, r4, r2)
            r1.addView(r0)
        L_0x006e:
            int r4 = r4 + 1
            goto L_0x004c
        L_0x0071:
            X.0Oa r9 = r11.A07
            X.0i6 r4 = X.AnonymousClass0wJ.A0U(r9)
            X.C04220Ms.A0B(r4, r3)
            X.0TJ r2 = X.AnonymousClass0TJ.A05
            r0 = 36326502677292651(0x810ec30003266b, double:3.036364795980743E-306)
            boolean r0 = X.C63803iN.A0E(r2, r4, r0)
            if (r0 == 0) goto L_0x0109
            r0 = 2131298888(0x7f090a48, float:1.8215762E38)
            android.view.View r8 = r12.findViewById(r0)
            android.view.ViewGroup r8 = (android.view.ViewGroup) r8
            r7 = 0
            r8.setVisibility(r3)
            java.util.List r6 = r11.A05
            int r5 = r6.size()
        L_0x009a:
            if (r7 >= r5) goto L_0x0109
            java.lang.Object r0 = r6.get(r7)
            int r10 = X.AnonymousClass0wJ.A04(r0)
            android.content.Context r0 = r11.requireContext()
            android.view.LayoutInflater r1 = android.view.LayoutInflater.from(r0)
            r0 = 2131493426(0x7f0c0232, float:1.8610332E38)
            android.view.View r4 = r1.inflate(r0, r8, r3)
            r0 = 95
            java.lang.String r0 = X.C18170wI.A00(r0)
            X.C04220Ms.A0C(r4, r0)
            r0 = 2131308642(0x7f093062, float:1.8235545E38)
            android.view.View r1 = r4.findViewById(r0)
            android.graphics.drawable.Drawable r2 = r1.getBackground()
            java.lang.String r0 = X.C28174Ezk.A00(r3)
            X.C04220Ms.A0C(r2, r0)
            android.graphics.drawable.GradientDrawable r2 = (android.graphics.drawable.GradientDrawable) r2
            android.content.Context r0 = r11.requireContext()
            int r0 = r0.getColor(r10)
            r2.setColor(r0)
            com.facebook.redex.IDxCListenerShape7S0101000_2_I2 r0 = new com.facebook.redex.IDxCListenerShape7S0101000_2_I2
            r0.<init>(r11, r7, r3)
            r1.setOnClickListener(r0)
            int r0 = r11.A00
            if (r7 != r0) goto L_0x00fe
            r0 = 2131306846(0x7f09295e, float:1.8231903E38)
            android.view.View r2 = r4.findViewById(r0)
            com.instagram.common.ui.widget.imageview.CircularImageView r2 = (com.instagram.common.ui.widget.imageview.CircularImageView) r2
            android.content.Context r1 = r11.requireContext()
            com.instagram.service.session.UserSession r0 = X.AnonymousClass0wJ.A0X(r9)
            X.C04220Ms.A04(r2)
            X.AnonymousClass7IM.A01(r1, r2, r0, r10)
        L_0x00fe:
            java.util.List r0 = r11.A04
            r0.add(r4)
            r8.addView(r4)
            int r7 = r7 + 1
            goto L_0x009a
        L_0x0109:
            r0 = 2131299238(0x7f090ba6, float:1.8216472E38)
            android.view.View r2 = r12.findViewById(r0)
            android.os.Bundle r1 = r11.requireArguments()
            r0 = 785(0x311, float:1.1E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            boolean r0 = r1.getBoolean(r0, r3)
            if (r0 == 0) goto L_0x012d
            r2.setVisibility(r3)
            r0 = 261(0x105, float:3.66E-43)
            com.facebook.redex.IDxCListenerShape201S0100000_1_I2 r0 = X.C18190wL.A0H(r11, r0)
            r2.setOnClickListener(r0)
            return
        L_0x012d:
            r0 = 8
            r2.setVisibility(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5x5.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    public final C10300i6 getSession() {
        return AnonymousClass0wJ.A0U(this.A07);
    }

    public AnonymousClass5x5() {
        C02230Ai A0l = C18210wN.A0l(C19300ze.class);
        this.A06 = C18220wO.A0M(new KtLambdaShape50S0100000_I2_30(this, 2), new KtLambdaShape50S0100000_I2_30(this, 3), new KtLambdaShape23S0200000_I2_7(38, (Object) null, this), A0l);
        this.A05 = C06750aI.A17(Integer.valueOf(R.color.igds_primary_text), Integer.valueOf(R.color.default_cta_dominate_color), Integer.valueOf(R.color.igds_active_badge), Integer.valueOf(R.color.igds_creation_tools_lavender), Integer.valueOf(R.color.activator_card_progress_bad), Integer.valueOf(R.color.igds_creation_tools_pink), Integer.valueOf(R.color.igds_creation_tools_purple));
        this.A04 = AnonymousClass0wJ.A0v();
        this.A03 = AnonymousClass0wJ.A0v();
    }

    public final void onCreate(Bundle bundle) {
        int i;
        int A022 = C14030oh.A02(-46115024);
        super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        ArrayList<String> stringArrayList = requireArguments.getStringArrayList(AnonymousClass000.A00(782));
        if (stringArrayList == null) {
            stringArrayList = AnonymousClass0wJ.A0v();
        }
        this.A03 = stringArrayList;
        List list = this.A05;
        StoryPollColorType storyPollColorType = (StoryPollColorType) StoryPollColorType.A01.get(requireArguments.getString(AnonymousClass000.A00(784)));
        if (storyPollColorType == null) {
            storyPollColorType = StoryPollColorType.UNRECOGNIZED;
        }
        switch (storyPollColorType.ordinal()) {
            case 3:
                i = R.color.default_cta_dominate_color;
                break;
            case 4:
                i = R.color.igds_active_badge;
                break;
            case 5:
                i = R.color.igds_creation_tools_lavender;
                break;
            case 6:
                i = R.color.activator_card_progress_bad;
                break;
            case 7:
                i = R.color.igds_creation_tools_pink;
                break;
            case 8:
                i = R.color.igds_creation_tools_purple;
                break;
            default:
                i = R.color.igds_primary_text;
                break;
        }
        this.A00 = list.indexOf(Integer.valueOf(i));
        C14030oh.A09(2063787434, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = C14030oh.A02(-649791456);
        C04220Ms.A0B(layoutInflater, 0);
        View A0D = C18180wK.A0D(layoutInflater, viewGroup, R.layout.comment_poll_creation, false);
        C14030oh.A09(1553066677, A022);
        return A0D;
    }

    public final void onDestroyView() {
        int A022 = C14030oh.A02(-1580115329);
        super.onDestroyView();
        this.A01 = null;
        this.A02 = null;
        C14030oh.A09(408792230, A022);
    }
}

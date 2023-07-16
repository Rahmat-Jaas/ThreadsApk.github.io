package X;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import com.facebook.redex.IDxHDelegateShape497S0100000_2_I2;
import com.facebook.redex.IDxTListenerShape296S0100000_2_I2;
import com.instagram.barcelona.R;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.groupprofiles.fragment.GroupProfileEditorFragment$onViewCreated$$inlined$launchAndRepeatWithViewLifecycle$default$1;
import com.instagram.igds.components.button.IgdsButton;
import com.instagram.igds.components.form.IgFormField;
import com.instagram.igds.components.textcell.IgdsActionCell;
import com.instagram.igds.components.textcell.IgdsListCell;
import com.instagram.model.creation.MediaCaptureConfig;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.KtLambdaShape159S0100000_I2_14;
import kotlin.jvm.internal.KtLambdaShape28S0200000_I2_12;
import kotlin.jvm.internal.KtLambdaShape45S0200000_I2_6;
import kotlin.jvm.internal.KtLambdaShape76S0100000_I2_56;

/* renamed from: X.5xV  reason: invalid class name */
public final class AnonymousClass5xV extends C34640IcN implements C21735BzM {
    public static final String __redex_internal_original_name = "GroupProfileEditorFragment";
    public Dialog A00;
    public Dialog A01;
    public C108286i7 A02;
    public NestedScrollView A03;
    public C84584tU A04;
    public String A05;
    public final C04530Oa A06 = C62373Zc.A03(new KtLambdaShape76S0100000_I2_56(this, 26));
    public final IDxHDelegateShape497S0100000_2_I2 A07;
    public final C04530Oa A08;

    public final /* synthetic */ void onBottomSheetClosed() {
    }

    public final /* synthetic */ void onBottomSheetPositionChanged(int i, int i2) {
    }

    public final void onSaveInstanceState(Bundle bundle) {
        C04220Ms.A0B(bundle, 0);
        super.onSaveInstanceState(bundle);
        C84584tU r0 = this.A04;
        if (r0 == null) {
            C04220Ms.A0E("captureFlowHelper");
            throw null;
        } else {
            r0.onSaveInstanceState(bundle);
        }
    }

    public final void onViewCreated(View view, Bundle bundle) {
        View view2 = view;
        C04220Ms.A0B(view2, 0);
        super.onViewCreated(view2, bundle);
        this.A03 = (NestedScrollView) view2.requireViewById(R.id.scroll_view);
        TextView textView = (TextView) AnonymousClass0wJ.A0K(view2, R.id.create_group_profile_description);
        IgImageView igImageView = (IgImageView) AnonymousClass0wJ.A0J(view2, R.id.change_photo);
        View A0J = AnonymousClass0wJ.A0J(view2, R.id.change_photo_text);
        IgFormField igFormField = (IgFormField) AnonymousClass0wJ.A0J(view2, R.id.group_profile_full_name_input);
        IgFormField igFormField2 = (IgFormField) AnonymousClass0wJ.A0K(view2, R.id.username);
        IgFormField igFormField3 = (IgFormField) AnonymousClass0wJ.A0K(view2, R.id.group_profile_description_input);
        IgFormField igFormField4 = (IgFormField) AnonymousClass0wJ.A0K(view2, R.id.group_profile_website_input);
        IgdsListCell igdsListCell = (IgdsListCell) AnonymousClass0wJ.A0K(view2, R.id.group_profile_is_private);
        TextView textView2 = (TextView) AnonymousClass0wJ.A0J(view2, R.id.group_profile_is_private_description);
        IgdsListCell igdsListCell2 = (IgdsListCell) AnonymousClass0wJ.A0K(view2, R.id.group_profile_chat);
        View requireViewById = view2.requireViewById(R.id.group_profile_chat_description);
        C04220Ms.A06(requireViewById);
        IgdsListCell igdsListCell3 = (IgdsListCell) AnonymousClass0wJ.A0K(view2, R.id.group_profile_post_approvals);
        View requireViewById2 = view2.requireViewById(R.id.group_profile_post_approvals_description);
        C04220Ms.A06(requireViewById2);
        IgdsListCell igdsListCell4 = (IgdsListCell) AnonymousClass0wJ.A0K(view2, R.id.group_profile_recommendable_cell);
        IgdsActionCell igdsActionCell = (IgdsActionCell) AnonymousClass0wJ.A0K(view2, R.id.group_profile_delete_button);
        IgdsButton igdsButton = (IgdsButton) AnonymousClass0wJ.A0K(view2, R.id.group_profile_learn_more_button);
        IgdsButton igdsButton2 = (IgdsButton) AnonymousClass0wJ.A0J(view2, R.id.done_button);
        Drawable drawable = igImageView.getDrawable();
        ImageView.ScaleType scaleType = igImageView.getScaleType();
        igFormField2.setRuleChecker(new C133547vs(this));
        igFormField.A00.addTextChangedListener(new AnonymousClass65R(new KtLambdaShape159S0100000_I2_14(this, 29)));
        AnonymousClass65R r0 = new AnonymousClass65R(new KtLambdaShape45S0200000_I2_6(23, (Object) this, (Object) igFormField2));
        igFormField2.A00.addTextChangedListener(r0);
        igFormField3.A00.addTextChangedListener(new AnonymousClass65R(new KtLambdaShape159S0100000_I2_14(this, 30)));
        igFormField4.A00.addTextChangedListener(new AnonymousClass65R(new KtLambdaShape159S0100000_I2_14(this, 31)));
        AnonymousClass24V r1 = AnonymousClass24V.TYPE_SWITCH;
        igdsListCell.setTextCellType(r1);
        igdsListCell.A0D(new IDxTListenerShape296S0100000_2_I2(this, 1));
        igdsListCell2.setTextCellType(r1);
        igdsListCell2.A0D(new IDxTListenerShape296S0100000_2_I2(this, 2));
        igdsListCell3.setTextCellType(r1);
        igdsListCell3.A0D(new IDxTListenerShape296S0100000_2_I2(this, 3));
        igdsListCell4.setTextCellType(r1);
        igdsListCell4.A0D(new IDxTListenerShape296S0100000_2_I2(this, 4));
        String A0g = C18190wL.A0g(AnonymousClass0wJ.A0B(this), 2131828071);
        igdsActionCell.A00(C18190wL.A0H(this, 460), AnonymousClass223.DESTRUCTIVE, A0g);
        C86104wH.A1C(igdsButton, 128, this);
        C86104wH.A1C(igdsButton2, 129, this);
        igFormField.setText(A00(this).A00.A01);
        igFormField2.setText(A00(this).A00.A02);
        igFormField3.setText(A00(this).A00.A00);
        igFormField4.setText(A00(this).A00.A03);
        igdsListCell3.setChecked(A00(this).A00.A04);
        AnonymousClass061 r30 = AnonymousClass061.STARTED;
        AnonymousClass066 viewLifecycleOwner = getViewLifecycleOwner();
        C25237DiI.A00((Integer) null, (C27952Ew2) null, new GroupProfileEditorFragment$onViewCreated$$inlined$launchAndRepeatWithViewLifecycle$default$1(drawable, A0J, scaleType, textView, textView2, (TextView) requireViewById2, (TextView) requireViewById, r30, viewLifecycleOwner, igImageView, this, igdsButton, igdsButton2, igFormField2, igFormField, igFormField4, igdsActionCell, igdsListCell, igdsListCell2, igdsListCell4, r0, (C146958n9) null), AnonymousClass067.A00(viewLifecycleOwner), 3);
    }

    public static final AnonymousClass56W A00(AnonymousClass5xV r0) {
        return (AnonymousClass56W) r0.A08.getValue();
    }

    public static final void A02(AnonymousClass5xV r4) {
        C84584tU r42 = r4.A04;
        if (r42 == null) {
            C04220Ms.A0E("captureFlowHelper");
            throw null;
        }
        C28923FeI feI = C28923FeI.PROFILE_PHOTO;
        C25818DsX dsX = new C25818DsX(feI);
        dsX.A05 = false;
        r42.Cvr(C170769vX.GROUP_PROFILE_CREATION, new MediaCaptureConfig(dsX), feI);
    }

    public final String getModuleName() {
        return this.A05;
    }

    public final C10300i6 getSession() {
        return AnonymousClass0wJ.A0U(this.A06);
    }

    public final boolean isScrolledToTop() {
        NestedScrollView nestedScrollView = this.A03;
        boolean z = false;
        if (nestedScrollView != null && nestedScrollView.canScrollVertically(-1)) {
            z = true;
        }
        return !z;
    }

    public AnonymousClass5xV() {
        KtLambdaShape76S0100000_I2_56 ktLambdaShape76S0100000_I2_56 = new KtLambdaShape76S0100000_I2_56(this, 27);
        C04530Oa A012 = AnonymousClass0OY.A01(AnonymousClass006.A0C, new KtLambdaShape76S0100000_I2_56(new KtLambdaShape76S0100000_I2_56(this, 23), 24));
        this.A08 = C18220wO.A0M(new KtLambdaShape76S0100000_I2_56(A012, 25), ktLambdaShape76S0100000_I2_56, new KtLambdaShape28S0200000_I2_12(24, (Object) null, (Object) A012), C18210wN.A0l(AnonymousClass56W.class));
        this.A05 = "group_profile_creation_sheet";
        this.A07 = new IDxHDelegateShape497S0100000_2_I2(this, 1);
    }

    public static final void A01(AnonymousClass5xV r4) {
        Context context = r4.getContext();
        if (context != null) {
            C25828Dsm dsm = new C25828Dsm(context);
            dsm.A0T(C86154wM.A0N(r4, 52), AnonymousClass25l.BLUE, 2131828099);
            dsm.A0S(C86154wM.A0N(r4, 53), AnonymousClass25l.RED, 2131828100);
            dsm.A0q(true);
            AnonymousClass0wJ.A1K(dsm);
        }
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        C84584tU r0 = this.A04;
        if (r0 == null) {
            C04220Ms.A0E("captureFlowHelper");
            throw null;
        } else {
            r0.onActivityResult(i, i2, intent);
        }
    }

    public final void onCreate(Bundle bundle) {
        String str;
        String str2;
        String[] stringArray;
        String string;
        int A022 = C14030oh.A02(-1384935283);
        super.onCreate(bundle);
        C84584tU A023 = C25529DnJ.A02.A02(requireContext(), this.A07, AnonymousClass0wJ.A0X(this.A06));
        this.A04 = A023;
        List list = null;
        A023.CH2(bundle);
        Bundle bundle2 = this.mArguments;
        if (bundle2 == null || (string = bundle2.getString("group_profile_id")) == null) {
            AnonymousClass56W A002 = A00(this);
            Bundle bundle3 = this.mArguments;
            if (bundle3 != null) {
                str = bundle3.getString("thread_id");
            } else {
                str = null;
            }
            Bundle bundle4 = this.mArguments;
            if (bundle4 != null) {
                str2 = bundle4.getString("thread_name");
            } else {
                str2 = null;
            }
            Bundle bundle5 = this.mArguments;
            if (!(bundle5 == null || (stringArray = bundle5.getStringArray("thread_participant_ids")) == null)) {
                list = Arrays.asList(stringArray);
                C04220Ms.A06(list);
            }
            A002.A0I(str, str2, list);
        } else {
            A00(this).A0F(string);
            this.A05 = "group_profile_edit_sheet";
        }
        C14030oh.A09(1563108762, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = C14030oh.A02(1102132088);
        C04220Ms.A0B(layoutInflater, 0);
        View A0D = C18180wK.A0D(layoutInflater, viewGroup, R.layout.layout_group_profile_creation, false);
        C14030oh.A09(-293811461, A022);
        return A0D;
    }

    public final void onDestroyView() {
        int A022 = C14030oh.A02(510994037);
        super.onDestroyView();
        this.A03 = null;
        C14030oh.A09(627285524, A022);
    }
}

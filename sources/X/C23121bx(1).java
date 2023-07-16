package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.redex.IDxCListenerShape447S0100000_1_I2;
import com.facebook.redex.IDxPCallbackShape480S0100000_1_I2;
import com.instagram.barcelona.R;
import com.instagram.request.IDxDCallbackShape173S0100000_1_I2;
import com.instagram.ui.widget.progressbutton.ProgressButton;
import java.util.ArrayList;

/* renamed from: X.1bx  reason: invalid class name and case insensitive filesystem */
public final class C23121bx extends C34640IcN implements C82424pb, C82034oy {
    public static final String __redex_internal_original_name = "TwoFacAccountRecoveryFragment";
    public Bundle A00;
    public View A01;
    public TextView A02;
    public ProgressButton A03;
    public boolean A04;
    public boolean A05;
    public View A06;
    public final C63873iU A07 = C63873iU.A06(this, 76);
    public final C04530Oa A08 = C80644m9.A00(this);
    public final View.OnLongClickListener A09 = new IDxCListenerShape447S0100000_1_I2(this, 0);

    public final void configureActionBar(AnonymousClass4u2 r3) {
        C04220Ms.A0B(r3, 0);
        r3.Cqb(2131836995);
        AnonymousClass4u2.A04(C18180wK.A0N(), r3, this, 518);
    }

    public static final void A01(C23121bx r4) {
        if (Build.VERSION.SDK_INT >= 33 || C18180wK.A1W(r4.requireActivity().checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE"))) {
            C31155GhB.A03(new C25081lj(A00(r4), r4));
        } else {
            AnonymousClass7K8.A02(r4.requireActivity(), new IDxPCallbackShape480S0100000_1_I2(r4, 1), new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"});
        }
    }

    public final /* bridge */ /* synthetic */ C10300i6 getSession() {
        return AnonymousClass0wJ.A0U(this.A08);
    }

    public final boolean onBackPressed() {
        if (this.A04) {
            C18180wK.A0Q(requireActivity(), AnonymousClass0wJ.A0U(this.A08)).A0D("PhoneNumberEntryFragment.BACKSTATE_NAME", 1);
            return true;
        }
        getParentFragmentManager().A16();
        return true;
    }

    public static final Bitmap A00(C23121bx r5) {
        Context context = r5.getContext();
        if (context != null) {
            View view = r5.A06;
            if (view != null) {
                view.setBackground(new ColorDrawable(C121907Is.A00(context, R.attr.backgroundColorPrimary)));
            }
            C04220Ms.A0E("rootLayout");
            throw null;
        }
        View view2 = r5.A06;
        if (view2 != null) {
            view2.setDrawingCacheEnabled(true);
            View view3 = r5.A06;
            if (view3 != null) {
                if (view3.getDrawingCache() != null) {
                    View view4 = r5.A06;
                    if (view4 != null) {
                        Bitmap drawingCache = view4.getDrawingCache();
                        C13760oG.A00(drawingCache);
                        Bitmap createBitmap = Bitmap.createBitmap(drawingCache);
                        if (createBitmap != null) {
                            View view5 = r5.A06;
                            if (view5 != null) {
                                view5.setDrawingCacheEnabled(false);
                                View view6 = r5.A06;
                                if (view6 != null) {
                                    view6.setBackground((Drawable) null);
                                    return createBitmap;
                                }
                            }
                        } else {
                            throw C18180wK.A0a("Required value was null.");
                        }
                    }
                } else {
                    throw C18180wK.A0a("Required value was null.");
                }
            }
        }
        C04220Ms.A0E("rootLayout");
        throw null;
    }

    public final String getModuleName() {
        return C63833iQ.A05();
    }

    public final void onCreate(Bundle bundle) {
        int A022 = C14030oh.A02(-615888595);
        super.onCreate(bundle);
        this.A04 = requireArguments().getBoolean(C63833iQ.A07(0, 33, 124));
        this.A05 = requireArguments().getBoolean("arg_should_check_email");
        AnonymousClass3WQ.A02(AnonymousClass0wJ.A0X(this.A08), "recovery_code");
        C14030oh.A09(-1523392855, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        String str;
        int A022 = C14030oh.A02(1336526492);
        C04220Ms.A0B(layoutInflater, 0);
        View A0D = C18180wK.A0D(layoutInflater, viewGroup, R.layout.two_fac_account_recovery_fragment_ui_updates_2020, false);
        this.A06 = A0D;
        TextView textView = (TextView) AnonymousClass0wJ.A0J(A0D, R.id.backup_codes);
        textView.setOnLongClickListener(this.A09);
        ArrayList<String> stringArrayList = requireArguments().getStringArrayList("arg_backup_codes");
        if (stringArrayList != null) {
            str = C18200wM.A0l("\n", stringArrayList);
        } else {
            str = "";
        }
        textView.setText(str);
        this.A02 = textView;
        View view = this.A06;
        if (view != null) {
            C62923b9.A02(C18730xl.A00(this, requireContext().getColor(R.color.igds_primary_button), 31), C18730xl.A00(this, requireContext().getColor(R.color.igds_primary_button), 30), (TextView) AnonymousClass0wJ.A0J(view, R.id.screenshot_and_get_new), C18180wK.A0g(this, 2131837001), C18180wK.A0g(this, 2131836996));
            View view2 = this.A06;
            if (view2 != null) {
                this.A01 = AnonymousClass0wJ.A0K(view2, R.id.row_divider);
                View view3 = this.A06;
                if (view3 != null) {
                    ProgressButton progressButton = (ProgressButton) AnonymousClass0wJ.A0J(view3, R.id.next_button);
                    AnonymousClass0wJ.A16(progressButton, 519, this);
                    this.A03 = progressButton;
                    C24731jw.A02(this);
                    View view4 = this.A06;
                    if (view4 != null) {
                        C14030oh.A09(1732003055, A022);
                        return view4;
                    }
                }
            }
        }
        C04220Ms.A0E("rootLayout");
        throw null;
    }

    public final void onStart() {
        int A022 = C14030oh.A02(-1187203826);
        super.onStart();
        if (this.A04 || this.A05) {
            C32165H8c A012 = C62403Zn.A01(requireContext(), AnonymousClass0wJ.A0X(this.A08));
            A012.A00 = new IDxDCallbackShape173S0100000_1_I2(getParentFragmentManager(), this, 2);
            schedule(A012);
        }
        C14030oh.A09(293972346, A022);
    }
}

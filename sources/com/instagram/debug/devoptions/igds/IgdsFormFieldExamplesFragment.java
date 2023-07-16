package com.instagram.debug.devoptions.igds;

import X.AnonymousClass0wJ;
import X.AnonymousClass38C;
import X.AnonymousClass4Cw;
import X.AnonymousClass4u2;
import X.C10300i6;
import X.C14030oh;
import X.C18180wK;
import X.C27686Erc;
import X.C34640IcN;
import X.C82034oy;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.instagram.barcelona.R;
import com.instagram.igds.components.form.IgFormField;
import com.instagram.service.session.UserSession;

public class IgdsFormFieldExamplesFragment extends C34640IcN implements C82034oy {
    public static final String CONFIRMED_TEXT = "Example confirmation";
    public static final String ERROR_TEXT = "Example error";
    public static final String LONG_MESSAGE = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaeca";
    public IgFormField mAddressField;
    public IgFormField mCappedField;
    public IgFormField mConfirmationField;
    public IgFormField mEmailField;
    public IgFormField mErrorField;
    public IgFormField mLoadingField;
    public IgFormField mLongTextField;
    public IgFormField mPhoneField;
    public IgFormField mPickerField;
    public int mSoftInputMode = 0;
    public UserSession mUserSession;

    public String getModuleName() {
        return "igds_form_field_examples";
    }

    private C27686Erc getRuleChecker(String str) {
        if (str.equals("error")) {
            return new C27686Erc() {
                public AnonymousClass38C getState(AnonymousClass38C r2, CharSequence charSequence, boolean z) {
                    if (charSequence.length() > 0) {
                        r2.A01 = "error";
                        r2.A00 = IgdsFormFieldExamplesFragment.ERROR_TEXT;
                    }
                    return r2;
                }
            };
        }
        if (!str.equals("loading")) {
            return new C27686Erc() {
                public AnonymousClass38C getState(AnonymousClass38C r2, CharSequence charSequence, boolean z) {
                    if (charSequence.length() > 0) {
                        r2.A01 = "confirmed";
                        r2.A00 = IgdsFormFieldExamplesFragment.CONFIRMED_TEXT;
                    }
                    return r2;
                }
            };
        }
        return new C27686Erc() {
            public AnonymousClass38C getState(AnonymousClass38C r2, CharSequence charSequence, boolean z) {
                r2.A01 = "loading";
                return r2;
            }
        };
    }

    public C10300i6 getSession() {
        return this.mUserSession;
    }

    public void configureActionBar(AnonymousClass4u2 r2) {
        AnonymousClass4u2.A07(r2, 2131825239);
    }

    public void onCreate(Bundle bundle) {
        int A02 = C14030oh.A02(1043416374);
        super.onCreate(bundle);
        this.mUserSession = AnonymousClass0wJ.A0W(this);
        C14030oh.A09(-436183235, A02);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C14030oh.A02(165328496);
        View A0H = AnonymousClass0wJ.A0H(layoutInflater, viewGroup, R.layout.igds_form_field_examples);
        C14030oh.A09(367989800, A02);
        return A0H;
    }

    public void onPause() {
        int A02 = C14030oh.A02(1679257756);
        super.onPause();
        Window A0F = C18180wK.A0F(this);
        if (A0F != null) {
            A0F.setSoftInputMode(this.mSoftInputMode);
        }
        C14030oh.A09(-630125030, A02);
    }

    public void onResume() {
        int A02 = C14030oh.A02(-1884976055);
        super.onResume();
        Window A0F = C18180wK.A0F(this);
        if (A0F != null) {
            this.mSoftInputMode = A0F.getAttributes().softInputMode;
            A0F.setSoftInputMode(32);
        }
        C14030oh.A09(1249652184, A02);
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.mErrorField = (IgFormField) view.requireViewById(R.id.igds_debug_error);
        this.mConfirmationField = (IgFormField) view.requireViewById(R.id.igds_debug_confirmation);
        this.mLoadingField = (IgFormField) view.requireViewById(R.id.igds_debug_loading);
        this.mCappedField = (IgFormField) view.requireViewById(R.id.igds_debug_capped_length);
        this.mLongTextField = (IgFormField) view.requireViewById(R.id.igds_debug_long_text);
        this.mPhoneField = (IgFormField) view.requireViewById(R.id.igds_debug_telephone);
        this.mAddressField = (IgFormField) view.requireViewById(R.id.igds_debug_address);
        this.mEmailField = (IgFormField) view.requireViewById(R.id.igds_debug_email);
        this.mPickerField = (IgFormField) view.requireViewById(R.id.igds_debug_picker);
        this.mErrorField.setLabelText("Type to produce error");
        this.mErrorField.setRuleChecker(new C27686Erc() {
            public AnonymousClass38C getState(AnonymousClass38C r2, CharSequence charSequence, boolean z) {
                if (charSequence.length() > 0) {
                    r2.A01 = "error";
                    r2.A00 = IgdsFormFieldExamplesFragment.ERROR_TEXT;
                }
                return r2;
            }
        });
        this.mCappedField.setLabelText("Max input length of 10");
        this.mCappedField.setMaxLength(10);
        this.mConfirmationField.setLabelText("Type for confirmation");
        this.mConfirmationField.setText("Confirmed text");
        this.mConfirmationField.setRuleChecker(new C27686Erc() {
            public AnonymousClass38C getState(AnonymousClass38C r2, CharSequence charSequence, boolean z) {
                if (charSequence.length() > 0) {
                    r2.A01 = "confirmed";
                    r2.A00 = IgdsFormFieldExamplesFragment.CONFIRMED_TEXT;
                }
                return r2;
            }
        });
        this.mEmailField.setLabelText("Email Address");
        this.mEmailField.setInputType(33);
        this.mEmailField.setRuleChecker(new AnonymousClass4Cw(requireContext()));
        this.mPhoneField.setLabelText("Telephone");
        this.mPhoneField.setInputType(3);
        this.mAddressField.setLabelText("Postal Address");
        this.mAddressField.setInputType(8304);
        this.mLongTextField.setLabelText("Very long text");
        this.mLongTextField.setText(LONG_MESSAGE);
        this.mLongTextField.setRuleChecker(new C27686Erc() {
            public AnonymousClass38C getState(AnonymousClass38C r2, CharSequence charSequence, boolean z) {
                if (charSequence.length() > 0) {
                    r2.A01 = "confirmed";
                    r2.A00 = IgdsFormFieldExamplesFragment.CONFIRMED_TEXT;
                }
                return r2;
            }
        });
        this.mLoadingField.setLabelText("Type for loading state");
        this.mLoadingField.setRuleChecker(new C27686Erc() {
            public AnonymousClass38C getState(AnonymousClass38C r2, CharSequence charSequence, boolean z) {
                r2.A01 = "loading";
                return r2;
            }
        });
        this.mPickerField.setLabelText("Picker");
        this.mPickerField.setInPickerMode(new View.OnClickListener() {
            public void onClick(View view) {
                String str;
                int A05 = C14030oh.A05(1686787978);
                int length = IgdsFormFieldExamplesFragment.this.mPickerField.A00.getText().length();
                IgFormField igFormField = IgdsFormFieldExamplesFragment.this.mPickerField;
                if (length == 0) {
                    str = "Filled in text.";
                } else {
                    str = "";
                }
                igFormField.setText(str);
                C14030oh.A0C(452532339, A05);
            }
        });
    }
}

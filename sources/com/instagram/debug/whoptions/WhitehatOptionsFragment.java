package com.instagram.debug.whoptions;

import X.AnonymousClass0wJ;
import X.AnonymousClass4MC;
import X.AnonymousClass4u2;
import X.C09120et;
import X.C09860go;
import X.C10300i6;
import X.C121907Is;
import X.C14030oh;
import X.C18180wK;
import X.C18200wM;
import X.C19573AyZ;
import X.C23411dm;
import X.C24;
import X.C27021rj;
import X.C57593Br;
import X.C63613hu;
import X.C64543mW;
import X.C82034oy;
import X.C83114qo;
import X.C83364rG;
import X.C83874s8;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.facebook.common.dextricks.DexStore;
import com.facebook.common.stringformat.StringFormatUtil;
import com.instagram.barcelona.R;
import com.instagram.debug.devoptions.api.DevOptionsPreferenceAdapter;
import com.instagram.service.session.UserSession;
import com.instagram.ui.widget.searchedittext.SearchEditText;
import java.util.ArrayList;
import java.util.List;

public class WhitehatOptionsFragment extends C23411dm implements C82034oy {
    public DevOptionsPreferenceAdapter mAdapter;
    public final C83874s8 mTypeaheadDelegate = new C83874s8() {
        public void registerTextViewLogging(TextView textView) {
            textView.addTextChangedListener(C64543mW.A00(WhitehatOptionsFragment.this.mUserSession));
        }

        public void searchTextChanged(String str) {
            boolean isEmpty = str.isEmpty();
            WhitehatOptionsFragment whitehatOptionsFragment = WhitehatOptionsFragment.this;
            if (isEmpty) {
                whitehatOptionsFragment.refreshItems();
            } else {
                C57593Br r1 = whitehatOptionsFragment.mTypeaheadHeaderModel;
                if (r1 != null) {
                    r1.A03 = true;
                }
                DevOptionsPreferenceAdapter devOptionsPreferenceAdapter = whitehatOptionsFragment.mAdapter;
                if (devOptionsPreferenceAdapter != null) {
                    devOptionsPreferenceAdapter.setTypeaheadHeaderModel(r1);
                }
            }
            WhitehatOptionsFragment.this.filterOptions(str);
        }
    };
    public C57593Br mTypeaheadHeaderModel;
    public UserSession mUserSession;

    public String getModuleName() {
        return "whitehat_options";
    }

    /* access modifiers changed from: private */
    public void filterOptions(CharSequence charSequence) {
        DevOptionsPreferenceAdapter devOptionsPreferenceAdapter = this.mAdapter;
        if (devOptionsPreferenceAdapter != null) {
            devOptionsPreferenceAdapter.getFilter().filter(charSequence);
        }
    }

    /* access modifiers changed from: private */
    public boolean shouldAddPrefTTL() {
        return C18180wK.A1W(C19573AyZ.A03(this.mUserSession) ? 1 : 0);
    }

    public C10300i6 getSession() {
        return this.mUserSession;
    }

    private void addNetworkItems(List list) {
        final C09120et A02 = C09120et.A02();
        C63613hu.A04(list, 2131838100);
        AnonymousClass4MC.A08(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                String str;
                C09120et A02 = C09120et.A02();
                if (!WhitehatOptionsFragment.this.shouldAddPrefTTL() || !z) {
                    str = "";
                } else {
                    str = StringFormatUtil.formatStrLocaleSafe("%d:%d", C18200wM.A0c(), Integer.valueOf(DexStore.DAYS_TO_MS_FACTOR));
                }
                C18180wK.A0v(A02.A00.edit().putBoolean("debug_allow_user_certs", z), "debug_allow_user_certs_ttl", str);
                if (z) {
                    C09120et.A3E.add("debug_allow_user_certs");
                }
                FragmentActivity activity = WhitehatOptionsFragment.this.getActivity();
                if (activity instanceof C83364rG) {
                    ((C83364rG) activity).CVH(A02);
                }
            }
        }, list, 2131838097, A02.A0H());
        AnonymousClass4MC.A08(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                AnonymousClass0wJ.A13(A02.A00.edit(), "debug_disable_liger_fizz", z);
                if (z) {
                    C09120et.A3E.add("debug_disable_liger_fizz");
                }
            }
        }, list, 2131838099, A02.A0I());
    }

    /* access modifiers changed from: private */
    public void refreshItems() {
        ArrayList A0v = AnonymousClass0wJ.A0v();
        SearchEditText searchEditText = this.mTypeaheadHeaderModel.A00;
        if (searchEditText != null) {
            searchEditText.setText("");
        }
        A0v.add(this.mTypeaheadHeaderModel);
        addNetworkItems(A0v);
        DevOptionsPreferenceAdapter devOptionsPreferenceAdapter = this.mAdapter;
        if (devOptionsPreferenceAdapter != null) {
            devOptionsPreferenceAdapter.setUnfilteredItems(A0v);
        }
        filterOptions("");
    }

    public void configureActionBar(AnonymousClass4u2 r2) {
        AnonymousClass4u2.A07(r2, 2131838096);
    }

    public void onPause() {
        int A02 = C14030oh.A02(2026245052);
        super.onPause();
        if (this.mView != null) {
            C09860go.A0I(C18200wM.A0H(this));
        }
        C14030oh.A09(1948291223, A02);
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.mUserSession = AnonymousClass0wJ.A0W(this);
        this.mAdapter = new DevOptionsPreferenceAdapter(requireActivity(), this.mUserSession, this);
        getScrollingViewProxy().ChZ(this.mAdapter);
        C18200wM.A0H(this).setBackgroundColor(C121907Is.A00(requireContext(), R.attr.backgroundColorPrimary));
        SearchEditText searchEditText = new SearchEditText(requireContext());
        searchEditText.setHint("Search Whitehat Settings");
        C57593Br r1 = new C57593Br();
        this.mTypeaheadHeaderModel = r1;
        r1.A01 = this.mTypeaheadDelegate;
        r1.A00 = searchEditText;
        r1.A02 = new C83114qo() {
            public void onSearchCleared(String str) {
                WhitehatOptionsFragment.this.refreshItems();
            }
        };
        getScrollingViewProxy().A7b(new C27021rj() {
            public void onScrollStateChanged(C24 c24, int i) {
                int A03 = C14030oh.A03(-1974471149);
                if (i == 1) {
                    C09860go.A0I(C18200wM.A0H(WhitehatOptionsFragment.this));
                }
                C14030oh.A0A(-606453774, A03);
            }
        });
        refreshItems();
    }
}

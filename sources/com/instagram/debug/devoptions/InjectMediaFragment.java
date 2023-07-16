package com.instagram.debug.devoptions;

import X.AnonymousClass0RA;
import X.AnonymousClass0wJ;
import X.AnonymousClass4O1;
import X.AnonymousClass8bP;
import X.C04220Ms;
import X.C14030oh;
import X.C18180wK;
import X.C18190wL;
import X.C18250wR;
import X.C34640IcN;
import X.C82384pX;
import X.C83604rg;
import android.os.Bundle;
import android.view.View;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.debug.devoptions.InjectionMediaSelectionAdapter;
import com.instagram.igds.components.search.InlineSearchBox;
import com.instagram.service.session.UserSession;
import com.instagram.ui.widget.trianglespinner.TriangleSpinner;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;

public final class InjectMediaFragment extends C34640IcN implements C83604rg, InjectionMediaSelectionAdapter.Delegate {
    public IgTextView clearAllButton;
    public String contentType;
    public C82384pX dataStoreManager;
    public LocalMediaInjectionController injectionController;
    public InjectionMediaSelectionAdapter injectionMediaSelectionAdapter;
    public List injectionUnits;
    public InlineSearchBox inlineSearchBox;
    public Set savedInjectedMedia;
    public View searchEmptyState;
    public UserSession session;
    public String surface;
    public String surfaceAndContentType;
    public TriangleSpinner surfaceSelector;

    public String getModuleName() {
        return "inject_media_fragment";
    }

    public void onItemSelectionChanged(Set set) {
        String str;
        C04220Ms.A0B(set, 0);
        this.savedInjectedMedia = set;
        LocalMediaInjectionController localMediaInjectionController = this.injectionController;
        if (localMediaInjectionController == null) {
            str = "injectionController";
        } else {
            String str2 = this.surfaceAndContentType;
            if (str2 == null) {
                str = "surfaceAndContentType";
            } else {
                localMediaInjectionController.selectInjectionItems(set, str2);
                return;
            }
        }
        C04220Ms.A0E(str);
        throw null;
    }

    public void onSearchCleared(String str) {
        C04220Ms.A0B(str, 0);
        filterListWithQuery(str);
        InlineSearchBox inlineSearchBox2 = this.inlineSearchBox;
        if (inlineSearchBox2 != null) {
            inlineSearchBox2.setVisibilityOfClearButton(false);
        }
    }

    public void onSearchTextChanged(String str) {
        C04220Ms.A0B(str, 0);
        filterListWithQuery(str);
        InlineSearchBox inlineSearchBox2 = this.inlineSearchBox;
        if (inlineSearchBox2 != null) {
            inlineSearchBox2.setVisibilityOfClearButton(C18180wK.A1X(str.length()));
        }
    }

    public void setSession(UserSession userSession) {
        C04220Ms.A0B(userSession, 0);
        this.session = userSession;
    }

    public UserSession getSession() {
        UserSession userSession = this.session;
        if (userSession != null) {
            return userSession;
        }
        C18250wR.A0l();
        throw null;
    }

    private final void filterListWithQuery(String str) {
        int i;
        String str2;
        ArrayList A0v = AnonymousClass0wJ.A0v();
        Locale locale = Locale.getDefault();
        C04220Ms.A06(locale);
        String A0r = C18190wL.A0r(locale, str);
        List list = this.injectionUnits;
        if (list == null) {
            str2 = "injectionUnits";
        } else {
            Iterator it = list.iterator();
            while (true) {
                i = 0;
                if (!it.hasNext()) {
                    break;
                }
                AnonymousClass4O1 r2 = (AnonymousClass4O1) it.next();
                String str3 = r2.A03;
                Locale locale2 = Locale.getDefault();
                C04220Ms.A06(locale2);
                if (AnonymousClass8bP.A0j(C18190wL.A0r(locale2, str3), A0r, false)) {
                    A0v.add(r2);
                }
            }
            View view = this.searchEmptyState;
            if (view != null) {
                if (!A0v.isEmpty()) {
                    i = 8;
                }
                view.setVisibility(i);
            }
            InjectionMediaSelectionAdapter injectionMediaSelectionAdapter2 = this.injectionMediaSelectionAdapter;
            if (injectionMediaSelectionAdapter2 == null) {
                str2 = "injectionMediaSelectionAdapter";
            } else {
                injectionMediaSelectionAdapter2.updateList(A0v);
                return;
            }
        }
        C04220Ms.A0E(str2);
        throw null;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00a9, code lost:
        X.C04220Ms.A0E("savedInjectedMedia");
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void updateList(com.instagram.ui.widget.trianglespinner.TriangleSpinner r8, com.instagram.common.ui.base.IgTextView r9, com.instagram.igds.components.search.InlineSearchBox r10) {
        /*
            r7 = this;
            java.lang.Object r0 = r8.getSelectedItem()
            java.lang.String r1 = r0.toString()
            java.util.Locale r0 = java.util.Locale.getDefault()
            X.C04220Ms.A06(r0)
            java.lang.String r2 = X.C18190wL.A0r(r0, r1)
            r7.surface = r2
            java.lang.String r6 = "surface"
            r1 = 95
            java.lang.String r0 = r7.contentType
            if (r0 != 0) goto L_0x0024
            java.lang.String r6 = "contentType"
        L_0x001f:
            X.C04220Ms.A0E(r6)
        L_0x0022:
            r0 = 0
            throw r0
        L_0x0024:
            java.lang.String r0 = X.AnonymousClass00U.A0N(r2, r0, r1)
            r7.surfaceAndContentType = r0
            java.lang.String r2 = "surfaceAndContentType"
            if (r0 == 0) goto L_0x00b3
            X.4pX r0 = X.AnonymousClass2LN.A00(r0)
            r7.dataStoreManager = r0
            if (r0 != 0) goto L_0x0039
            java.lang.String r6 = "dataStoreManager"
            goto L_0x001f
        L_0x0039:
            java.util.Map r0 = r0.Aow()
            java.util.Collection r0 = r0.values()
            java.util.ArrayList r0 = X.C18200wM.A0s(r0)
            r7.injectionUnits = r0
            com.instagram.debug.devoptions.LocalMediaInjectionController r1 = r7.injectionController
            if (r1 != 0) goto L_0x004e
            java.lang.String r6 = "injectionController"
            goto L_0x001f
        L_0x004e:
            java.lang.String r0 = r7.surfaceAndContentType
            if (r0 == 0) goto L_0x00b3
            java.util.Set r0 = r1.getSelectedInjectionItems(r0)
            java.util.Set r0 = X.AnonymousClass00J.A0b(r0)
            r7.savedInjectedMedia = r0
            java.util.List r0 = r7.injectionUnits
            java.lang.String r5 = "injectionUnits"
            if (r0 == 0) goto L_0x00ae
            java.util.Iterator r4 = r0.iterator()
        L_0x0066:
            boolean r0 = r4.hasNext()
            java.lang.String r3 = "savedInjectedMedia"
            if (r0 == 0) goto L_0x0081
            java.lang.Object r2 = r4.next()
            X.4O1 r2 = (X.AnonymousClass4O1) r2
            java.util.Set r1 = r7.savedInjectedMedia
            if (r1 == 0) goto L_0x00a9
            java.lang.String r0 = r2.A02
            boolean r0 = r1.contains(r0)
            r2.A00 = r0
            goto L_0x0066
        L_0x0081:
            com.instagram.debug.devoptions.InjectionMediaSelectionAdapter r2 = r7.injectionMediaSelectionAdapter
            if (r2 != 0) goto L_0x0088
            java.lang.String r6 = "injectionMediaSelectionAdapter"
            goto L_0x001f
        L_0x0088:
            java.util.List r1 = r7.injectionUnits
            if (r1 == 0) goto L_0x00ae
            java.util.Set r0 = r7.savedInjectedMedia
            if (r0 == 0) goto L_0x00a9
            r2.setMediaInjectionsList(r1, r0)
            java.lang.String r0 = r10.getSearchString()
            r7.filterListWithQuery(r0)
            r1 = 2131825287(0x7f111287, float:1.9283426E38)
            java.lang.String r0 = r7.surface
            if (r0 == 0) goto L_0x001f
            java.lang.String r0 = X.AnonymousClass0wJ.A0o(r7, r0, r1)
            r9.setText(r0)
            return
        L_0x00a9:
            X.C04220Ms.A0E(r3)
            goto L_0x0022
        L_0x00ae:
            X.C04220Ms.A0E(r5)
            goto L_0x0022
        L_0x00b3:
            X.C04220Ms.A0E(r2)
            goto L_0x0022
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.debug.devoptions.InjectMediaFragment.updateList(com.instagram.ui.widget.trianglespinner.TriangleSpinner, com.instagram.common.ui.base.IgTextView, com.instagram.igds.components.search.InlineSearchBox):void");
    }

    public void onCreate(Bundle bundle) {
        int A02 = C14030oh.A02(-542715394);
        super.onCreate(bundle);
        setSession(C18180wK.A0W(this, AnonymousClass0RA.A0C));
        C14030oh.A09(-1621299766, A02);
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x00ad  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View onCreateView(android.view.LayoutInflater r13, android.view.ViewGroup r14, android.os.Bundle r15) {
        /*
            r12 = this;
            r0 = -1009871397(0xffffffffc3ce95db, float:-413.17075)
            int r3 = X.C14030oh.A02(r0)
            r1 = 0
            X.C04220Ms.A0B(r13, r1)
            r0 = 2131494459(0x7f0c063b, float:1.8612427E38)
            android.view.View r4 = r13.inflate(r0, r14, r1)
            r0 = 2131302049(0x7f0916a1, float:1.8222173E38)
            android.view.View r0 = r4.requireViewById(r0)
            r12.searchEmptyState = r0
            android.os.Bundle r1 = r12.requireArguments()
            java.lang.String r0 = "content_type_key"
            java.lang.String r0 = r1.getString(r0)
            X.C04220Ms.A0A(r0)
            r12.contentType = r0
            android.content.Context r7 = r12.requireContext()
            r6 = 2131494461(0x7f0c063d, float:1.8612431E38)
            java.lang.String r9 = r12.contentType
            java.lang.String r11 = "contentType"
            if (r9 == 0) goto L_0x0185
            java.util.ArrayList r5 = X.AnonymousClass0wJ.A0v()
            int r10 = r9.hashCode()
            r0 = -1204461845(0xffffffffb8355eeb, float:-4.3242162E-5)
            java.lang.String r8 = "Reels"
            java.lang.String r2 = "Stories"
            if (r10 == r0) goto L_0x0178
            r0 = -1048928944(0xffffffffc17a9d50, float:-15.663406)
            java.lang.String r1 = "Feed"
            if (r10 == r0) goto L_0x0168
            r0 = 96432(0x178b0, float:1.3513E-40)
            if (r10 != r0) goto L_0x018a
            java.lang.String r0 = "ads"
            boolean r0 = r9.equals(r0)
            if (r0 == 0) goto L_0x018a
            r5.add(r2)
            r5.add(r1)
        L_0x0062:
            r5.add(r8)
        L_0x0065:
            android.widget.ArrayAdapter r2 = new android.widget.ArrayAdapter
            r2.<init>(r7, r6, r5)
            r0 = 2131494460(0x7f0c063c, float:1.861243E38)
            r2.setDropDownViewResource(r0)
            r0 = 2131307771(0x7f092cfb, float:1.8233779E38)
            android.view.View r0 = r4.requireViewById(r0)
            r5 = r0
            com.instagram.ui.widget.trianglespinner.TriangleSpinner r5 = (com.instagram.ui.widget.trianglespinner.TriangleSpinner) r5
            r12.surfaceSelector = r5
            X.C04220Ms.A06(r0)
            android.content.Context r1 = r12.requireContext()
            r0 = 2131099961(0x7f060139, float:1.781229E38)
            int r0 = r1.getColor(r0)
            r5.setTriangleColor(r0)
            r5.setAdapter(r2)
            java.lang.Object r0 = r5.getSelectedItem()
            java.lang.String r1 = r0.toString()
            java.util.Locale r0 = java.util.Locale.getDefault()
            X.C04220Ms.A06(r0)
            java.lang.String r2 = X.C18190wL.A0r(r0, r1)
            r12.surface = r2
            java.lang.String r6 = "surface"
            r1 = 95
            java.lang.String r0 = r12.contentType
            if (r0 == 0) goto L_0x0185
            java.lang.String r0 = X.AnonymousClass00U.A0N(r2, r0, r1)
            r12.surfaceAndContentType = r0
            java.lang.String r11 = "surfaceAndContentType"
            if (r0 == 0) goto L_0x0185
            X.4pX r0 = X.AnonymousClass2LN.A00(r0)
            r12.dataStoreManager = r0
            android.content.Context r1 = r12.requireContext()
            com.instagram.debug.devoptions.LocalMediaInjectionController r0 = new com.instagram.debug.devoptions.LocalMediaInjectionController
            r0.<init>(r1)
            r12.injectionController = r0
            X.4pX r0 = r12.dataStoreManager
            if (r0 != 0) goto L_0x00d3
            java.lang.String r6 = "dataStoreManager"
        L_0x00ce:
            X.C04220Ms.A0E(r6)
        L_0x00d1:
            r0 = 0
            throw r0
        L_0x00d3:
            java.util.Map r0 = r0.Aow()
            java.util.Collection r0 = r0.values()
            java.util.ArrayList r0 = X.C18200wM.A0s(r0)
            r12.injectionUnits = r0
            com.instagram.debug.devoptions.LocalMediaInjectionController r1 = r12.injectionController
            if (r1 != 0) goto L_0x00e8
            java.lang.String r6 = "injectionController"
            goto L_0x00ce
        L_0x00e8:
            java.lang.String r0 = r12.surfaceAndContentType
            if (r0 == 0) goto L_0x0185
            java.util.Set r0 = r1.getSelectedInjectionItems(r0)
            java.util.Set r2 = X.AnonymousClass00J.A0b(r0)
            r12.savedInjectedMedia = r2
            java.util.List r1 = r12.injectionUnits
            if (r1 != 0) goto L_0x00fd
            java.lang.String r6 = "injectionUnits"
            goto L_0x00ce
        L_0x00fd:
            com.instagram.debug.devoptions.InjectionMediaSelectionAdapter r0 = new com.instagram.debug.devoptions.InjectionMediaSelectionAdapter
            r0.<init>(r12, r1, r2)
            r12.injectionMediaSelectionAdapter = r0
            r0 = 2131302050(0x7f0916a2, float:1.8222175E38)
            android.view.View r1 = X.AnonymousClass0wJ.A0J(r4, r0)
            androidx.recyclerview.widget.RecyclerView r1 = (androidx.recyclerview.widget.RecyclerView) r1
            com.instagram.debug.devoptions.InjectionMediaSelectionAdapter r0 = r12.injectionMediaSelectionAdapter
            if (r0 != 0) goto L_0x0114
            java.lang.String r6 = "injectionMediaSelectionAdapter"
            goto L_0x00ce
        L_0x0114:
            r1.setAdapter(r0)
            com.instagram.debug.devoptions.InjectMediaFragment$onCreateView$1 r0 = new com.instagram.debug.devoptions.InjectMediaFragment$onCreateView$1
            r0.<init>()
            r1.A11(r0)
            r0 = 2131298399(0x7f09085f, float:1.821477E38)
            android.view.View r0 = r4.requireViewById(r0)
            r2 = r0
            com.instagram.common.ui.base.IgTextView r2 = (com.instagram.common.ui.base.IgTextView) r2
            r12.clearAllButton = r2
            X.C04220Ms.A06(r0)
            r1 = 2131825287(0x7f111287, float:1.9283426E38)
            java.lang.String r0 = r12.surface
            if (r0 == 0) goto L_0x00ce
            java.lang.String r0 = X.AnonymousClass0wJ.A0o(r12, r0, r1)
            r2.setText(r0)
            com.instagram.debug.devoptions.InjectMediaFragment$onCreateView$2 r0 = new com.instagram.debug.devoptions.InjectMediaFragment$onCreateView$2
            r0.<init>(r12)
            r2.setOnClickListener(r0)
            r0 = 2131302051(0x7f0916a3, float:1.8222177E38)
            android.view.View r0 = r4.requireViewById(r0)
            r1 = r0
            com.instagram.igds.components.search.InlineSearchBox r1 = (com.instagram.igds.components.search.InlineSearchBox) r1
            r12.inlineSearchBox = r1
            X.C04220Ms.A06(r0)
            r1.A02 = r12
            r0 = 6
            r1.setImeOptions(r0)
            com.instagram.debug.devoptions.InjectMediaFragment$onCreateView$3 r0 = new com.instagram.debug.devoptions.InjectMediaFragment$onCreateView$3
            r0.<init>(r12, r5, r2, r1)
            r5.setOnItemSelectedListener(r0)
            r0 = 1661963629(0x630f8d6d, float:2.6480752E21)
            X.C14030oh.A09(r0, r3)
            return r4
        L_0x0168:
            java.lang.String r0 = "netego"
            boolean r0 = r9.equals(r0)
            if (r0 == 0) goto L_0x018a
            r5.add(r2)
            r5.add(r1)
            goto L_0x0065
        L_0x0178:
            java.lang.String r0 = "organic"
            boolean r0 = r9.equals(r0)
            if (r0 == 0) goto L_0x018a
            r5.add(r2)
            goto L_0x0062
        L_0x0185:
            X.C04220Ms.A0E(r11)
            goto L_0x00d1
        L_0x018a:
            java.lang.String r0 = "Unsupported content type!"
            java.lang.IllegalArgumentException r0 = X.C18190wL.A0a(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.debug.devoptions.InjectMediaFragment.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    public void onDestroyView() {
        int A02 = C14030oh.A02(769813040);
        super.onDestroyView();
        this.inlineSearchBox = null;
        this.surfaceSelector = null;
        this.clearAllButton = null;
        this.searchEmptyState = null;
        C14030oh.A09(-1537454118, A02);
    }
}

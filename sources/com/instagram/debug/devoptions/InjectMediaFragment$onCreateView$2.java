package com.instagram.debug.devoptions;

import X.AnonymousClass4O1;
import X.C04220Ms;
import X.C14030oh;
import X.C18220wO;
import X.C63813iO;
import android.content.Context;
import android.view.View;
import java.util.List;
import java.util.Set;

public final class InjectMediaFragment$onCreateView$2 implements View.OnClickListener {
    public final /* synthetic */ InjectMediaFragment this$0;

    public InjectMediaFragment$onCreateView$2(InjectMediaFragment injectMediaFragment) {
        this.this$0 = injectMediaFragment;
    }

    public final void onClick(View view) {
        int A05 = C14030oh.A05(-1058684552);
        Set set = this.this$0.savedInjectedMedia;
        String str = "savedInjectedMedia";
        if (set != null) {
            set.clear();
            InjectMediaFragment injectMediaFragment = this.this$0;
            LocalMediaInjectionController localMediaInjectionController = injectMediaFragment.injectionController;
            if (localMediaInjectionController == null) {
                str = "injectionController";
            } else {
                Set set2 = injectMediaFragment.savedInjectedMedia;
                if (set2 != null) {
                    String str2 = injectMediaFragment.surfaceAndContentType;
                    if (str2 == null) {
                        str = "surfaceAndContentType";
                    } else {
                        localMediaInjectionController.selectInjectionItems(set2, str2);
                        List<AnonymousClass4O1> list = this.this$0.injectionUnits;
                        str = "injectionUnits";
                        if (list != null) {
                            for (AnonymousClass4O1 r0 : list) {
                                r0.A00 = false;
                            }
                            InjectMediaFragment injectMediaFragment2 = this.this$0;
                            InjectionMediaSelectionAdapter injectionMediaSelectionAdapter = injectMediaFragment2.injectionMediaSelectionAdapter;
                            if (injectionMediaSelectionAdapter == null) {
                                str = "injectionMediaSelectionAdapter";
                            } else {
                                List list2 = injectMediaFragment2.injectionUnits;
                                if (list2 != null) {
                                    injectionMediaSelectionAdapter.updateList(list2);
                                    Context requireContext = this.this$0.requireContext();
                                    InjectMediaFragment injectMediaFragment3 = this.this$0;
                                    String str3 = injectMediaFragment3.surface;
                                    if (str3 == null) {
                                        str = "surface";
                                    } else {
                                        String str4 = injectMediaFragment3.contentType;
                                        if (str4 == null) {
                                            str = "contentType";
                                        } else {
                                            C63813iO.A0B(requireContext, C18220wO.A0k(injectMediaFragment3, str3, str4, 2131825288));
                                            C14030oh.A0C(148579585, A05);
                                            return;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        C04220Ms.A0E(str);
        throw null;
    }
}

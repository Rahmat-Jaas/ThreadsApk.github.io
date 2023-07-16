package com.facebook.rsys.cowatch.gen;

import X.AnonymousClass0wJ;
import X.C18180wK;
import X.C18190wL;
import X.C18200wM;
import X.C18210wN;
import X.C18220wO;
import com.facebook.djinni.msys.infra.McfReference;
import java.util.ArrayList;

public class CowatchAddMediaDialogModel {
    public final boolean amdLaunchedFromPromotion;
    public final int currentPageType;
    public final CowatchMediaTabModel fypTab;
    public final boolean hasEverBeenOpened;
    public final boolean isLoading;
    public final ArrayList logs;
    public final String requestedInitialTabId;
    public final CowatchMediaTabModel searchTab;
    public final long selectedTabIndex;
    public final ArrayList tabs;

    public static native CowatchAddMediaDialogModel createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof CowatchAddMediaDialogModel)) {
                return false;
            }
            CowatchAddMediaDialogModel cowatchAddMediaDialogModel = (CowatchAddMediaDialogModel) obj;
            if (this.hasEverBeenOpened != cowatchAddMediaDialogModel.hasEverBeenOpened || this.isLoading != cowatchAddMediaDialogModel.isLoading) {
                return false;
            }
            String str = this.requestedInitialTabId;
            String str2 = cowatchAddMediaDialogModel.requestedInitialTabId;
            if (str == null) {
                if (str2 != null) {
                    return false;
                }
            } else if (!str.equals(str2)) {
                return false;
            }
            if (this.amdLaunchedFromPromotion != cowatchAddMediaDialogModel.amdLaunchedFromPromotion || this.selectedTabIndex != cowatchAddMediaDialogModel.selectedTabIndex) {
                return false;
            }
            CowatchMediaTabModel cowatchMediaTabModel = this.searchTab;
            CowatchMediaTabModel cowatchMediaTabModel2 = cowatchAddMediaDialogModel.searchTab;
            if (cowatchMediaTabModel == null) {
                if (cowatchMediaTabModel2 != null) {
                    return false;
                }
            } else if (!cowatchMediaTabModel.equals(cowatchMediaTabModel2)) {
                return false;
            }
            if (!this.tabs.equals(cowatchAddMediaDialogModel.tabs)) {
                return false;
            }
            CowatchMediaTabModel cowatchMediaTabModel3 = this.fypTab;
            CowatchMediaTabModel cowatchMediaTabModel4 = cowatchAddMediaDialogModel.fypTab;
            if (cowatchMediaTabModel3 == null) {
                if (cowatchMediaTabModel4 != null) {
                    return false;
                }
            } else if (!cowatchMediaTabModel3.equals(cowatchMediaTabModel4)) {
                return false;
            }
            if (this.currentPageType != cowatchAddMediaDialogModel.currentPageType || !this.logs.equals(cowatchAddMediaDialogModel.logs)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        ArrayList arrayList = this.tabs;
        return C18220wO.A06(this.logs, (((AnonymousClass0wJ.A05(arrayList, (((((((((C18210wN.A00(this.hasEverBeenOpened ? 1 : 0) + (this.isLoading ? 1 : 0)) * 31) + AnonymousClass0wJ.A06(this.requestedInitialTabId)) * 31) + (this.amdLaunchedFromPromotion ? 1 : 0)) * 31) + C18190wL.A02(this.selectedTabIndex)) * 31) + AnonymousClass0wJ.A03(this.searchTab)) * 31) + C18200wM.A07(this.fypTab)) * 31) + this.currentPageType) * 31);
    }

    public final String toString() {
        StringBuilder A0s = C18190wL.A0s("CowatchAddMediaDialogModel{hasEverBeenOpened=");
        A0s.append(this.hasEverBeenOpened);
        A0s.append(",isLoading=");
        A0s.append(this.isLoading);
        A0s.append(",requestedInitialTabId=");
        A0s.append(this.requestedInitialTabId);
        A0s.append(",amdLaunchedFromPromotion=");
        A0s.append(this.amdLaunchedFromPromotion);
        A0s.append(",selectedTabIndex=");
        A0s.append(this.selectedTabIndex);
        A0s.append(",searchTab=");
        A0s.append(this.searchTab);
        A0s.append(",tabs=");
        A0s.append(this.tabs);
        A0s.append(",fypTab=");
        A0s.append(this.fypTab);
        A0s.append(",currentPageType=");
        A0s.append(this.currentPageType);
        A0s.append(",logs=");
        A0s.append(this.logs);
        return C18180wK.A0i("}", A0s);
    }

    public CowatchAddMediaDialogModel(boolean z, boolean z2, String str, boolean z3, long j, CowatchMediaTabModel cowatchMediaTabModel, ArrayList arrayList, CowatchMediaTabModel cowatchMediaTabModel2, int i, ArrayList arrayList2) {
        arrayList.getClass();
        arrayList2.getClass();
        this.hasEverBeenOpened = z;
        this.isLoading = z2;
        this.requestedInitialTabId = str;
        this.amdLaunchedFromPromotion = z3;
        this.selectedTabIndex = j;
        this.searchTab = cowatchMediaTabModel;
        this.tabs = arrayList;
        this.fypTab = cowatchMediaTabModel2;
        this.currentPageType = i;
        this.logs = arrayList2;
    }
}

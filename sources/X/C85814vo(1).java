package X;

import java.util.List;

/* renamed from: X.4vo  reason: invalid class name and case insensitive filesystem */
public interface C85814vo extends C146578mT {
    String getCategory();

    C62123Xf getCheckpoint();

    String getCheckpointUrl();

    C571339w getConsentData();

    String getDialogueType();

    String getEnrollmentTime();

    String getErrorBody();

    String getErrorCode();

    String getErrorMessage();

    String getErrorSource();

    List getErrorStrings();

    String getErrorTitle();

    String getErrorType();

    String getExpirationTime();

    String getFeedbackAction();

    String getFeedbackAppealLabel();

    String getFeedbackIgnoreLabel();

    String getFeedbackMessage();

    String getFeedbackTitle();

    String getFeedbackUrl();

    String getLocalizedErrorMessage();

    String getLogoutReason();

    boolean getNewsURLIsRegulated();

    String getReasonsThrown();

    String getResponsiblePolicy();

    String getRestrictionDetailUseCase();

    String getRestrictionExtraData();

    String getRestrictionType();

    int getRetryCooldownTimeInMs();

    boolean getRetryEntireUploadFlow();

    boolean getSentryBlockRestrictionDialogueUnificationEnabled();

    boolean getShouldShowWebviewCancelButton();

    boolean getSpam();

    String getStatus();

    List getSystemMessages();

    boolean isCheckpointRequired();

    boolean isConsentRequired();

    boolean isFeedbackRequired();

    boolean isLoginRequired();
}

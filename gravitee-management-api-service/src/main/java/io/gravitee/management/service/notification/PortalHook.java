/**
 * Copyright (C) 2015 The Gravitee team (http://gravitee.io)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.gravitee.management.service.notification;

/**
 * @author Nicolas GERAUD (nicolas.geraud at graviteesource.com) 
 * @author GraviteeSource Team
 */
public enum PortalHook implements Hook {

    USER_REGISTERED("User Registered", "Triggered when an user is registered", "USER"),
    USER_CREATED("User Created", "Triggered when an user is created", "USER"),
    USER_FIRST_LOGIN("First Login", "Triggered when an user log in for the first time", "USER"),
    PASSWORD_RESET("Password Reset", "Triggered when a password is reset", "USER"),
    NEW_SUPPORT_TICKET("New Support Ticket", "Triggered when a new support ticket is created", "SUPPORT"),
    GROUP_INVITATION("Group invitation", "Triggered when an user is invited in a group", "GROUP"),
    MESSAGE(null, null, null, true),
    ASK_FOR_REVIEW("Ask for API review", "Triggered when an API can be reviewed", "REVIEW"),
    REVIEW_OK("Accept API review", "Triggered when an API's review has been accepted", "REVIEW"),
    REQUEST_FOR_CHANGES("Reject API review", "Triggered when an API's review has been rejected", "REVIEW");

    private String label;
    private String description;
    private String category;
    private boolean hidden;

    PortalHook(String label, String description, String category) {
        this(label, description, category, false);
    }

    PortalHook(String label, String description, String category, boolean hidden) {
        this.label = label;
        this.description = description;
        this.category = category;
        this.hidden = hidden;
    }

    @Override
    public String getLabel() {
        return label;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public String getCategory() {
        return category;
    }

    @Override
    public HookScope getScope() {
        return HookScope.PORTAL;
    }

    @Override
    public boolean isHidden() {
        return hidden;
    }


}

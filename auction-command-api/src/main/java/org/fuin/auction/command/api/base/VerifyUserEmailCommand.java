/*
 * Copyright (c) 2010. Axon Auction Example
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.fuin.auction.command.api.base;

import java.util.HashSet;
import java.util.Set;

import javax.validation.constraints.NotNull;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.fuin.auction.command.api.support.Command;
import org.fuin.objects4j.Contract;
import org.fuin.objects4j.Label;
import org.fuin.objects4j.TextField;
import org.fuin.objects4j.validation.UUIDStr;

/**
 * Verify the user's email address with a given security token.
 */
public final class VerifyUserEmailCommand implements Command {

	private static final long serialVersionUID = 7178665113651928567L;

	private long version = serialVersionUID;

	@NotNull
	@UUIDStr
	@Label("User ID")
	@TextField(width = 100)
	private String userAggregateId;

	@NotNull
	@Label("Security Token")
	@TextField(width = 100)
	private String securityToken;

	/**
	 * Default constructor for serialization.
	 */
	protected VerifyUserEmailCommand() {
		super();
	}

	/**
	 * Constructor with all attributes.
	 * 
	 * @param userAggregateId
	 *            Aggregate id of the user.
	 * @param securityToken
	 *            Security token.
	 */
	public VerifyUserEmailCommand(final String userAggregateId, final String securityToken) {
		super();
		this.userAggregateId = userAggregateId;
		this.securityToken = securityToken;
		Contract.requireValid(this);
	}

	/**
	 * Returns the aggregate id of the user.
	 * 
	 * @return Unique id.
	 */
	public final String getUserAggregateId() {
		return userAggregateId;
	}

	/**
	 * Sets the aggregate id of the user to a new value.
	 * 
	 * @param userAggregateId
	 *            Unique id to set.
	 */
	public final void setUserAggregateId(final String userAggregateId) {
		this.userAggregateId = userAggregateId;
	}

	/**
	 * Returns the security token.
	 * 
	 * @return Base64 encoded security token.
	 */
	public final String getSecurityToken() {
		return securityToken;
	}

	/**
	 * Sets the security token to a new value.
	 * 
	 * @param securityToken
	 *            Base64 encoded security token.
	 */
	public final void setSecurityToken(final String securityToken) {
		this.securityToken = securityToken;
	}

	@Override
	public final String toTraceString() {
		return new ToStringBuilder(this).append("userAggregateId", userAggregateId).append(
		        "securityToken", securityToken).append("version", version).toString();
	}

	@Override
	public final long getVersion() {
		return version;
	}

	@Override
	public final Set<Integer> getResultCodes() {
		final Set<Integer> codes = new HashSet<Integer>();
		codes.add(ResultCode.CATEGORY_ALREADY_EXISTS.getCode());
		codes.add(ResultCode.ID_NOT_FOUND.getCode());
		codes.add(ResultCode.USER_EMAIL_VERIFICATION_FAILED.getCode());
		codes.add(ResultCode.INVALID_COMMAND.getCode());
		codes.add(ResultCode.INTERNAL_ERROR.getCode());
		return codes;
	}

}

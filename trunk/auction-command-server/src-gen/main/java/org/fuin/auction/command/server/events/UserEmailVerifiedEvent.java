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
package org.fuin.auction.command.server.events;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.axonframework.domain.DomainEvent;

// GENERATED CODE - DO NOT EDIT!

/**
 * The email address of a user was verified.
 */
public final class UserEmailVerifiedEvent extends DomainEvent implements ExtendedDomainEvent {
	private static final long serialVersionUID = 100L;

	/**
	 * Default constructor for serialization.
	 */
	public UserEmailVerifiedEvent() {
		super();
	}

	@Override
	public final String toTraceString() {
		return new ToStringBuilder(this).append("aggregateIdentifier", getAggregateIdentifier())
		        .append("aggregateVersion", getAggregateVersion()).toString();
	}
}
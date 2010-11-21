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
package org.fuin.auction.common;

import org.fuin.objects4j.Ensures;

/**
 * Tags objects that can create a trace string representation.
 */
public interface TraceStringCapable {

	/**
	 * Creates a representation of the command for tracing.
	 * 
	 * @return A string for a technical log.
	 */
	@Ensures("\result!=null")
	public String toTraceString();

}

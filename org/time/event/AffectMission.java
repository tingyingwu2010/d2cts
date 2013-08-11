/*
 * This file is part of D²CTS : Dynamic and Distributed Container Terminal Simulator.
 *
 * Copyright (C) 2009-2012  Gaëtan Lesauvage
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA  02111-1307, USA.
 */
package org.time.event;

import org.time.Time;

public class AffectMission extends DynamicEvent {

	private String missionId, straddleCarrierId;
	private static final String TYPE = "AffectMission";

	public AffectMission(Time t, String missionId, String straddleCarrierId) {
		super(t, TYPE, "<event time='" + t + "' type='" + TYPE + "' mission='"
				+ missionId + "' straddleCarrier='" + straddleCarrierId + "'/>");
		this.missionId = missionId;
		this.straddleCarrierId = straddleCarrierId;
	}

	@Override
	public void execute() {
		terminal.incomingMission(straddleCarrierId, missionId);
	}
}

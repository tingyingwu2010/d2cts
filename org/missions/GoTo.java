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
package org.missions;

import java.io.Serializable;

import org.util.Location;


public class GoTo implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -6122323797829224880L;
	public Location target;
	private boolean interruptible = true;
	public GoTo (Location target){
		this.target = target;
	}
	public GoTo (Location target, boolean interruptible){
		this.target = target;
		this.interruptible = interruptible;
	}
	public Location getTarget(){
		return target;
	}
	public boolean isInterruptible(){
		return interruptible;
	}
}

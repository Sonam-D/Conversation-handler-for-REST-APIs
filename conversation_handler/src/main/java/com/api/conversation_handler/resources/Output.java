// Copyright (c) 2003-2020, One Network Enterprises, Inc. All rights reserved.

package com.api.conversation_handler.resources;

/**
 * TODO complete the class documentation
 *
 */
public class Output {


	public Output(String api, String type) {
		super();
		this.api = api;
		this.type = type;
	}


	private String api;
	private String type;
	/**
	 * @return the api
	 */
	public String getApi() {
		return api;
	}
	/**
	 * @param api the api to set
	 */
	public void setApi(String api) {
		this.api = api;
	}
	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}
	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}
	/**
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((api == null) ? 0 : api.hashCode());
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		return result;
	}
	/**
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
/*	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Output other = (Output) obj;
		if (api == null) {
			if (other.api != null)
				return false;
		}
		else if (!api.equals(other.api))
			return false;
		if (type == null) {
			if (other.type != null)
				return false;
		}
		else if (!type.equals(other.type))
			return false;
		return true;
	}*/
	@Override
	public String toString() {
		return "Output [api=" + api + ", type=" + type + "]";
	}



}

/* ************************************************************************** */
/*                                                                            */
/*                                                        :::      ::::::::   */
/*   ft_strchr.c                                        :+:      :+:    :+:   */
/*                                                    +:+ +:+         +:+     */
/*   By: ombouarg <marvin@42.fr>                    +#+  +:+       +#+        */
/*                                                +#+#+#+#+#+   +#+           */
/*   Created: 2025/04/23 16:09:58 by ombouarg          #+#    #+#             */
/*   Updated: 2025/04/23 16:23:37 by ombouarg         ###   ########.fr       */
/*                                                                            */
/* ************************************************************************** */

#include <string.h>
#include <stdio.h>

char	*ft_strchr(const char *s, int c)
{
	while (*s != '\0')
	{
		if (*s == (char)c)
			return ((char *)s);
		s++;
	}
	if ((char)c == '\0')
		return ((char *)s);
	return (NULL);
}
/*
int main(void)
{
	char *str;
	char *result;

	str = "Hola mundillo";
	result = ft_strchr(str, 'a');
	printf("Buscando 'a': %s\n", result);
	result = ft_strchr(str, 'z');
	printf("Buscando 'z': %s\n", result);
	return (0);
}*/
